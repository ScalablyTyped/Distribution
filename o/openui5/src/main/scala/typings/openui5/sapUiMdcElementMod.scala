package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiMdcElementMod {
  
  @JSImport("sap/ui/mdc/Element", JSImport.Default)
  @js.native
  /**
    * Creates and initializes a new MDC element with the given `sId` and settings.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Element1 {
    def this(/**
      * Object with initial settings for the new control
      */
    mSettings: ElementSettings) = this()
    def this(/**
      * Optional ID for the new element; generated automatically if no non-empty ID is given Note: this can be
      * omitted, no matter whether `mSettings` will be given or not!
      */
    sId: String) = this()
    def this(
      /**
      * Optional ID for the new element; generated automatically if no non-empty ID is given Note: this can be
      * omitted, no matter whether `mSettings` will be given or not!
      */
    sId: String,
      /**
      * Object with initial settings for the new control
      */
    mSettings: ElementSettings
    ) = this()
    def this(
      /**
      * Optional ID for the new element; generated automatically if no non-empty ID is given Note: this can be
      * omitted, no matter whether `mSettings` will be given or not!
      */
    sId: Unit,
      /**
      * Object with initial settings for the new control
      */
    mSettings: ElementSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/mdc/Element", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Provides access to the delegate initialization `Promise`. **Note:** `initControlDelegate` must be called
      * to start the delegate initialization
      *
      * @returns Returns a `Promise` reflecting the delegate initialization
      */
    inline def awaitControlDelegate(): js.Promise[/* was: sap.ui.mdc.BaseDelegate */ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("awaitControlDelegate")().asInstanceOf[js.Promise[/* was: sap.ui.mdc.BaseDelegate */ Any]]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Provides access to the property helper initialization `Promise`.
      *
      * @returns Returns a `Promise` that resolves with the property helper
      */
    inline def awaitPropertyHelper(): js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("awaitPropertyHelper")().asInstanceOf[js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any]]
    
    /**
      * Creates a new subclass of class sap.ui.mdc.Element with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Element.extend}.
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
    oClassInfo: ClassInfo[T, Element1]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Element1],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Finalize the propertyHelper using the control's delegate.
      *
      * @returns Returns a `Promise` that resolves with the property helper
      */
    inline def finalizePropertyHelper(): js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("finalizePropertyHelper")().asInstanceOf[js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any]]
    inline def finalizePropertyHelper(/**
      * optional set of initial properties
      */
    aProperties: js.Array[js.Object]): js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("finalizePropertyHelper")(aProperties.asInstanceOf[js.Any]).asInstanceOf[js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any]]
    inline def finalizePropertyHelper(
      /**
      * optional set of initial properties
      */
    aProperties: js.Array[js.Object],
      /**
      * flag for mark the propertyHelper as final
      */
    bFinal: js.Array[js.Object]
    ): js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("finalizePropertyHelper")(aProperties.asInstanceOf[js.Any], bFinal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any]]
    inline def finalizePropertyHelper(
      /**
      * optional set of initial properties
      */
    aProperties: Unit,
      /**
      * flag for mark the propertyHelper as final
      */
    bFinal: js.Array[js.Object]
    ): js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("finalizePropertyHelper")(aProperties.asInstanceOf[js.Any], bFinal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any]]
    
    /**
      * Returns the delegate instance, if available.
      *
      * @returns `typeUtil` made available by a delegate module
      */
    inline def getControlDelegate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getControlDelegate")().asInstanceOf[Any]
    
    /**
      * Returns a metadata object for class sap.ui.mdc.Element.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    
    /**
      * Returns the payload object set for the delegate property.
      *
      * @returns Payload set for delegate property
      */
    inline def getPayload(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getPayload")().asInstanceOf[js.Object]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the property helper instance, if available.
      *
      * @returns The property helper
      */
    inline def getPropertyHelper(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getPropertyHelper")().asInstanceOf[Any]
    
    /**
      * Returns the `TypeMap` made available by a delegate module.
      *
      * @returns `TypeMap` object
      */
    inline def getTypeMap(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeMap")().asInstanceOf[Any]
    
    /**
      * @deprecated - (since 1.115.0) - please see {@link #getTypeMap}
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Returns the `typeUtil` made available by a delegate module.
      *
      * @returns `TypeUtil` object
      */
    inline def getTypeUtil(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTypeUtil")().asInstanceOf[Any]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Loads and initializes the delegate module related to the enhanced control.
      *
      * @returns Returns a `Promise` that resolves the delegate module, if available
      */
    inline def initControlDelegate(): js.Promise[/* was: sap.ui.mdc.BaseDelegate */ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("initControlDelegate")().asInstanceOf[js.Promise[/* was: sap.ui.mdc.BaseDelegate */ Any]]
    inline def initControlDelegate(/**
      * Preloaded delegate module
      */
    oPreloadedModule: /* was: sap.ui.mdc.BaseDelegate */ Any): js.Promise[/* was: sap.ui.mdc.BaseDelegate */ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("initControlDelegate")(oPreloadedModule.asInstanceOf[js.Any]).asInstanceOf[js.Promise[/* was: sap.ui.mdc.BaseDelegate */ Any]]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Loads and initializes the property helper related to the enhanced control.
      *
      * @returns Returns a `Promise` that resolves with the property helper
      */
    inline def initPropertyHelper(): js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("initPropertyHelper")().asInstanceOf[js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any]]
    inline def initPropertyHelper(
      /**
      * Custom property helper class
      */
    PropertyHelperClass: /* was: sap.ui.mdc.util.PropertyHelper */ Any
    ): js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("initPropertyHelper")(PropertyHelperClass.asInstanceOf[js.Any]).asInstanceOf[js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any]]
    inline def initPropertyHelper(
      /**
      * Custom property helper class
      */
    PropertyHelperClass: /* was: sap.ui.mdc.util.PropertyHelper */ Any,
      /**
      * optional set of initial properties
      */
    aProperties: js.Array[js.Object]
    ): js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("initPropertyHelper")(PropertyHelperClass.asInstanceOf[js.Any], aProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any]]
    inline def initPropertyHelper(
      /**
      * Custom property helper class
      */
    PropertyHelperClass: /* was: sap.ui.mdc.util.PropertyHelper */ Any,
      /**
      * optional set of initial properties
      */
    aProperties: js.Array[js.Object],
      /**
      * flag for mark the propertyHelper as final
      */
    bFinal: js.Array[js.Object]
    ): js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("initPropertyHelper")(PropertyHelperClass.asInstanceOf[js.Any], aProperties.asInstanceOf[js.Any], bFinal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any]]
    inline def initPropertyHelper(
      /**
      * Custom property helper class
      */
    PropertyHelperClass: /* was: sap.ui.mdc.util.PropertyHelper */ Any,
      /**
      * optional set of initial properties
      */
    aProperties: Unit,
      /**
      * flag for mark the propertyHelper as final
      */
    bFinal: js.Array[js.Object]
    ): js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("initPropertyHelper")(PropertyHelperClass.asInstanceOf[js.Any], aProperties.asInstanceOf[js.Any], bFinal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any]]
    inline def initPropertyHelper(
      /**
      * Custom property helper class
      */
    PropertyHelperClass: Unit,
      /**
      * optional set of initial properties
      */
    aProperties: js.Array[js.Object]
    ): js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("initPropertyHelper")(PropertyHelperClass.asInstanceOf[js.Any], aProperties.asInstanceOf[js.Any])).asInstanceOf[js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any]]
    inline def initPropertyHelper(
      /**
      * Custom property helper class
      */
    PropertyHelperClass: Unit,
      /**
      * optional set of initial properties
      */
    aProperties: js.Array[js.Object],
      /**
      * flag for mark the propertyHelper as final
      */
    bFinal: js.Array[js.Object]
    ): js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("initPropertyHelper")(PropertyHelperClass.asInstanceOf[js.Any], aProperties.asInstanceOf[js.Any], bFinal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any]]
    inline def initPropertyHelper(
      /**
      * Custom property helper class
      */
    PropertyHelperClass: Unit,
      /**
      * optional set of initial properties
      */
    aProperties: Unit,
      /**
      * flag for mark the propertyHelper as final
      */
    bFinal: js.Array[js.Object]
    ): js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("initPropertyHelper")(PropertyHelperClass.asInstanceOf[js.Any], aProperties.asInstanceOf[js.Any], bFinal.asInstanceOf[js.Any])).asInstanceOf[js.Promise[/* was: sap.ui.mdc.util.PropertyHelper */ Any]]
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Indicates if the control's propertyHelper already contains all available properties
      *
      * @returns Returns a `boolean` indicating the propertyHelper's final state
      */
    inline def isPropertyHelperFinal(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPropertyHelperFinal")().asInstanceOf[Boolean]
  }
  
  @js.native
  trait Element1
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @experimental
      *
      * Gets current value of property {@link #getDelegate delegate}.
      *
      * Path to the `Delegate` module that provides the required APIs to execute model-specific logic.
      *  **Note:** Ensure that the related file can be requested (any required library has to be loaded before
      * that).
      *  Do not bind or modify the module. This property can only be configured during control initialization.
      *
      * @returns Value of property `delegate`
      */
    def getDelegate(): js.Object = js.native
    
    /**
      * @experimental
      *
      * Sets a new value for property {@link #getDelegate delegate}.
      *
      * Path to the `Delegate` module that provides the required APIs to execute model-specific logic.
      *  **Note:** Ensure that the related file can be requested (any required library has to be loaded before
      * that).
      *  Do not bind or modify the module. This property can only be configured during control initialization.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDelegate(/**
      * New value for property `delegate`
      */
    oDelegate: js.Object): this.type = js.native
  }
  
  trait ElementSettings
    extends StObject
       with typings.openui5.sapUiCoreElementMod.ElementSettings {
    
    /**
      * @experimental
      *
      * Path to the `Delegate` module that provides the required APIs to execute model-specific logic.
      *  **Note:** Ensure that the related file can be requested (any required library has to be loaded before
      * that).
      *  Do not bind or modify the module. This property can only be configured during control initialization.
      */
    var delegate: js.UndefOr[
        js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ElementSettings {
    
    inline def apply(): ElementSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElementSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ElementSettings] (val x: Self) extends AnyVal {
      
      inline def setDelegate(value: js.Object | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "delegate", value.asInstanceOf[js.Any])
      
      inline def setDelegateUndefined: Self = StObject.set(x, "delegate", js.undefined)
    }
  }
}
