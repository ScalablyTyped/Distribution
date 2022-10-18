package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.sapUiCoreUtilXmlpreprocessorMod.IContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataAnnotationHelperMod extends Shortcut {
  
  @JSImport("sap/ui/model/odata/AnnotationHelper", JSImport.Default)
  @js.native
  val default: AnnotationHelper = js.native
  
  /**
    * @SINCE 1.27.0
    *
    * A collection of methods which help to consume
    * OData V4 annotations in XML template views. Every context argument must belong to a `sap.ui.model.odata.ODataMetaModel`
    * instance.
    *
    * Formatter functions like {@link #.format format} and {@link #.simplePath simplePath} can be used in complex
    * bindings to turn OData V4 annotations into texts or data bindings, e.g. `<sfi:SmartField value="{path
    * : 'meta>Value', formatter : 'sap.ui.model.odata.AnnotationHelper.simplePath'}"/>`.
    *
    * Helper functions like {@link #.resolvePath resolvePath} can be used by template instructions in XML template
    * views, e.g. `<template:with path="meta>Value" helper="sap.ui.model.odata.AnnotationHelper.resolvePath"
    * var="target">`.
    *
    * Since 1.31.0, you DO NOT need to {@link sap.ui.require} this module before use.
    */
  @js.native
  trait AnnotationHelper extends StObject {
    
    /**
      * @SINCE 1.31.0
      *
      * Creates a property setting (which is either a constant value or a binding info object) from the given
      * parts and from the optional root formatter function. Each part can have one of the following types:
      * 	`boolean`, `number`, `undefined`: The part is a constant value.
      *
      * `string`: The part is a data binding expression with complex binding syntax (for example, as created
      * by {@link #.format format}) and is parsed accordingly to create either a constant value or a binding
      * info object. Proper backslash escaping must be used for constant values with curly braces.
      *
      * `object`: The part is a binding info object if it has a "path" or "parts" property, otherwise it
      * is a constant value.  If a binding info object is not the only part and has a "parts" property itself,
      * then it must have no other properties except "formatter"; this is the case for expression bindings and
      * data binding expressions created by {@link #.format format}.
      *
      * If all parts are constant values, the resulting property setting is also a constant value computed by
      * applying the root formatter function to the constant parts once. If at least one part is a binding info
      * object, the resulting property setting is also a binding info object and the root formatter function
      * will be applied again and again to the current values of all parts, no matter whether constant or variable.
      *
      * Note: The root formatter function should not rely on its `this` value because it depends on how the function
      * is called.
      *
      * Note: A single data binding expression can be given directly to {@link sap.ui.base.ManagedObject#applySettings
      * applySettings}, no need to call this function first.
      *
      * Example:
      * ```javascript
      *
      * function myRootFormatter(oValue1, oValue2, sFullName, sGreeting, iAnswer) {
      *     return ...;
      * }
      *
      * oSupplierContext = oMetaModel.getMetaContext("/ProductSet('HT-1021')/ToSupplier");
      * oValueContext = oMetaModel.createBindingContext("com.sap.vocabularies.UI.v1.DataPoint/Value", oSupplierContext);
      *
      * vPropertySetting =  sap.ui.model.odata.AnnotationHelper.createPropertySetting([
      *     sap.ui.model.odata.AnnotationHelper.format(oValueContext),
      *     "{path : 'meta>Value', formatter : 'sap.ui.model.odata.AnnotationHelper.simplePath'}",
      *     "{:= 'Mr. ' + ${/FirstName} + ' ' + ${/LastName}}",
      *     "hello, world!",
      *     42
      * ], myRootFormatter);
      *
      * oControl.applySettings({"someProperty" : vPropertySetting});
      * ```
      *
      *
      * @returns constant value or binding info object for a property as expected by {@link sap.ui.base.ManagedObject#applySettings
      * applySettings}
      */
    def createPropertySetting(/**
      * array of parts
      */
    aParts: js.Array[Any]): Any | js.Object = js.native
    def createPropertySetting(
      /**
      * array of parts
      */
    aParts: js.Array[Any],
      /**
      * root formatter function; default: `Array.prototype.join(., " ")` in case of multiple parts, just like
      * {@link sap.ui.model.CompositeBinding#getExternalValue getExternalValue}
      */
    fnRootFormatter: js.Function
    ): Any | js.Object = js.native
    
    /**
      * A formatter function to be used in a complex binding inside an XML template view in order to interpret
      * OData V4 annotations. It knows about
      * 	 the "14.4 Constant Expressions" for "edm:Bool", "edm:Date", "edm:DateTimeOffset", "edm:Decimal", "edm:Float",
      * "edm:Guid", "edm:Int", "edm:TimeOfDay".  the constant "14.4.11 Expression edm:String": This is turned
      * into a fixed text (e.g. `"Width"`) or into a data binding expression (e.g. ` "{/##/dataServices/schema/0/entityType/1/com.sap.vocabularies.UI.v1.FieldGroup#Dimensions/Data/0/Label/String}"
      * `). Data binding expressions are used in case XML template processing has been started with the setting
      * `bindTexts : true`. The purpose is to reference translatable texts from OData V4 annotations, especially
      * for XML template processing at design time. Since 1.31.0, string constants that contain a simple binding
      * `"{@i18n>...}"` to the hard-coded model name "@i18n" with arbitrary path are not turned into a fixed
      * text, but kept as a data binding expression; this allows local annotation files to refer to a resource
      * bundle for internationalization.  the dynamic "14.5.1 Comparison and Logical Operators": These are
      * turned into expression bindings to perform the operations at run-time.  the dynamic "14.5.3 Expression
      * edm:Apply":
      * 	 "14.5.3.1.1 Function odata.concat": This is turned into a data binding expression relative to an entity.
      *  "14.5.3.1.2 Function odata.fillUriTemplate": This is turned into an expression binding to fill the
      * template at run-time.  "14.5.3.1.3 Function odata.uriEncode": This is turned into an expression binding
      * to encode the parameter at run-time.  Apply functions may be nested arbitrarily.   the dynamic
      * "14.5.6 Expression edm:If": This is turned into an expression binding to be evaluated at run-time. The
      * expression is a conditional expression like `"{=condition ? expression1 : expression2}"`.  the dynamic
      * "14.5.10 Expression edm:Null": This is turned into a `null` value. In `odata.concat` it is ignored.
      * the dynamic "14.5.12 Expression edm:Path" and "14.5.13 Expression edm:PropertyPath": This is turned into
      * a data binding relative to an entity, including type information and constraints as available from metadata,
      * e.g. `"{path : 'Name', type : 'sap.ui.model.odata.type.String', constraints : {'maxLength':'255'}}"`.
      * Depending on the used type, some additional constraints of this type are set:
      * 	Edm.DateTime: The "displayFormat" constraint is set to the value of the "sap:display-format" annotation
      * of the referenced property. Edm.Decimal: The "precision" and "scale" constraints are set to the values
      * of the corresponding attributes of the referenced property. The "minimum", "maximum", "minimumExclusive"
      * and "maximumExlusive" constraints are set to the values of the corresponding "Org.OData.Validation.V1"
      * annotation of the referenced property; note that in this case only constant expressions are supported
      * to determine the annotation value. Edm.String: The "maxLength" constraint is set to the value of
      * the corresponding attribute of the referenced property and the "isDigitSequence" constraint is set to
      * the value of the "com.sap.vocabularies.Common.v1.IsDigitSequence" annotation of the referenced property;
      * note that in this case only constant expressions are supported to determine the annotation value.
      *  Unsupported or incorrect values are turned into a string nevertheless, but indicated as such. Proper
      * escaping is used to make sure that data binding syntax is not corrupted. An error describing the problem
      * is logged to the console in such a case.
      *
      * Example:
      * ```javascript
      *
      * <Text text="{path: 'meta>Value', formatter: 'sap.ui.model.odata.AnnotationHelper.format'}" />
      * ```
      *
      *
      * @returns the resulting string value to write into the processed XML
      */
    def format(/**
      * the callback interface related to the current formatter call
      */
    oInterface: IContext): String = js.native
    def format(
      /**
      * the callback interface related to the current formatter call
      */
    oInterface: IContext,
      /**
      * the raw value from the meta model, which is embedded within an entity set or entity type:
      * 	 - if this function is used as formatter the value is provided by the framework
      * 	 - if this function is called directly, provide the parameter only if it is already calculated
      * 	 - if the parameter is omitted, it is calculated automatically through `oInterface.getObject("")`
      */
    vRawValue: Any
    ): String = js.native
    def format(
      /**
      * the callback interface related to the current formatter call
      */
    oInterface: typings.openui5.sapUiModelContextMod.default
    ): String = js.native
    def format(
      /**
      * the callback interface related to the current formatter call
      */
    oInterface: typings.openui5.sapUiModelContextMod.default,
      /**
      * the raw value from the meta model, which is embedded within an entity set or entity type:
      * 	 - if this function is used as formatter the value is provided by the framework
      * 	 - if this function is called directly, provide the parameter only if it is already calculated
      * 	 - if the parameter is omitted, it is calculated automatically through `oInterface.getObject("")`
      */
    vRawValue: Any
    ): String = js.native
    
    /**
      * A formatter function to be used in a complex binding inside an XML template view in order to interpret
      * OData V4 annotations. It knows about the following dynamic expressions:
      * 	 - "14.5.2 Expression edm:AnnotationPath"
      * 	 - "14.5.11 Expression edm:NavigationPropertyPath"
      * 	 - "14.5.12 Expression edm:Path"
      * 	 - "14.5.13 Expression edm:PropertyPath"  It returns a binding expression for a navigation path
      * 			in an OData model, starting at an entity. Currently supports navigation properties. Term casts and annotations
      * 			of navigation properties terminate the navigation path.
      *
      * Examples:
      * ```javascript
      *
      * <template:if test="{path: 'facet>Target', formatter: 'sap.ui.model.odata.AnnotationHelper.getNavigationPath'}">
      *     <form:SimpleForm binding="{path: 'facet>Target', formatter: 'sap.ui.model.odata.AnnotationHelper.getNavigationPath'}" />
      * </template:if>
      * ```
      *
      *
      * @returns the resulting string value to write into the processed XML, e.g. "{ToSupplier}" or "{}" (in
      * case no navigation is needed); returns "" in case the navigation path cannot be determined (this is treated
      * as falsy in `template:if` statements!)
      */
    def getNavigationPath(/**
      * the callback interface related to the current formatter call
      */
    oInterface: IContext): String = js.native
    def getNavigationPath(
      /**
      * the callback interface related to the current formatter call
      */
    oInterface: IContext,
      /**
      * the raw value from the meta model, e.g. `{AnnotationPath : "ToSupplier/@com.sap.vocabularies.Communication.v1.Address"}`
      * or ` {AnnotationPath : "@com.sap.vocabularies.UI.v1.FieldGroup#Dimensions"}`; embedded within an entity
      * set or entity type;
      * 	 - if this function is used as formatter the value is provided by the framework
      * 	 - if this function is called directly, provide the parameter only if it is already calculated
      * 	 - if the parameter is omitted, it is calculated automatically through `oInterface.getObject("")`
      */
    vRawValue: Any
    ): String = js.native
    def getNavigationPath(
      /**
      * the callback interface related to the current formatter call
      */
    oInterface: typings.openui5.sapUiModelContextMod.default
    ): String = js.native
    def getNavigationPath(
      /**
      * the callback interface related to the current formatter call
      */
    oInterface: typings.openui5.sapUiModelContextMod.default,
      /**
      * the raw value from the meta model, e.g. `{AnnotationPath : "ToSupplier/@com.sap.vocabularies.Communication.v1.Address"}`
      * or ` {AnnotationPath : "@com.sap.vocabularies.UI.v1.FieldGroup#Dimensions"}`; embedded within an entity
      * set or entity type;
      * 	 - if this function is used as formatter the value is provided by the framework
      * 	 - if this function is called directly, provide the parameter only if it is already calculated
      * 	 - if the parameter is omitted, it is calculated automatically through `oInterface.getObject("")`
      */
    vRawValue: Any
    ): String = js.native
    
    /**
      * Helper function for a `template:with` instruction that depending on how it is called goes to the entity
      * set with the given name or to the one determined by the last navigation property. Supports the following
      * dynamic expressions:
      * 	 - "14.5.2 Expression edm:AnnotationPath"
      * 	 - "14.5.11 Expression edm:NavigationPropertyPath"
      * 	 - "14.5.12 Expression edm:Path"
      * 	 - "14.5.13 Expression edm:PropertyPath"
      *
      * Example:
      * ```javascript
      *
      *   <template:with path="facet>Target" helper="sap.ui.model.odata.AnnotationHelper.gotoEntitySet" var="entitySet"/>
      *   <template:with path="associationSetEnd>entitySet" helper="sap.ui.model.odata.AnnotationHelper.gotoEntitySet" var="entitySet"/>
      * ```
      *
      *
      * @returns the path to the entity set, or `undefined` if no such set is found. In this case, a warning
      * is logged to the console.
      */
    def gotoEntitySet(
      /**
      * a context which must point to a simple string or to an annotation (or annotation property) of type `Edm.AnnotationPath`,
      * `Edm.NavigationPropertyPath`, `Edm.Path`, or `Edm.PropertyPath` embedded within an entity set or entity
      * type; the context's model must be an {@link sap.ui.model.odata.ODataMetaModel}
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): js.UndefOr[String] = js.native
    
    /**
      * Helper function for a `template:with` instruction that goes to the entity type with the qualified name
      * which `oContext` points at.
      *
      * Example: Assume that "entitySet" refers to an entity set within an OData meta model; the helper function
      * is then called on the "entityType" property of that entity set (which holds the qualified name of the
      * entity type) and in turn the path of that entity type is assigned to the variable "entityType".
      * ```javascript
      *
      *   <template:with path="entitySet>entityType" helper="sap.ui.model.odata.AnnotationHelper.gotoEntityType" var="entityType">
      * ```
      *
      *
      * @returns the path to the entity type with the given qualified name, or `undefined` if no such type is
      * found. In this case, a warning is logged to the console.
      */
    def gotoEntityType(
      /**
      * a context which must point to the qualified name of an entity type; the context's model must be an {@link
      * sap.ui.model.odata.ODataMetaModel}
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): js.UndefOr[String] = js.native
    
    /**
      * @SINCE 1.29.1
      *
      * Helper function for a `template:with` instruction that goes to the function import with the name which
      * `oContext` points at.
      *
      * Example: Assume that "dataField" refers to a DataFieldForAction within an OData meta model; the helper
      * function is then called on the "Action" property of that data field (which holds an object with the qualified
      * name of the function import in the `String` property) and in turn the path of that function import is
      * assigned to the variable "function".
      * ```javascript
      *
      *   <template:with path="dataField>Action"
      *   helper="sap.ui.model.odata.AnnotationHelper.gotoFunctionImport" var="function">
      * ```
      *
      *
      * @returns the path to the function import with the given qualified name, or `undefined` if no function
      * import is found. In this case, a warning is logged to the console.
      */
    def gotoFunctionImport(
      /**
      * a context which must point to an object with a `String` property, which holds the qualified name of the
      * function import; the context's model must be an {@link sap.ui.model.odata.ODataMetaModel}
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): js.UndefOr[String] = js.native
    
    /**
      * A formatter function to be used in a complex binding inside an XML template view in order to interpret
      * OData V4 annotations. It knows about the following dynamic expressions:
      * 	 - "14.5.2 Expression edm:AnnotationPath"
      * 	 - "14.5.11 Expression edm:NavigationPropertyPath"
      * 	 - "14.5.12 Expression edm:Path"
      * 	 - "14.5.13 Expression edm:PropertyPath"  It returns the information whether the navigation path
      * 			ends with an association end with multiplicity "*". It throws an error if the navigation path has an
      * 			association end with multiplicity "*" which is not the last one. Currently supports navigation properties.
      * 			Term casts and annotations of navigation properties terminate the navigation path.
      *
      * Examples:
      * ```javascript
      *
      * <template:if test="{path: 'facet>Target', formatter: 'sap.ui.model.odata.AnnotationHelper.isMultiple'}">
      * ```
      *
      *
      * @returns `"true"` if the navigation path ends with an association end with multiplicity "*", `""` in
      * case the navigation path cannot be determined, `"false"` otherwise (the latter are both treated as falsy
      * in `template:if` statements!)
      */
    def isMultiple(/**
      * the callback interface related to the current formatter call
      */
    oInterface: IContext): String = js.native
    def isMultiple(
      /**
      * the callback interface related to the current formatter call
      */
    oInterface: IContext,
      /**
      * the raw value from the meta model, e.g. `{AnnotationPath : "ToSupplier/@com.sap.vocabularies.Communication.v1.Address"}`
      * or ` {AnnotationPath : "@com.sap.vocabularies.UI.v1.FieldGroup#Dimensions"}`; embedded within an entity
      * set or entity type;
      * 	 - if this function is used as formatter the value is provided by the framework
      * 	 - if this function is called directly, provide the parameter only if it is already calculated
      * 	 - if the parameter is omitted, it is calculated automatically through `oInterface.getObject("")`
      */
    vRawValue: Any
    ): String = js.native
    def isMultiple(
      /**
      * the callback interface related to the current formatter call
      */
    oInterface: typings.openui5.sapUiModelContextMod.default
    ): String = js.native
    def isMultiple(
      /**
      * the callback interface related to the current formatter call
      */
    oInterface: typings.openui5.sapUiModelContextMod.default,
      /**
      * the raw value from the meta model, e.g. `{AnnotationPath : "ToSupplier/@com.sap.vocabularies.Communication.v1.Address"}`
      * or ` {AnnotationPath : "@com.sap.vocabularies.UI.v1.FieldGroup#Dimensions"}`; embedded within an entity
      * set or entity type;
      * 	 - if this function is used as formatter the value is provided by the framework
      * 	 - if this function is called directly, provide the parameter only if it is already calculated
      * 	 - if the parameter is omitted, it is calculated automatically through `oInterface.getObject("")`
      */
    vRawValue: Any
    ): String = js.native
    
    /**
      * Helper function for a `template:with` instruction that resolves a dynamic "14.5.2 Expression edm:AnnotationPath",
      * "14.5.11 Expression edm:NavigationPropertyPath", "14.5.12 Expression edm:Path" or "14.5.13 Expression
      * edm:PropertyPath". Currently supports navigation properties and term casts.
      *
      * Example:
      * ```javascript
      *
      *   <template:with path="meta>Value" helper="sap.ui.model.odata.AnnotationHelper.resolvePath" var="target">
      * ```
      *
      *
      * @returns the path to the target, or `undefined` in case the path cannot be resolved. In this case, a
      * warning is logged to the console.
      */
    def resolvePath(
      /**
      * a context which must point to an annotation or annotation property of type `Edm.AnnotationPath`, `Edm.NavigationPropertyPath`,
      * `Edm.Path` or `Edm.PropertyPath`, embedded within an entity set or entity type; the context's model must
      * be an {@link sap.ui.model.odata.ODataMetaModel}
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): js.UndefOr[String] = js.native
    
    /**
      * Formatter function that is used in a complex binding inside an XML template view. The function is used
      * to interpret OData V4 annotations, supporting the same annotations as {@link #.format format} but with
      * a simplified output aimed at design-time templating with smart controls.
      *
      * In contrast to `format`, "14.5.12 Expression edm:Path" or "14.5.13 Expression edm:PropertyPath" is turned
      * into a simple binding path without type or constraint information. In certain cases, a complex binding
      * is required to allow for proper escaping of the path.
      *
      * Example:
      * ```javascript
      *
      *   <sfi:SmartField value="{path: 'meta>Value', formatter: 'sap.ui.model.odata.AnnotationHelper.simplePath'}"/>
      * ```
      *
      *
      * @returns the resulting string value to write into the processed XML
      */
    def simplePath(/**
      * the callback interface related to the current formatter call
      */
    oInterface: IContext): String = js.native
    def simplePath(
      /**
      * the callback interface related to the current formatter call
      */
    oInterface: IContext,
      /**
      * the raw value from the meta model, which is embedded within an entity set or entity type:
      * 	 - if this function is used as formatter the value is provided by the framework
      * 	 - if this function is called directly, provide the parameter only if it is already calculated
      * 	 - if the parameter is omitted, it is calculated automatically through `oInterface.getObject("")`
      */
    vRawValue: Any
    ): String = js.native
    def simplePath(
      /**
      * the callback interface related to the current formatter call
      */
    oInterface: typings.openui5.sapUiModelContextMod.default
    ): String = js.native
    def simplePath(
      /**
      * the callback interface related to the current formatter call
      */
    oInterface: typings.openui5.sapUiModelContextMod.default,
      /**
      * the raw value from the meta model, which is embedded within an entity set or entity type:
      * 	 - if this function is used as formatter the value is provided by the framework
      * 	 - if this function is called directly, provide the parameter only if it is already calculated
      * 	 - if the parameter is omitted, it is calculated automatically through `oInterface.getObject("")`
      */
    vRawValue: Any
    ): String = js.native
  }
  
  type _To = AnnotationHelper
  
  /* This means you don't have to write `default`, but can instead just say `sapUiModelOdataAnnotationHelperMod.foo` */
  override def _to: AnnotationHelper = default
}
