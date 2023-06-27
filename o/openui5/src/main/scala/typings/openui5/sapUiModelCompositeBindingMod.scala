package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiModelCompositeBindingMod {
  
  @JSImport("sap/ui/model/CompositeBinding", JSImport.Default)
  @js.native
  /**
    * Constructor for CompositeBinding.
    * See:
    * 	{@link https://ui5.sap.com/#/topic/a2fe8e763014477e87990ff50657a0d0}
    */
  open class default () extends CompositeBinding
  /* static members */
  object default {
    
    @JSImport("sap/ui/model/CompositeBinding", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.model.CompositeBinding with name `sClassName` and enriches it
      * with the information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.model.PropertyBinding.extend}.
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
    oClassInfo: ClassInfo[T, CompositeBinding]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, CompositeBinding],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.model.CompositeBinding.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseMetadataMod.default]
  }
  
  @js.native
  trait CompositeBinding
    extends typings.openui5.sapUiModelPropertyBindingMod.default {
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Detaches event handler `fnFunction` from the `AggregatedDataStateChange` event of this `sap.ui.model.CompositeBinding`.
      */
    def detachAggregatedDataStateChange(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def detachAggregatedDataStateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Object on which to call the given function
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Detaches event handler `fnFunction` from the `change` event of this `sap.ui.model.CompositeBinding`.
      */
    def detachChange(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Object on which to call the given function
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Detaches event handler `fnFunction` from the `DataStateChange` event of this `sap.ui.model.CompositeBinding`.
      */
    def detachDataStateChange(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): Unit = js.native
    def detachDataStateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Object on which to call the given function
      */
    oListener: js.Object
    ): Unit = js.native
    
    /**
      * Returns the property bindings contained in this composite binding.
      *
      * @returns The property bindings in this composite binding
      */
    def getBindings(): js.Array[Any] = js.native
    
    /**
      * Sets the external value of a composite binding. If no CompositeType is assigned to the binding, the default
      * implementation assumes a space-separated list of values. This will cause the setValue to be called for
      * each nested binding, except for undefined values in the array.
      *
      * @returns A promise in case of asynchronous type parsing or validation
      */
    def setExternalValue(/**
      * The value to set for this binding
      */
    oValue: js.Object): js.UndefOr[js.Promise[Any]] = js.native
    
    /**
      * Sets the internal value of the bound target. Parameter must be an array of values matching the internal
      * (JS native) types of nested bindings.
      *
      * @returns A promise in case of asynchronous type parsing or validation
      */
    def setInternalValue(/**
      * the new values of the nested bindings
      */
    aValues: js.Array[Any]): js.UndefOr[js.Promise[Any]] = js.native
    
    /**
      * Sets the raw value of the bound target. Parameter must be an array of values matching the raw (model)
      * types of nested bindings.
      *
      * @returns A promise in case of asynchronous type parsing or validation
      */
    def setRawValue(/**
      * the new values of the nested bindings
      */
    aValues: js.Array[Any]): js.UndefOr[js.Promise[Any]] = js.native
    
    /**
      * Sets the optional type and internal type for the binding. The type and internal type are used to do the
      * parsing/formatting correctly. The internal type is the property type of the element which the value is
      * formatted to.
      */
    def setType(
      /**
      * The type for the binding
      */
    oType: typings.openui5.sapUiModelCompositeTypeMod.default,
      /**
      * The internal type of the element property which this binding is bound against.
      */
    sInternalType: String
    ): Unit = js.native
    
    /**
      * Sets the values. This will cause the setValue to be called for each nested binding, except for undefined
      * values in the array.
      */
    def setValue(/**
      * The values to set for this binding
      */
    aValues: js.Array[Any]): Unit = js.native
  }
}
