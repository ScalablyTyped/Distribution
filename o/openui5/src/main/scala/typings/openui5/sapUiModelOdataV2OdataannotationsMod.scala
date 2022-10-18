package typings.openui5

import typings.openui5.anon.SkipMetadata
import typings.openui5.sap.ClassInfo
import typings.std.Document
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataV2OdataannotationsMod {
  
  @JSImport("sap/ui/model/odata/v2/ODataAnnotations", JSImport.Default)
  @js.native
  open class default protected () extends ODataAnnotations {
    /**
      * Creates a new instance of the ODataAnnotations annotation loader.
      */
    def this(
      /**
      * Metadata object with the metadata information needed to parse the annotations
      */
    oMetadata: typings.openui5.sapUiModelOdataOdatametadataMod.default,
      /**
      * Obligatory options
      */
    mOptions: SkipMetadata
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/v2/ODataAnnotations", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.v2.ODataAnnotations with name `sClassName` and enriches
      * it with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.EventProvider.extend}.
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
    oClassInfo: ClassInfo[T, ODataAnnotations]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataAnnotations],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.v2.ODataAnnotations.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataAnnotations
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * Adds one or several sources to the annotation loader. Sources will be loaded instantly but merged only
      * after the previously added source has either been successfully merged or failed.
      *
      * @returns The promise to (load,) parse and merge the given source(s). The Promise resolves with an array
      * of maps containing the properties `source` and `data`; see the parameters of the `success` event for
      * more details. In case at least one source could not be (loaded,) parsed or merged, the promise fails
      * with an array of objects containing Errors and/or Success objects.
      */
    def addSource(
      /**
      * One or several Annotation source or array of annotation sources; an annotation source is either a string
      * containing a URL or an object of type {@link sap.ui.model.odata.v2.ODataAnnotations.Source}.
      */
    vSource: String
    ): js.Promise[Any] = js.native
    def addSource(
      /**
      * One or several Annotation source or array of annotation sources; an annotation source is either a string
      * containing a URL or an object of type {@link sap.ui.model.odata.v2.ODataAnnotations.Source}.
      */
    vSource: js.Array[Source | String]
    ): js.Promise[Any] = js.native
    def addSource(
      /**
      * One or several Annotation source or array of annotation sources; an annotation source is either a string
      * containing a URL or an object of type {@link sap.ui.model.odata.v2.ODataAnnotations.Source}.
      */
    vSource: Source
    ): js.Promise[Any] = js.native
    
    /**
      * Attaches the given callback to the `allFailed` event.
      *
      * This event exists for compatibility with the old Annotation loader. It is fired when no annotation from
      * a group of sources was successfully (loaded,) parsed and merged. The parameter `result` will be set on
      * the event argument and contains an array of Errors in the order in which the sources had been added.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.v2.ODataAnnotations` itself.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def attachAllFailed(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachAllFailed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `ODataAnnotations` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches the given callback to the `allFailed` event.
      *
      * This event exists for compatibility with the old Annotation loader. It is fired when no annotation from
      * a group of sources was successfully (loaded,) parsed and merged. The parameter `result` will be set on
      * the event argument and contains an array of Errors in the order in which the sources had been added.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.v2.ODataAnnotations` itself.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def attachAllFailed(
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
    def attachAllFailed(
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
      * Context object to call the event handler with, defaults to this `ODataAnnotations` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches the given callback to the {@link #event:error error} event, which is fired whenever a source
      * cannot be loaded, parsed or merged into the annotation data.
      *
      * The following parameters will be set on the event object that is given to the callback function: `source`
      * - A map containing the properties `type` - containing either "url" or "xml" - and `data` containing the
      * data given as source, either a URL or an XML string depending on how the source was added. `error` -
      * An Error object describing the problem that occurred
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.v2.ODataAnnotations` itself.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def attachError(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachError(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `ODataAnnotations` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches the given callback to the {@link #event:error error} event, which is fired whenever a source
      * cannot be loaded, parsed or merged into the annotation data.
      *
      * The following parameters will be set on the event object that is given to the callback function: `source`
      * - A map containing the properties `type` - containing either "url" or "xml" - and `data` containing the
      * data given as source, either a URL or an XML string depending on how the source was added. `error` -
      * An Error object describing the problem that occurred
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.v2.ODataAnnotations` itself.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def attachError(
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
    def attachError(
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
      * Context object to call the event handler with, defaults to this `ODataAnnotations` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches the given callback to the {@link #event:failed failed} event.
      *
      * This event is fired when at least one annotation from a group of sources was not successfully (loaded,)
      * parsed or merged. The parameter `result` will be set on the event argument and contains an array of Errors
      * in the order in which the sources had been added.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.v2.ODataAnnotations` itself.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def attachFailed(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachFailed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `ODataAnnotations` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches the given callback to the {@link #event:failed failed} event.
      *
      * This event is fired when at least one annotation from a group of sources was not successfully (loaded,)
      * parsed or merged. The parameter `result` will be set on the event argument and contains an array of Errors
      * in the order in which the sources had been added.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.v2.ODataAnnotations` itself.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def attachFailed(
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
    def attachFailed(
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
      * Context object to call the event handler with, defaults to this `ODataAnnotations` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches the given callback to the {@link #event:loaded loaded} event.
      *
      * This event is fired when all annotations from a group of sources was successfully (loaded,) parsed and
      * merged. The parameter `result` will be set on the event argument and contains an array of all loaded
      * sources as well as Errors in the order in which they had been added.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.v2.ODataAnnotations` itself.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def attachLoaded(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachLoaded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `ODataAnnotations` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches the given callback to the {@link #event:loaded loaded} event.
      *
      * This event is fired when all annotations from a group of sources was successfully (loaded,) parsed and
      * merged. The parameter `result` will be set on the event argument and contains an array of all loaded
      * sources as well as Errors in the order in which they had been added.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.v2.ODataAnnotations` itself.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def attachLoaded(
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
    def attachLoaded(
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
      * Context object to call the event handler with, defaults to this `ODataAnnotations` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches the given callback to the `someLoaded` event.
      *
      * This event exists for compatibility with the old annotation loader. It is fired when at least one annotation
      * from a group of sources was successfully (loaded,) parsed and merged. The parameter `result` will be
      * set on the event argument and contains an array of all loaded sources as well as Errors in the order
      * in which they had been added.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.v2.ODataAnnotations` itself.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def attachSomeLoaded(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachSomeLoaded(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `ODataAnnotations` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches the given callback to the `someLoaded` event.
      *
      * This event exists for compatibility with the old annotation loader. It is fired when at least one annotation
      * from a group of sources was successfully (loaded,) parsed and merged. The parameter `result` will be
      * set on the event argument and contains an array of all loaded sources as well as Errors in the order
      * in which they had been added.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.v2.ODataAnnotations` itself.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def attachSomeLoaded(
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
    def attachSomeLoaded(
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
      * Context object to call the event handler with, defaults to this `ODataAnnotations` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches the given callback to the {@link #event:success success} event, which is fired whenever a source
      * has been successfully (loaded,) parsed and merged into the annotation data.
      *
      * The following parameters are set on the event object that is given to the callback function: `source`
      * - A map containing the properties `type` - containing either "url" or "xml" - and `data` containing the
      * data given as source, either a URL or an XML string depending on how the source was added.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.v2.ODataAnnotations` itself.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def attachSuccess(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def attachSuccess(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with, defaults to this `ODataAnnotations` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches the given callback to the {@link #event:success success} event, which is fired whenever a source
      * has been successfully (loaded,) parsed and merged into the annotation data.
      *
      * The following parameters are set on the event object that is given to the callback function: `source`
      * - A map containing the properties `type` - containing either "url" or "xml" - and `data` containing the
      * data given as source, either a URL or an XML string depending on how the source was added.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.v2.ODataAnnotations` itself.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def attachSuccess(
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
    def attachSuccess(
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
      * Context object to call the event handler with, defaults to this `ODataAnnotations` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches the given callback from the `allFailed` event.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def detachAllFailed(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachAllFailed(
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
      * Detaches the given callback from the `error` event.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def detachError(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachError(
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
      * Detaches the given callback from the `failed` event.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def detachFailed(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachFailed(
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
      * Detaches the given callback from the `loaded` event.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def detachLoaded(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachLoaded(
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
      * Detaches the given callback from the `someLoaded` event.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def detachSomeLoaded(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachSomeLoaded(
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
      * Detaches the given callback from the `success` event.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` to allow method chaining
      */
    def detachSuccess(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): this.type = js.native
    def detachSuccess(
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
      * @deprecated (since 1.37.0) - only kept for compatibility with V1 API, use {@link #getData} instead.
      *
      * Returns the parsed and merged annotation data object.
      *
      * @returns The annotation data
      */
    def getAnnotationsData(): js.Object = js.native
    
    /**
      * Returns the parsed and merged annotation data object.
      *
      * @returns The annotation data
      */
    def getData(): js.Object = js.native
    
    /**
      * Returns a map of custom headers that are sent with every request to an annotation URL.
      *
      * @returns A map of all custom headers.
      */
    def getHeaders(): Record[String, String] = js.native
    
    /**
      * Returns a promise that resolves when the added annotation sources were successfully processed.
      *
      * @returns A promise that resolves after the last added sources have been processed
      */
    def loaded(): js.Promise[Any] = js.native
    
    /**
      * Set custom headers which are provided in a key/value map. These headers are used for all requests. The
      * "Accept-Language" header cannot be modified and is set using the core's language setting.
      *
      * To remove these headers, simply set the `mHeaders` parameter to `{}`. Note that when calling this method
      * again, all previous custom headers are removed, unless they are specified again in the `mCustomHeaders`
      * parameter.
      */
    def setHeaders(/**
      * the header name/value map.
      */
    mHeaders: Record[String, String]): Unit = js.native
  }
  
  trait Source extends StObject {
    
    /**
      * (Set internally, available in event-callback) The parsed Annotations object of the annotation source
      */
    var annotations: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The data or a Promise that resolves with the data. In case the type is set to "url" the data must be
      * a URL, in case it is set to "xml" the data must be an XML string.
      */
    var data: String | js.Promise[Any]
    
    /**
      * (Set internally, available in event-callback) The parsed XML document of the annotation source
      */
    var document: js.UndefOr[Document] = js.undefined
    
    /**
      * The source type. Either "url" or "xml".
      */
    var `type`: String
    
    /**
      * (Set internally, available in event-callback) The XML string of the annotation source
      */
    var xml: js.UndefOr[String] = js.undefined
  }
  object Source {
    
    inline def apply(data: String | js.Promise[Any], `type`: String): Source = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setAnnotations(value: js.Object): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
      
      inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
      
      inline def setData(value: String | js.Promise[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setXml(value: String): Self = StObject.set(x, "xml", value.asInstanceOf[js.Any])
      
      inline def setXmlUndefined: Self = StObject.set(x, "xml", js.undefined)
    }
  }
  
  trait errorParameters extends StObject {
    
    /**
      * The error that occurred. Also contains the properties from {@link sap.ui.model.odata.v2.ODataAnnotations.Source}
      * that could be filled up to that point
      */
    var result: js.Error
  }
  object errorParameters {
    
    inline def apply(result: js.Error): errorParameters = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[errorParameters]
    }
    
    extension [Self <: errorParameters](x: Self) {
      
      inline def setResult(value: js.Error): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait failedParameters extends StObject {
    
    /**
      * An array of Errors (@see sap.ui.model.v2.ODataAnnotations#error) that occurred while loading a group
      * of annotations
      */
    var result: js.Array[js.Error]
  }
  object failedParameters {
    
    inline def apply(result: js.Array[js.Error]): failedParameters = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[failedParameters]
    }
    
    extension [Self <: failedParameters](x: Self) {
      
      inline def setResult(value: js.Array[js.Error]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultVarargs(value: js.Error*): Self = StObject.set(x, "result", js.Array(value*))
    }
  }
  
  trait loadedParameters extends StObject {
    
    /**
      * An array of results and Errors (@see sap.ui.model.v2.ODataAnnotations#success and @see sap.ui.model.v2.ODataAnnotations#error)
      * that occurred while loading a group of annotations
      */
    var result: (js.Array[js.Error | Source]) | Any
  }
  object loadedParameters {
    
    inline def apply(result: (js.Array[js.Error | Source]) | Any): loadedParameters = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[loadedParameters]
    }
    
    extension [Self <: loadedParameters](x: Self) {
      
      inline def setResult(value: (js.Array[js.Error | Source]) | Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultVarargs(value: (js.Error | Source)*): Self = StObject.set(x, "result", js.Array(value*))
    }
  }
  
  trait successParameters extends StObject {
    
    /**
      * The source type. Either "url" or "xml".
      */
    var result: Source
  }
  object successParameters {
    
    inline def apply(result: Source): successParameters = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[successParameters]
    }
    
    extension [Self <: successParameters](x: Self) {
      
      inline def setResult(value: Source): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
