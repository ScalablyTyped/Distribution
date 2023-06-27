package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiModelBindingModeMod.BindingMode
import typings.openui5.sapUiModelChangeReasonMod.ChangeReason
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelModelMod {
  
  @JSImport("sap/ui/model/Model", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Model.
    *
    * Every Model is a MessageProcessor that is able to handle Messages with the normal binding path syntax
    * in the target.
    */
  open class default () extends Model
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/Model", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.Model with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.message.MessageProcessor.extend}.
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
    oClassInfo: ClassInfo[T, Model]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Model],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.Model.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait Model
    extends typings.openui5.sapUiCoreMessageMessageProcessorMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:parseError parseError} event of this `sap.ui.model.Model`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Model` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachParseError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelParseErrorEvent, Unit]
    ): this.type = js.native
    def attachParseError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelParseErrorEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.Model` itself.
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:parseError parseError} event of this `sap.ui.model.Model`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Model` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachParseError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelParseErrorEvent, Unit]
    ): this.type = js.native
    def attachParseError(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelParseErrorEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.Model` itself.
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:propertyChange propertyChange} event of this
      * `sap.ui.model.Model`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Model` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPropertyChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelPropertyChangeEvent, Unit]
    ): this.type = js.native
    def attachPropertyChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelPropertyChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.Model` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:propertyChange propertyChange} event of this
      * `sap.ui.model.Model`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Model` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPropertyChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelPropertyChangeEvent, Unit]
    ): this.type = js.native
    def attachPropertyChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelPropertyChangeEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.Model` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:requestCompleted requestCompleted} event of
      * this `sap.ui.model.Model`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Model` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRequestCompleted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestCompletedEvent, Unit]
    ): this.type = js.native
    def attachRequestCompleted(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestCompletedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.Model` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:requestCompleted requestCompleted} event of
      * this `sap.ui.model.Model`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Model` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRequestCompleted(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestCompletedEvent, Unit]
    ): this.type = js.native
    def attachRequestCompleted(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestCompletedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.Model` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:requestFailed requestFailed} event of this `sap.ui.model.Model`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Model` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRequestFailed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestFailedEvent, Unit]
    ): this.type = js.native
    def attachRequestFailed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestFailedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.Model` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:requestFailed requestFailed} event of this `sap.ui.model.Model`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Model` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRequestFailed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestFailedEvent, Unit]
    ): this.type = js.native
    def attachRequestFailed(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestFailedEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.Model` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:requestSent requestSent} event of this `sap.ui.model.Model`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Model` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRequestSent(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestSentEvent, Unit]
    ): this.type = js.native
    def attachRequestSent(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestSentEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.Model` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:requestSent requestSent} event of this `sap.ui.model.Model`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.model.Model` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachRequestSent(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestSentEvent, Unit]
    ): this.type = js.native
    def attachRequestSent(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestSentEvent, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.model.Model` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Create ContextBinding.
      *
      * @returns The newly created binding
      */
    def bindContext(/**
      * The path pointing to the property that should be bound
      */
    sPath: String): typings.openui5.sapUiModelContextBindingMod.default = js.native
    def bindContext(
      /**
      * The path pointing to the property that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelContextBindingMod.default = js.native
    def bindContext(
      /**
      * The path pointing to the property that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object,
      /**
      * Event handlers can be passed to the binding ({change:myHandler})
      */
    oEvents: js.Object
    ): typings.openui5.sapUiModelContextBindingMod.default = js.native
    def bindContext(
      /**
      * The path pointing to the property that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Additional model-specific parameters
      */
    mParameters: Unit,
      /**
      * Event handlers can be passed to the binding ({change:myHandler})
      */
    oEvents: js.Object
    ): typings.openui5.sapUiModelContextBindingMod.default = js.native
    def bindContext(
      /**
      * The path pointing to the property that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): typings.openui5.sapUiModelContextBindingMod.default = js.native
    def bindContext(
      /**
      * The path pointing to the property that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelContextBindingMod.default = js.native
    def bindContext(
      /**
      * The path pointing to the property that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object,
      /**
      * Event handlers can be passed to the binding ({change:myHandler})
      */
    oEvents: js.Object
    ): typings.openui5.sapUiModelContextBindingMod.default = js.native
    def bindContext(
      /**
      * The path pointing to the property that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Additional model-specific parameters
      */
    mParameters: Unit,
      /**
      * Event handlers can be passed to the binding ({change:myHandler})
      */
    oEvents: js.Object
    ): typings.openui5.sapUiModelContextBindingMod.default = js.native
    
    /**
      *
      * @returns The newly created binding
      */
    def bindList(/**
      * The path pointing to the list / array that should be bound
      */
    sPath: String): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: Unit,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: Unit,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: Unit,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: Unit,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default],
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: Unit,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: Unit,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: Unit,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    def bindList(
      /**
      * The path pointing to the list / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Initial sort order (can be either a sorter or an array of sorters)
      */
    aSorters: typings.openui5.sapUiModelSorterMod.default,
      /**
      * Predefined filter/s (can be either a filter or an array of filters)
      */
    aFilters: typings.openui5.sapUiModelFilterMod.default,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelListBindingMod.default = js.native
    
    /**
      *
      * @returns The newly created binding
      */
    def bindProperty(/**
      * The path pointing to the property that should be bound
      */
    sPath: String): typings.openui5.sapUiModelPropertyBindingMod.default = js.native
    def bindProperty(
      /**
      * The path pointing to the property that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelPropertyBindingMod.default = js.native
    def bindProperty(
      /**
      * The path pointing to the property that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): typings.openui5.sapUiModelPropertyBindingMod.default = js.native
    def bindProperty(
      /**
      * The path pointing to the property that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelPropertyBindingMod.default = js.native
    
    /**
      *
      * @returns The newly created binding
      */
    def bindTree(/**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters
      */
    mParameters: js.Object,
      /**
      * Predefined sap.ui.model.sorter/s contained in an array
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters
      */
    mParameters: Unit,
      /**
      * Predefined sap.ui.model.sorter/s contained in an array
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters
      */
    mParameters: js.Object,
      /**
      * Predefined sap.ui.model.sorter/s contained in an array
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: Unit,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters
      */
    mParameters: Unit,
      /**
      * Predefined sap.ui.model.sorter/s contained in an array
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default]
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters
      */
    mParameters: js.Object,
      /**
      * Predefined sap.ui.model.sorter/s contained in an array
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: js.Array[typings.openui5.sapUiModelFilterMod.default],
      /**
      * Additional model specific parameters
      */
    mParameters: Unit,
      /**
      * Predefined sap.ui.model.sorter/s contained in an array
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters
      */
    mParameters: js.Object
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters
      */
    mParameters: js.Object,
      /**
      * Predefined sap.ui.model.sorter/s contained in an array
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    def bindTree(
      /**
      * The path pointing to the tree / array that should be bound
      */
    sPath: String,
      /**
      * The context object for this databinding
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Predefined filter/s contained in an array
      */
    aFilters: Unit,
      /**
      * Additional model specific parameters
      */
    mParameters: Unit,
      /**
      * Predefined sap.ui.model.sorter/s contained in an array
      */
    aSorters: js.Array[typings.openui5.sapUiModelSorterMod.default]
    ): typings.openui5.sapUiModelTreeBindingMod.default = js.native
    
    /**
      *
      * @returns The binding context, if it could be created synchronously
      */
    def createBindingContext(/**
      * The path to create the new context from
      */
    sPath: String): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: Unit,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: js.Object
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: Unit,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: js.Object,
      /**
      * The function which should be called after the binding context has been created
      */
    fnCallBack: js.Function
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: Unit,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: js.Object,
      /**
      * The function which should be called after the binding context has been created
      */
    fnCallBack: js.Function,
      /**
      * Force reload even if data is already available; for server-side models this should refetch the data from
      * the server
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: Unit,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: js.Object,
      /**
      * The function which should be called after the binding context has been created
      */
    fnCallBack: Unit,
      /**
      * Force reload even if data is already available; for server-side models this should refetch the data from
      * the server
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: Unit,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: Unit,
      /**
      * The function which should be called after the binding context has been created
      */
    fnCallBack: js.Function
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: Unit,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: Unit,
      /**
      * The function which should be called after the binding context has been created
      */
    fnCallBack: js.Function,
      /**
      * Force reload even if data is already available; for server-side models this should refetch the data from
      * the server
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: Unit,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: Unit,
      /**
      * The function which should be called after the binding context has been created
      */
    fnCallBack: Unit,
      /**
      * Force reload even if data is already available; for server-side models this should refetch the data from
      * the server
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: js.Object
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: js.Object,
      /**
      * The function which should be called after the binding context has been created
      */
    fnCallBack: js.Function
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: js.Object,
      /**
      * The function which should be called after the binding context has been created
      */
    fnCallBack: js.Function,
      /**
      * Force reload even if data is already available; for server-side models this should refetch the data from
      * the server
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: js.Object,
      /**
      * The function which should be called after the binding context has been created
      */
    fnCallBack: Unit,
      /**
      * Force reload even if data is already available; for server-side models this should refetch the data from
      * the server
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: Unit,
      /**
      * The function which should be called after the binding context has been created
      */
    fnCallBack: js.Function
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: Unit,
      /**
      * The function which should be called after the binding context has been created
      */
    fnCallBack: js.Function,
      /**
      * Force reload even if data is already available; for server-side models this should refetch the data from
      * the server
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    def createBindingContext(
      /**
      * The path to create the new context from
      */
    sPath: String,
      /**
      * The context which should be used to create the new binding context
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * The parameters used to create the new binding context
      */
    mParameters: Unit,
      /**
      * The function which should be called after the binding context has been created
      */
    fnCallBack: Unit,
      /**
      * Force reload even if data is already available; for server-side models this should refetch the data from
      * the server
      */
    bReload: Boolean
    ): js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.native
    
    def destroyBindingContext(/**
      * The context to destroy
      */
    oContext: typings.openui5.sapUiModelContextMod.default): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:parseError parseError} event of this `sap.ui.model.Model`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachParseError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelParseErrorEvent, Unit]
    ): this.type = js.native
    def detachParseError(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelParseErrorEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:propertyChange propertyChange} event of this
      * `sap.ui.model.Model`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPropertyChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelPropertyChangeEvent, Unit]
    ): this.type = js.native
    def detachPropertyChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelPropertyChangeEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:requestCompleted requestCompleted} event of
      * this `sap.ui.model.Model`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRequestCompleted(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestCompletedEvent, Unit]
    ): this.type = js.native
    def detachRequestCompleted(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestCompletedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:requestFailed requestFailed} event of this
      * `sap.ui.model.Model`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRequestFailed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestFailedEvent, Unit]
    ): this.type = js.native
    def detachRequestFailed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestFailedEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:requestSent requestSent} event of this `sap.ui.model.Model`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachRequestSent(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestSentEvent, Unit]
    ): this.type = js.native
    def detachRequestSent(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* evt */ ModelRequestSentEvent, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:parseError parseError} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireParseError(): this.type = js.native
    def fireParseError(
      /**
      * Parameters to pass along with the event; May contain the following parameters: `errorCode`, `url`, `reason`,
      * `srcText`, `line`, `linePos`, `filePos`
      */
    oParameters: Model$ParseErrorEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:propertyChange propertyChange} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePropertyChange(): this.type = js.native
    def firePropertyChange(
      /**
      * Parameters to pass along with the event
      */
    oParameters: Model$PropertyChangeEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:requestCompleted requestCompleted} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRequestCompleted(): this.type = js.native
    def fireRequestCompleted(
      /**
      * Parameters to pass along with the event
      */
    oParameters: Model$RequestCompletedEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:requestFailed requestFailed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRequestFailed(): this.type = js.native
    def fireRequestFailed(
      /**
      * Parameters to pass along with the event
      */
    oParameters: Model$RequestFailedEventParameters
    ): this.type = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Fires event {@link #event:requestSent requestSent} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireRequestSent(): this.type = js.native
    def fireRequestSent(/**
      * Parameters to pass along with the event
      */
    oParameters: Model$RequestSentEventParameters): this.type = js.native
    
    /**
      * Get the default binding mode for the model.
      *
      * @returns Default binding mode of the model
      */
    def getDefaultBindingMode(): BindingMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingMode * / any */ String) = js.native
    
    /**
      * @since 1.76.0
      *
      * Returns messages of this model associated with the given context, that is messages belonging to the object
      * referred to by this context or a child object of that object. The messages are sorted by their {@link sap.ui.core.message.Message#getType type }
      * according to the type's severity in a way that messages with highest severity come first.
      *
      * @returns The messages associated with this context sorted by severity; empty array in case no messages
      * exist
      */
    def getMessages(
      /**
      * The context to retrieve messages for
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): js.Array[typings.openui5.sapUiCoreMessageMessageMod.default] = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns model messages for which the target matches the given resolved binding path.
      *
      * @returns An array of messages matching the given path; may be empty but not `null` or `undefined`
      */
    def getMessagesByPath(/**
      * The resolved binding path
      */
    sPath: String): js.Array[typings.openui5.sapUiCoreMessageMessageMod.default] = js.native
    def getMessagesByPath(
      /**
      * The resolved binding path
      */
    sPath: String,
      /**
      * Whether also messages with a target starting with the given path are returned, not just the messages
      * with a target identical to the given path
      */
    bPrefixMatch: Boolean
    ): js.Array[typings.openui5.sapUiCoreMessageMessageMod.default] = js.native
    
    /**
      * Returns the meta model associated with this model if it is available for the concrete model type.
      *
      * @returns The meta model or `undefined` if no meta model exists.
      */
    def getMetaModel(): js.UndefOr[typings.openui5.sapUiModelMetaModelMod.default] = js.native
    
    /**
      *
      * @returns The value for the given path/context or `undefined` if data could not be found
      */
    def getObject(/**
      * Path to where to read the object
      */
    sPath: String): js.UndefOr[Any] = js.native
    def getObject(
      /**
      * Path to where to read the object
      */
    sPath: String,
      /**
      * Context with which the path should be resolved
      */
    oContext: Unit,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): js.UndefOr[Any] = js.native
    def getObject(
      /**
      * Path to where to read the object
      */
    sPath: String,
      /**
      * Context with which the path should be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): js.UndefOr[Any] = js.native
    def getObject(
      /**
      * Path to where to read the object
      */
    sPath: String,
      /**
      * Context with which the path should be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default,
      /**
      * Additional model-specific parameters
      */
    mParameters: js.Object
    ): js.UndefOr[Any] = js.native
    
    /**
      * Returns the original value for the property with the given path and context.
      *
      * The original value is the value that was last responded by a server if using a server model implementation.
      *
      * @returns vValue The value of the property
      */
    def getOriginalProperty(/**
      * Path/name of the property
      */
    sPath: String): Any = js.native
    def getOriginalProperty(
      /**
      * Path/name of the property
      */
    sPath: String,
      /**
      * Context if available to access the property value
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): Any = js.native
    
    /**
      *
      * @returns Value of the addressed property
      */
    def getProperty(/**
      * The path to where to read the attribute value
      */
    sPath: String): Any = js.native
    def getProperty(
      /**
      * The path to where to read the attribute value
      */
    sPath: String,
      /**
      * The context with which the path should be resolved
      */
    oContext: typings.openui5.sapUiModelContextMod.default
    ): Any = js.native
    
    def isBindingModeSupported(
      /**
      * The binding mode to check
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingMode * / any */ String
    ): Boolean = js.native
    /**
      * Check if the specified binding mode is supported by the model.
      *
      * @returns Whether the given binding mode is supported
      */
    def isBindingModeSupported(/**
      * The binding mode to check
      */
    sMode: BindingMode): Boolean = js.native
    
    /**
      * @deprecated (since 1.88.0) - legacy path syntax is not supported by most model implementations.
      *
      * Returns whether legacy path syntax is used.
      *
      * @returns Whether legacy path syntax is used
      */
    def isLegacySyntax(): Boolean = js.native
    
    /**
      * Refresh the model.
      *
      * This will check all bindings for updated data and update the controls if data has been changed.
      */
    def refresh(): Unit = js.native
    def refresh(/**
      * Update controls even if data has not been changed
      */
    bForceUpdate: Boolean): Unit = js.native
    
    def setDefaultBindingMode(
      /**
      * The default binding mode to set for the model
      */
    sMode: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BindingMode * / any */ String
    ): this.type = js.native
    /**
      * Set the default binding mode for the model.
      *
      * If the default binding mode should be changed, this method should be called directly after model instance
      * creation and before any binding creation. Otherwise it is not guaranteed that the existing bindings will
      * be updated with the new binding mode.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultBindingMode(/**
      * The default binding mode to set for the model
      */
    sMode: BindingMode): this.type = js.native
    
    /**
      * @deprecated (since 1.88.0) - legacy path syntax is not supported by most model implementations.
      *
      * Enables legacy path syntax handling.
      *
      * This defines, whether relative bindings, which do not have a defined binding context, should be compatible
      * to earlier releases which means they are resolved relative to the root element or handled strict and
      * stay unresolved until a binding context is set.
      */
    def setLegacySyntax(/**
      * The path syntax to use
      */
    bLegacySyntax: Boolean): Unit = js.native
    
    /**
      * Sets the messages for this model and notifies the bindings if the new messages differ from the current
      * model messages.
      */
    def setMessages(): Unit = js.native
    
    /**
      * Set the maximum number of entries which are used for list bindings.
      *
      * The default size limit for models is 100.
      */
    def setSizeLimit(/**
      * Collection size limit
      */
    iSizeLimit: int): Unit = js.native
  }
  
  trait Model$ParseErrorEventParameters extends StObject {
    
    var errorCode: js.UndefOr[int] = js.undefined
    
    var filepos: js.UndefOr[int] = js.undefined
    
    var line: js.UndefOr[int] = js.undefined
    
    var linepos: js.UndefOr[int] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var srcText: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
  }
  object Model$ParseErrorEventParameters {
    
    inline def apply(): Model$ParseErrorEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Model$ParseErrorEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Model$ParseErrorEventParameters] (val x: Self) extends AnyVal {
      
      inline def setErrorCode(value: int): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setFilepos(value: int): Self = StObject.set(x, "filepos", value.asInstanceOf[js.Any])
      
      inline def setFileposUndefined: Self = StObject.set(x, "filepos", js.undefined)
      
      inline def setLine(value: int): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setLinepos(value: int): Self = StObject.set(x, "linepos", value.asInstanceOf[js.Any])
      
      inline def setLineposUndefined: Self = StObject.set(x, "linepos", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setSrcText(value: String): Self = StObject.set(x, "srcText", value.asInstanceOf[js.Any])
      
      inline def setSrcTextUndefined: Self = StObject.set(x, "srcText", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Model$PropertyChangeEventParameters extends StObject {
    
    /**
      * The binding context (if available)
      */
    var context: js.UndefOr[typings.openui5.sapUiModelContextMod.default] = js.undefined
    
    /**
      * The path of the property
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * The cause of the property value change
      */
    var reason: js.UndefOr[ChangeReason] = js.undefined
    
    /**
      * The current value of the property
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object Model$PropertyChangeEventParameters {
    
    inline def apply(): Model$PropertyChangeEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Model$PropertyChangeEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Model$PropertyChangeEventParameters] (val x: Self) extends AnyVal {
      
      inline def setContext(value: typings.openui5.sapUiModelContextMod.default): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setReason(value: ChangeReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait Model$RequestCompletedEventParameters extends StObject {
    
    /**
      * If the request is synchronous or asynchronous (if available)
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If the request failed the error if any can be accessed in this property.
      */
    var errorobject: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Additional information for the request (if available) **deprecated**
      */
    var info: js.UndefOr[String] = js.undefined
    
    /**
      * Additional information for the request (if available)
      */
    var infoObject: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Whether the request has been successful or not. In case of errors, consult the optional `errorobject`
      * parameter.
      */
    var success: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Type of the request (if available)
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * URL which was sent to the back end
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object Model$RequestCompletedEventParameters {
    
    inline def apply(): Model$RequestCompletedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Model$RequestCompletedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Model$RequestCompletedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setErrorobject(value: js.Object): Self = StObject.set(x, "errorobject", value.asInstanceOf[js.Any])
      
      inline def setErrorobjectUndefined: Self = StObject.set(x, "errorobject", js.undefined)
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoObject(value: js.Object): Self = StObject.set(x, "infoObject", value.asInstanceOf[js.Any])
      
      inline def setInfoObjectUndefined: Self = StObject.set(x, "infoObject", js.undefined)
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait Model$RequestFailedEventParameters extends StObject {
    
    /**
      * A text that describes the failure.
      */
    var message: js.UndefOr[String] = js.undefined
    
    /**
      * Response that has been received for the request, as a text string
      */
    var responseText: js.UndefOr[String] = js.undefined
    
    /**
      * HTTP status code returned by the request (if available)
      */
    var statusCode: js.UndefOr[String] = js.undefined
    
    /**
      * The status as a text, details not specified, intended only for diagnosis output
      */
    var statusText: js.UndefOr[String] = js.undefined
  }
  object Model$RequestFailedEventParameters {
    
    inline def apply(): Model$RequestFailedEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Model$RequestFailedEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Model$RequestFailedEventParameters] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      inline def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
      
      inline def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    }
  }
  
  trait Model$RequestSentEventParameters extends StObject {
    
    /**
      * If the request is synchronous or asynchronous (if available)
      */
    var async: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Additional information for the request (if available) **deprecated**
      */
    var info: js.UndefOr[String] = js.undefined
    
    /**
      * Additional information for the request (if available)
      */
    var infoObject: js.UndefOr[js.Object] = js.undefined
    
    /**
      * The type of the request (if available)
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /**
      * The url which is sent to the back end
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object Model$RequestSentEventParameters {
    
    inline def apply(): Model$RequestSentEventParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Model$RequestSentEventParameters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Model$RequestSentEventParameters] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoObject(value: js.Object): Self = StObject.set(x, "infoObject", value.asInstanceOf[js.Any])
      
      inline def setInfoObjectUndefined: Self = StObject.set(x, "infoObject", js.undefined)
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  type ModelParseErrorEvent = typings.openui5.sapUiBaseEventMod.default[Model$ParseErrorEventParameters]
  
  type ModelParseErrorEventParameters = Model$ParseErrorEventParameters
  
  type ModelPropertyChangeEvent = typings.openui5.sapUiBaseEventMod.default[Model$PropertyChangeEventParameters]
  
  type ModelPropertyChangeEventParameters = Model$PropertyChangeEventParameters
  
  type ModelRequestCompletedEvent = typings.openui5.sapUiBaseEventMod.default[Model$RequestCompletedEventParameters]
  
  type ModelRequestCompletedEventParameters = Model$RequestCompletedEventParameters
  
  type ModelRequestFailedEvent = typings.openui5.sapUiBaseEventMod.default[Model$RequestFailedEventParameters]
  
  type ModelRequestFailedEventParameters = Model$RequestFailedEventParameters
  
  type ModelRequestSentEvent = typings.openui5.sapUiBaseEventMod.default[Model$RequestSentEventParameters]
  
  type ModelRequestSentEventParameters = Model$RequestSentEventParameters
}
