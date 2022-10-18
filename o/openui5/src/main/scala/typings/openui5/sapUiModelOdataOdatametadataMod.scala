package typings.openui5

import typings.openui5.anon.CacheKey
import typings.openui5.anon.ResponseText
import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelOdataOdatametadataMod {
  
  @JSImport("sap/ui/model/odata/ODataMetadata", JSImport.Default)
  @js.native
  open class default protected () extends ODataMetadata {
    /**
      * Constructor for a new ODataMetadata.
      */
    def this(/**
      * needs the correct metadata uri including $metadata
      */
    sMetadataURI: String) = this()
    def this(
      /**
      * needs the correct metadata uri including $metadata
      */
    sMetadataURI: String,
      /**
      * optional map of parameters.
      */
    mParams: CacheKey
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/odata/ODataMetadata", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.odata.ODataMetadata with name `sClassName` and enriches
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
    oClassInfo: ClassInfo[T, ODataMetadata]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ODataMetadata],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.odata.ODataMetadata.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait ODataMetadata
    extends typings.openui5.sapUiBaseEventProviderMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:failed failed} event of this `sap.ui.model.odata.ODataMetadata`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.ODataMetadata` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataMetadata` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:failed failed} event of this `sap.ui.model.odata.ODataMetadata`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.ODataMetadata` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataMetadata` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:loaded loaded} event of this `sap.ui.model.odata.ODataMetadata`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.ODataMetadata` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataMetadata` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:loaded loaded} event of this `sap.ui.model.odata.ODataMetadata`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.odata.ODataMetadata` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.model.odata.ODataMetadata` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:failed failed} event of this `sap.ui.model.odata.ODataMetadata`.
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
      * Detaches event handler `fnFunction` from the {@link #event:loaded loaded} event of this `sap.ui.model.odata.ODataMetadata`.
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
      * Fires event {@link #event:loaded loaded} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireLoaded(): this.type = js.native
    def fireLoaded(/**
      * Parameters to pass along with the event
      */
    oParameters: js.Object): this.type = js.native
    
    /**
      * Return the metadata object.
      *
      * @returns Metadata object
      */
    def getServiceMetadata(): js.Object = js.native
    
    /**
      * Get the use-batch extension value if any
      *
      * @returns true/false
      */
    def getUseBatch(): Boolean = js.native
    
    /**
      * Checks whether metadata loading has already failed.
      *
      * @returns Whether metadata request has failed
      */
    def isFailed(): Boolean = js.native
    
    /**
      * Checks whether metadata is available.
      *
      * @returns Whether metadata is already loaded
      */
    def isLoaded(): Boolean = js.native
    
    /**
      * Returns a promise for the loaded state of the metadata.
      *
      * @returns A promise on metadata loaded state
      */
    def loaded(): js.Promise[Any] = js.native
    def loaded(
      /**
      * With `bRejectOnFailure=false` the returned promise is not rejected. In case of failure this promise stays
      * pending. Since 1.79 with `bRejectOnFailure=true` the returned promise is rejected when the initial loading
      * of the metadata fails.
      */
    bRejectOnFailure: Boolean
    ): js.Promise[Any] = js.native
    
    /**
      * Refreshes the metadata creating a new request to the server.
      *
      * Returns a new promise which can be resolved or rejected depending on the metadata loading state.
      *
      * @returns A promise on metadata loaded state
      */
    def refresh(): js.Promise[Any] = js.native
  }
}
