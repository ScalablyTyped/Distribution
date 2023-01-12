package typings.openui5

import typings.openui5.anon.AdjustDeepPath
import typings.openui5.anon.AsyncRequests
import typings.openui5.anon.BatchGroupId
import typings.openui5.anon.BatchGroupIdError
import typings.openui5.anon.BindableResponseHeaders
import typings.openui5.anon.Created
import typings.openui5.anon.CreatedEntitiesKey
import typings.openui5.anon.Custom
import typings.openui5.anon.ID_
import typings.openui5.anon.IgnoreMessages
import typings.openui5.anon.Metadata
import typings.openui5.anon.Navigation
import typings.openui5.anon.RefreshAfterChange
import typings.openui5.anon.Requests
import typings.openui5.anon.ResponseText
import typings.openui5.anon.Select
import typings.openui5.anon.Sorters
import typings.openui5.anon.UrlParameters
import typings.openui5.anon.`34`
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelOdataCountModeMod.CountMode
import typings.openui5.sapUiModelOdataMessageScopeMod.MessageScope
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV2OdatamodelMod {
  
  @JSImport("sap/ui/model/odata/v2/ODataModel", JSImport.Default)
  @js.native
  open class default protected () extends ODataModel {
    /**
      * Constructor for a new ODataModel.
      */
    def this(/**
      * Base URI of the service to request data from; additional URL parameters appended here will be appended
      * to every request. If you pass an object, it will be interpreted as the parameter object (second parameter).
      * Then `mParameters.serviceUrl` becomes a mandatory parameter.
      */
    vServiceUrl: String) = this()
    def this(/**
      * Base URI of the service to request data from; additional URL parameters appended here will be appended
      * to every request. If you pass an object, it will be interpreted as the parameter object (second parameter).
      * Then `mParameters.serviceUrl` becomes a mandatory parameter.
      */
    vServiceUrl: js.Object) = this()
    def this(
      /**
      * Base URI of the service to request data from; additional URL parameters appended here will be appended
      * to every request. If you pass an object, it will be interpreted as the parameter object (second parameter).
      * Then `mParameters.serviceUrl` becomes a mandatory parameter.
      */
    vServiceUrl: String,
      /**
      * Map which contains the following parameter properties:
      */
    mParameters: BindableResponseHeaders
    ) = this()
    def this(
      /**
      * Base URI of the service to request data from; additional URL parameters appended here will be appended
      * to every request. If you pass an object, it will be interpreted as the parameter object (second parameter).
      * Then `mParameters.serviceUrl` becomes a mandatory parameter.
      */
    vServiceUrl: js.Object,
      /**
      * Map which contains the following parameter properties:
      */
    mParameters: BindableResponseHeaders
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/v2/ODataModel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.v2.ODataModel with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
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
      * Returns a metadata object for class sap.ui.model.odata.v2.ODataModel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  trait ChangeGroupDefinition extends StObject {
    
    /**
      * ID of a `ChangeSet` which bundles the changes for the entity type.
      */
    var changeSetId: js.UndefOr[String] = js.undefined
    
    /**
      * Id of the batch group
      */
    var groupId: String
    
    /**
      * Defines if every change will get an own change set
      */
    var single: js.UndefOr[Boolean] = js.undefined
  }
  object ChangeGroupDefinition {
    
    inline def apply(groupId: String): ChangeGroupDefinition = {
      val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeGroupDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeGroupDefinition] (val x: Self) extends AnyVal {
      
      inline def setChangeSetId(value: String): Self = StObject.set(x, "changeSetId", value.asInstanceOf[js.Any])
      
      inline def setChangeSetIdUndefined: Self = StObject.set(x, "changeSetId", js.undefined)
      
      inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setSingle(value: Boolean): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      inline def setSingleUndefined: Self = StObject.set(x, "single", js.undefined)
    }
  }
  
  @js.native
  trait ODataModel
    extends typings.openui5.sapUiModelModelMod.default {
    
    /**
      * Adds (a) new URL(s) whose content should be parsed as OData annotations, which are then merged into the
      * annotations object which can be retrieved by calling the {@link #getServiceAnnotations}-method. If a
      * `$metadata` URL is passed, the data will also be merged into the metadata object, which can be reached
      * by calling the {@link #getServiceMetadata} method.
      *
      * @returns The Promise to load the given URL(s), resolved if all URLs have been loaded, rejected if at
      * least one fails to load. If this promise resolves it returns an object with the following properties:
      * `annotations`: The annotation object `entitySets`: An array of EntitySet objects containing the newly
      * merged EntitySets from a `$metadata` requests. The structure is the same as in the metadata object reached
      * by the `getServiceMetadata()` method. For non-`$metadata` requests the array will be empty.
      */
    def addAnnotationUrl(/**
      * Either one URL as string or an array of URL strings
      */
    vUrl: String): js.Promise[Any] = js.native
    def addAnnotationUrl(/**
      * Either one URL as string or an array of URL strings
      */
    vUrl: js.Array[String]): js.Promise[Any] = js.native
    
    /**
      * Adds new XML content to be parsed for OData annotations, which are then merged into the annotations object
      * which can be retrieved by calling the {@link #getServiceAnnotations}-method.
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
      * @SINCE 1.42
      *
      * Returns a promise that resolves with an array containing information about the initially loaded annotations.
      *
      * **Important**: This covers the annotations that were given to the model constructor, not the ones that
      * might have been added later on using the protected API method {@link #addAnnotationUrl}. In order to
      * get information about those, the event `annotationsLoaded` can be used.
      *
      * @returns A promise that resolves with an array containing information about the initially loaded annotations
      */
    def annotationsLoaded(): js.Promise[Any] = js.native
    
    /**
      * Attaches event handler `fnFunction` to the `annotationsFailed` event of this `sap.ui.model.odata.v2.ODataModel`.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the `annotationsFailed` event of this `sap.ui.model.odata.v2.ODataModel`.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the `annotationsLoaded` event of this `sap.ui.model.odata.v2.ODataModel`.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the `annotationsLoaded` event of this `sap.ui.model.odata.v2.ODataModel`.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:batchRequestCompleted batchRequestCompleted}
      * event of this `sap.ui.model.odata.v2.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBatchRequestCompleted(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachBatchRequestCompleted(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:batchRequestCompleted batchRequestCompleted}
      * event of this `sap.ui.model.odata.v2.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBatchRequestCompleted(
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
    def attachBatchRequestCompleted(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:batchRequestFailed batchRequestFailed} event
      * of this `sap.ui.model.odata.v2.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBatchRequestFailed(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachBatchRequestFailed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:batchRequestFailed batchRequestFailed} event
      * of this `sap.ui.model.odata.v2.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBatchRequestFailed(
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
    def attachBatchRequestFailed(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:batchRequestSent batchRequestSent} event of
      * this `sap.ui.model.odata.v2.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBatchRequestSent(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachBatchRequestSent(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:batchRequestSent batchRequestSent} event of
      * this `sap.ui.model.odata.v2.ODataModel`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachBatchRequestSent(
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
    def attachBatchRequestSent(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the `metadataFailed` event of this `sap.ui.model.odata.v2.ODataModel`.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the `metadataFailed` event of this `sap.ui.model.odata.v2.ODataModel`.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the `metadataLoaded` event of this `sap.ui.model.odata.v2.ODataModel`.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the `metadataLoaded` event of this `sap.ui.model.odata.v2.ODataModel`.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.v2.ODataModel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    def bindContext(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: Unit,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: BatchGroupId
    ): typings.openui5.sapUiModelOdataV2OdatacontextbindingMod.default = js.native
    def bindContext(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: BatchGroupId
    ): typings.openui5.sapUiModelOdataV2OdatacontextbindingMod.default = js.native
    
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: Unit,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: Unit,
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: Unit,
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: Unit,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: Unit,
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: Unit,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: Unit,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: Unit,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: Unit,
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: Unit,
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: Unit,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: Unit,
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: Unit,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    def bindList(
      /**
      * The binding path in the model
      */
    sPath: String,
      /**
      * The context which is required as base for a relative path.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order, can be either a sorter or an array of sorters.
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filters, can be either a filter or an array of filters.
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * A map which contains additional parameters for the binding.
      */
    mParameters: CreatedEntitiesKey
    ): typings.openui5.sapUiModelOdataV2OdatalistbindingMod.default = js.native
    
    def bindProperty(
      /**
      * Path pointing to the property that should be bound; either an absolute path or a path relative to a given
      * `oContext`
      */
    sPath: String,
      /**
      * A context object for the new binding
      */
    oContext: js.Object
    ): typings.openui5.sapUiModelPropertyBindingMod.default = js.native
    def bindProperty(
      /**
      * Path pointing to the property that should be bound; either an absolute path or a path relative to a given
      * `oContext`
      */
    sPath: String,
      /**
      * A context object for the new binding
      */
    oContext: js.Object,
      /**
      * Map of optional parameters for the binding
      */
    mParameters: IgnoreMessages
    ): typings.openui5.sapUiModelPropertyBindingMod.default = js.native
    def bindProperty(
      /**
      * Path pointing to the property that should be bound; either an absolute path or a path relative to a given
      * `oContext`
      */
    sPath: String,
      /**
      * A context object for the new binding
      */
    oContext: Unit,
      /**
      * Map of optional parameters for the binding
      */
    mParameters: IgnoreMessages
    ): typings.openui5.sapUiModelPropertyBindingMod.default = js.native
    
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters
      */
    mParameters: Unit,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters
      */
    mParameters: Navigation
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters
      */
    mParameters: Navigation,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters
      */
    mParameters: Navigation,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: Unit,
      /**
      * Map of binding parameters
      */
    mParameters: Unit,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: Unit,
      /**
      * Map of binding parameters
      */
    mParameters: Navigation
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: Unit,
      /**
      * Map of binding parameters
      */
    mParameters: Navigation,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: Unit,
      /**
      * Map of binding parameters
      */
    mParameters: Navigation,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters
      */
    mParameters: Unit,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters
      */
    mParameters: Unit,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters
      */
    mParameters: Navigation
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters
      */
    mParameters: Navigation,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: Unit,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters
      */
    mParameters: Navigation,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters
      */
    mParameters: Unit,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters
      */
    mParameters: Navigation
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters
      */
    mParameters: Navigation,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Map of binding parameters
      */
    mParameters: Navigation,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: Unit,
      /**
      * Map of binding parameters
      */
    mParameters: Unit,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: Unit,
      /**
      * Map of binding parameters
      */
    mParameters: Navigation
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: Unit,
      /**
      * Map of binding parameters
      */
    mParameters: Navigation,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: Unit,
      /**
      * Map of binding parameters
      */
    mParameters: Navigation,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters
      */
    mParameters: Unit,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters
      */
    mParameters: Unit,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters
      */
    mParameters: Navigation
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters
      */
    mParameters: Navigation,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    def bindTree(
      /**
      * The binding path, either absolute or relative to a given `oContext`
      */
    sPath: String,
      /**
      * The parent context which is required as base for a relative path
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The application filters to be used initially; depending on the operation mode, there are restrictions
      * for using filters, see above
      */
    vFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Map of binding parameters
      */
    mParameters: Navigation,
      /**
      * The dynamic sorters to be used initially
      */
    vSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelOdataV2OdatatreebindingMod.default = js.native
    
    /**
      * Triggers a request for the given function import.
      *
      * If the return type of the function import is either an entity type or a collection of an entity type,
      * then this OData model's cache is updated with the values of the returned entities. Otherwise they are
      * ignored, and the `response` can be processed in the `success` callback.
      *
      * @returns An object which has a `contextCreated` function that returns a `Promise`. This resolves with
      * the created {@link sap.ui.model.Context}. In addition it has an `abort` function to abort the current
      * request. The Promise returned by `contextCreated` is rejected if the function name cannot be found in
      * the metadata or if the parameter `expand` is used and the function does not return a single entity.
      */
    def callFunction(
      /**
      * The name of the function import starting with a slash, for example `/Activate`.
      */
    sFunctionName: String
    ): js.Object = js.native
    def callFunction(
      /**
      * The name of the function import starting with a slash, for example `/Activate`.
      */
    sFunctionName: String,
      /**
      * The parameter map containing any of the following properties:
      */
    mParameters: AdjustDeepPath
    ): js.Object = js.native
    
    /**
      * Whether the canonical requests calculation is switched on, see the `canonicalRequests` parameter of the
      * model constructor.
      *
      * @returns Whether the canonical requests calculation is switched on
      */
    def canonicalRequestsEnabled(): Boolean = js.native
    
    /**
      * Trigger a `POST` request to the OData service that was specified in the model constructor; see {@link
      * topic:6c47b2b39db9404582994070ec3d57a2#loio4c4cd99af9b14e08bb72470cc7cabff4 Creating Entities documentation}
      * for comprehensive information on the topic.
      *
      * **Note:** This function does not support a "deep create" scenario. Use {@link #createEntry} or {@link
      * sap.ui.model.odata.v2.ODataListBinding#create} instead.
      *
      * @returns An object which has an `abort` function to abort the current request.
      */
    def create(
      /**
      * A string containing the path to the collection where an entry should be created. The path is concatenated
      * to the service URL which was specified in the model constructor.
      */
    sPath: String,
      /**
      * Data of the entry that should be created.
      */
    oData: js.Object
    ): js.Object = js.native
    def create(
      /**
      * A string containing the path to the collection where an entry should be created. The path is concatenated
      * to the service URL which was specified in the model constructor.
      */
    sPath: String,
      /**
      * Data of the entry that should be created.
      */
    oData: js.Object,
      /**
      * Optional parameter map containing any of the following properties:
      */
    mParameters: RefreshAfterChange
    ): js.Object = js.native
    
    def createBindingContext(/**
      * Binding path
      */
    sPath: String, /**
      * Binding context
      */
    oContext: js.Object): js.UndefOr[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def createBindingContext(
      /**
      * Binding path
      */
    sPath: String,
      /**
      * Binding context
      */
    oContext: js.Object,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: Unit,
      /**
      * The function to be called when the context has been created. The parameter of the callback function is
      * the newly created binding context, an instance of {@link sap.ui.model.odata.v2.Context}.
      */
    fnCallBack: js.Function
    ): js.UndefOr[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def createBindingContext(
      /**
      * Binding path
      */
    sPath: String,
      /**
      * Binding context
      */
    oContext: js.Object,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: Unit,
      /**
      * The function to be called when the context has been created. The parameter of the callback function is
      * the newly created binding context, an instance of {@link sap.ui.model.odata.v2.Context}.
      */
    fnCallBack: js.Function,
      /**
      * Whether to reload data
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def createBindingContext(
      /**
      * Binding path
      */
    sPath: String,
      /**
      * Binding context
      */
    oContext: js.Object,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: Unit,
      /**
      * The function to be called when the context has been created. The parameter of the callback function is
      * the newly created binding context, an instance of {@link sap.ui.model.odata.v2.Context}.
      */
    fnCallBack: Unit,
      /**
      * Whether to reload data
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def createBindingContext(
      /**
      * Binding path
      */
    sPath: String,
      /**
      * Binding context
      */
    oContext: js.Object,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: Custom
    ): js.UndefOr[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def createBindingContext(
      /**
      * Binding path
      */
    sPath: String,
      /**
      * Binding context
      */
    oContext: js.Object,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: Custom,
      /**
      * The function to be called when the context has been created. The parameter of the callback function is
      * the newly created binding context, an instance of {@link sap.ui.model.odata.v2.Context}.
      */
    fnCallBack: js.Function
    ): js.UndefOr[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def createBindingContext(
      /**
      * Binding path
      */
    sPath: String,
      /**
      * Binding context
      */
    oContext: js.Object,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: Custom,
      /**
      * The function to be called when the context has been created. The parameter of the callback function is
      * the newly created binding context, an instance of {@link sap.ui.model.odata.v2.Context}.
      */
    fnCallBack: js.Function,
      /**
      * Whether to reload data
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def createBindingContext(
      /**
      * Binding path
      */
    sPath: String,
      /**
      * Binding context
      */
    oContext: js.Object,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: Custom,
      /**
      * The function to be called when the context has been created. The parameter of the callback function is
      * the newly created binding context, an instance of {@link sap.ui.model.odata.v2.Context}.
      */
    fnCallBack: Unit,
      /**
      * Whether to reload data
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def createBindingContext(
      /**
      * Binding path
      */
    sPath: String,
      /**
      * Binding context
      */
    oContext: Unit,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: Custom
    ): js.UndefOr[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def createBindingContext(
      /**
      * Binding path
      */
    sPath: String,
      /**
      * Binding context
      */
    oContext: Unit,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: Custom,
      /**
      * The function to be called when the context has been created. The parameter of the callback function is
      * the newly created binding context, an instance of {@link sap.ui.model.odata.v2.Context}.
      */
    fnCallBack: js.Function
    ): js.UndefOr[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def createBindingContext(
      /**
      * Binding path
      */
    sPath: String,
      /**
      * Binding context
      */
    oContext: Unit,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: Custom,
      /**
      * The function to be called when the context has been created. The parameter of the callback function is
      * the newly created binding context, an instance of {@link sap.ui.model.odata.v2.Context}.
      */
    fnCallBack: js.Function,
      /**
      * Whether to reload data
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    def createBindingContext(
      /**
      * Binding path
      */
    sPath: String,
      /**
      * Binding context
      */
    oContext: Unit,
      /**
      * Map which contains additional parameters for the binding
      */
    mParameters: Custom,
      /**
      * The function to be called when the context has been created. The parameter of the callback function is
      * the newly created binding context, an instance of {@link sap.ui.model.odata.v2.Context}.
      */
    fnCallBack: Unit,
      /**
      * Whether to reload data
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    
    /**
      * Creates a new entry object which is described by the metadata of the entity type of the specified `sPath`
      * Name. A context object is returned which can be used to bind against the newly created object. See {@link
      * topic:6c47b2b39db9404582994070ec3d57a2#loio4c4cd99af9b14e08bb72470cc7cabff4 Creating Entities documentation}
      * for comprehensive information on the topic.
      *
      * For each created entry a request is created and stored in a request queue. The request queue can be submitted
      * by calling {@link #submitChanges}. As long as the context is transient (see {@link sap.ui.model.odata.v2.Context#isTransient}),
      * {@link sap.ui.model.odata.v2.ODataModel#resetChanges} with the `bDeleteCreatedEntities` parameter set
      * to `true` can be used to delete the created entity again.
      *
      * If the creation of the entity on the server failed, it is repeated automatically.
      *
      * The optional parameter `mParameters.properties` can be used as follows:
      * 	 - `properties` could be an array containing the property names which should be included in the new
      * 			entry. Other properties defined in the entity type won't be included.
      * 	 - `properties` could be an object which includes the desired properties and the corresponding values
      * 			which should be used for the created entry.   If `properties` is not specified, all properties in
      * 			the entity type will be included in the created entry.
      *
      * If there are no values specified, the properties will have `undefined` values.
      *
      * The `properties` can be modified via property bindings relative to the returned context instance.
      *
      * The parameter `expand` is supported since 1.78.0. If this parameter is set, the given navigation properties
      * are expanded automatically with the same $batch request in which the POST request for the creation is
      * contained. Ensure that the batch mode is used and the back-end service supports GET requests relative
      * to a content ID outside the changeset. The success and error callback functions are called only once,
      * even if there are two requests in the `$batch` related to a single call of {@link #createEntry}:
      *
      * 	 - a POST request for creating an entity,
      * 	 - a GET request for requesting the navigation properties for the just created entity.   The following
      * 			outcomes are possible:
      * 	 - If both requests succeed, the success handler is called with the merged data of the POST and the
      * 			GET request and with the response of the POST request.
      * 	 - If the POST request fails, the GET request also fails. In that case the error callback handler is
      * 			called with the error response of the POST request.
      * 	 - If the POST request succeeds but the GET request for the navigation properties fails, the success
      * 			handler is called with the data and the response of the POST request. The response object of the success
      * 			handler call and the response parameter of the corresponding `requestFailed` and `requestCompleted` events
      * 			have an additional property `expandAfterCreateFailed` set to `true`.
      *
      * Note: If a server requires a property in the request, you must supply this property in the initial data,
      * for example if the server requires a unit for an amount. This also applies if this property has a default
      * value.
      *
      * Note: Deep create is only supported since 1.108.0, where "deep create" means creation of a sub-entity
      * for a navigation property of a transient, not yet persisted root entity. Before 1.108.0, the sub-entity
      * had to be created after the transient entity had been saved successfully in the back-end system. Since
      * 1.108.0, a deep create is triggered when the `sPath` parameter is a navigation property for the entity
      * type associated with the transient context given in `mParameters.context`. The payload of the OData request
      * to create the root entity then contains its sub-entities. On creation of a sub-entity, only the `sPath`,
      * `mParameters.context` and `mParameters.properties` method parameters are allowed; the context given in
      * `mParameters.context` must not be inactive.
      *
      * @returns An OData V2 context object that points to the newly created entry; or `undefined` if the service
      * metadata are not yet loaded or if a `created` callback parameter is given
      */
    def createEntry(
      /**
      * The path to the EntitySet
      */
    sPath: String,
      /**
      * A map of the following parameters:
      */
    mParameters: Created
    ): js.UndefOr[typings.openui5.sapUiModelOdataV2ContextMod.default] = js.native
    
    /**
      * Creates the key from the given collection name and property map.
      *
      * Please make sure that the metadata document is loaded before using this function.
      *
      * @returns Key of the entry
      */
    def createKey(
      /**
      * Name of the collection
      */
    sCollection: String,
      /**
      * Object containing at least all the key properties of the entity type
      */
    oKeyProperties: js.Object
    ): String = js.native
    
    /**
      * @deprecated (since 1.95.0) - use {@link #resetChanges} instead
      *
      * Deletes a created entry from the request queue and from the model.
      *
      * **Note:** Controls are not updated. Use {@link #resetChanges} instead to update also the controls, for
      * example: `oModel.resetChanges([oContext.getPath()], undefined, true);`
      */
    def deleteCreatedEntry(
      /**
      * The context object pointing to the created entry
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the `annotationsFailed` event of this `sap.ui.model.odata.v2.ODataModel`.
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
      * Detaches event handler `fnFunction` from the `annotationsLoaded` event of this `sap.ui.model.odata.v2.ODataModel`.
      *
      * The passed function and listener object must match the ones used for event registration.
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
      * Detaches event handler `fnFunction` from the {@link #event:batchRequestCompleted batchRequestCompleted}
      * event of this `sap.ui.model.odata.v2.ODataModel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBatchRequestCompleted(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachBatchRequestCompleted(
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
      * Detaches event handler `fnFunction` from the {@link #event:batchRequestFailed batchRequestFailed} event
      * of this `sap.ui.model.odata.v2.ODataModel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBatchRequestFailed(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachBatchRequestFailed(
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
      * Detaches event handler `fnFunction` from the {@link #event:batchRequestSent batchRequestSent} event of
      * this `sap.ui.model.odata.v2.ODataModel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachBatchRequestSent(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachBatchRequestSent(
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
      * Detaches event handler `fnFunction` from the `metadataFailed` event of this `sap.ui.model.odata.v2.ODataModel`.
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
      * Detaches event handler `fnFunction` from the `metadataLoaded` event of this `sap.ui.model.odata.v2.ODataModel`.
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
      * @returns Reference to `this` to allow method chaining
      */
    def fireAnnotationsFailed(): this.type = js.native
    def fireAnnotationsFailed(/**
      * Parameters to pass along with the event
      */
    oParameters: ResponseText): this.type = js.native
    
    /**
      * Fires event {@link #event:annotationsLoaded annotationsLoaded} to attached listeners.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def fireAnnotationsLoaded(): this.type = js.native
    def fireAnnotationsLoaded(/**
      * Parameters to pass along with the event
      */
    oParameters: `34`): this.type = js.native
    
    /**
      * Fires event {@link #event:batchRequestCompleted batchRequestCompleted} to attached listeners.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def fireBatchRequestCompleted(/**
      * parameters to add to the fired event
      */
    oParameters: ID_): this.type = js.native
    
    /**
      * Fires event {@link #event:batchRequestFailed batchRequestFailed} to attached listeners.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def fireBatchRequestFailed(/**
      * Parameters to pass along with the event
      */
    oParameters: Requests): this.type = js.native
    
    /**
      * Fires event {@link #event:batchRequestSent batchRequestSent} to attached listeners.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def fireBatchRequestSent(): this.type = js.native
    def fireBatchRequestSent(/**
      * Parameters to pass along with the event
      */
    oParameters: AsyncRequests): this.type = js.native
    
    /**
      * Fires event {@link #event:metadataFailed metadataFailed} to attached listeners.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def fireMetadataFailed(): this.type = js.native
    def fireMetadataFailed(/**
      * Parameters to pass along with the event
      */
    oParameters: ResponseText): this.type = js.native
    
    /**
      * Fires event {@link #event:metadataLoaded metadataLoaded} to attached listeners.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def fireMetadataLoaded(): this.type = js.native
    def fireMetadataLoaded(/**
      * Parameters to pass along with the event
      */
    oParameters: Metadata): this.type = js.native
    
    /**
      * Force the update on the server of an entity by setting its ETag to '*'.
      *
      * ETag handling must be active so the force update will work.
      */
    def forceEntityUpdate(/**
      * The key to an Entity e.g.: Customer(4711)
      */
    sKey: String): Unit = js.native
    
    /**
      * @deprecated (since 1.36) - use {@link #getChangeGroups} instead
      *
      * Returns the definition of batch groups per entity type for two-way binding changes.
      *
      * @returns Definition of batch groups for two-way binding changes, keyed by entity names.
      */
    def getChangeBatchGroups(): Record[String, ChangeGroupDefinition] = js.native
    
    /**
      * Returns the definition of groups per entity type for two-way binding changes
      *
      * @returns Definition of groups for two-way binding changes, keyed by entity names.
      */
    def getChangeGroups(): Record[String, ChangeGroupDefinition] = js.native
    
    /**
      * @deprecated (since 1.24) - please use {@link #getProperty} instead
      *
      * Return requested data as object if the data has already been loaded and stored in the model.
      *
      * @returns Object containing the requested data if the path is valid.
      */
    def getData(
      /**
      * A string containing the path to the data object that should be returned.
      */
    sPath: String
    ): js.Object = js.native
    def getData(
      /**
      * A string containing the path to the data object that should be returned.
      */
    sPath: String,
      /**
      * The optional context which is used with the `sPath` to retrieve the requested data.
      */
    oContext: js.Object
    ): js.Object = js.native
    def getData(
      /**
      * A string containing the path to the data object that should be returned.
      */
    sPath: String,
      /**
      * The optional context which is used with the `sPath` to retrieve the requested data.
      */
    oContext: js.Object,
      /**
      * This parameter should be set when a URI or custom parameter with a `$expand` system query option was
      * used to retrieve associated entries embedded. If set to `true` then the `getProperty` function returns
      * a desired property value or entry and includes the associated expand entries (if any). If set to `false`
      * the associated/expanded entry properties are removed and not included in the desired entry as properties
      * at all. This is useful for performing updates on the base entry only. Note: A copy, not a reference of
      * the entry will be returned.
      */
    bIncludeExpandEntries: Boolean
    ): js.Object = js.native
    def getData(
      /**
      * A string containing the path to the data object that should be returned.
      */
    sPath: String,
      /**
      * The optional context which is used with the `sPath` to retrieve the requested data.
      */
    oContext: Unit,
      /**
      * This parameter should be set when a URI or custom parameter with a `$expand` system query option was
      * used to retrieve associated entries embedded. If set to `true` then the `getProperty` function returns
      * a desired property value or entry and includes the associated expand entries (if any). If set to `false`
      * the associated/expanded entry properties are removed and not included in the desired entry as properties
      * at all. This is useful for performing updates on the base entry only. Note: A copy, not a reference of
      * the entry will be returned.
      */
    bIncludeExpandEntries: Boolean
    ): js.Object = js.native
    
    /**
      * @SINCE 1.20
      *
      * Returns the default count mode for retrieving the count of collections
      *
      * @returns Returns the default count mode for this model
      */
    def getDefaultCountMode(): CountMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof CountMode * / any */ String) = js.native
    
    /**
      * @deprecated (since 1.32) - use {@link #getDeferredGroups} instead
      *
      * Returns the array of batch group IDs that are set as deferred
      *
      * @returns aGroupIds The array of deferred batch group IDs
      */
    def getDeferredBatchGroups(): js.Array[Any] = js.native
    
    /**
      * Returns the array of group IDs that are set as deferred.
      *
      * @returns aGroupIds The array of deferred group IDs
      */
    def getDeferredGroups(): js.Array[Any] = js.native
    
    /**
      * Returns the ETag for a given binding path/context or data object.
      *
      * @returns The found ETag (or `null` if none could be found)
      */
    def getETag(): String | Null = js.native
    def getETag(/**
      * The binding path
      */
    sPath: String): String | Null = js.native
    def getETag(
      /**
      * The binding path
      */
    sPath: String,
      /**
      * The binding context
      */
    oContext: Unit,
      /**
      * The entity data
      */
    oEntity: js.Object
    ): String | Null = js.native
    def getETag(
      /**
      * The binding path
      */
    sPath: String,
      /**
      * The binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): String | Null = js.native
    def getETag(
      /**
      * The binding path
      */
    sPath: String,
      /**
      * The binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The entity data
      */
    oEntity: js.Object
    ): String | Null = js.native
    def getETag(
      /**
      * The binding path
      */
    sPath: Unit,
      /**
      * The binding context
      */
    oContext: Unit,
      /**
      * The entity data
      */
    oEntity: js.Object
    ): String | Null = js.native
    def getETag(
      /**
      * The binding path
      */
    sPath: Unit,
      /**
      * The binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): String | Null = js.native
    def getETag(
      /**
      * The binding path
      */
    sPath: Unit,
      /**
      * The binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The entity data
      */
    oEntity: js.Object
    ): String | Null = js.native
    
    /**
      * Returns all headers and custom headers which are stored in this OData model.
      *
      * @returns The header map
      */
    def getHeaders(): js.Object = js.native
    
    /**
      * Returns the key part for the given the canonical entry URI, model context or data object or `undefined`
      * when the `vValue` can't be interpreted.
      *
      * @returns Key of the entry or `undefined`
      */
    def getKey(/**
      * The canonical entry URI, the context or entry object
      */
    vValue: String): js.UndefOr[String] = js.native
    def getKey(/**
      * The canonical entry URI, the context or entry object
      */
    vValue: js.Object): js.UndefOr[String] = js.native
    def getKey(
      /**
      * The canonical entry URI, the context or entry object
      */
    vValue: typings.openui5.sapUiModelContextMod.default
    ): js.UndefOr[String] = js.native
    
    /**
      * @SINCE 1.76.0
      *
      * Returns this model's message scope.
      * See:
      * 	sap.ui.model.odata.MessageScope
      *
      * @returns The message scope
      */
    def getMessageScope(): MessageScope | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageScope * / any */ String) = js.native
    
    def getObject(
      /**
      * The path referencing the object
      */
    sPath: String,
      /**
      * The optional context which is used with the `sPath` to reference the object.
      */
    oContext: Unit,
      /**
      * Map of parameters
      */
    mParameters: Select
    ): js.UndefOr[Any] = js.native
    def getObject(
      /**
      * The path referencing the object
      */
    sPath: String,
      /**
      * The optional context which is used with the `sPath` to reference the object.
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Map of parameters
      */
    mParameters: Select
    ): js.UndefOr[Any] = js.native
    
    def getOriginalProperty(
      /**
      * The path/name of the property
      */
    sPath: String,
      /**
      * The context if available to access the property value
      */
    oContext: js.Object
    ): Any = js.native
    
    /**
      * Returns the changed properties of all changed entities in a map which are still pending. The key is the
      * string name of the entity, and the value is an object which contains the changed properties. The tree
      * hierarchy changes for removed nodes are represented via an empty object.
      *
      * In contrast to the two related functions {@link #hasPendingChanges} and {@link #resetChanges}, only client
      * data changes are supported.
      *
      * @returns the pending changes in a map
      */
    def getPendingChanges(): Record[String, js.Object] = js.native
    
    def getProperty(
      /**
      * Path/name of the property
      */
    sPath: String,
      /**
      * Context if available to access the property value
      */
    oContext: js.Object
    ): Any = js.native
    def getProperty(
      /**
      * Path/name of the property
      */
    sPath: String,
      /**
      * Context if available to access the property value
      */
    oContext: js.Object,
      /**
      * Deprecated, use {@link #getObject} function with 'select' and 'expand' parameters instead. Whether entities
      * for navigation properties of this property which have been read via `$expand` are part of the return
      * value.
      */
    bIncludeExpandEntries: Boolean
    ): Any = js.native
    def getProperty(
      /**
      * Path/name of the property
      */
    sPath: String,
      /**
      * Context if available to access the property value
      */
    oContext: Unit,
      /**
      * Deprecated, use {@link #getObject} function with 'select' and 'expand' parameters instead. Whether entities
      * for navigation properties of this property which have been read via `$expand` are part of the return
      * value.
      */
    bIncludeExpandEntries: Boolean
    ): Any = js.native
    
    /**
      * @SINCE 1.46.0
      *
      * Whether all affected bindings are refreshed after a change operation.
      *
      * This flag can be overruled on request level by providing the `refreshAfterChange` parameter to the corresponding
      * function (for example {@link #update}).
      *
      * @returns Whether to automatically refresh after changes
      */
    def getRefreshAfterChange(): Boolean = js.native
    
    /**
      * Returns the current security token.
      *
      * If the token has not been requested from the server it will be requested first (synchronously).
      *
      * @returns The security token
      */
    def getSecurityToken(): String = js.native
    
    /**
      * Return the annotation object. Please note that the metadata is loaded asynchronously and this function
      * might return undefined because the metadata has not been loaded yet. In this case attach to the `annotationsLoaded`
      * event to get notified when the annotations are available and then call this function.
      *
      * @returns Metadata object
      */
    def getServiceAnnotations(): js.Object = js.native
    
    /**
      * Return the parsed XML metadata as a Javascript object.
      *
      * Please note that the metadata is loaded asynchronously and this function might return `undefined` because
      * the metadata has not been loaded yet. In this case attach to the `metadataLoaded` event to get notified
      * when the metadata is available and then call this function.
      *
      * @returns Metadata object
      */
    def getServiceMetadata(): js.UndefOr[js.Object] = js.native
    
    /**
      * Checks if there exist pending changes in the model.
      *
      * By default, only client data changes triggered through {@link #createEntry} or {@link #setProperty},
      * and tree hierarchy changes are taken into account.
      *
      * If `bAll` is set to `true`, also deferred requests triggered through {@link #create}, {@link #update},
      * and {@link #remove} are taken into account.
      *
      * @returns `true` if there are pending changes, `false` otherwise.
      */
    def hasPendingChanges(): Boolean = js.native
    def hasPendingChanges(/**
      * If set to true, deferred requests are also taken into account.
      */
    bAll: Boolean): Boolean = js.native
    
    /**
      * Checks if there are pending requests, either ongoing or sequential.
      *
      * @returns Whether there are pending requests
      */
    def hasPendingRequests(): Boolean = js.native
    
    /**
      * @SINCE 1.52.1
      *
      * Invalidate the model data.
      *
      * Mark all entries in the model cache as invalid. Next time a context or list is bound (binding), the respective
      * entries will be detected as invalid and will be refreshed from the server.
      *
      * To refresh all model data use {@link sap.ui.model.odata.v2.ODataModel#refresh}
      */
    def invalidate(): Unit = js.native
    def invalidate(
      /**
      * A function which can be used to restrict invalidation to specific entries, gets the entity key and object
      * as parameters and should return true for entities to invalidate.
      */
    fnCheckEntry: js.Function
    ): Unit = js.native
    
    /**
      * @SINCE 1.52.1
      *
      * Invalidate all entries of the given entity type in the model data.
      *
      * Mark entries of the provided entity type in the model cache as invalid. Next time a context binding or
      * list binding is done, the entry will be detected as invalid and will be refreshed from the server.
      */
    def invalidateEntityType(
      /**
      * The qualified name of the entity type. A qualified name consists of two parts separated by a dot. The
      * first part is the namespace of the schema in which the entity type is defined, such as "NorthwindModel".
      * The second part is the entity type name such as "Customer". This results in a qualified name such as
      * "NorthwindModel.Customer". The qualified name can be found in the data sent from the server in JSON format
      * under `__metadata.type` or in XML format in the `term` attribute of the entity's `category` tag.
      */
    sEntityType: String
    ): Unit = js.native
    
    /**
      * @SINCE 1.52.1
      *
      * Invalidate a single entry in the model data.
      *
      * Mark the selected entry in the model cache as invalid. Next time a context binding or list binding is
      * done, the entry will be detected as invalid and will be refreshed from the server.
      */
    def invalidateEntry(
      /**
      * the reference to the entry, either by key, absolute path or context object
      */
    vEntry: String
    ): Unit = js.native
    def invalidateEntry(
      /**
      * the reference to the entry, either by key, absolute path or context object
      */
    vEntry: typings.openui5.sapUiModelContextMod.default
    ): Unit = js.native
    
    /**
      * @SINCE 1.38
      *
      * Checks whether metadata loading has failed in the past.
      *
      * @returns Whether metadata request has failed
      */
    def isMetadataLoadingFailed(): Boolean = js.native
    
    /**
      * @SINCE 1.76.0
      *
      * Checks whether the service has set the OData V2 annotation "message-scope-supported" on the `EntityContainer`
      * with the value `true`. This is a a precondition for the setting of {@link sap.ui.model.odata.MessageScope.BusinessObject}
      * via {@link #setMessageScope}.
      * See:
      * 	sap.ui.model.odata.MessageScope
      *
      * @returns A promise resolving with `true` if the OData V2 annotation "message-scope-supported" on the
      * `EntityContainer` is set to `true`
      */
    def messageScopeSupported(): js.Promise[Any] = js.native
    
    /**
      * @SINCE 1.30
      *
      * Returns a promise for the loaded state of the metadata.
      *
      * The metadata needs to be loaded prior to performing OData calls. Chaining to the returned promise ensures
      * that all required parameters have been loaded, e.g. the security token, see {@link #getSecurityToken}.
      *
      * The returned promise depends on the optional parameter `bRejectOnFailure`.
      *
      * `bRejectOnFailure=false`: The promise won't get rejected in case the metadata or annotation loading failed
      * but is only resolved if
      * 	 - the metadata are loaded successfully,
      * 	 - the annotations are processed, provided the model parameter `loadAnnotationsJoined` has been set.
      * 			 Use this promise for delaying OData calls until all required information is available, i.e. this
      * 			promise is resolved.
      *
      * `bRejectOnFailure=true`: Since 1.79, the parameter `bRejectOnFailure` allows to request a promise that
      * is rejected when one of the following fails:
      * 	 - the loading of the metadata,
      * 	 - the loading of the annotations, provided the model parameter `loadAnnotationsJoined` has been set.
      * 			 The promise is fulfilled upon successful loading of both. This promise can be used to start processing
      * 			OData calls when it is fulfilled and to display an error message when it is rejected. See also the example
      * 			below.
      *
      * If the method `refreshMetadata` is called after the returned promise is already resolved or rejected,
      * you should use the promise returned by `refreshMetadata` to get information about the refreshed state.
      *
      * @returns A promise on metadata loaded state
      */
    def metadataLoaded(): js.Promise[Any] = js.native
    def metadataLoaded(
      /**
      * Determines since 1.79 whether the returned promise is rejected when the initial loading of the metadata
      * fails. In case the model parameter `loadAnnotationsJoined` is set, the returned promise fails also if
      * loading the annotations fails.
      */
    bRejectOnFailure: Boolean
    ): js.Promise[Any] = js.native
    
    /**
      * Trigger a `GET` request to the OData service that was specified in the model constructor.
      *
      * The data will be stored in the model. The requested data is returned with the response.
      *
      * @returns An object which has an `abort` function to abort the current request.
      */
    def read(
      /**
      * An absolute path or a path relative to the context given in `mParameters.context`; if the path contains
      * a query string, the query string is ignored, use `mParameters.urlParameters` instead
      */
    sPath: String
    ): js.Object = js.native
    def read(
      /**
      * An absolute path or a path relative to the context given in `mParameters.context`; if the path contains
      * a query string, the query string is ignored, use `mParameters.urlParameters` instead
      */
    sPath: String,
      /**
      * Optional parameter map containing any of the following properties:
      */
    mParameters: Sorters
    ): js.Object = js.native
    
    def refresh(
      /**
      * Force update of controls
      */
    bForceUpdate: Boolean,
      /**
      * If set to `true` then the model data will be removed/cleared. Please note that the data might not be
      * there when calling e.g. `getProperty` too early before the refresh call returned.
      */
    bRemoveData: Boolean
    ): Unit = js.native
    def refresh(
      /**
      * Force update of controls
      */
    bForceUpdate: Boolean,
      /**
      * If set to `true` then the model data will be removed/cleared. Please note that the data might not be
      * there when calling e.g. `getProperty` too early before the refresh call returned.
      */
    bRemoveData: Boolean,
      /**
      * ID of a request group; requests belonging to the same group will be bundled in one batch request
      */
    sGroupId: String
    ): Unit = js.native
    def refresh(
      /**
      * Force update of controls
      */
    bForceUpdate: Boolean,
      /**
      * If set to `true` then the model data will be removed/cleared. Please note that the data might not be
      * there when calling e.g. `getProperty` too early before the refresh call returned.
      */
    bRemoveData: Unit,
      /**
      * ID of a request group; requests belonging to the same group will be bundled in one batch request
      */
    sGroupId: String
    ): Unit = js.native
    def refresh(
      /**
      * Force update of controls
      */
    bForceUpdate: Unit,
      /**
      * If set to `true` then the model data will be removed/cleared. Please note that the data might not be
      * there when calling e.g. `getProperty` too early before the refresh call returned.
      */
    bRemoveData: Boolean
    ): Unit = js.native
    def refresh(
      /**
      * Force update of controls
      */
    bForceUpdate: Unit,
      /**
      * If set to `true` then the model data will be removed/cleared. Please note that the data might not be
      * there when calling e.g. `getProperty` too early before the refresh call returned.
      */
    bRemoveData: Boolean,
      /**
      * ID of a request group; requests belonging to the same group will be bundled in one batch request
      */
    sGroupId: String
    ): Unit = js.native
    def refresh(
      /**
      * Force update of controls
      */
    bForceUpdate: Unit,
      /**
      * If set to `true` then the model data will be removed/cleared. Please note that the data might not be
      * there when calling e.g. `getProperty` too early before the refresh call returned.
      */
    bRemoveData: Unit,
      /**
      * ID of a request group; requests belonging to the same group will be bundled in one batch request
      */
    sGroupId: String
    ): Unit = js.native
    
    /**
      * @deprecated (since 1.42)
      *
      * Refreshes the metadata for this model, for example when the request for metadata has failed.
      *
      * **Note**: Do not use `refreshMetadata` if the metadata is outdated or should be updated. This will lead
      * to inconsistent data in the application.
      *
      * Returns a new promise which can be resolved or rejected depending on the metadata loading state.
      *
      * @returns A promise on metadata loaded state or `undefined` if metadata is not initialized or currently
      * refreshed
      */
    def refreshMetadata(): js.UndefOr[js.Promise[Any]] = js.native
    
    /**
      * Refresh XSRF token by performing a GET request against the service root URL.
      *
      * @returns An object which has an `abort` function to abort the current request.
      */
    def refreshSecurityToken(): js.Object = js.native
    def refreshSecurityToken(
      /**
      * Callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: js.Function
    ): js.Object = js.native
    def refreshSecurityToken(
      /**
      * Callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: js.Function,
      /**
      * Callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information.
      */
    fnError: js.Function
    ): js.Object = js.native
    def refreshSecurityToken(
      /**
      * Callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: js.Function,
      /**
      * Callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information.
      */
    fnError: js.Function,
      /**
      * Whether the request should be sent asynchronously
      */
    bAsync: Boolean
    ): js.Object = js.native
    def refreshSecurityToken(
      /**
      * Callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: js.Function,
      /**
      * Callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information.
      */
    fnError: Unit,
      /**
      * Whether the request should be sent asynchronously
      */
    bAsync: Boolean
    ): js.Object = js.native
    def refreshSecurityToken(
      /**
      * Callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: Unit,
      /**
      * Callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information.
      */
    fnError: js.Function
    ): js.Object = js.native
    def refreshSecurityToken(
      /**
      * Callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: Unit,
      /**
      * Callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information.
      */
    fnError: js.Function,
      /**
      * Whether the request should be sent asynchronously
      */
    bAsync: Boolean
    ): js.Object = js.native
    def refreshSecurityToken(
      /**
      * Callback function which is called when the data has been successfully retrieved.
      */
    fnSuccess: Unit,
      /**
      * Callback function which is called when the request failed. The handler can have the parameter: oError
      * which contains additional error information.
      */
    fnError: Unit,
      /**
      * Whether the request should be sent asynchronously
      */
    bAsync: Boolean
    ): js.Object = js.native
    
    /**
      * Trigger a `DELETE` request to the OData service that was specified in the model constructor.
      *
      * @returns An object which has an `abort` function to abort the current request.
      */
    def remove(
      /**
      * A string containing the path to the data that should be removed. The path is concatenated to the service
      * URL which was specified in the model constructor.
      */
    sPath: String
    ): js.Object = js.native
    def remove(
      /**
      * A string containing the path to the data that should be removed. The path is concatenated to the service
      * URL which was specified in the model constructor.
      */
    sPath: String,
      /**
      * Optional, can contain the following attributes:
      */
    mParameters: UrlParameters
    ): js.Object = js.native
    
    /**
      * Resets pending changes and aborts corresponding requests.
      *
      * By default, only changes triggered through {@link #createEntry} or {@link #setProperty} are taken into
      * account. If `bAll` is set, also deferred requests triggered through {@link #create}, {@link #update}
      * or {@link #remove} are taken into account.
      *
      * With a given `aPath` only specified entities are reset. Note that tree hierarchy changes are only affected
      * if a given path is equal to the tree binding's resolved binding path.
      *
      * If `bDeleteCreatedEntities` is set, the entity is completely removed, provided it has been created
      *
      * 	 - via {@link #createEntry} and it is not yet persisted in the back end, or
      * 	 - via {@link #callFunction}.
      *
      * @returns Resolves when all regarded changes have been reset.
      */
    def resetChanges(): js.Promise[Any] = js.native
    def resetChanges(/**
      * Paths to be reset; if no array is passed, all changes are reset
      */
    aPath: js.Array[Any]): js.Promise[Any] = js.native
    def resetChanges(
      /**
      * Paths to be reset; if no array is passed, all changes are reset
      */
    aPath: js.Array[Any],
      /**
      * Whether also deferred requests are taken into account
      */
    bAll: Boolean
    ): js.Promise[Any] = js.native
    def resetChanges(
      /**
      * Paths to be reset; if no array is passed, all changes are reset
      */
    aPath: js.Array[Any],
      /**
      * Whether also deferred requests are taken into account
      */
    bAll: Boolean,
      /**
      * Whether to delete the entities created via {@link #createEntry} or {@link #callFunction}; since 1.95.0
      */
    bDeleteCreatedEntities: Boolean
    ): js.Promise[Any] = js.native
    def resetChanges(
      /**
      * Paths to be reset; if no array is passed, all changes are reset
      */
    aPath: js.Array[Any],
      /**
      * Whether also deferred requests are taken into account
      */
    bAll: Unit,
      /**
      * Whether to delete the entities created via {@link #createEntry} or {@link #callFunction}; since 1.95.0
      */
    bDeleteCreatedEntities: Boolean
    ): js.Promise[Any] = js.native
    def resetChanges(
      /**
      * Paths to be reset; if no array is passed, all changes are reset
      */
    aPath: Unit,
      /**
      * Whether also deferred requests are taken into account
      */
    bAll: Boolean
    ): js.Promise[Any] = js.native
    def resetChanges(
      /**
      * Paths to be reset; if no array is passed, all changes are reset
      */
    aPath: Unit,
      /**
      * Whether also deferred requests are taken into account
      */
    bAll: Boolean,
      /**
      * Whether to delete the entities created via {@link #createEntry} or {@link #callFunction}; since 1.95.0
      */
    bDeleteCreatedEntities: Boolean
    ): js.Promise[Any] = js.native
    def resetChanges(
      /**
      * Paths to be reset; if no array is passed, all changes are reset
      */
    aPath: Unit,
      /**
      * Whether also deferred requests are taken into account
      */
    bAll: Unit,
      /**
      * Whether to delete the entities created via {@link #createEntry} or {@link #callFunction}; since 1.95.0
      */
    bDeleteCreatedEntities: Boolean
    ): js.Promise[Any] = js.native
    
    /**
      * Returns a promise, which will resolve with the security token as soon as it is available.
      *
      * @returns A promise on the security token
      */
    def securityTokenAvailable(): js.Promise[Any] = js.native
    
    /**
      * @deprecated (since 1.32) - Use {@link #setChangeGroups} instead
      *
      * Definition of batch groups per entity type for two-way binding changes.
      */
    def setChangeBatchGroups(
      /**
      * A map containing the definition of batch groups for two-way binding changes. The map has the following
      * format:
      * ```javascript
      *
      * {
      *   "EntityTypeName": {
      *     batchGroupId: "ID",
      *     [changeSetId: "ID",]
      *     [single: true/false,]
      *   }
      * }
      * ```
      *
      * 	 - `batchGroupId`: Defines the batch group for changes of the defined EntityTypeName
      * 	 - `changeSetId`: ID of a `ChangeSet` which bundles the changes for the entity type.
      * 	 - `single`: Defines if every change will get an own change set (defaults to `true`)
      */
    mGroups: Record[String, ChangeGroupDefinition]
    ): Unit = js.native
    
    /**
      * Definition of groups per entity type for two-way binding changes.
      */
    def setChangeGroups(
      /**
      * A map containing the definition of batch groups for two-way binding changes, keyed by entity names. The
      * map has the following format:
      * ```javascript
      *
      * {
      *   "EntityTypeName": {
      *     groupId: "ID",
      *     [changeSetId: "ID",]
      *     [single: true/false,]
      *   }
      * }
      * ```
      *
      * 	 - `groupId`: Defines the group for changes of the defined EntityTypeName
      * 	 - `changeSetId`: ID of a `ChangeSet` which bundles the changes for the entity type.
      * 	 - `single`: Defines if every change will get an own change set (defaults to `true`)
      */
    mGroups: Record[String, ChangeGroupDefinition]
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
      * If no default count mode is set for an `ODataModel` (v2), the mode `Request` will be used.
      */
    def setDefaultCountMode(/**
      * The new default count mode for this model
      */
    sCountMode: CountMode): Unit = js.native
    
    /**
      * @deprecated (since 1.32) - use {@link #setDeferredGroups} instead
      *
      * Setting batch groups as deferred.
      *
      * Requests that belong to a deferred batch group have to be sent by explicitly calling {@link #submitChanges}.
      */
    def setDeferredBatchGroups(/**
      * Array of batch group IDs that should be set as deferred
      */
    aGroupIds: js.Array[Any]): Unit = js.native
    
    /**
      * Setting request groups as deferred. **Note:** This will overwrite existing deferred groups, including
      * the default group "changes".
      *
      * Requests that belong to a deferred group will be sent by explicitly calling {@link #submitChanges}.
      */
    def setDeferredGroups(/**
      * Array of group IDs that should be set as deferred
      */
    aGroupIds: js.Array[Any]): Unit = js.native
    
    /**
      * Set custom headers which are provided in a key/value map.
      *
      * These headers are used for requests against the OData backend. Private headers which are set in the ODataModel
      * cannot be modified. These private headers are: `accept, accept-language, x-csrf-token, MaxDataServiceVersion,
      * DataServiceVersion`.
      *
      * To remove these custom headers simply set the `mHeaders` parameter to null. Please also note that when
      * calling this method again, all previous custom headers are removed unless they are specified again in
      * the `mHeaders` parameter.
      */
    def setHeaders(/**
      * The header name/value map.
      */
    mHeaders: js.Object): Unit = js.native
    
    def setMessageScope(
      /**
      * The message scope
      */
    sMessageScope: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof MessageScope * / any */ String
    ): Unit = js.native
    /**
      * @SINCE 1.76.0
      *
      * Sets this model's message scope.
      * See:
      * 	sap.ui.model.odata.MessageScope
      */
    def setMessageScope(/**
      * The message scope
      */
    sMessageScope: MessageScope): Unit = js.native
    
    /**
      * Sets a new value for the given property `sPath` in the model.
      *
      * If the `changeBatchGroup` for the changed entity type is set to {@link #setDeferredGroups deferred},
      * changes could be submitted with {@link #submitChanges}. Otherwise the change will be submitted directly.
      *
      * @returns `true` if the value was set correctly and `false` if errors occurred like the entry was not
      * found or another entry was already updated.
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
    oContext: Unit,
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
    oContext: typings.openui5.sapUiModelContextMod.default
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
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Whether to update other bindings dependent on this property asynchronously
      */
    bAsyncUpdate: Boolean
    ): Boolean = js.native
    
    /**
      * @SINCE 1.16.3
      *
      * Defines whether all affected bindings are refreshed after a change operation.
      *
      * This flag can be overruled on request level by providing the `refreshAfterChange` parameter to the corresponding
      * function (for example {@link #update}).
      */
    def setRefreshAfterChange(/**
      * Whether to automatically refresh after changes
      */
    bRefreshAfterChange: Boolean): Unit = js.native
    
    /**
      * Enable/Disable security token handling.
      */
    def setTokenHandlingEnabled(): Unit = js.native
    def setTokenHandlingEnabled(/**
      * Whether to use token handling or not
      */
    bTokenHandling: Boolean): Unit = js.native
    
    /**
      * Enable or disable batch mode for future requests.
      */
    def setUseBatch(): Unit = js.native
    def setUseBatch(/**
      * Whether the requests should be encapsulated in a batch request
      */
    bUseBatch: Boolean): Unit = js.native
    
    /**
      * Submits the collected changes which were collected by the {@link #setProperty} method and other deferred
      * requests.
      *
      * The update method is defined by the global `defaultUpdateMethod` parameter which is `sap.ui.model.odata.UpdateMethod.Merge`
      * by default. In case of a `sap.ui.model.odata.UpdateMethod.Merge` request only the changed properties
      * will be updated. If a URI with a `$expand` query option was used then the expand entries will be removed
      * from the collected changes. Changes to this entries should be done on the entry itself. So no deep updates
      * are supported.
      *
      * **Important**: The success/error handler will only be called if batch support is enabled. If multiple
      * batch groups are submitted the handlers will be called for every batch group. If there are no changes/requests
      * or all contained requests are aborted before a batch request returns, the success handler will be called
      * with an empty response object. If the abort method on the return object is called, all contained batch
      * requests will be aborted and the error handler will be called for each of them.
      *
      * @returns An object which has an `abort` function to abort the current request or requests
      */
    def submitChanges(): js.Object = js.native
    def submitChanges(
      /**
      * A map which contains the following parameter properties:
      */
    mParameters: BatchGroupIdError
    ): js.Object = js.native
    
    /**
      * Trigger a `PUT/MERGE` request to the OData service that was specified in the model constructor.
      *
      * The update method used is defined by the global `defaultUpdateMethod` parameter which is `sap.ui.model.odata.UpdateMethod.Merge`
      * by default. Please note that deep updates are not supported and may not work. These should be done separately
      * and directly on the corresponding entry.
      *
      * @returns An object which has an `abort` function to abort the current request.
      */
    def update(
      /**
      * A string containing the path to the data that should be updated. The path is concatenated to the sServiceUrl
      * which was specified in the model constructor.
      */
    sPath: String,
      /**
      * Data of the entry that should be updated.
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
      * Data of the entry that should be updated.
      */
    oData: js.Object,
      /**
      * Optional, can contain the following attributes:
      */
    mParameters: UrlParameters
    ): js.Object = js.native
    
    /**
      * Update all bindings.
      */
    def updateBindings(): Unit = js.native
    def updateBindings(
      /**
      * If set to `false`, an update will only be done when the value of a binding changed.
      */
    bForceUpdate: Boolean
    ): Unit = js.native
  }
}
