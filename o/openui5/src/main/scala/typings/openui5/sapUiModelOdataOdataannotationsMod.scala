package typings.openui5

import typings.openui5.anon.Error
import typings.openui5.anon.ResponseText
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataOdataannotationsMod {
  
  @JSImport("sap/ui/model/odata/ODataAnnotations", JSImport.Default)
  @js.native
  open class default protected () extends ODataAnnotations {
    def this(
      /**
      * The annotation-URL or an array of URLs that should be parsed and merged
      */
    aAnnotationURI: String,
      oMetadata: typings.openui5.sapUiModelOdataOdatametadataMod.default,
      mParams: js.Object
    ) = this()
    def this(
      /**
      * The annotation-URL or an array of URLs that should be parsed and merged
      */
    aAnnotationURI: js.Array[String],
      oMetadata: typings.openui5.sapUiModelOdataOdatametadataMod.default,
      mParams: js.Object
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/ODataAnnotations", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.ODataAnnotations with name `sClassName` and enriches
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
      * Returns a metadata object for class sap.ui.model.odata.ODataAnnotations.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataAnnotations
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * Adds either one URL or an array of URLs to be loaded and parsed. The result will be merged into the annotations
      * data which can be retrieved using the getAnnotations-method.
      *
      * @returns The Promise to load the given URL(s), resolved if all URLs have been loaded, rejected if at
      * least one failed to load. The argument is an object containing the annotations object, success (an array
      * of sucessfully loaded URLs), fail (an array ob of failed URLs).
      */
    def addUrl(/**
      * Either one URL as string or an array of URL strings
      */
    vUrl: String): js.Promise[Any] = js.native
    def addUrl(/**
      * Either one URL as string or an array of URL strings
      */
    vUrl: js.Array[String]): js.Promise[Any] = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:failed failed} event of this `sap.ui.model.odata.ODataAnnotations`.
      *
      * @returns Reference to `this` in order to allow method chaining
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataAnnotations`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:failed failed} event of this `sap.ui.model.odata.ODataAnnotations`.
      *
      * @returns Reference to `this` in order to allow method chaining
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataAnnotations`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:loaded loaded} event of this `sap.ui.model.odata.ODataAnnotations`.
      *
      * @returns Reference to `this` in order to allow method chaining
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataAnnotations`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:loaded loaded} event of this `sap.ui.model.odata.ODataAnnotations`.
      *
      * @returns Reference to `this` in order to allow method chaining
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataAnnotations`
      * itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:failed failed} event of this `sap.ui.model.odata.ODataAnnotations`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
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
      * Detaches event handler `fnFunction` from the {@link #event:loaded loaded} event of this `sap.ui.model.odata.ODataAnnotations`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
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
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:failed failed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireFailed(): this.type = js.native
    def fireFailed(/**
      * Parameters to pass along with the event
      */
    oParameters: ResponseText): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:loaded loaded} to attached listeners.
      *
      * @returns `this` to allow method chaining
      */
    def fireLoaded(): this.type = js.native
    def fireLoaded(
      /**
      * Parameters that will be given as parameters to the event handler
      */
    oParameters: js.Object
    ): this.type = js.native
    
    /**
      * returns the raw annotation data
      */
    var getAnnotationsData: Unit = js.native
    
    /**
      * Checks whether annotations loading of at least one of the given URLs has already failed. Note: For asynchronous
      * annotations {@link #attachFailed} has to be used.
      *
      * @returns whether annotations request has failed
      */
    def isFailed(): Boolean = js.native
    
    /**
      * Checks whether annotations from at least one source are available
      *
      * @returns returns whether annotations is already loaded
      */
    def isLoaded(): Boolean = js.native
    
    /**
      * Set custom headers which are provided in a key/value map. These headers are used for all requests. The
      * Accept-Language header cannot be modified and is set using the Core's language setting.
      *
      * To remove these headers simply set the mHeaders parameter to {}. Please also note that when calling this
      * method again all previous custom headers are removed unless they are specified again in the mCustomHeaders
      * parameter.
      */
    def setHeaders(/**
      * the header name/value map.
      */
    mHeaders: Record[String, String]): Unit = js.native
    
    /**
      * Sets an XML document.
      *
      * @returns Whether or not parsing was successful
      */
    def setXML(
      /**
      * The XML document to parse for annotations
      */
    oXMLDocument: js.Object,
      /**
      * The XML content as string to parse for annotations
      */
    sXMLContent: String
    ): Boolean = js.native
    def setXML(
      /**
      * The XML document to parse for annotations
      */
    oXMLDocument: js.Object,
      /**
      * The XML content as string to parse for annotations
      */
    sXMLContent: String,
      /**
      * Additional options
      */
    mOptions: Error
    ): Boolean = js.native
  }
  
  trait ODataAnnotations$FailedEventParameters extends StObject
  
  trait ODataAnnotations$LoadedEventParameters extends StObject
  
  type ODataAnnotationsFailedEvent = typings.openui5.sapUiBaseEventMod.default[ODataAnnotations$FailedEventParameters]
  
  type ODataAnnotationsFailedEventParameters = ODataAnnotations$FailedEventParameters
  
  type ODataAnnotationsLoadedEvent = typings.openui5.sapUiBaseEventMod.default[ODataAnnotations$LoadedEventParameters]
  
  type ODataAnnotationsLoadedEventParameters = ODataAnnotations$LoadedEventParameters
}
