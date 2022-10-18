package typings.openui5

import typings.openui5.anon.AnnotationURI
import typings.openui5.anon.Annotations
import typings.openui5.anon.CountMode
import typings.openui5.anon.ETag
import typings.openui5.anon.Filters
import typings.openui5.anon.Merge
import typings.openui5.anon.Metadata
import typings.openui5.anon.Method
import typings.openui5.anon.ResponseText
import typings.openui5.anon.SETag
import typings.openui5.anon.Success
import typings.openui5.openui5Booleans.`false`
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataOdatamodelMod {
  
  @JSImport("sap/ui/model/odata/ODataModel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ODataModel.
    */
  open class default () extends ODataModel {
    def this(/**
      * base uri of the service to request data from; additional URL parameters appended here will be appended
      * to every request can be passed with the mParameters object as well: [mParameters.serviceUrl] A serviceURl
      * is required!
      */
    sServiceUrl: String) = this()
    def this(
      /**
      * base uri of the service to request data from; additional URL parameters appended here will be appended
      * to every request can be passed with the mParameters object as well: [mParameters.serviceUrl] A serviceURl
      * is required!
      */
    sServiceUrl: String,
      /**
      * (optional) a map which contains the following parameter properties:
      */
    mParameters: AnnotationURI
    ) = this()
    def this(
      /**
      * base uri of the service to request data from; additional URL parameters appended here will be appended
      * to every request can be passed with the mParameters object as well: [mParameters.serviceUrl] A serviceURl
      * is required!
      */
    sServiceUrl: Unit,
      /**
      * (optional) a map which contains the following parameter properties:
      */
    mParameters: AnnotationURI
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/ODataModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.ODataModel with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.Model.extend}.
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
    oClassInfo: ClassInfo[T, ODataModel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataModel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.ODataModel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataModel
    extends typings.openui5.sapUiModelModelMod.default {
    
    /**
      * Adds (a) new URL(s) to the be parsed for OData annotations, which are then merged into the annotations
      * object which can be retrieved by calling the getServiceAnnotations()-method. If a $metadata url is passed
      * the data will also be merged into the metadata object, which can be reached by calling the getServiceMetadata()
      * method.
      *
      * @returns The Promise to load the given URL(s), resolved if all URLs have been loaded, rejected if at
      * least one fails to load. If this promise resolves it returns the following parameters: annotations: The
      * annotation object entitySets: An array of EntitySet objects containing the newly merged EntitySets from
      * a $metadata requests. the structure is the same as in the metadata object reached by the getServiceMetadata()
      * method. For non $metadata requests the array will be empty.
      */
    def addAnnotationUrl(/**
      * Either one URL as string or an array or URL strings
      */
    vUrl: String): js.Promise[Any] = js.native
    def addAnnotationUrl(/**
      * Either one URL as string or an array or URL strings
      */
    vUrl: js.Array[String]): js.Promise[Any] = js.native
    
    /**
      * Adds new xml content to be parsed for OData annotations, which are then merged into the annotations object
      * which can be retrieved by calling the getServiceAnnotations()-method.
      *
      * @returns The Promise to parse the given XML-String, resolved if parsed without errors, rejected if errors
      * occur
      */
    def addAnnotationXML(/**
      * The string that should be parsed as annotation XML
      */
    sXMLContent: String): js.Promise[Any] = js.native
    def addAnnotationXML(
      /**
      * The string that should be parsed as annotation XML
      */
    sXMLContent: String,
      /**
      * Whether not to fire annotationsLoaded event on the annotationParser
      */
    bSuppressEvents: Boolean
    ): js.Promise[Any] = js.native
    
    /**
      * Appends the change batch operations to the end of the batch stack. Only `PUTPOST` or `DELETE`
      * batch operations should be included in the specified array. The operations in the array will be included
      * in a single changeset. To embed change operations in different change sets call this method with the
      * corresponding change operations again. If an illegal batch operation is added to the change set nothing
      * will be performed and false will be returned.
      *
      * @returns `false`, if an illegal batch operation is added
      */
    def addBatchChangeOperations(
      /**
      * An array of change batch operations created via `createBatchOperation` with parameter `sMethod = "POST"/"PUT"/"MERGE"/"DELETE"`
      */
    aChangeOperations: js.Array[Any]
    ): js.UndefOr[`false`] = js.native
    
    /**
      * Appends the read batch operations to the end of the batch stack. Only GET batch operations should be
      * included in the specified array. If an illegal batch operation is added to the batch nothing will be
      * performed and false will be returned.
      *
      * @returns `false`, if an illegal batch operation is added
      */
    def addBatchReadOperations(
      /**
      * An array of read batch operations created via `createBatchOperation` with `sMethod = "GET"`
      */
    aReadOperations: js.Array[Any]
    ): js.UndefOr[`false`] = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:annotationsFailed annotationsFailed} event of
      * this `sap.ui.model.odata.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAnnotationsFailed(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachAnnotationsFailed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:annotationsFailed annotationsFailed} event of
      * this `sap.ui.model.odata.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAnnotationsFailed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachAnnotationsFailed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:annotationsLoaded annotationsLoaded} event of
      * this `sap.ui.model.odata.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAnnotationsLoaded(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachAnnotationsLoaded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:annotationsLoaded annotationsLoaded} event of
      * this `sap.ui.model.odata.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachAnnotationsLoaded(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachAnnotationsLoaded(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:metadataFailed metadataFailed} event of this
      * `sap.ui.model.odata.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMetadataFailed(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachMetadataFailed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:metadataFailed metadataFailed} event of this
      * `sap.ui.model.odata.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMetadataFailed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachMetadataFailed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:metadataLoaded metadataLoaded} event of this
      * `sap.ui.model.odata.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMetadataLoaded(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachMetadataLoaded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:metadataLoaded metadataLoaded} event of this
      * `sap.ui.model.odata.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachMetadataLoaded(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): this.type = js.native
    def attachMetadataLoaded(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: Unit,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: Unit,
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: Unit,
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: Unit,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: Unit,
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: Unit,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: Unit,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: Unit,
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: Unit,
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: Unit,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: Unit,
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: Unit,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * Binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * Binding context referring to this model
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s, can be either a filter or an array of filters
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: CountMode
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    
    /**
      * Trigger a request to the function import odata service that was specified in the model constructor.
      *
      * @returns an object which has an `abort` function to abort the current request.
      */
    def callFunction(
      /**
      * A string containing the name of the function to call. The name is concatenated to the sServiceUrl which
      * was specified in the model constructor.
      */
    sFunctionName: String
    ): js.Object = js.native
    def callFunction(
      /**
      * A string containing the name of the function to call. The name is concatenated to the sServiceUrl which
      * was specified in the model constructor.
      */
    sFunctionName: String,
      /**
      * Optional parameter map containing any of the following properties:
      */
    mParameters: Method
    ): js.Object = js.native
    
    /**
      * Removes all operations in the current batch.
      */
    def clearBatch(): Unit = js.native
    
    /**
      * Trigger a POST request to the odata service that was specified in the model constructor. Please note
      * that deep creates are not supported and may not work.
      *
      * @returns an object which has an `abort` function to abort the current request.
      */
    def create(
      /**
      * A string containing the path to the collection where an entry should be created. The path is concatenated
      * to the sServiceUrl which was specified in the model constructor.
      */
    sPath: String,
      /**
      * data of the entry that should be created.
      */
    oData: js.Object
    ): js.Object = js.native
    def create(
      /**
      * A string containing the path to the collection where an entry should be created. The path is concatenated
      * to the sServiceUrl which was specified in the model constructor.
      */
    sPath: String,
      /**
      * data of the entry that should be created.
      */
    oData: js.Object,
      /**
      * Optional parameter map containing any of the following properties:
      */
    mParameters: Success
    ): js.Object = js.native
    
    /**
      * Creates a single batch operation (read or change operation) which can be used in a batch request.
      *
      * @returns The created batch operation
      */
    def createBatchOperation(
      /**
      * A string containing the path to the collection or entry where the batch operation should be performed;
      * the path is concatenated to the `sServiceUrl` which was specified in the model constructor
      */
    sPath: String,
      /**
      * For the batch operation; possible values are `GET`, `PUT`, `MERGE`, `POST` or `DELETE`
      */
    sMethod: String
    ): js.Object = js.native
    def createBatchOperation(
      /**
      * A string containing the path to the collection or entry where the batch operation should be performed;
      * the path is concatenated to the `sServiceUrl` which was specified in the model constructor
      */
    sPath: String,
      /**
      * For the batch operation; possible values are `GET`, `PUT`, `MERGE`, `POST` or `DELETE`
      */
    sMethod: String,
      /**
      * Optional data payload which should be created, updated, deleted in a change batch operation
      */
    oData: js.Object
    ): js.Object = js.native
    def createBatchOperation(
      /**
      * A string containing the path to the collection or entry where the batch operation should be performed;
      * the path is concatenated to the `sServiceUrl` which was specified in the model constructor
      */
    sPath: String,
      /**
      * For the batch operation; possible values are `GET`, `PUT`, `MERGE`, `POST` or `DELETE`
      */
    sMethod: String,
      /**
      * Optional data payload which should be created, updated, deleted in a change batch operation
      */
    oData: js.Object,
      /**
      * Optional parameter for additional information introduced in SAPUI5 1.9.1
      */
    oParameters: SETag
    ): js.Object = js.native
    def createBatchOperation(
      /**
      * A string containing the path to the collection or entry where the batch operation should be performed;
      * the path is concatenated to the `sServiceUrl` which was specified in the model constructor
      */
    sPath: String,
      /**
      * For the batch operation; possible values are `GET`, `PUT`, `MERGE`, `POST` or `DELETE`
      */
    sMethod: String,
      /**
      * Optional data payload which should be created, updated, deleted in a change batch operation
      */
    oData: Unit,
      /**
      * Optional parameter for additional information introduced in SAPUI5 1.9.1
      */
    oParameters: SETag
    ): js.Object = js.native
    
    /**
      * Creates a new entry object which is described by the metadata of the entity type of the specified sPath
      * Name. A context object is returned which can be used to bind against the newly created object.
      *
      * For each created entry a request is created and stored in a request queue. The request queue can be submitted
      * by calling submitChanges. To delete a created entry from the request queue call deleteCreateEntry.
      *
      * The optional vProperties parameter can be used as follows:
      *
      * - vProperties could be an array containing the property names which should be included in the new entry.
      * 			Other properties defined in the entity type are not included. - vProperties could be an object which
      * 			includes the desired properties and the values which should be used for the created entry.
      *
      * If vProperties is not specified, all properties in the entity type will be included in the created entry.
      *
      * If there are no values specified the properties will have undefined values.
      *
      * Please note that deep creates (including data defined by navigationproperties) are not supported
      *
      * @returns oContext A Context object that point to the new created entry.
      */
    def createEntry(
      /**
      * Name of the path to the collection
      */
    sPath: String,
      /**
      * An array that specifies a set of properties or the entry
      */
    vProperties: js.Array[Any]
    ): typings.openui5.sapUiModelContextMod.default = js.native
    def createEntry(
      /**
      * Name of the path to the collection
      */
    sPath: String,
      /**
      * An array that specifies a set of properties or the entry
      */
    vProperties: js.Object
    ): typings.openui5.sapUiModelContextMod.default = js.native
    
    /**
      * Creates the key from the given collection name and property map.
      *
      * @returns The created key
      */
    def createKey(
      /**
      * The name of the collection
      */
    sCollection: String,
      /**
      * The object containing at least all the key properties of the entity type
      */
    oKeyProperties: js.Object,
      /**
      * Whether the URI decoding should be applied on the key
      */
    bDecode: Boolean
    ): String = js.native
    
    /**
      * Deletes a created entry from the request queue and the model.
      */
    def deleteCreatedEntry(
      /**
      * The context object pointing to the created entry
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:annotationsFailed annotationsFailed} event
      * of this `sap.ui.model.odata.ODataModel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAnnotationsFailed(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachAnnotationsFailed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:annotationsLoaded annotationsLoaded} event
      * of this `sap.ui.model.odata.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachAnnotationsLoaded(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachAnnotationsLoaded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:metadataFailed metadataFailed} event of this
      * `sap.ui.model.odata.ODataModel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMetadataFailed(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachMetadataFailed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:metadataLoaded metadataLoaded} event of this
      * `sap.ui.model.odata.ODataModel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachMetadataLoaded(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachMetadataLoaded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:annotationsFailed annotationsFailed} to attached listeners.
      *
      * @returns `this` to allow method chaining
      */
    def fireAnnotationsFailed(): this.type = js.native
    def fireAnnotationsFailed(/**
      * Parameters to pass along with the event
      */
    oParameters: ResponseText): this.type = js.native
    
    /**
      * Fires event {@link #event:annotationsLoaded annotationsLoaded} to attached listeners.
      *
      * @returns `this` to allow method chaining
      */
    def fireAnnotationsLoaded(): this.type = js.native
    def fireAnnotationsLoaded(/**
      * Parameters to pass along with the event
      */
    oParameters: Annotations): this.type = js.native
    
    /**
      * Fires event {@link #event:metadataFailed metadataFailed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMetadataFailed(): this.type = js.native
    def fireMetadataFailed(/**
      * Parameters to pass along with the event
      */
    oParameters: ResponseText): this.type = js.native
    
    /**
      * Fires event {@link #event:metadataLoaded metadataLoaded} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireMetadataLoaded(): this.type = js.native
    def fireMetadataLoaded(/**
      * Parameters to pass along with the event
      */
    oParameters: Metadata): this.type = js.native
    
    /**
      * @deprecated (since 1.13) - the caching should be controlled by the backend by setting the correct cache
      * control header
      *
      * Force no caching
      */
    def forceNoCache(): Unit = js.native
    def forceNoCache(/**
      * whether to force no caching
      */
    bForceNoCache: Boolean): Unit = js.native
    
    /**
      * @deprecated (since 1.6.0) - please use {@link #getProperty} instead
      *
      * Return requested data as object if the data has already been loaded and stored in the model.
      *
      * @returns oData Object containing the requested data if the path is valid.
      */
    def getData(/**
      * A string containing the path to the data object that should be returned
      */
    sPath: String): js.Object = js.native
    def getData(
      /**
      * A string containing the path to the data object that should be returned
      */
    sPath: String,
      /**
      * The optional context which is used with the sPath to retrieve the requested data
      */
    oContext: js.Object
    ): js.Object = js.native
    def getData(
      /**
      * A string containing the path to the data object that should be returned
      */
    sPath: String,
      /**
      * The optional context which is used with the sPath to retrieve the requested data
      */
    oContext: js.Object,
      /**
      * This parameter should be set when a URI or custom parameter with a `$expand` System Query Option was
      * used to retrieve associated entries embedded/inline; if true then the `getProperty` function returns
      * a desired property value/entry and includes the associated expand entries (if any); if false the associated/expanded
      * entry properties are removed and not included in the desired entry as properties at all; this is useful
      * for performing updates on the base entry only; note: A copy and not a reference of the entry will be
      * returned.
      */
    bIncludeExpandEntries: Boolean
    ): js.Object = js.native
    def getData(
      /**
      * A string containing the path to the data object that should be returned
      */
    sPath: String,
      /**
      * The optional context which is used with the sPath to retrieve the requested data
      */
    oContext: Unit,
      /**
      * This parameter should be set when a URI or custom parameter with a `$expand` System Query Option was
      * used to retrieve associated entries embedded/inline; if true then the `getProperty` function returns
      * a desired property value/entry and includes the associated expand entries (if any); if false the associated/expanded
      * entry properties are removed and not included in the desired entry as properties at all; this is useful
      * for performing updates on the base entry only; note: A copy and not a reference of the entry will be
      * returned.
      */
    bIncludeExpandEntries: Boolean
    ): js.Object = js.native
    
    /**
      * @SINCE 1.20
      *
      * Returns the default count mode for retrieving the count of collections.
      *
      * @returns The default count mode for retrieving the count of collections
      */
    def getDefaultCountMode(): typings.openui5.sapUiModelOdataCountModeMod.CountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CountMode * / any */ String) = js.native
    
    /**
      * Returns all headers and custom headers which are stored in the OData model.
      *
      * @returns the header map
      */
    def getHeaders(): js.Object = js.native
    
    /**
      * Returns the key part from the entry URI or the given context or object.
      *
      * @returns The key part from the entry URI
      */
    def getKey(
      /**
      * The context or object
      */
    oObject: js.Object,
      /**
      * Whether the URI decoding should be applied on the key
      */
    bDecode: Boolean
    ): String = js.native
    def getKey(
      /**
      * The context or object
      */
    oObject: typings.openui5.sapUiModelContextMod.default,
      /**
      * Whether the URI decoding should be applied on the key
      */
    bDecode: Boolean
    ): String = js.native
    
    def getProperty(
      /**
      * The path/name of the property
      */
    sPath: String,
      /**
      * The context if available to access the property value
      */
    oContext: js.Object
    ): js.Object = js.native
    def getProperty(
      /**
      * The path/name of the property
      */
    sPath: String,
      /**
      * The context if available to access the property value
      */
    oContext: js.Object,
      /**
      * This parameter should be set when a URI or custom parameter with a `$expand` System Query Option was
      * used to retrieve associated entries embedded/inline. If true then the getProperty function returns a
      * desired property value/entry and includes the associated expand entries (if any). If false the associated/expanded
      * entry properties are removed and not included in the desired entry as properties at all. This is useful
      * for performing updates on the base entry only. Note: A copy and not a reference of the entry will be
      * returned.
      */
    bIncludeExpandEntries: Boolean
    ): js.Object = js.native
    def getProperty(
      /**
      * The path/name of the property
      */
    sPath: String,
      /**
      * The context if available to access the property value
      */
    oContext: Unit,
      /**
      * This parameter should be set when a URI or custom parameter with a `$expand` System Query Option was
      * used to retrieve associated entries embedded/inline. If true then the getProperty function returns a
      * desired property value/entry and includes the associated expand entries (if any). If false the associated/expanded
      * entry properties are removed and not included in the desired entry as properties at all. This is useful
      * for performing updates on the base entry only. Note: A copy and not a reference of the entry will be
      * returned.
      */
    bIncludeExpandEntries: Boolean
    ): js.Object = js.native
    
    /**
      * Returns the current security token. If the token has not been requested from the server it will be requested
      * first.
      *
      * @returns the CSRF security token
      */
    def getSecurityToken(): String = js.native
    
    /**
      * Return the annotation object. Please note that when using the model with `bLoadMetadataAsync = true`
      * then this function might return undefined because the metadata has not been loaded yet. In this case
      * attach to the `annotationsLoaded` event to get notified when the annotations are available and then call
      * this function.
      *
      * @returns Metadata object
      */
    def getServiceAnnotations(): js.UndefOr[js.Object] = js.native
    
    /**
      * Return the metadata object. Please note that when using the model with `bLoadMetadataAsync = true` then
      * this function might return `undefinedmetadataLoaded` event to get notified when the metadata is available and then call
      * this function.
      *
      * @returns Metadata object
      */
    def getServiceMetadata(): js.UndefOr[js.Object] = js.native
    
    /**
      * Checks if there exist pending changes in the model created by the setProperty method.
      *
      * @returns true/false
      */
    def hasPendingChanges(): Boolean = js.native
    
    /**
      * @deprecated (since 1.20) - please use {@link #getDefaultCountMode} instead.
      *
      * Returns whether this model supports `$count` on its collections.
      *
      * @returns Whether this model supports `$count` on its collections
      */
    def isCountSupported(): Boolean = js.native
    
    /**
      * Trigger a GET request to the odata service that was specified in the model constructor. The data will
      * not be stored in the model. The requested data is returned with the response.
      *
      * @returns an object which has an `abort` function to abort the current request.
      */
    def read(
      /**
      * A string containing the path to the data which should be retrieved. The path is concatenated to the sServiceUrl
      * which was specified in the model constructor.
      */
    sPath: String
    ): js.Object = js.native
    def read(
      /**
      * A string containing the path to the data which should be retrieved. The path is concatenated to the sServiceUrl
      * which was specified in the model constructor.
      */
    sPath: String,
      /**
      * Optional parameter map containing any of the following properties:
      */
    mParameters: Filters
    ): js.Object = js.native
    
    def refresh(
      /**
      * Force update of controls
      */
    bForceUpdate: Boolean,
      /**
      * If set to true then the model data will be removed/cleared. Please note that the data might not be there
      * when calling e.g. getProperty too early before the refresh call returned.
      */
    bRemoveData: Boolean
    ): Unit = js.native
    def refresh(
      /**
      * Force update of controls
      */
    bForceUpdate: Unit,
      /**
      * If set to true then the model data will be removed/cleared. Please note that the data might not be there
      * when calling e.g. getProperty too early before the refresh call returned.
      */
    bRemoveData: Boolean
    ): Unit = js.native
    
    /**
      * Refreshes the metadata for model, e.g. in case the first request for metadata has failed.
      */
    def refreshMetadata(): Unit = js.native
    
    /**
      * refresh XSRF token by performing a GET request against the service root URL.
      *
      * @returns an object which has an `abort` function to abort the current request.
      */
    def refreshSecurityToken(): js.Object = js.native
    def refreshSecurityToken(
      /**
      * a callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: js.Function
    ): js.Object = js.native
    def refreshSecurityToken(
      /**
      * a callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: js.Function,
      /**
      * a callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information.
      */
    fnError: js.Function
    ): js.Object = js.native
    def refreshSecurityToken(
      /**
      * a callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: js.Function,
      /**
      * a callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information.
      */
    fnError: js.Function,
      /**
      * true for asynchronous requests.
      */
    bAsync: Boolean
    ): js.Object = js.native
    def refreshSecurityToken(
      /**
      * a callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: js.Function,
      /**
      * a callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information.
      */
    fnError: Unit,
      /**
      * true for asynchronous requests.
      */
    bAsync: Boolean
    ): js.Object = js.native
    def refreshSecurityToken(
      /**
      * a callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: Unit,
      /**
      * a callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information.
      */
    fnError: js.Function
    ): js.Object = js.native
    def refreshSecurityToken(
      /**
      * a callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: Unit,
      /**
      * a callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information.
      */
    fnError: js.Function,
      /**
      * true for asynchronous requests.
      */
    bAsync: Boolean
    ): js.Object = js.native
    def refreshSecurityToken(
      /**
      * a callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: Unit,
      /**
      * a callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information.
      */
    fnError: Unit,
      /**
      * true for asynchronous requests.
      */
    bAsync: Boolean
    ): js.Object = js.native
    
    /**
      * Trigger a DELETE request to the odata service that was specified in the model constructor.
      *
      * @returns an object which has an `abort` function to abort the current request.
      */
    def remove(
      /**
      * A string containing the path to the data that should be removed. The path is concatenated to the sServiceUrl
      * which was specified in the model constructor.
      */
    sPath: String
    ): js.Object = js.native
    def remove(
      /**
      * A string containing the path to the data that should be removed. The path is concatenated to the sServiceUrl
      * which was specified in the model constructor.
      */
    sPath: String,
      /**
      * Optional, can contain the following attributes: oContext, fnSuccess, fnError, sETag:
      */
    mParameters: ETag
    ): js.Object = js.native
    
    /**
      * Resets the collected changes by the setProperty method and reloads the data from the server.
      */
    def resetChanges(): Unit = js.native
    def resetChanges(
      /**
      * a callback function which is called when the data has been successfully resetted. The handler can have
      * the following parameters: oData and response.
      */
    fnSuccess: js.Function
    ): Unit = js.native
    def resetChanges(
      /**
      * a callback function which is called when the data has been successfully resetted. The handler can have
      * the following parameters: oData and response.
      */
    fnSuccess: js.Function,
      /**
      * a callback function which is called when the request failed
      */
    fnError: js.Function
    ): Unit = js.native
    def resetChanges(
      /**
      * a callback function which is called when the data has been successfully resetted. The handler can have
      * the following parameters: oData and response.
      */
    fnSuccess: Unit,
      /**
      * a callback function which is called when the request failed
      */
    fnError: js.Function
    ): Unit = js.native
    
    /**
      * @deprecated (since 1.20) - please use {@link #setDefaultCountMode} instead.
      *
      * Sets whether this OData service supports `$count` on its collections.
      */
    def setCountSupported(
      /**
      * Whether this OData service supports `$count` on its collections
      */
    bCountSupported: Boolean
    ): Unit = js.native
    
    def setDefaultCountMode(
      /**
      * The new default count mode for this model
      */
    sCountMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CountMode * / any */ String
    ): Unit = js.native
    /**
      * @SINCE 1.20
      *
      * Sets the default mode how to retrieve the item count for a collection in this model.
      *
      * The count can be determined in the following ways
      * 	 - by sending a separate `$count` request
      * 	 - by adding parameter `$inlinecount=allpages` to one or all data requests
      * 	 - a combination of the previous two
      * 	 - not at all (questions about the size of the collection can't be answered then)  See {@link sap.ui.model.odata.CountMode}
      * 			for all enumeration values and more details.
      *
      * Note that a call to this method does not modify the count mode for existing list bindings, only bindings
      * that are created afterwards will use the new mode when no mode is defined at their creation.
      *
      * If no default count mode is set for an `ODataModel` (v1), the mode `Both` will be used for compatibility
      * reasons.
      */
    def setDefaultCountMode(
      /**
      * The new default count mode for this model
      */
    sCountMode: typings.openui5.sapUiModelOdataCountModeMod.CountMode
    ): Unit = js.native
    
    /**
      * Set custom headers which are provided in a key/value map. These headers are used for requests against
      * the OData backend. Private headers which are set in the ODataModel cannot be modified. These private
      * headers are: accept, accept-language, x-csrf-token, MaxDataServiceVersion, DataServiceVersion.
      *
      * To remove these headers simply set the mCustomHeaders parameter to null. Please also note that when calling
      * this method again all previous custom headers are removed unless they are specified again in the mCustomHeaders
      * parameter.
      */
    def setHeaders(/**
      * the header name/value map.
      */
    mHeaders: js.Object): Unit = js.native
    
    /**
      * Sets a new value for the given property `sPropertyName` in the model without triggering a server request.
      * This can be done by the `submitChanges` method.
      *
      * Note: Only one entry of one collection can be updated at once. Otherwise a `fireRejectChange` event is
      * fired.
      *
      * Before updating a different entry the existing changes of the current entry have to be submitted or reset
      * by the corresponding methods: `submitChanges`, `resetChanges`.
      *
      * IMPORTANT: All pending changes are reset in the model if the application triggers any kind of refresh
      * on that entry. Make sure to submit the pending changes first. To determine if there are any pending changes
      * call the `hasPendingChanges` method.
      *
      * @returns Whether the value was set correctly
      */
    def setProperty(
      /**
      * Path of the property to set
      */
    sPath: String,
      /**
      * Value to set the property to
      */
    oValue: Any
    ): Boolean = js.native
    def setProperty(
      /**
      * Path of the property to set
      */
    sPath: String,
      /**
      * Value to set the property to
      */
    oValue: Any,
      /**
      * The context which will be used to set the property
      */
    oContext: js.Object
    ): Boolean = js.native
    def setProperty(
      /**
      * Path of the property to set
      */
    sPath: String,
      /**
      * Value to set the property to
      */
    oValue: Any,
      /**
      * The context which will be used to set the property
      */
    oContext: js.Object,
      /**
      * Whether to update other bindings dependent on this property asynchronously
      */
    bAsyncUpdate: Boolean
    ): Boolean = js.native
    def setProperty(
      /**
      * Path of the property to set
      */
    sPath: String,
      /**
      * Value to set the property to
      */
    oValue: Any,
      /**
      * The context which will be used to set the property
      */
    oContext: Unit,
      /**
      * Whether to update other bindings dependent on this property asynchronously
      */
    bAsyncUpdate: Boolean
    ): Boolean = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Enable/Disable automatic updates of all Bindings after change operations
      */
    def setRefreshAfterChange(/**
      * Whether automatic updates should be enabled
      */
    bRefreshAfterChange: Boolean): Unit = js.native
    
    /**
      * Enable/Disable XCSRF-Token handling
      */
    def setTokenHandlingEnabled(): Unit = js.native
    def setTokenHandlingEnabled(/**
      * whether to use token handling or not
      */
    bTokenHandling: Boolean): Unit = js.native
    
    /**
      * Enable/Disable batch for all requests
      */
    def setUseBatch(): Unit = js.native
    def setUseBatch(/**
      * whether the requests should be encapsulated in a batch request
      */
    bUseBatch: Boolean): Unit = js.native
    
    /**
      * Submits the collected changes in the batch which were collected via `addBatchReadOperations` or `addBatchChangeOperations`.
      * The batch will be cleared afterwards. If the batch is empty, no request will be sent and false will be
      * returned.
      *
      * **Note:** No data will be stored in the model as long as `bImportData` is not set.
      *
      * @returns An object which has an `abort` function to abort the current request. Returns false if no request
      * will be performed because the batch is empty.
      */
    def submitBatch(): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: js.Function
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: js.Function,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: js.Function
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: js.Function,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: js.Function,
      /**
      * true for asynchronous request
      */
    bAsync: Boolean
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: js.Function,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: js.Function,
      /**
      * true for asynchronous request
      */
    bAsync: Boolean,
      /**
      * Whether response data should be imported into the model
      */
    bImportData: Boolean
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: js.Function,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: js.Function,
      /**
      * true for asynchronous request
      */
    bAsync: Unit,
      /**
      * Whether response data should be imported into the model
      */
    bImportData: Boolean
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: js.Function,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: Unit,
      /**
      * true for asynchronous request
      */
    bAsync: Boolean
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: js.Function,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: Unit,
      /**
      * true for asynchronous request
      */
    bAsync: Boolean,
      /**
      * Whether response data should be imported into the model
      */
    bImportData: Boolean
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: js.Function,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: Unit,
      /**
      * true for asynchronous request
      */
    bAsync: Unit,
      /**
      * Whether response data should be imported into the model
      */
    bImportData: Boolean
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: Unit,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: js.Function
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: Unit,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: js.Function,
      /**
      * true for asynchronous request
      */
    bAsync: Boolean
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: Unit,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: js.Function,
      /**
      * true for asynchronous request
      */
    bAsync: Boolean,
      /**
      * Whether response data should be imported into the model
      */
    bImportData: Boolean
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: Unit,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: js.Function,
      /**
      * true for asynchronous request
      */
    bAsync: Unit,
      /**
      * Whether response data should be imported into the model
      */
    bImportData: Boolean
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: Unit,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: Unit,
      /**
      * true for asynchronous request
      */
    bAsync: Boolean
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: Unit,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: Unit,
      /**
      * true for asynchronous request
      */
    bAsync: Boolean,
      /**
      * Whether response data should be imported into the model
      */
    bImportData: Boolean
    ): js.Object = js.native
    def submitBatch(
      /**
      * A callback function which is called when the batch request has been successfully sent. Note: Errors that
      * may have come up in the single batch operations can be accessed in the `aErrorResponses` parameter in
      * the callback handler. The handler can have the following parameters: `oData`, `oResponse` and `aErrorResponses`.
      */
    fnSuccess: Unit,
      /**
      * A callback function which is called when the batch request failed. The handler can have the parameter
      * `oError` which contains additional error information.
      */
    fnError: Unit,
      /**
      * true for asynchronous request
      */
    bAsync: Unit,
      /**
      * Whether response data should be imported into the model
      */
    bImportData: Boolean
    ): js.Object = js.native
    
    /**
      * Submits the collected changes which were collected by the setProperty method. A MERGE request will be
      * triggered to only update the changed properties. If a URI with a $expand System Query Option was used
      * then the expand entries will be removed from the collected changes. Changes to this entries should be
      * done on the entry itself. So no deep updates are supported.
      *
      * @returns an object which has an `abort` function to abort the current request.
      */
    def submitChanges(): js.Object = js.native
    def submitChanges(
      /**
      * a callback function which is called when the data has been successfully updated. The handler can have
      * the following parameters: oData and response.
      */
    fnSuccess: js.Function
    ): js.Object = js.native
    def submitChanges(
      /**
      * a callback function which is called when the data has been successfully updated. The handler can have
      * the following parameters: oData and response.
      */
    fnSuccess: js.Function,
      /**
      * a callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information
      */
    fnError: js.Function
    ): js.Object = js.native
    def submitChanges(
      /**
      * a callback function which is called when the data has been successfully updated. The handler can have
      * the following parameters: oData and response.
      */
    fnSuccess: js.Function,
      /**
      * a callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information
      */
    fnError: js.Function,
      /**
      * optional parameter for additional information introduced in SAPUI5 1.9.1
      */
    oParameters: SETag
    ): js.Object = js.native
    def submitChanges(
      /**
      * a callback function which is called when the data has been successfully updated. The handler can have
      * the following parameters: oData and response.
      */
    fnSuccess: js.Function,
      /**
      * a callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information
      */
    fnError: Unit,
      /**
      * optional parameter for additional information introduced in SAPUI5 1.9.1
      */
    oParameters: SETag
    ): js.Object = js.native
    def submitChanges(
      /**
      * a callback function which is called when the data has been successfully updated. The handler can have
      * the following parameters: oData and response.
      */
    fnSuccess: Unit,
      /**
      * a callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information
      */
    fnError: js.Function
    ): js.Object = js.native
    def submitChanges(
      /**
      * a callback function which is called when the data has been successfully updated. The handler can have
      * the following parameters: oData and response.
      */
    fnSuccess: Unit,
      /**
      * a callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information
      */
    fnError: js.Function,
      /**
      * optional parameter for additional information introduced in SAPUI5 1.9.1
      */
    oParameters: SETag
    ): js.Object = js.native
    def submitChanges(
      /**
      * a callback function which is called when the data has been successfully updated. The handler can have
      * the following parameters: oData and response.
      */
    fnSuccess: Unit,
      /**
      * a callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information
      */
    fnError: Unit,
      /**
      * optional parameter for additional information introduced in SAPUI5 1.9.1
      */
    oParameters: SETag
    ): js.Object = js.native
    
    /**
      * Trigger a PUT/MERGE request to the odata service that was specified in the model constructor. Please
      * note that deep updates are not supported and may not work. These should be done seperate on the entry
      * directly.
      *
      * @returns an object which has an `abort` function to abort the current request.
      */
    def update(
      /**
      * A string containing the path to the data that should be updated. The path is concatenated to the sServiceUrl
      * which was specified in the model constructor.
      */
    sPath: String,
      /**
      * data of the entry that should be updated.
      */
    oData: js.Object
    ): js.Object = js.native
    def update(
      /**
      * A string containing the path to the data that should be updated. The path is concatenated to the sServiceUrl
      * which was specified in the model constructor.
      */
    sPath: String,
      /**
      * data of the entry that should be updated.
      */
    oData: js.Object,
      /**
      * Optional, can contain the following attributes:
      */
    mParameters: Merge
    ): js.Object = js.native
    
    /**
      * update all bindings
      */
    def updateBindings(): Unit = js.native
    def updateBindings(
      /**
      * If set to false an update will only be done when the value of a binding changed.
      */
    bForceUpdate: Boolean
    ): Unit = js.native
  }
}
