package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.Arguments
import typings.openui5.anon.SchemaChildName
import typings.openui5.anon.ValueAsPromise
import typings.openui5.sapUiModelOdataV4ValueListTypeMod.ValueListType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV4AnnotationHelperMod extends Shortcut {
  
  @JSImport("sap/ui/model/odata/v4/AnnotationHelper", JSImport.Default)
  @js.native
  val default: AnnotationHelper = js.native
  
  /**
    * @SINCE 1.43.0
    *
    * A collection of methods which help to consume OData V4 annotations in XML template views. Every context argument must belong to an {@link sap.ui.model.odata.v4.ODataMetaModel}
    * instance.
    */
  trait AnnotationHelper extends StObject {
    
    /**
      * @SINCE 1.63.0
      *
      * A function that helps to interpret OData V4 annotations.
      *
      * Unsupported or incorrect values are turned into a string nevertheless, but are indicated as such. In
      * such a case, an error describing the problem is logged to the console. Proper escaping is used to make
      * sure that data binding syntax is not corrupted.
      *
      * Example:
      * ```javascript
      *
      * <Text text="{meta>Value/@@sap.ui.model.odata.v4.AnnotationHelper.format}" />
      * ```
      *
      *
      * Supported Expressions:
      * 	 "14.4 Constant Expressions" for "edm:Bool", "edm:Date", "edm:DateTimeOffset", "edm:Decimal", "edm:Float",
      * "edm:Guid", "edm:Int", "edm:TimeOfDay".  constant "14.4.11 Expression edm:String": This is turned
      * into a fixed text (for example `"Width"`). String constants that contain a simple binding `"{@i18n>...}"`
      * to the hard-coded model name "@i18n" with arbitrary path are not turned into a fixed text, but kept as
      * a data binding expression; this allows local annotation files to refer to a resource bundle for internationalization.
      *  dynamic "14.5.1 Comparison and Logical Operators": These are turned into expression bindings to
      * perform the operations at runtime.  dynamic "14.5.3 Expression edm:Apply":
      * 	 "14.5.3.1.1 Function odata.concat": This is turned into a data binding expression relative to an entity.
      *  "14.5.3.1.2 Function odata.fillUriTemplate": This is turned into an expression binding to fill the
      * template at runtime.  "14.5.3.1.3 Function odata.uriEncode": This is turned into an expression binding
      * to encode the parameter at runtime.  Apply functions may be nested arbitrarily.   dynamic
      * "14.5.5 Expression edm:Collection": This is turned into an expression binding to be evaluated at runtime.
      * Elements can be conditionally added to the collection when using dynamic "14.5.6 Expression edm:If" as
      * a direct child.  dynamic "14.5.6 Expression edm:If": This is turned into an expression binding to
      * be evaluated at runtime. The expression is a conditional expression like `"{=condition ? expression1
      * : expression2}"`.  dynamic "14.5.10 Expression edm:Null": This is turned into a `null` value. It
      * is ignored in `odata.concat`.  dynamic "14.5.12 Expression edm:Path" and "14.5.13 Expression edm:PropertyPath":
      * These are turned into data bindings relative to an entity, including type information and constraints
      * as available from metadata, for example `"{path : 'Name', type : 'sap.ui.model.odata.type.String', constraints
      * : {'maxLength' : 255}, formatOptions : {'parseKeepsEmptyString' : true}}"`. Depending on the used type,
      * some additional constraints and format options of this type are set:
      * 	 Edm.DateTime: The "displayFormat" constraint is set to the value of the "sap:display-format" annotation
      * of the referenced property.  Edm.Decimal: The "precision" and "scale" constraints are set to the
      * values of the corresponding attributes of the referenced property. The "minimum", "maximum", "minimumExclusive",
      * and "maximumExclusive" constraints are set to the values of the corresponding "Org.OData.Validation.V1"
      * annotation of the referenced property; note that in this case only constant expressions are supported
      * to determine the annotation value.  Edm.String: The "maxLength" constraint is set to the value of
      * the corresponding attribute of the referenced property, and the "isDigitSequence" constraint is set to
      * the value of the "com.sap.vocabularies.Common.v1.IsDigitSequence" annotation of the referenced property;
      * note that in this case only constant expressions are supported to determine the annotation value. The
      * "parseKeepsEmptyString" format option is set.  Since 1.78.0, both "edm:Path" and "edm:PropertyPath"
      * are also supported if `vRawValue` is the path itself, and not the object wrapping it.
      *
      * $AnnotationPath and $Path: If `oDetails.context.getPath()` contains a single "$AnnotationPath" or "$Path"
      * segment, the value corresponding to that segment is considered as a data binding path prefix whenever
      * a dynamic "14.5.12 Expression edm:Path" or "14.5.13 Expression edm:PropertyPath" is turned into a data
      * binding. Use {@link sap.ui.model.odata.v4.AnnotationHelper.resolve$Path} to avoid these prefixes in cases
      * where they are not applicable.
      *
      * $AnnotationPath: Example for "$AnnotationPath" in the context's path:
      * ```javascript
      *
      * <Annotations Target="com.sap.gateway.default.iwbep.tea_busi.v0001.EQUIPMENT">
      *   <Annotation Term="com.sap.vocabularies.UI.v1.Facets">
      *     <Collection>
      *       <Record Type="com.sap.vocabularies.UI.v1.ReferenceFacet">
      *         <PropertyValue Property="Target" AnnotationPath="EQUIPMENT_2_PRODUCT/@com.sap.vocabularies.Common.v1.QuickInfo" />
      *       </Record>
      *     </Collection>
      *   </Annotation>
      * </Annotations>
      * <Annotations Target="com.sap.gateway.default.iwbep.tea_busi_product.v0001.Product">
      *   <Annotation Term="com.sap.vocabularies.Common.v1.QuickInfo" Path="Name" />
      * </Annotations>
      * ```
      *
      * ```javascript
      *
      * <Text text="{meta>/Equipments/@com.sap.vocabularies.UI.v1.Facets/0/Target/$AnnotationPath/@@sap.ui.model.odata.v4.AnnotationHelper.format}" />
      * ```
      *  `format` returns a binding with path "EQUIPMENT_2_PRODUCT/Name".
      *
      * $Path: Example for "$Path" in the context's path:
      * ```javascript
      *
      * <Annotations Target="com.sap.gateway.default.iwbep.tea_busi.v0001.EQUIPMENT">
      *   <Annotation Term="com.sap.vocabularies.UI.v1.LineItem">
      *     <Collection>
      *       <Record Type="com.sap.vocabularies.UI.v1.DataField">
      *         <PropertyValue Property="Value" Path="EQUIPMENT_2_PRODUCT/Name" />
      *       </Record>
      *     </Collection>
      *   </Annotation>
      * </Annotations>
      * <Annotations Target="com.sap.gateway.default.iwbep.tea_busi_product.v0001.Product/Name">
      *   <Annotation Term="com.sap.vocabularies.Common.v1.QuickInfo" Path="PRODUCT_2_SUPPLIER/Supplier_Name" />
      * </Annotations>
      * ```
      *
      * ```javascript
      *
      * <Text text="{meta>/Equipments/@com.sap.vocabularies.UI.v1.LineItem/0/Value/$Path@com.sap.vocabularies.Common.v1.QuickInfo@@sap.ui.model.odata.v4.AnnotationHelper.format}" />
      * ```
      *  `format` returns a binding with path "EQUIPMENT_2_PRODUCT/PRODUCT_2_SUPPLIER/Supplier_Name".
      *
      * Annotations on an Operation or a Parameter: Since 1.71.0, for annotations on an operation or a parameter,
      * the binding parameter's name is stripped off any dynamic "14.5.12 Expression edm:Path" and "14.5.13 Expression
      * edm:PropertyPath" where it might be used as a first segment. Since 1.76.0 this does not apply to annotations
      * on a parameter. In the former case, we assume that the resulting data binding is relative to the parent
      * context of the operation binding, that is, to the context representing the binding parameter itself.
      * In the latter case, we assume that the resulting data binding is relative to the parameter context of
      * the operation binding (see {@link sap.ui.model.odata.v4.ODataContextBinding#getParameterContext}).
      *
      * Example:
      * ```javascript
      *
      *    <Action Name="ShipProduct" EntitySetPath="_it" IsBound="true" >
      *        <Parameter Name="_it" Type="name.space.Product" Nullable="false"/>
      *        <Parameter Name="City" Type="Edm.String"/>
      *    </Action>
      * ```
      *  For the operation `ShipProduct` mentioned above, the following annotation targets an operation parameter
      * and refers back to the binding parameter.
      * ```javascript
      *
      *     <Annotations Target="name.space.ShipProduct(name.space.Product)/City">
      *        <Annotation Term="com.sap.vocabularies.Common.v1.Text" Path="_it/SupplierIdentifier"/>
      *     </Annotations>
      * ```
      *
      *
      * Using `AnnotationHelper.format` like
      * ```javascript
      *
      * <Text text="{meta>/Products/name.space.ShipProduct/$Parameter/City@com.sap.vocabularies.Common.v1.Text@@sap.ui.model.odata.v4.AnnotationHelper.format}" />
      * ```
      *  results in
      * ```javascript
      *
      * <Text text="{path:'_it/SupplierIdentifier',type:'sap.ui.model.odata.type.Int32'}" />
      * ```
      *  and the data binding evaluates to the `SupplierIdentifier` property of the entity the operation is called
      * on.
      *
      * Operation Parameters: Since 1.73.0, this function can be used on action or function parameters and results
      * in a relative data binding, just like a "14.5.12 Expression edm:Path".
      *
      * Assume we have the following metadata for an unbound action "AcChangeTeamBudgetByID":
      * ```javascript
      *
      *    <Action Name="AcChangeTeamBudgetByID">
      *        <Parameter Name="TeamID" Type="Edm.String" Nullable="false" MaxLength="10"/>
      *        <Parameter Name="Budget" Type="Edm.Decimal" Nullable="false" Precision="16" Scale="variable"/>
      *    </Action>
      * ```
      *
      *
      * Let `ChangeTeamBudgetByID` be the action import of this action. Using `AnnotationHelper.format` for the
      * `TeamID` like
      * ```javascript
      *
      * <Text text="{meta>/ChangeTeamBudgetByID/TeamID@@sap.ui.model.odata.v4.AnnotationHelper.format}" />
      * ```
      *  results in
      * ```javascript
      *
      * <Text text="{path:'TeamID',type:'sap.ui.model.odata.type.String',constraints:{'maxLength':10,'nullable':false},formatOptions:{'parseKeepsEmptyString':true}}" />
      * ```
      *
      *
      * Binding Parameters and Format Options: Since 1.77.0, binding parameters and format options can be given.
      * The usage
      * ```javascript
      *
      * <Input value="{meta>/ChangeTeamBudgetByID/Budget@@sap.ui.model.odata.v4.AnnotationHelper.format($($$noPatch : true$), $(groupingEnabled : false$))}" />
      * ```
      *  results in a data binding with the given binding parameters and format options. Note how, for an object
      * notation, curly brackets must be replaced by `$(` and `$)` respectively. Use `null`, not `undefined`,
      * in case no binding parameters are needed.
      *
      * Structural Properties: Since 1.78.0, this function can be used on a structural property and results in
      * a relative data binding, just like a "14.5.12 Expression edm:Path". The usage
      * ```javascript
      *
      * <Input value="{meta>/Department/Name@@sap.ui.model.odata.v4.AnnotationHelper.format}"/>
      * ```
      *  results in
      * ```javascript
      *
      * < Input value="{path:'Name',type:'sap.ui.model.odata.type.String',constraints:{'maxLength':40,'nullable':false},formatOptions:{'parseKeepsEmptyString':true}}"/>
      * ```
      *
      * See:
      * 	sap.ui.model.odata.v4.AnnotationHelper.resolve$Path
      * 	sap.ui.model.odata.v4.AnnotationHelper.value
      *
      * @returns A data binding, or a fixed text, or a sequence thereof, or a `Promise` resolving with that string,
      * for example if not all type information is already available
      */
    def format(
      /**
      * The raw value from the meta model
      */
    vRawValue: Any,
      /**
      * The details object
      */
    oDetails: Arguments
    ): String | js.Promise[Any]
    
    /**
      * @SINCE 1.43.0
      *
      * Returns a data binding according to the result of {@link sap.ui.model.odata.v4.AnnotationHelper.getNavigationPath}.
      *
      * @returns A data binding according to the result of {@link sap.ui.model.odata.v4.AnnotationHelper.getNavigationPath},
      * for example "{ToSupplier}" or ""
      */
    def getNavigationBinding(
      /**
      * The path value from the meta model, for example "ToSupplier/@com.sap.vocabularies.Communication.v1.Address"
      * or "@com.sap.vocabularies.UI.v1.FieldGroup#Dimensions"
      */
    sPath: String
    ): String
    
    /**
      * @SINCE 1.43.0
      *
      * A function that helps to interpret OData V4 annotations. It knows about the syntax of the path value
      * used by the following dynamic expressions:
      * 	 "14.5.2 Expression edm:AnnotationPath"  "14.5.11 Expression edm:NavigationPropertyPath"  "14.5.12
      * Expression edm:Path"  "14.5.13 Expression edm:PropertyPath"  It returns the path of structural
      * and navigation properties from the given path value, but removes "$count", types casts, term casts, and
      * annotations on navigation properties.
      *
      * @returns The path of structural and navigation properties, for example "ToSupplier" or ""
      */
    def getNavigationPath(
      /**
      * The path value from the meta model, for example "ToSupplier/@com.sap.vocabularies.Communication.v1.Address"
      * or "@com.sap.vocabularies.UI.v1.FieldGroup#Dimensions"
      */
    sPath: String
    ): String
    
    /**
      * @SINCE 1.47.0
      *
      * Determines which type of value list exists for the given property.
      *
      * @returns The type of the value list or a `Promise` resolving with the type of the value list or rejected,
      * if the property cannot be found in the metadata
      */
    def getValueListType(
      /**
      * The raw value from the meta model; must be either a property or a path pointing to a property (relative
      * to `oDetails.schemaChildName`)
      */
    vRawValue: Any,
      /**
      * The details object
      */
    oDetails: SchemaChildName
    ): ValueListType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueListType * / any */ String) | js.Promise[Any]
    
    /**
      * @SINCE 1.43.0
      *
      * A function that helps to interpret OData V4 annotations. It knows about the syntax of the path value
      * used by the following dynamic expressions:
      * 	 "14.5.2 Expression edm:AnnotationPath"  "14.5.11 Expression edm:NavigationPropertyPath"  "14.5.12
      * Expression edm:Path"  "14.5.13 Expression edm:PropertyPath"  It returns the information whether
      * the given path ends with "$count" or with a multi-valued structural or navigation property. Term casts
      * and annotations on navigation properties are ignored.
      *
      * Example:
      * ```javascript
      *
      * <template:if test="{facet>Target/$AnnotationPath@@sap.ui.model.odata.v4.AnnotationHelper.isMultiple}">
      * ```
      *
      *
      * @returns `true` if the given path ends with "$count" or with a multi-valued structural or navigation
      * property, `false` otherwise. If `oDetails.$$valueAsPromise` is `true` a `Promise` may be returned resolving
      * with the boolean value.
      */
    def isMultiple(
      /**
      * The path value from the meta model, for example "ToSupplier/@com.sap.vocabularies.Communication.v1.Address"
      * or "@com.sap.vocabularies.UI.v1.FieldGroup#Dimensions"
      */
    sPath: String,
      /**
      * The details object
      */
    oDetails: SchemaChildName
    ): Boolean | js.Promise[Any]
    
    /**
      * @SINCE 1.49.0
      *
      * Returns the value for the label of a `com.sap.vocabularies.UI.v1.DataFieldAbstract` from the meta model.
      * If no `Label` property is available, but the data field has a `Value` property with an `edm:Path` expression
      * as value, the label will be taken from the `com.sap.vocabularies.Common.v1.Label` annotation of the path's
      * target property.
      *
      * Example:
      * ```javascript
      *
      * <Label text="{meta>@@sap.ui.model.odata.v4.AnnotationHelper.label}" />
      * ```
      *
      *
      * @returns A data binding or a fixed text or a sequence thereof or `undefined`. If `oDetails.$$valueAsPromise`
      * is `true` a `Promise` may be returned resolving with the value for the label.
      */
    def label(
      /**
      * The raw value from the meta model
      */
    vRawValue: Any,
      /**
      * The details object
      */
    oDetails: ValueAsPromise
    ): js.UndefOr[String | js.Promise[Any]]
    
    /**
      * @SINCE 1.63.0
      *
      * Helper function for a `template:with` instruction that returns an equivalent to the given context's path,
      * without "$AnnotationPath", "$NavigationPropertyPath", "$Path", and "$PropertyPath" segments.
      * See:
      * 	sap.ui.model.odata.v4.AnnotationHelper.format
      *
      * @returns An equivalent to the given context's path, without the mentioned segments
      */
    @JSName("resolve$Path")
    def resolve$Path(
      /**
      * A context which belongs to an {@link sap.ui.model.odata.v4.ODataMetaModel}
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): String
    
    /**
      * @SINCE 1.43.0
      *
      * A function that helps to interpret OData V4 annotations.
      *
      * Unsupported or incorrect values are turned into a string nevertheless, but are indicated as such. In
      * such a case, an error describing the problem is logged to the console.
      *
      * Example:
      * ```javascript
      *
      * <Text text="{meta>Value/@@sap.ui.model.odata.v4.AnnotationHelper.value}" />
      * ```
      *
      *
      * Supported Expressions:
      * 	 "14.4 Constant Expressions" for "edm:Bool", "edm:Date", "edm:DateTimeOffset", "edm:Decimal", "edm:Float",
      * "edm:Guid", "edm:Int", "edm:TimeOfDay".  constant "14.4.11 Expression edm:String": This is turned
      * into a fixed text (for example `"Width"`). String constants that contain a simple binding `"{@i18n>...}"`
      * to the hard-coded model name "@i18n" with arbitrary path are not turned into a fixed text, but kept as
      * a data binding expression; this allows local annotation files to refer to a resource bundle for internationalization.
      *  dynamic "14.5.1 Comparison and Logical Operators": These are turned into expression bindings to
      * perform the operations at runtime.  dynamic "14.5.3 Expression edm:Apply":
      * 	 "14.5.3.1.1 Function odata.concat": This is turned into a data binding expression.  "14.5.3.1.2
      * Function odata.fillUriTemplate": This is turned into an expression binding to fill the template at runtime.
      *  "14.5.3.1.3 Function odata.uriEncode": This is turned into an expression binding to encode the parameter
      * at runtime.  Apply functions may be nested arbitrarily.   dynamic "14.5.5 Expression edm:Collection":
      * This is turned into an expression binding to be evaluated at runtime. Elements can be conditionally added
      * to the collection when using dynamic "14.5.6 Expression edm:If" as a direct child.  dynamic "14.5.6
      * Expression edm:If": This is turned into an expression binding to be evaluated at runtime. The expression
      * is a conditional expression like `"{=condition ? expression1 : expression2}"`.  dynamic "14.5.10
      * Expression edm:Null": This is turned into a `null` value. It is ignored in `odata.concat`.  dynamic
      * "14.5.12 Expression edm:Path" and "14.5.13 Expression edm:PropertyPath": These are turned into simple
      * data bindings, for example `"{Name}"`. Since 1.78.0, both are also supported if `vRawValue` is the path
      * itself, and not the object wrapping it.
      *
      * Annotations on an Operation or a Parameter: Since 1.71.0, for annotations on an operation or a parameter,
      * the binding parameter's name is stripped off any dynamic "14.5.12 Expression edm:Path" and "14.5.13 Expression
      * edm:PropertyPath" where it might be used as a first segment. Since 1.76.0 this does not apply to annotations
      * on a parameter. In the former case, we assume that the resulting data binding is relative to the parent
      * context of the operation binding, that is, to the context representing the binding parameter itself.
      * In the latter case, we assume that the resulting data binding is relative to the parameter context of
      * the operation binding (see {@link sap.ui.model.odata.v4.ODataContextBinding#getParameterContext}).
      *
      * Example:
      * ```javascript
      *
      *    <Action Name="ShipProduct" EntitySetPath="_it" IsBound="true" >
      *        <Parameter Name="_it" Type="name.space.Product" Nullable="false"/>
      *        <Parameter Name="City" Type="Edm.String"/>
      *    </Action>
      * ```
      *  For the operation `ShipProduct` mentioned above, the following annotation targets an operation parameter
      * and refers back to the binding parameter.
      * ```javascript
      *
      *     <Annotations Target="name.space.ShipProduct(name.space.Product)/City">
      *        <Annotation Term="com.sap.vocabularies.Common.v1.Text" Path="_it/SupplierIdentifier"/>
      *     </Annotations>
      * ```
      *
      *
      * Using `AnnotationHelper.value` like
      * ```javascript
      *
      * <Text text="{meta>/Products/name.space.ShipProduct/$Parameter/City@com.sap.vocabularies.Common.v1.Text@@sap.ui.model.odata.v4.AnnotationHelper.value}" />
      * ```
      *  results in
      * ```javascript
      *
      * <Text text="{_it/SupplierIdentifier}" />
      * ```
      *  and the data binding evaluates to the `SupplierIdentifier` property of the entity the operation is called
      * on.
      *
      * Operation Parameters: Since 1.73.0, this function can be used on action or function parameters and results
      * in a relative data binding, just like a "14.5.12 Expression edm:Path".
      *
      * Assume we have the following metadata for an unbound action "AcChangeTeamBudgetByID":
      * ```javascript
      *
      *    <Action Name="AcChangeTeamBudgetByID">
      *        <Parameter Name="TeamID" Type="Edm.String" Nullable="false" MaxLength="10"/>
      *        <Parameter Name="Budget" Type="Edm.Decimal" Nullable="false" Precision="16" Scale="variable"/>
      *    </Action>
      * ```
      *
      *
      * Let `ChangeTeamBudgetByID` be the action import of this action. Using `AnnotationHelper.value` for the
      * `TeamID` like
      * ```javascript
      *
      * <Text text="{meta>/ChangeTeamBudgetByID/TeamID@@sap.ui.model.odata.v4.AnnotationHelper.value}" />
      * ```
      *  results in
      * ```javascript
      *
      * <Text text="{TeamID}" />
      * ```
      *
      *
      * Binding Parameters: Since 1.77.0, binding parameters can be given. The usage
      * ```javascript
      *
      * <Input value="{meta>/ChangeTeamBudgetByID/Budget@@sap.ui.model.odata.v4.AnnotationHelper.value($($$noPatch : true$))}" />
      * ```
      *  results in a data binding with the given binding parameters. Note how, for an object notation, curly
      * brackets must be replaced by `$(` and `$)` respectively.
      *
      * Structural Properties: Since 1.78.0, this function can be used on a structural property and results in
      * a relative data binding, just like a "14.5.12 Expression edm:Path". The usage
      * ```javascript
      *
      * <Input value="{meta>/Department/Name@@sap.ui.model.odata.v4.AnnotationHelper.value}"/>
      * ```
      *  results in
      * ```javascript
      *
      * < Input value="{Name}"/>
      * ```
      *
      * See:
      * 	sap.ui.model.odata.v4.AnnotationHelper.format
      *
      * @returns A data binding or a fixed text or a sequence thereof
      */
    def value(
      /**
      * The raw value from the meta model
      */
    vRawValue: Any,
      /**
      * The details object
      */
    oDetails: Arguments
    ): String
  }
  object AnnotationHelper {
    
    inline def apply(
      format: (Any, Arguments) => String | js.Promise[Any],
      getNavigationBinding: String => String,
      getNavigationPath: String => String,
      getValueListType: (Any, SchemaChildName) => ValueListType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueListType * / any */ String) | js.Promise[Any],
      isMultiple: (String, SchemaChildName) => Boolean | js.Promise[Any],
      label: (Any, ValueAsPromise) => js.UndefOr[String | js.Promise[Any]],
      resolve$Path: typings.openui5.sapUiModelContextMod.default => String,
      value: (Any, Arguments) => String
    ): AnnotationHelper = {
      val __obj = js.Dynamic.literal(format = js.Any.fromFunction2(format), getNavigationBinding = js.Any.fromFunction1(getNavigationBinding), getNavigationPath = js.Any.fromFunction1(getNavigationPath), getValueListType = js.Any.fromFunction2(getValueListType), isMultiple = js.Any.fromFunction2(isMultiple), label = js.Any.fromFunction2(label), resolve$Path = js.Any.fromFunction1(resolve$Path), value = js.Any.fromFunction2(value))
      __obj.asInstanceOf[AnnotationHelper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationHelper] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: (Any, Arguments) => String | js.Promise[Any]): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      inline def setGetNavigationBinding(value: String => String): Self = StObject.set(x, "getNavigationBinding", js.Any.fromFunction1(value))
      
      inline def setGetNavigationPath(value: String => String): Self = StObject.set(x, "getNavigationPath", js.Any.fromFunction1(value))
      
      inline def setGetValueListType(
        value: (Any, SchemaChildName) => ValueListType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueListType * / any */ String) | js.Promise[Any]
      ): Self = StObject.set(x, "getValueListType", js.Any.fromFunction2(value))
      
      inline def setIsMultiple(value: (String, SchemaChildName) => Boolean | js.Promise[Any]): Self = StObject.set(x, "isMultiple", js.Any.fromFunction2(value))
      
      inline def setLabel(value: (Any, ValueAsPromise) => js.UndefOr[String | js.Promise[Any]]): Self = StObject.set(x, "label", js.Any.fromFunction2(value))
      
      inline def setResolve$Path(value: typings.openui5.sapUiModelContextMod.default => String): Self = StObject.set(x, "resolve$Path", js.Any.fromFunction1(value))
      
      inline def setValue(value: (Any, Arguments) => String): Self = StObject.set(x, "value", js.Any.fromFunction2(value))
    }
  }
  
  type _To = AnnotationHelper
  
  /* This means you don't have to write `default`, but can instead just say `sapUiModelOdataV4AnnotationHelperMod.foo` */
  override def _to: AnnotationHelper = default
}
