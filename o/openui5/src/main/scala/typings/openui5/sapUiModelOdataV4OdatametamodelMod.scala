package typings.openui5

import typings.openui5.anon.ScopeValueAsPromise
import typings.openui5.anon.StandardCode
import typings.openui5.anon.`43`
import typings.openui5.anon.`44`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelOdataV4ValueListTypeMod.ValueListType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV4OdatametamodelMod {
  
  @JSImport("sap/ui/model/odata/v4/ODataMetaModel", JSImport.Default)
  @js.native
  open class default () extends ODataMetaModel
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/v4/ODataMetaModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.v4.ODataMetaModel with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.MetaModel.extend}.
      *
      * @returns Created class / constructor function
      */
    inline def extend[T /* <: Record[String, Any] */](/**
      * Name of the class being created
      */
    sClassName: String): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any]).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: Unit,
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataMetaModel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataMetaModel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.v4.ODataMetaModel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataMetaModel
    extends typings.openui5.sapUiModelMetaModelMod.default {
    
    /**
      * @SINCE 1.37.0
      *
      * See {@link sap.ui.base.EventProvider#attachEvent}
      * See:
      * 	sap.ui.base.EventProvider#attachEvent
      *
      * @returns `this` to allow method chaining
      */
    def attachEvent(/**
      * The identifier of the event to listen for
      */
    sEventId: String): this.type = js.native
    def attachEvent(/**
      * The identifier of the event to listen for
      */
    sEventId: String, _oData: js.Object): this.type = js.native
    def attachEvent(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      _oData: js.Object,
      _fnFunction: Unit,
      _oListener: js.Object
    ): this.type = js.native
    def attachEvent(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      _oData: Unit,
      _fnFunction: js.Function
    ): this.type = js.native
    def attachEvent(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      _oData: Unit,
      _fnFunction: js.Function,
      _oListener: js.Object
    ): this.type = js.native
    def attachEvent(
      /**
      * The identifier of the event to listen for
      */
    sEventId: String,
      _oData: Unit,
      _fnFunction: Unit,
      _oListener: js.Object
    ): this.type = js.native
    
    def bindProperty(
      /**
      * A relative or absolute path within the metadata model, for example "/EMPLOYEES/ENTRYDATE"
      */
    sPath: String,
      /**
      * The context to be used as a starting point in case of a relative path
      */
    oContext: Unit,
      /**
      * Optional binding parameters that are passed to {@link #getObject} to compute the binding's value; if
      * they are given, `oContext` cannot be omitted
      */
    mParameters: ScopeValueAsPromise
    ): typings.openui5.sapUiModelPropertyBindingMod.default = js.native
    def bindProperty(
      /**
      * A relative or absolute path within the metadata model, for example "/EMPLOYEES/ENTRYDATE"
      */
    sPath: String,
      /**
      * The context to be used as a starting point in case of a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Optional binding parameters that are passed to {@link #getObject} to compute the binding's value; if
      * they are given, `oContext` cannot be omitted
      */
    mParameters: ScopeValueAsPromise
    ): typings.openui5.sapUiModelPropertyBindingMod.default = js.native
    
    /**
      * @SINCE 1.59.0
      *
      * Returns a snapshot of each $metadata or annotation file loaded so far, combined into a single "JSON"
      * object according to the streamlined OData V4 Metadata JSON Format.
      * See:
      * 	#requestData
      *
      * @returns The OData metadata as a "JSON" object, if it is already available, or `undefined`.
      */
    def getData(): js.UndefOr[js.Object] = js.native
    
    /**
      * @SINCE 1.51.0
      *
      * Returns a map of entity tags for each $metadata or annotation file loaded so far.
      *
      * @returns A map which contains one entry for each $metadata or annotation file loaded so far: the key
      * is the file's URL as a `string` and the value is the `string` value of the "ETag" response header for
      * that file. Initially, the map is empty. If no "ETag" response header was sent for a file, the `Date`
      * value of the "Last-Modified" response header is used instead. The value `null` is used in case no such
      * header is sent at all. Note that this map may change due to load-on-demand of "cross-service references"
      * (see parameter `supportReferences` of {@link sap.ui.model.odata.v4.ODataModel#constructor}).
      */
    def getETags(): Record[String, String | Null] = js.native
    
    /**
      * @SINCE 1.47.0
      * @deprecated (since 1.51.0) - use {@link #getETags} instead because modifications to old files may be
      * shadowed by a new file in certain scenarios.
      *
      * Returns the maximum value of all "Last-Modified" response headers seen so far.
      *
      * @returns The maximum value of all "Last-Modified" (or, as a fallback, "Date") response headers seen so
      * far when loading $metadata or annotation files. It is `new Date(0)` initially as long as no such files
      * have been loaded. It becomes `new Date()` as soon as a file without such a header is loaded. Note that
      * this value may change due to load-on-demand of "cross-service references" (see parameter `supportReferences`
      * of {@link sap.ui.model.odata.v4.ODataModel#constructor}).
      */
    def getLastModified(): js.Date = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Returns the OData metadata model context corresponding to the given OData data model path.
      *
      * @returns The corresponding metadata context within the OData metadata model, for example with metadata
      * path "/EMPLOYEES/ENTRYDATE"
      */
    def getMetaContext(
      /**
      * An absolute data path within the OData data model, for example "/EMPLOYEES/0/ENTRYDATE"
      */
    sPath: String
    ): typings.openui5.sapUiModelContextMod.default = js.native
    
    /**
      * @SINCE 1.81.0
      *
      * Returns the OData metadata model path corresponding to the given OData data model path.
      *
      * @returns The corresponding metadata path within the OData metadata model, for example "/EMPLOYEES/ENTRYDATE"
      */
    def getMetaPath(
      /**
      * An absolute data path within the OData data model, for example "/EMPLOYEES/0/ENTRYDATE" or "/EMPLOYEES('42')/ENTRYDATE
      */
    sPath: String
    ): String = js.native
    
    def getObject(
      /**
      * A relative or absolute path within the metadata model
      */
    sPath: String,
      /**
      * The context to be used as a starting point in case of a relative path
      */
    oContext: Unit,
      /**
      * Optional (binding) parameters; if they are given, `oContext` cannot be omitted
      */
    mParameters: `43`
    ): js.UndefOr[Any] = js.native
    def getObject(
      /**
      * A relative or absolute path within the metadata model
      */
    sPath: String,
      /**
      * The context to be used as a starting point in case of a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Optional (binding) parameters; if they are given, `oContext` cannot be omitted
      */
    mParameters: `43`
    ): js.UndefOr[Any] = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Method not supported
      */
    def getOriginalProperty(): Unit = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Use {@link #getObject}.
      * See:
      * 	sap.ui.model.Model#getProperty
      */
    def getProperty(): Unit = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Returns the UI5 type for the given property path that formats and parses corresponding to the property's
      * EDM type and constraints. The property's type must be a primitive type. Use {@link #requestUI5Type} for
      * asynchronous access.
      * See:
      * 	#requestUI5Type
      *
      * @returns The corresponding UI5 type from {@link sap.ui.model.odata.type}, if all required metadata to
      * calculate this type is already available; if no specific type can be determined, a warning is logged
      * and {@link sap.ui.model.odata.type.Raw} is used
      */
    def getUI5Type(/**
      * An absolute path to an OData property within the OData data model
      */
    sPath: String): typings.openui5.sapUiModelOdataTypeOdatatypeMod.default = js.native
    def getUI5Type(
      /**
      * An absolute path to an OData property within the OData data model
      */
    sPath: String,
      /**
      * Type-specific format options, since 1.81.0. The boolean format option "parseKeepsEmptyString" applies
      * to {@link sap.ui.model.odata.type.String} only and is ignored for all other types. All other format options
      * are passed "as is".
      */
    mFormatOptions: js.Object
    ): typings.openui5.sapUiModelOdataTypeOdatatypeMod.default = js.native
    
    /**
      * @SINCE 1.45.0
      *
      * Determines which type of value list exists for the given property.
      * See:
      * 	#requestValueListType
      *
      * @returns The type of the value list
      */
    def getValueListType(
      /**
      * An absolute path to an OData property within the OData data model
      */
    sPropertyPath: String
    ): ValueListType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ValueListType * / any */ String) = js.native
    
    /**
      * @SINCE 1.63.0
      *
      * Request currency customizing based on the code list reference given in the entity container's `com.sap.vocabularies.CodeList.v1.CurrencyCodes`
      * annotation. The corresponding HTTP request uses the HTTP headers obtained via {@link sap.ui.model.odata.v4.ODataModel#getHttpHeaders}
      * from this meta model's data model.
      * See:
      * 	#requestUnitsOfMeasure
      *
      * @returns A promise resolving with the currency customizing which is a map from currency key to an object
      * with the following properties:
      * 	 StandardCode: The language-independent standard code (e.g. ISO) for the currency as referred to via
      * the `com.sap.vocabularies.CodeList.v1.StandardCode` annotation on the currency's key, if present
      * Text: The language-dependent text for the currency as referred to via the `com.sap.vocabularies.Common.v1.Text`
      * annotation on the currency's key  UnitSpecificScale: The decimals for the currency as referred to
      * via the `com.sap.vocabularies.Common.v1.UnitSpecificScale` annotation on the currency's key; entries
      * where this would be `null` are ignored, and an error is logged  It resolves with `null`, if no `com.sap.vocabularies.CodeList.v1.CurrencyCodes`
      * annotation is found. It is rejected, if there is not exactly one currency key, or if the currency customizing
      * cannot be loaded.
      */
    def requestCurrencyCodes(): js.Promise[(Record[String, StandardCode]) | Null] = js.native
    def requestCurrencyCodes(/**
      * If present, it must be this meta model's root entity container
      */
    vRawValue: Any): js.Promise[(Record[String, StandardCode]) | Null] = js.native
    def requestCurrencyCodes(
      /**
      * If present, it must be this meta model's root entity container
      */
    vRawValue: Any,
      /**
      * The details object
      */
    oDetails: `44`
    ): js.Promise[(Record[String, StandardCode]) | Null] = js.native
    def requestCurrencyCodes(
      /**
      * If present, it must be this meta model's root entity container
      */
    vRawValue: Unit,
      /**
      * The details object
      */
    oDetails: `44`
    ): js.Promise[(Record[String, StandardCode]) | Null] = js.native
    
    /**
      * @SINCE 1.59.0
      *
      * Requests a snapshot of each $metadata or annotation file loaded so far, combined into a single "JSON"
      * object according to the streamlined OData V4 Metadata JSON Format. It is a map from all currently known
      * qualified names to their values, with the special key "$EntityContainer" mapped to the root entity container's
      * qualified name as a starting point. See {@link topic:87aac894a40640f89920d7b2a414499b OData V4 Metadata
      * JSON Format}.
      *
      * Note that this snapshot may change due to load-on-demand of "cross-service references" (see parameter
      * `supportReferences` of {@link sap.ui.model.odata.v4.ODataModel#constructor}).
      * See:
      * 	#getData
      *
      * @returns A promise which is resolved with the OData metadata as a "JSON" object as soon as it is available.
      */
    def requestData(): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Requests the metadata value for the given path relative to the given context. Returns a `Promise` which
      * is resolved with the requested metadata value or rejected with an error (only in case metadata cannot
      * be loaded). An invalid path leads to an `undefined` result and a warning is logged. Use {@link #getObject}
      * for synchronous access.
      *
      * A relative path is appended to the context's path separated by a forward slash("/"). A relative path
      * starting with "@" (that is, an annotation) is appended without a separator. Use "./" as a prefix for
      * such a relative path to enforce a separator.
      *
      * Example:
      * ```javascript
      *
      * <template:with path="/EMPLOYEES/ENTRYDATE" var="property">
      *   <!-- /EMPLOYEES/ENTRYDATE/$Type -->
      *   "{property>$Type}"
      *
      *   <!-- /EMPLOYEES/ENTRYDATE@com.sap.vocabularies.Common.v1.Text -->
      *   "{property>@com.sap.vocabularies.Common.v1.Text}"
      *
      *   <!-- /EMPLOYEES/ENTRYDATE/@com.sap.vocabularies.Common.v1.Text -->
      *   "{property>./@com.sap.vocabularies.Common.v1.Text}"
      * </template:with>
      * ```
      *
      *
      * The basic idea is that every path described in "14.2.1 Attribute Target" in specification "OData Version 4.0 Part 3: Common Schema Definition Language"
      * is a valid absolute path within the metadata model if a leading slash is added; for example "/" + "MySchema.MyEntityContainer/MyEntitySet/MyComplexProperty/MyNavigationProperty".
      * Also, every path described in "14.5.2 Expression edm:AnnotationPath", "14.5.11 Expression edm:NavigationPropertyPath",
      * "14.5.12 Expression edm:Path", and "14.5.13 Expression edm:PropertyPath" is a valid relative path within
      * the metadata model if a suitable prefix is added which addresses an entity container, entity set, singleton,
      * complex type, entity type, or property; for example "/MySchema.MyEntityType/MyProperty" + "@vCard.Address#work/FullName".
      *
      * The absolute path is split into segments and followed step-by-step, starting at the global scope of all
      * known qualified OData names. There are two technical properties there: "$Version" (typically "4.0") and
      * "$EntityContainer" with the name of the single entity container for this metadata model's service.
      *
      * An empty segment in between is invalid, except to force return type lookup for operation overloads (see
      * below). An empty segment at the end caused by a trailing slash differentiates between a name and the
      * object it refers to. This way, "/$EntityContainer" refers to the name of the single entity container
      * and "/$EntityContainer/" refers to the single entity container as an object.
      *
      * The segment "@sapui.name" refers back to the last OData name (simple identifier or qualified name) or
      * annotation name encountered during path traversal immediately before "@sapui.name":
      * 	 "/EMPLOYEES@sapui.name" results in "EMPLOYEES" and "/EMPLOYEES/@sapui.name" results in the same as
      * "/EMPLOYEES/$Type", that is, the qualified name of the entity set's type (see below how "$Type" is inserted
      * implicitly). Note how the separating slash again makes a difference here.  "/EMPLOYEES/@com.sap.vocabularies.Common.v1.Label@sapui.name"
      * results in "@com.sap.vocabularies.Common.v1.Label" and a slash does not make any difference as long as
      * the annotation does not have a "$Type" property.  A technical property (that is, a numerical segment
      * or one starting with a "$") immediately before "@sapui.name" is invalid, for example "/$EntityContainer@sapui.name".
      *  The path must not continue after "@sapui.name".
      *
      * If the current object is a string value, that string value is treated as a relative path and followed
      * step-by-step before the next segment is processed. Except for this, a path must not continue if it comes
      * across a non-object value. Such a string value can be a qualified name (example path "/$EntityContainer/..."),
      * a simple identifier (example path "/TEAMS/$NavigationPropertyBinding/TEAM_2_EMPLOYEES/...") including
      * the special name "$ReturnType" (since 1.71.0), or even a path according to "14.5.12 Expression edm:Path"
      * etc. (example path "/TEAMS/@com.sap.vocabularies.UI.v1.LineItem/0/Value/$Path/...".
      *
      * Segments starting with an "@" character, for example "@com.sap.vocabularies.Common.v1.Label", address
      * annotations at the current object. As the first segment, they refer to the single entity container. For
      * objects which can only be annotated inline (see "14.3 Element edm:Annotation" minus "14.2.1 Attribute
      * Target"), the object already contains the annotations as a property. For objects which can (only or also)
      * be annotated via external targeting, the object does not contain any annotation as a property. Such annotations
      * MUST be accessed via a path. Such objects include operations (that is, actions and functions) and their
      * parameters, which can be annotated for a single overload or for all overloads at the same time.
      *
      * Segments starting with an OData name followed by an "@" character, for example "/TEAMS@Org.OData.Capabilities.V1.TopSupported",
      * address annotations at an entity set, singleton, or property, not at the corresponding type. In contrast,
      * "/TEAMS/@com.sap.vocabularies.Common.v1.Deletable" (note the separating slash) addresses an annotation
      * at the entity set's type. This is in line with the special rule of "14.5.12 Expression edm:Path" regarding
      * annotations at a navigation property itself.
      *
      * "@" can be used as a segment to address a map of all annotations of the current object. This is useful
      * for iteration, for example via `<template:repeat list="{entityType>@}" ...>`.
      *
      * Annotations of an annotation are addressed not by two separate segments, but by a single segment like
      * "@com.sap.vocabularies.Common.v1.Text@com.sap.vocabularies.Common.v1.TextArrangement". Each annotation
      * can have a qualifier, for example "@first#foo@second#bar". Note: If the first annotation's value is a
      * record, a separate segment addresses an annotation of that record, not an annotation of the first annotation
      * itself. In a similar way, annotations of "7.2 Element edm:ReferentialConstraint", "7.3 Element edm:OnDelete",
      * "10.2 Element edm:Member" and "14.5.14.2 Element edm:PropertyValue" are addressed by segments like "<7.2.1
      * Attribute Property>@...", "$OnDelete@...", "<10.2.1 Attribute Name>@..." and "<14.5.14.2.1 Attribute
      * Property>@..." (where angle brackets denote a variable part and sections refer to specification "OData Version 4.0 Part 3:
      * Common Schema Definition Language").
      *
      * Annotations starting with "@@", for example "@@sap.ui.model.odata.v4.AnnotationHelper.isMultiple" or
      * "@@.AH.isMultiple" or "@@.isMultiple", represent computed annotations. Their name without the "@@" prefix
      * must refer to a function in `mParameters.scope` in case of a relative name starting with a dot, which
      * is stripped before lookup; see the `<template:alias>` instruction for XML Templating. In case of an
      * absolute name, it is searched in `mParameters.scope` first and then in the global namespace. The names
      * "requestCurrencyCodes" and "requestUnitsOfMeasure" default to {@link #requestCurrencyCodes} and {@link
      * #requestUnitsOfMeasure} resp. if not present in `mParameters.scope`. This function is called with the
      * current object (or primitive value) and additional details and returns the result of this {@link #requestObject}
      * call. The additional details are given as an object with the following properties:
      * 	 `{boolean} $$valueAsPromise` Whether the computed annotation may return a `Promise` resolving with
      * its value (since 1.57.0)  `{@link sap.ui.model.Context} context` Points to the current object
      * `{object} overload` In case of annotations of an operation or a parameter, if filtering by binding parameter
      * determines a single operation overload, that overload is passed (since 1.71.0), else `undefined`
      * `{string} schemaChildName` The qualified name of the schema child where the computed annotation has been
      * found  Computed annotations cannot be iterated by "@". The path must not continue after a computed
      * annotation. Since 1.77.0, arguments can be given to a computed annotation much like a JavaScript function
      * call. The left parenthesis must immediately follow the name and no whitespace must follow the right parenthesis.
      * In between, a comma separated list of JSON values may be given (see `JSON.parse`); string literals may
      * be enclosed in single or double quotes; property names in object literals need not be quoted; curly brackets
      * must be replaced by `$(` and `$)` respectively, no matter where they appear, and there is no escaping
      * for `$(` and `$)` to prevent replacement back to curly brackets before parsing; as usual, `null` is supported
      * while `undefined` is not. Example: "@@AH.format($(style : 'short'$)))" or "@@AH.format(null, $($$noPatch
      * : true$)))".
      *
      * A segment which represents an OData qualified name is looked up in the global scope ("scope lookup")
      * and thus determines a schema child which is used later on. Unknown qualified names are invalid. This
      * way, "/acme.DefaultContainer/EMPLOYEES" addresses the "EMPLOYEES" child of the schema child named "acme.DefaultContainer".
      * This also works indirectly ("/$EntityContainer/EMPLOYEES") and implicitly ("/EMPLOYEES", see below).
      *
      * A segment which represents an OData simple identifier (or the special names "$ReturnType", since 1.71.0,
      * or "$Parameter", since 1.73.0) needs special preparations. The same applies to the empty segment after
      * a trailing slash.   If the current object has a "$Action", "$Function" or "$Type" property, it
      * is used for scope lookup first. This way, "/EMPLOYEES/ENTRYDATE" addresses the same object as "/EMPLOYEES/$Type/ENTRYDATE",
      * namely the "ENTRYDATE" child of the entity type corresponding to the "EMPLOYEES" child of the entity
      * container. The other cases jump from an operation import to the corresponding operation overloads.
      * Else if the segment is the first one within its path, the last schema child addressed via scope lookup
      * is used instead of the current object. This can only happen indirectly as in "/TEAMS/$NavigationPropertyBinding/TEAM_2_EMPLOYEES/..."
      * where the schema child is the entity container and the navigation property binding can contain the simple
      * identifier of another entity set within the same container.
      *
      * If the segment is the first one overall, "$EntityContainer" is inserted into the path implicitly. In
      * other words, the entity container is used as the initial schema child. This way, "/EMPLOYEES" addresses
      * the same object as "/$EntityContainer/EMPLOYEES", namely the "EMPLOYEES" child of the entity container.
      *  Afterwards, if the current object is an array, it represents overloads for an operation. Annotations
      * of an operation (since 1.71.0) or a parameter (since 1.66.0) can be immediately addressed, no matter
      * if they apply for a single overload or for all overloads at the same time, for example "/TEAMS/acme.NewAction@"
      * or "/TEAMS/acme.NewAction/Team_ID@". Annotations of an unbound operation overload can be addressed like
      * "/OperationImport/@$ui5.overload@", while "/OperationImport/@" addresses annotations of the operation
      * import itself. The special name "$ReturnType" can be used (since 1.71.0) like a parameter to address
      * annotations of the return type instead, for example "/TEAMS/acme.NewAction/$ReturnType@".
      *
      * Operation overloads are then filtered by binding parameter; multiple overloads after filtering are invalid
      * except if addressing all overloads via the segment "@$ui5.overload", for example "/acme.NewAction/@$ui5.overload".
      *
      * Once a single overload has been determined, its parameters can be immediately addressed, for example
      * "/TEAMS/acme.NewAction/Team_ID", or the special name "$Parameter" can be used (since 1.73.0), for example
      * "/TEAMS/acme.NewAction/$Parameter/Team_ID". The special name "$ReturnType" can be used (since 1.71.0)
      * like a parameter to address the return type instead, for example "/TEAMS/acme.NewAction/$ReturnType".
      * For all other names, the overload's "$ReturnType/$Type" is used for scope lookup. This way, "/GetOldestWorker/AGE"
      * addresses the same object as "/GetOldestWorker/$ReturnType/AGE" or "/GetOldestWorker/$Function/0/$ReturnType/$Type/AGE",
      * and "/TEAMS/acme.NewAction/MemberCount" (assuming "MemberCount" is not a parameter in this example) addresses
      * the same object as "/TEAMS/acme.NewAction/$ReturnType/MemberCount" or "/TEAMS/acme.NewAction/@$ui5.overload/0/$ReturnType/$Type/MemberCount".
      * In case a name can refer both to a parameter and to a property of the return type, an empty segment can
      * be used instead of "@$ui5.overload/0/$ReturnType/$Type" or "$ReturnType" to force return type lookup,
      * for example "/TEAMS/acme.NewAction//Team_ID".
      *
      * For primitive return types, the special segment "value" can be used to refer to the return type itself
      * (see {@link sap.ui.model.odata.v4.ODataContextBinding#execute}). This way, "/GetOldestAge/value" addresses
      * the same object as "/GetOldestAge/$ReturnType" or "/GetOldestAge/$Function/0/$ReturnType" or "/GetOldestAge/@$ui5.overload/0/$ReturnType"
      * (which is needed for automatic type determination, see {@link #requestUI5Type}).
      *
      * A trailing slash can be used to continue a path and thus force scope lookup or OData simple identifier
      * preparations, but then stay at the current object. This way, "/EMPLOYEES/$Type/" addresses the entity
      * type itself corresponding to the "EMPLOYEES" child of the entity container. Although the empty segment
      * is not an OData simple identifier, it can be used as a placeholder for one. In this way, "/EMPLOYEES/"
      * addresses the same entity type as "/EMPLOYEES/$Type/". That entity type in turn is a map of all its OData
      * children (that is, structural and navigation properties) and determines the set of possible child names
      * that might be used after the trailing slash.
      *
      * "$" can be used as the last segment to continue a path and thus force scope lookup, but no OData simple
      * identifier preparations. In this way, it serves as a placeholder for a technical property. The path must
      * not continue after "$", except for a computed annotation. Example: "/TEAMS/@com.sap.vocabularies.UI.v1.LineItem/0/Value/$Path/$"
      * addresses the referenced property itself, not the corresponding type like "/TEAMS/@com.sap.vocabularies.UI.v1.LineItem/0/Value/$Path/"
      * does. "/TEAMS/@com.sap.vocabularies.UI.v1.LineItem/0/Target/$NavigationPropertyPath/$@@.isMultiple" calls
      * a computed annotation on the navigation property itself, not on the corresponding type.
      *
      * Any other segment, including an OData simple identifier, is looked up as a property of the current object.
      * Segments which themselves represent a path, such as the keys for the "$ReferentialConstraint" and "$NavigationPropertyBinding"
      * maps, need to use URL encoding for the slash character ("%2F"), for example "/TEAMS/$NavigationPropertyBinding/Address%2FCountries/...".
      * See:
      * 	#getObject
      *
      * @returns A promise which is resolved with the requested metadata value as soon as it is available; it
      * is rejected if the requested metadata cannot be loaded
      */
    def requestObject(/**
      * A relative or absolute path within the metadata model
      */
    sPath: String): js.Promise[Any] = js.native
    def requestObject(
      /**
      * A relative or absolute path within the metadata model
      */
    sPath: String,
      /**
      * The context to be used as a starting point in case of a relative path
      */
    oContext: Unit,
      /**
      * Optional (binding) parameters; if they are given, `oContext` cannot be omitted
      */
    mParameters: `43`
    ): js.Promise[Any] = js.native
    def requestObject(
      /**
      * A relative or absolute path within the metadata model
      */
    sPath: String,
      /**
      * The context to be used as a starting point in case of a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): js.Promise[Any] = js.native
    def requestObject(
      /**
      * A relative or absolute path within the metadata model
      */
    sPath: String,
      /**
      * The context to be used as a starting point in case of a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Optional (binding) parameters; if they are given, `oContext` cannot be omitted
      */
    mParameters: `43`
    ): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Requests the UI5 type for the given property path that formats and parses corresponding to the property's
      * EDM type and constraints. The property's type must be a primitive type. Use {@link #getUI5Type} for synchronous
      * access.
      * See:
      * 	#getUI5Type
      *
      * @returns A promise that gets resolved with the corresponding UI5 type from {@link sap.ui.model.odata.type};
      * if no specific type can be determined, a warning is logged and {@link sap.ui.model.odata.type.Raw} is
      * used
      */
    def requestUI5Type(/**
      * An absolute path to an OData property within the OData data model
      */
    sPath: String): js.Promise[Any] = js.native
    def requestUI5Type(
      /**
      * An absolute path to an OData property within the OData data model
      */
    sPath: String,
      /**
      * Type-specific format options, since 1.81.0. The boolean format option "parseKeepsEmptyString" applies
      * to {@link sap.ui.model.odata.type.String} only and is ignored for all other types. All other format options
      * are passed "as is".
      */
    mFormatOptions: js.Object
    ): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.63.0
      *
      * Request unit customizing based on the code list reference given in the entity container's `com.sap.vocabularies.CodeList.v1.UnitOfMeasure`
      * annotation. The corresponding HTTP request uses the HTTP headers obtained via {@link sap.ui.model.odata.v4.ODataModel#getHttpHeaders}
      * from this meta model's data model.
      * See:
      * 	#requestCurrencyCodes
      *
      * @returns A promise resolving with the unit customizing which is a map from unit key to an object with
      * the following properties:
      * 	 StandardCode: The language-independent standard code (e.g. ISO) for the unit as referred to via the
      * `com.sap.vocabularies.CodeList.v1.StandardCode` annotation on the unit's key, if present  Text: The
      * language-dependent text for the unit as referred to via the `com.sap.vocabularies.Common.v1.Text` annotation
      * on the unit's key  UnitSpecificScale: The decimals for the unit as referred to via the `com.sap.vocabularies.Common.v1.UnitSpecificScale`
      * annotation on the unit's key; entries where this would be `null` are ignored, and an error is logged
      *  It resolves with `null`, if no `com.sap.vocabularies.CodeList.v1.UnitOfMeasure` annotation is found.
      * It is rejected, if there is not exactly one unit key, or if the unit customizing cannot be loaded.
      */
    def requestUnitsOfMeasure(): js.Promise[(Record[String, StandardCode]) | Null] = js.native
    def requestUnitsOfMeasure(/**
      * If present, it must be this meta model's root entity container
      */
    vRawValue: Any): js.Promise[(Record[String, StandardCode]) | Null] = js.native
    def requestUnitsOfMeasure(
      /**
      * If present, it must be this meta model's root entity container
      */
    vRawValue: Any,
      /**
      * The details object
      */
    oDetails: `44`
    ): js.Promise[(Record[String, StandardCode]) | Null] = js.native
    def requestUnitsOfMeasure(
      /**
      * If present, it must be this meta model's root entity container
      */
    vRawValue: Unit,
      /**
      * The details object
      */
    oDetails: `44`
    ): js.Promise[(Record[String, StandardCode]) | Null] = js.native
    
    /**
      * @SINCE 1.45.0
      *
      * Requests information to retrieve a value list for the property given by `sPropertyPath`.
      *
      * @returns A promise which is resolved with a map of qualifier to value list mapping objects structured
      * as defined by `com.sap.vocabularies.Common.v1.ValueListType`; the map entry with key "" represents the
      * mapping without qualifier. Each entry has an additional property "$model" which is the {@link sap.ui.model.odata.v4.ODataModel}
      * instance to read value list data via this mapping; that model is constructed with the HTTP headers obtained
      * via {@link sap.ui.model.odata.v4.ODataModel#getHttpHeaders} from this meta model's data model. Since
      * 1.80.0, that model's parameter "sharedRequests" is set automatically (see {@link sap.ui.model.odata.v4.ODataModel#constructor}).
      * If the value list model is the data model associated with this meta model, use the binding-specific parameter
      * "$$sharedRequest" instead, see {@link sap.ui.model.odata.v4.ODataModel#bindList}.
      *
      * For fixed values, only one mapping is expected and the qualifier is ignored. The mapping is available
      * with key "" and has an additional property "$qualifier" which is the original qualifier (useful in case
      * of "ValueListRelevantQualifiers" annotation).
      *
      * The promise is rejected with an error if there is no value list information available for the given property
      * path. Use {@link #getValueListType} to determine if value list information exists. It is also rejected
      * with an error if the value list metadata is inconsistent.
      *
      * Since 1.99.0, the `com.sap.vocabularies.Common.v1.ValueListWithFixedValues` annotation wins, even if
      * a `com.sap.vocabularies.Common.v1.ValueList` annotation in the service itself has the `SearchSupported`
      * property.
      *
      * An inconsistency can result from one of the following reasons:
      * 	 There is a reference, but the referenced service does not contain mappings for the property.  The
      * referenced service contains annotation targets in the namespace of the data service that are not mappings
      * for the property.  Two different referenced services contain a mapping using the same qualifier.
      *  A service is referenced twice.  There are multiple mappings for a fixed value list.  A `com.sap.vocabularies.Common.v1.ValueList`
      * annotation in a referenced service has the property `CollectionRoot` or `SearchSupported`.
      */
    def requestValueListInfo(
      /**
      * An absolute path to an OData property within the OData data model or a (meta) path to an operation parameter,
      * for example "/TEAMS(1)/acme.NewAction/Team_ID"
      */
    sPropertyPath: String
    ): js.Promise[Any] = js.native
    def requestValueListInfo(
      /**
      * An absolute path to an OData property within the OData data model or a (meta) path to an operation parameter,
      * for example "/TEAMS(1)/acme.NewAction/Team_ID"
      */
    sPropertyPath: String,
      /**
      * The value of the parameter `autoExpandSelect` for value list models created by this method. If the value
      * list model is the data model associated with this meta model, this flag has no effect. Supported since
      * 1.68.0
      */
    bAutoExpandSelect: Boolean
    ): js.Promise[Any] = js.native
    def requestValueListInfo(
      /**
      * An absolute path to an OData property within the OData data model or a (meta) path to an operation parameter,
      * for example "/TEAMS(1)/acme.NewAction/Team_ID"
      */
    sPropertyPath: String,
      /**
      * The value of the parameter `autoExpandSelect` for value list models created by this method. If the value
      * list model is the data model associated with this meta model, this flag has no effect. Supported since
      * 1.68.0
      */
    bAutoExpandSelect: Boolean,
      /**
      * Context to resolve "14.5.12 Expression edm:Path" references contained in a "com.sap.vocabularies.Common.v1.ValueListRelevantQualifiers"
      * annotation. Supported since 1.84.0
      */
    oContext: typings.openui5.sapUiModelOdataV4ContextMod.default
    ): js.Promise[Any] = js.native
    def requestValueListInfo(
      /**
      * An absolute path to an OData property within the OData data model or a (meta) path to an operation parameter,
      * for example "/TEAMS(1)/acme.NewAction/Team_ID"
      */
    sPropertyPath: String,
      /**
      * The value of the parameter `autoExpandSelect` for value list models created by this method. If the value
      * list model is the data model associated with this meta model, this flag has no effect. Supported since
      * 1.68.0
      */
    bAutoExpandSelect: Unit,
      /**
      * Context to resolve "14.5.12 Expression edm:Path" references contained in a "com.sap.vocabularies.Common.v1.ValueListRelevantQualifiers"
      * annotation. Supported since 1.84.0
      */
    oContext: typings.openui5.sapUiModelOdataV4ContextMod.default
    ): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.47.0
      *
      * Determines which type of value list exists for the given property.
      * See:
      * 	#getValueListType
      *
      * @returns A promise that is resolved with the type of the value list, a constant of the enumeration {@link
      * sap.ui.model.odata.v4.ValueListType}. The promise is rejected if the property cannot be found in the
      * metadata.
      */
    def requestValueListType(
      /**
      * An absolute path to an OData property within the OData data model
      */
    sPropertyPath: String
    ): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.37.0
      *
      * Method not supported
      */
    def setLegacySyntax(): Unit = js.native
  }
}
