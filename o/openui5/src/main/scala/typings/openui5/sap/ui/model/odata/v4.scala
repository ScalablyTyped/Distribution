package typings.openui5.sap.ui.model.odata

import typings.jquery.JQueryPromise
import typings.openui5.TypeofFilterType
import typings.openui5.sap.ui.model.ContextBinding
import typings.openui5.sap.ui.model.ListBinding
import typings.openui5.sap.ui.model.MetaModel
import typings.openui5.sap.ui.model.Model
import typings.openui5.sap.ui.model.PropertyBinding
import typings.openui5.sap.ui.model.Sorter
import typings.openui5.sap.ui.model.odata.`type`.ODataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.odata.v4")
@js.native
object v4 extends js.Object {
  @js.native
  class Context protected ()
    extends typings.openui5.sap.ui.model.Context {
    /**
      * Do <strong>NOT</strong> call this private constructor for a new <code>Context</code>. In theOData V4
      * model you cannot create contexts at will: retrieve them from a binding or a viewelement instead.
      * @param oModel The model
      * @param oBinding A binding that belongs to the model
      * @param sPath An absolute path without trailing slash
      * @param iIndex Index of item (within the collection addressed by <code>sPath</code>) represented  by
      * this context; used by list bindings, not context bindings
      */
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      oBinding: typings.openui5.sap.ui.model.odata.v4.ODataContextBinding,
      sPath: String
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      oBinding: typings.openui5.sap.ui.model.odata.v4.ODataListBinding,
      sPath: String
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      oBinding: typings.openui5.sap.ui.model.odata.v4.ODataContextBinding,
      sPath: String,
      iIndex: Double
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      oBinding: typings.openui5.sap.ui.model.odata.v4.ODataListBinding,
      sPath: String,
      iIndex: Double
    ) = this()
    /**
      * Returns the "canonical path" of the entity for this context.According to "4.3.1 Canonical URL" of
      * the specification "OData Version 4.0 Part 2: URLConventions", this is the "name of the entity set
      * associated with the entity followed by thekey predicate identifying the entity within the
      * collection".Use the canonical path in {@link sap.ui.core.Element#bindElement} to create an
      * elementbinding.
      * @since 1.39.0
      */
    var getCanonicalPath: js.Any = js.native
    /**
      * Returns a promise for the "canonical path" of the entity for this context.According to "4.3.1
      * Canonical URL" of the specification "OData Version 4.0 Part 2: URLConventions", this is the "name of
      * the entity set associated with the entity followed by thekey predicate identifying the entity within
      * the collection".Use the canonical path in {@link sap.ui.core.Element#bindElement} to create an
      * elementbinding.
      * @since 1.39.0
      */
    var requestCanonicalPath: js.Any = js.native
    /**
      * Returns the binding this context belongs to.
      * @since 1.39.0
      * @returns The context's binding
      */
    def getBinding(): typings.openui5.sap.ui.model.odata.v4.ODataContextBinding | typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    /**
      * Returns the context's index within the binding's collection.
      * @since 1.39.0
      * @returns The context's index within the binding's collection or <code>undefined</code> if the 
      * context does not belong to a list binding.
      */
    def getIndex(): Double = js.native
    def getProperty(sPath: String, bExternalFormat: Boolean): js.Any = js.native
    /**
      * Returns a promise on the value for the given path relative to this context. The functionallows
      * access to the complete data the context points to (when <code>sPath</code> is "") orany part
      * thereof. The data is a JSON structure as described in<a
      * href="http://docs.oasis-open.org/odata/odata-json-format/v4.0/odata-json-format-v4.0.html">"OData
      * JSON Format Version 4.0"</a>.Note that the function clones the result. Modify values via{@link
      * sap.ui.model.odata.v4.ODataPropertyBinding#setValue}.
      * @since 1.39.0
      * @param sPath A relative path within the JSON structure
      * @returns A promise on the requested value
      */
    def requestObject(sPath: String): JQueryPromise[_] = js.native
    /**
      * Returns a promise on the property value for the given path relative to this context. The pathis
      * expected to point to a structural property with primitive type.
      * @since 1.39.0
      * @param sPath A relative path within the JSON structure
      * @param bExternalFormat If <code>true</code>, the value is returned in external format using a UI5
      * type for the  given property path that formats corresponding to the property's EDM type and
      * constraints.
      * @returns A promise on the requested value; it is rejected if the value is not primitive
      */
    def requestProperty(sPath: String): JQueryPromise[_] = js.native
    def requestProperty(sPath: String, bExternalFormat: Boolean): JQueryPromise[_] = js.native
  }
  
  @js.native
  class ODataContextBinding protected () extends ContextBinding {
    /**
      * DO NOT CALL this private constructor for a new <code>ODataContextBinding</code>,but rather use
      * {@link sap.ui.model.odata.v4.ODataModel#bindContext bindContext} instead!
      * @param oModel The OData V4 model
      * @param sPath The binding path in the model; must not end with a slash
      * @param oContext The context which is required as base for a relative path
      * @param mParameters Map of binding parameters which can be OData query options as specified in 
      * "OData Version 4.0 Part 2: URL Conventions" or the binding-specific parameters "$$groupId"  and
      * "$$updateGroupId".  Note: If parameters are provided for a relative binding path, the binding
      * accesses data  with its own service requests instead of using its parent binding.  The following
      * OData query options are allowed:  <ul>  <li> All "5.2 Custom Query Options" except for those with a
      * name starting with "sap-"  <li> The $expand, $filter, $orderby and $select "5.1 System Query
      * Options"; OData V4 only  allows $filter and $orderby inside resource paths that identify a
      * collection. In our case  here, this means you can only use them inside $expand.  </ul>  All other
      * query options lead to an error.  Query options specified for the binding overwrite model query
      * options.
      */
    def this(oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel, sPath: String) = this()
    def this(oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel, sPath: String, oContext: Context) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: Context,
      mParameters: js.Any
    ) = this()
    /**
      * Returns the bound context.
      * @since 1.39.0
      */
    var getBoundContext: js.Any = js.native
    /**
      * Calls the OData operation that corresponds to this operation binding.Parameters for the operation
      * must be set via {@link #setParameter} beforehand.The value of this binding is the result of the
      * operation. To access a result of primitivetype, bind a control to the path "value", for
      * example<code>&lt;Text text="{value}"/&gt;</code>. If the result has a complex or entity type, youcan
      * bind properties as usual, for example <code>&lt;Text text="{street}"/&gt;</code>.
      * @since 1.37.0
      * @param sGroupId The group ID to be used for the request; if not specified, the group ID for this
      * binding is  used, see {@link sap.ui.model.odata.v4.ODataContextBinding#constructor}.  Valid values
      * are <code>undefined</code>, <code>'$auto'</code>, <code>'$direct'</code> or  application group IDs
      * as specified in {@link sap.ui.model.odata.v4.ODataModel#submitBatch}.
      * @returns A promise that is resolved without data when the operation call succeeded, or rejected 
      * with an instance of <code>Error</code> in case of failure.
      */
    def execute(sGroupId: String): JQueryPromise[_] = js.native
    /**
      * Returns <code>true</code> if the binding has pending changes, meaning updates via two-waybinding
      * that have not yet been sent to the server.
      * @since 1.39.0
      * @returns <code>true</code> if the binding has pending changes
      */
    def hasPendingChanges(): Boolean = js.native
    /**
      * Resets all pending property changes of this binding, meaning updates via two-way binding thathave
      * not yet been sent to the server.
      * @since 1.40.1
      */
    def resetChanges(): Unit = js.native
    /**
      * Sets a parameter for an operation call.
      * @since 1.37.0
      * @param sParameterName The parameter name
      * @param vValue The parameter value
      * @returns <code>this</code> to enable method chaining
      */
    def setParameter(sParameterName: String, vValue: js.Any): typings.openui5.sap.ui.model.odata.v4.ODataContextBinding = js.native
  }
  
  @js.native
  class ODataListBinding protected () extends ListBinding {
    /**
      * DO NOT CALL this private constructor for a new <code>ODataListBinding</code>,but rather use {@link
      * sap.ui.model.odata.v4.ODataModel#bindList bindList} instead!
      * @param oModel The OData V4 model
      * @param sPath The binding path in the model; must not be empty or end with a slash
      * @param oContext The parent context which is required as base for a relative path
      * @param vSorters The dynamic sorters to be used initially. Call {@link #sort} to replace them. Static
      *  sorters, as defined in the '$orderby' binding parameter, are always executed after the  dynamic
      * sorters.  Supported since 1.39.0.
      * @param vFilters The dynamic application filters to be used initially. Call {@link #filter} to
      * replace them.  Static filters, as defined in the '$filter' binding parameter, are always combined
      * with the  dynamic filters using a logical <code>AND</code>.  Supported since 1.39.0.
      * @param mParameters Map of binding parameters which can be OData query options as specified in 
      * "OData Version 4.0 Part 2: URL Conventions" or the binding-specific parameters "$$groupId"  and
      * "$$updateGroupId".  Note: If parameters are provided for a relative binding path, the binding
      * accesses data  with its own service requests instead of using its parent binding.  The following
      * OData query options are allowed:  <ul>  <li> All "5.2 Custom Query Options" except for those with a
      * name starting with "sap-"  <li> The $expand, $filter, $orderby and $select "5.1 System Query
      * Options"  </ul>  All other query options lead to an error.  Query options specified for the binding
      * overwrite model query options.
      */
    def this(oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel, sPath: String) = this()
    def this(oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel, sPath: String, oContext: Context) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: Context,
      vSorters: js.Array[Sorter]
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: Context,
      vSorters: Sorter
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: Context,
      vSorters: js.Array[Sorter],
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter]
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: Context,
      vSorters: js.Array[Sorter],
      vFilters: typings.openui5.sap.ui.model.Filter
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: Context,
      vSorters: Sorter,
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter]
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: Context,
      vSorters: Sorter,
      vFilters: typings.openui5.sap.ui.model.Filter
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: Context,
      vSorters: js.Array[Sorter],
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: Context,
      vSorters: js.Array[Sorter],
      vFilters: typings.openui5.sap.ui.model.Filter,
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: Context,
      vSorters: Sorter,
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter],
      mParameters: js.Any
    ) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: Context,
      vSorters: Sorter,
      vFilters: typings.openui5.sap.ui.model.Filter,
      mParameters: js.Any
    ) = this()
    def filter(vFilters: js.Array[typings.openui5.sap.ui.model.Filter]): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    /**
      * Filters the list with the given filters.If there are pending changes an error is thrown. Use {@link
      * #hasPendingChanges} to check ifthere are pending changes. If there are changes, call{@link
      * sap.ui.model.odata.v4.ODataModel#submitBatch} to submit the changes or{@link
      * sap.ui.model.odata.v4.ODataModel#resetChanges} to reset the changes before calling'filter'.
      * @since 1.39.0
      * @param vFilters The dynamic filters to be used; replaces the dynamic filters given in  {@link
      * sap.ui.model.odata.v4.ODataModel#bindList}.  The filter executed on the list is created from the
      * following parts, which are combined  with a logical 'and':  <ul>  <li> dynamic filters of type
      * sap.ui.model.FilterType.Application  <li> dynamic filters of type sap.ui.model.FilterType.Control 
      * <li> the static filters, as defined in the '$filter' binding parameter  </ul>
      * @param sFilterType The filter type to use
      * @returns <code>this</code> to facilitate method chaining
      */
    def filter(vFilters: typings.openui5.sap.ui.model.Filter): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    def filter(vFilters: typings.openui5.sap.ui.model.Filter, sFilterType: TypeofFilterType): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    def getContexts(iStart: Double, iLength: Double, iMaximumPrefetchSize: Double): js.Array[Context] = js.native
    /**
      * Returns <code>true</code> if the binding has pending changes, meaning updates via two-waybinding
      * that have not yet been sent to the server.
      * @since 1.39.0
      * @returns <code>true</code> if the binding has pending changes
      */
    def hasPendingChanges(): Boolean = js.native
    /**
      * Resets all pending property changes of this binding, meaning updates via two-way binding thathave
      * not yet been sent to the server.
      * @since 1.40.1
      */
    def resetChanges(): Unit = js.native
  }
  
  @js.native
  class ODataMetaModel protected () extends MetaModel {
    /**
      * Do <strong>NOT</strong> call this private constructor for a new <code>ODataMetaModel</code>,but
      * rather use {@link sap.ui.model.odata.v4.ODataModel#getMetaModel getMetaModel} instead.
      * @param oRequestor The meta data requestor
      * @param sUrl The URL to the $metadata document of the service
      */
    def this(oRequestor: js.Any, sUrl: String) = this()
    def bindList(
      sPath: String,
      oContext: typings.openui5.sap.ui.model.Context,
      aSorters: js.Array[Sorter],
      aFilters: typings.openui5.sap.ui.model.Filter
    ): ListBinding = js.native
    def bindList(sPath: String, oContext: typings.openui5.sap.ui.model.Context, aSorters: Sorter): ListBinding = js.native
    def bindList(
      sPath: String,
      oContext: typings.openui5.sap.ui.model.Context,
      aSorters: Sorter,
      aFilters: js.Array[typings.openui5.sap.ui.model.Filter]
    ): ListBinding = js.native
    def bindList(
      sPath: String,
      oContext: typings.openui5.sap.ui.model.Context,
      aSorters: Sorter,
      aFilters: typings.openui5.sap.ui.model.Filter
    ): ListBinding = js.native
    /**
      * Returns the OData meta data model context corresponding to the given OData data model path.
      * @since 1.37.0
      * @param sPath An absolute data path within the OData data model, for example 
      * "/EMPLOYEES/0/ENTRYDATE"
      * @returns The corresponding meta data context within the OData meta data model, for example with 
      * meta data path "/EMPLOYEES/ENTRYDATE"
      */
    def getMetaContext(sPath: String): typings.openui5.sap.ui.model.Context = js.native
    def getObject(sPath: String, oContext: typings.openui5.sap.ui.model.Context): js.Any = js.native
    /**
      * Method not supported
      * @since 1.37.0
      */
    def getOriginalProperty(): Unit = js.native
    /**
      * @since 1.37.0
      */
    def getProperty(): Unit = js.native
    /**
      * Returns the UI5 type for the given property path that formats and parses corresponding tothe
      * property's EDM type and constraints. The property's type must be a primitive type. Use{@link
      * #requestUI5Type requestUI5Type} for asynchronous access.
      * @since 1.37.0
      * @param sPath An absolute path to an OData property within the OData data model
      * @returns The corresponding UI5 type from <code>sap.ui.model.odata.type</code>, if all required meta 
      * data to calculate this type is already available; if no specific type can be determined, a  warning
      * is logged and <code>sap.ui.model.odata.type.Raw</code> is used
      */
    def getUI5Type(sPath: String): ODataType = js.native
    /**
      * Method not supported
      * @since 1.37.0
      */
    def isList(): Unit = js.native
    /**
      * Method not supported
      * @since 1.37.0
      */
    def refresh(): Unit = js.native
    /**
      * Requests the meta data value for the given path relative to the given context (see{@link #resolve
      * resolve} on how this resolution happens and how slashes are inserted as aseparator). Returns a
      * <code>Promise</code> which is resolved with the requested meta datavalue or rejected with an error
      * (only in case meta data cannot be loaded). An invalid pathleads to an <code>undefined</code> result
      * and a warning is logged. Use{@link #getObject getObject} for synchronous access.The basic idea is
      * that every path described in "14.2.1 Attribute Target" in specification"OData Version 4.0 Part 3:
      * Common Schema Definition Language" is a valid absolute pathwithin the meta data model if a leading
      * slash is added; for example"/" +
      * "MySchema.MyEntityContainer/MyEntitySet/MyComplexProperty/MyNavigationProperty". Also,every path
      * described in "14.5.2 Expression edm:AnnotationPath","14.5.11 Expression edm:NavigationPropertyPath",
      * "14.5.12 Expression edm:Path", and"14.5.13 Expression edm:PropertyPath" is a valid relative path
      * within the meta data modelif a suitable prefix is added which addresses an entity container, entity
      * set, singleton,complex type, entity type, or property; for
      * example"/MySchema.MyEntityType/MyProperty" + "@vCard.Address#work/FullName".The absolute path is
      * split into segments and followed step-by-step, starting at the globalscope of all known qualified
      * OData names. There are two technical properties there:"$Version" (typically "4.0") and
      * "$EntityContainer" with the name of the single entitycontainer for this meta data model's service.An
      * empty segment in between is invalid. An empty segment at the end caused by a trailingslash
      * differentiates between a name and the object it refers to. This way,"/$EntityContainer" refers to
      * the name of the single entity container and"/$EntityContainer/" refers to the single entity
      * container as an object.The segment "@sapui.name" refers back to the last OData name (simple
      * identifier or qualifiedname) or annotation name encountered during path traversal immediately before
      * "@sapui.name":<ul><li> "/EMPLOYEES@sapui.name" results in "EMPLOYEES" and
      * "/EMPLOYEES/@sapui.name"results in the same as "/EMPLOYEES/$Type", that is, the qualified name of
      * the entity set'stype (see below how "$Type" is inserted implicitly). Note how the separating slash
      * againmakes a difference here.<li> "/EMPLOYEES/@com.sap.vocabularies.Common.v1.Label@sapui.name"
      * results in"@com.sap.vocabularies.Common.v1.Label" and a slash does not make any difference as long
      * asthe annotation does not have a "$Type" property.<li> A technical property (that is, a numerical
      * segment or one starting with a "$")immediately before "@sapui.name" is invalid, for example
      * "/$EntityContainer@sapui.name".</ul>The path must not continue after "@sapui.name".If the current
      * object is a string value, that string value is treated as a relative path andfollowed step-by-step
      * before the next segment is processed. Except for this, a path mustnot continue if it comes across a
      * non-object value. Such a string value can be a qualifiedname (example path "/$EntityContainer/..."),
      * a simple identifier (example path"/TEAMS/$NavigationPropertyBinding/TEAM_2_EMPLOYEES/...") or even a
      * path according to"14.5.12 Expression edm:Path" etc. (example
      * path"/TEAMS/$Type/@com.sap.vocabularies.UI.v1.LineItem/0/Value/$Path/...").Segments starting with an
      * "@" character, for example "@com.sap.vocabularies.Common.v1.Label",address annotations at the
      * current object. As the first segment, they refer to the singleentity container. For objects which
      * can only be annotated inline (see "14.3 Elementedm:Annotation" minus "14.2.1 Attribute Target"), the
      * object already contains theannotations as a property. For objects which can (only or also) be
      * annotated via externaltargeting, the object does not contain any annotation as a property. Such
      * annotations MUSTbe accessed via a path. BEWARE of a special case: Actions, functions and their
      * parameterscan be annotated inline for a single overload or via external targeting for all overloads
      * atthe same time. In this case, the object contains all annotations for the single overload asa
      * property, but annotations MUST nevertheless be accessed via a path in order to includealso
      * annotations for all overloads at the same time.Segments starting with an OData name followed by an
      * "@" character, for example"/TEAMS@Org.OData.Capabilities.V1.TopSupported", address annotations at an
      * entity set,singleton, or property, not at the corresponding type. In
      * contrast,"/TEAMS/@com.sap.vocabularies.Common.v1.Deletable" (note the separating slash) addresses
      * anannotation at the entity set's type. This is in line with the special rule of"14.5.12 Expression
      * edm:Path" regarding annotations at a navigation property itself."@" can be used as a segment to
      * address a map of all annotations of the current object. Thisis useful for iteration, for example
      * via<code>&lt;template:repeat list="{entityType>@}" ...></code>.Annotations of an annotation are
      * addressed not by two separate segments, but by a singlesegment
      * like"@com.sap.vocabularies.Common.v1.Text@com.sap.vocabularies.Common.v1.TextArrangement".
      * Eachannotation can have a qualifier, for example "@first#foo@second#bar". Note: If the
      * firstannotation's value is a record, a separate segment addresses an annotation of that record,not
      * an annotation of the first annotation itself.In a similar way, annotations of "7.2 Element
      * edm:ReferentialConstraint","7.3 Element edm:OnDelete", "10.2 Element edm:Member" and"14.5.14.2
      * Element edm:PropertyValue" are addressed by segments like"&lt;7.2.1 Attribute Property>@...",
      * "$OnDelete@...", "&lt;10.2.1 Attribute Name>@..." and"&lt;14.5.14.2.1 Attribute Property>@..."
      * (where angle brackets denote a variable part andsections refer to specification "OData Version 4.0
      * Part 3: Common Schema DefinitionLanguage").A segment which represents an OData qualified name is
      * looked up in the global scope ("scopelookup") and thus determines a schema child which is used later
      * on. Unknown qualified namesare invalid. This way, "/acme.DefaultContainer/EMPLOYEES" addresses the
      * "EMPLOYEES" child ofthe schema child named "acme.DefaultContainer". This also works
      * indirectly("/$EntityContainer/EMPLOYEES") and implicitly ("/EMPLOYEES", see below).A segment which
      * represents an OData simple identifier needs special preparations. The sameapplies to the empty
      * segment after a trailing slash.<ol><li> If the current object has a "$Action", "$Function" or
      * "$Type" property, it is used for   scope lookup first. This way, "/EMPLOYEES/ENTRYDATE" addresses
      * the same object as   "/EMPLOYEES/$Type/ENTRYDATE", namely the "ENTRYDATE" child of the entity type  
      * corresponding to the "EMPLOYEES" child of the entity container. The other cases jump from   an
      * action or function import to the corresponding action or function overloads.<li> Else if the segment
      * is the first one within its path, the last schema child addressed   via scope lookup is used instead
      * of the current object. This can only happen indirectly as   in
      * "/TEAMS/$NavigationPropertyBinding/TEAM_2_EMPLOYEES/..." where the schema child is the   entity
      * container and the navigation property binding can contain the simple identifier of   another entity
      * set within the same container.   If the segment is the first one overall, "$EntityContainer" is
      * inserted into the path   implicitly. In other words, the entity container is used as the initial
      * schema child.   This way, "/EMPLOYEES" addresses the same object as "/$EntityContainer/EMPLOYEES",
      * namely   the "EMPLOYEES" child of the entity container.<li> Afterwards, if the current object is an
      * array, it represents overloads for an action or   function. Multiple overloads are invalid. The
      * overload's "$ReturnType/$Type" is used for   scope lookup. This way, "/GetOldestWorker/AGE"
      * addresses the same object as   "/GetOldestWorker/0/$ReturnType/$Type/AGE". For primitive return
      * types, the special   segment "value" can be used to refer to the return type itself (see   {@link
      * sap.ui.model.odata.v4.ODataContextBinding#execute}). This way,   "/GetOldestAge/value" addresses the
      * same object as "/GetOldestAge/0/$ReturnType" (which   is needed for automatic type determination,
      * see {@link #requestUI5Type}).</ol>A trailing slash can be used to continue a path and thus force
      * scope lookup or OData simpleidentifier preparations, but then stay at the current object. This way,
      * "/EMPLOYEES/$Type/"addresses the entity type itself corresponding to the "EMPLOYEES" child of the
      * entitycontainer. Although the empty segment is not an OData simple identifier, it can be used as
      * aplaceholder for one. In this way, "/EMPLOYEES/" addresses the same entity type
      * as"/EMPLOYEES/$Type/". That entity type in turn is a map of all its OData children (that
      * is,structural and navigation properties) and determines the set of possible child names thatmight be
      * used after the trailing slash.Any other segment, including an OData simple identifier, is looked up
      * as a property of thecurrent object.
      * @since 1.37.0
      * @param sPath A relative or absolute path within the meta data model
      * @param oContext The context to be used as a starting point in case of a relative path, see  {@link
      * #resolve resolve}
      * @returns A promise which is resolved with the requested meta data value as soon as it is  available
      */
    def requestObject(sPath: String): JQueryPromise[_] = js.native
    def requestObject(sPath: String, oContext: typings.openui5.sap.ui.model.Context): JQueryPromise[_] = js.native
    /**
      * Requests the UI5 type for the given property path that formats and parses corresponding tothe
      * property's EDM type and constraints. The property's type must be a primitive type. Use{@link
      * #getUI5Type getUI5Type} for synchronous access.
      * @since 1.37.0
      * @param sPath An absolute path to an OData property within the OData data model
      * @returns A promise that gets resolved with the corresponding UI5 type from 
      * <code>sap.ui.model.odata.type</code> or rejected with an error; if no specific type can be 
      * determined, a warning is logged and <code>sap.ui.model.odata.type.Raw</code> is used
      */
    def requestUI5Type(sPath: String): JQueryPromise[_] = js.native
    /**
      * Method not supported
      * @since 1.37.0
      */
    def setLegacySyntax(): Unit = js.native
  }
  
  @js.native
  class ODataModel protected () extends Model {
    /**
      * Constructor for a new ODataModel.
      * @param mParameters The parameters
      */
    def this(mParameters: js.Any) = this()
    def bindContext(sPath: String, oContext: Context): typings.openui5.sap.ui.model.odata.v4.ODataContextBinding = js.native
    def bindContext(sPath: String, oContext: Context, mParameters: js.Any): typings.openui5.sap.ui.model.odata.v4.ODataContextBinding = js.native
    def bindList(sPath: String, oContext: Context): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    def bindList(sPath: String, oContext: Context, vSorters: js.Array[Sorter]): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    def bindList(
      sPath: String,
      oContext: Context,
      vSorters: js.Array[Sorter],
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter]
    ): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    def bindList(
      sPath: String,
      oContext: Context,
      vSorters: js.Array[Sorter],
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter],
      mParameters: js.Any
    ): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    def bindList(
      sPath: String,
      oContext: Context,
      vSorters: js.Array[Sorter],
      vFilters: typings.openui5.sap.ui.model.Filter
    ): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    def bindList(
      sPath: String,
      oContext: Context,
      vSorters: js.Array[Sorter],
      vFilters: typings.openui5.sap.ui.model.Filter,
      mParameters: js.Any
    ): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    def bindList(sPath: String, oContext: Context, vSorters: Sorter): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    def bindList(
      sPath: String,
      oContext: Context,
      vSorters: Sorter,
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter]
    ): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    def bindList(
      sPath: String,
      oContext: Context,
      vSorters: Sorter,
      vFilters: js.Array[typings.openui5.sap.ui.model.Filter],
      mParameters: js.Any
    ): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    def bindList(sPath: String, oContext: Context, vSorters: Sorter, vFilters: typings.openui5.sap.ui.model.Filter): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    def bindList(
      sPath: String,
      oContext: Context,
      vSorters: Sorter,
      vFilters: typings.openui5.sap.ui.model.Filter,
      mParameters: js.Any
    ): typings.openui5.sap.ui.model.odata.v4.ODataListBinding = js.native
    def bindProperty(sPath: String, oContext: Context): typings.openui5.sap.ui.model.odata.v4.ODataPropertyBinding = js.native
    def bindProperty(sPath: String, oContext: Context, mParameters: js.Any): typings.openui5.sap.ui.model.odata.v4.ODataPropertyBinding = js.native
    /**
      * Method not supported
      * @since 1.37.0
      */
    def destroyBindingContext(): Unit = js.native
    /**
      * Method not supported
      * @since 1.37.0
      */
    def getObject(): Unit = js.native
    /**
      * Method not supported
      * @since 1.37.0
      */
    def getOriginalProperty(): Unit = js.native
    /**
      * Method not supported
      * @since 1.37.0
      */
    def getProperty(): Unit = js.native
    /**
      * Returns <code>true</code> if there are pending changes that would be reset by{@link #refresh}.
      * @since 1.39.0
      * @returns <code>true</code> if there are pending changes
      */
    def hasPendingChanges(): Boolean = js.native
    /**
      * Method not supported
      * @since 1.37.0
      */
    def isList(): Unit = js.native
    /**
      * Returns a promise for the "canonical path" of the entity for the given context.According to "4.3.1
      * Canonical URL" of the specification "OData Version 4.0 Part 2: URLConventions", this is the "name of
      * the entity set associated with the entity followed by thekey predicate identifying the entity within
      * the collection".Use the canonical path in {@link sap.ui.core.Element#bindElement} to create an
      * elementbinding.
      * @since 1.37.0
      * @param oEntityContext A context in this model which must point to a non-contained OData entity
      * @returns A promise which is resolved with the canonical path (e.g. "/EMPLOYEES(ID='1')") in case of 
      * success, or rejected with an instance of <code>Error</code> in case of failure, e.g. when  the given
      * context does not point to an entity
      */
    def requestCanonicalPath(oEntityContext: Context): JQueryPromise[_] = js.native
    /**
      * Resets all property changes associated with the given application group ID which have notyet been
      * submitted via {@link #submitBatch}.
      * @since 1.39.0
      * @param sGroupId The application group ID, which is a non-empty string consisting of alphanumeric 
      * characters from the basic Latin alphabet, including the underscore. If it is 
      * <code>undefined</code>, the model's <code>updateGroupId</code> is used. Note that the  default
      * <code>updateGroupId</code> is "$auto", which is invalid here.
      */
    def resetChanges(sGroupId: String): Unit = js.native
    /**
      * Method not supported
      * @since 1.37.0
      */
    def setLegacySyntax(): Unit = js.native
    /**
      * Submits the requests associated with the given application group ID in one batch request.
      * @since 1.37.0
      * @param sGroupId The application group ID, which is a non-empty string consisting of alphanumeric 
      * characters from the basic Latin alphabet, including the underscore.
      * @returns A promise on the outcome of the HTTP request resolving with <code>undefined</code>; it is 
      * rejected with an error if the batch request itself fails
      */
    def submitBatch(sGroupId: String): JQueryPromise[_] = js.native
  }
  
  @js.native
  class ODataPropertyBinding protected () extends PropertyBinding {
    /**
      * DO NOT CALL this private constructor for a new <code>ODataPropertyBinding</code>,but rather use
      * {@link sap.ui.model.odata.v4.ODataModel#bindProperty bindProperty} instead!
      * @param oModel The OData V4 model
      * @param sPath The binding path in the model; must not be empty or end with a slash
      * @param oContext The context which is required as base for a relative path
      * @param mParameters Map of binding parameters which can be OData query options as specified in 
      * "OData Version 4.0 Part 2: URL Conventions" or the binding-specific parameters "$$groupId"  and
      * "$$updateGroupId".  Note: Binding parameters may only be provided for absolute binding paths as only
      * those  lead to a data service request.  All "5.2 Custom Query Options" are allowed except for those
      * with a name starting with  "sap-". All other query options lead to an error.  Query options
      * specified for the binding overwrite model query options.
      */
    def this(oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel, sPath: String) = this()
    def this(oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel, sPath: String, oContext: Context) = this()
    def this(
      oModel: typings.openui5.sap.ui.model.odata.v4.ODataModel,
      sPath: String,
      oContext: Context,
      mParameters: js.Any
    ) = this()
    /**
      * Returns <code>true</code> if the binding has pending changes, that is updates via two-waybinding
      * that have not yet been sent to the server.
      * @since 1.39.0
      * @returns <code>true</code> if the binding has pending changes
      */
    def hasPendingChanges(): Boolean = js.native
    def setValue(vValue: js.Any, sGroupId: String): Unit = js.native
  }
  
}

