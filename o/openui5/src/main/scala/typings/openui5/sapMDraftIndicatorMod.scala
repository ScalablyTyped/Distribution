package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.DraftIndicatorState
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMDraftIndicatorMod {
  
  @JSImport("sap/m/DraftIndicator", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DraftIndicator.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends DraftIndicator {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DraftIndicatorSettings) = this()
    def this(/**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: DraftIndicatorSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DraftIndicatorSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/DraftIndicator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.DraftIndicator with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Control.extend}.
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
    oClassInfo: ClassInfo[T, DraftIndicator]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DraftIndicator],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.DraftIndicator.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DraftIndicator
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Clears the indicator state
      */
    def clearDraftState(): Unit = js.native
    
    /**
      * Gets current value of property {@link #getMinDisplayTime minDisplayTime}.
      *
      * Minimum time in milliseconds for showing the draft indicator
      *
      * Default value is `1500`.
      *
      * @returns Value of property `minDisplayTime`
      */
    def getMinDisplayTime(): int = js.native
    
    /**
      * Gets current value of property {@link #getState state}.
      *
      * State of the indicator. Could be "Saving", "Saved" and "Clear".
      *
      * Default value is `Clear`.
      *
      * @returns Value of property `state`
      */
    def getState(): DraftIndicatorState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraftIndicatorState * / any */ String) = js.native
    
    /**
      * Sets a new value for property {@link #getMinDisplayTime minDisplayTime}.
      *
      * Minimum time in milliseconds for showing the draft indicator
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `1500`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinDisplayTime(): this.type = js.native
    def setMinDisplayTime(/**
      * New value for property `minDisplayTime`
      */
    iMinDisplayTime: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getState state}.
      *
      * State of the indicator. Could be "Saving", "Saved" and "Clear".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Clear`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setState(): this.type = js.native
    def setState(
      /**
      * New value for property `state`
      */
    sState: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraftIndicatorState * / any */ String
    ): this.type = js.native
    def setState(/**
      * New value for property `state`
      */
    sState: DraftIndicatorState): this.type = js.native
    
    /**
      * Sets the indicator in "Saved" state
      */
    def showDraftSaved(): Unit = js.native
    
    /**
      * Sets the indicator in "Saving..." state
      */
    def showDraftSaving(): Unit = js.native
  }
  
  trait DraftIndicatorSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Minimum time in milliseconds for showing the draft indicator
      */
    var minDisplayTime: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * State of the indicator. Could be "Saving", "Saved" and "Clear".
      */
    var state: js.UndefOr[
        DraftIndicatorState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraftIndicatorState * / any */ String) | PropertyBindingInfo
      ] = js.undefined
  }
  object DraftIndicatorSettings {
    
    inline def apply(): DraftIndicatorSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DraftIndicatorSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DraftIndicatorSettings] (val x: Self) extends AnyVal {
      
      inline def setMinDisplayTime(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minDisplayTime", value.asInstanceOf[js.Any])
      
      inline def setMinDisplayTimeUndefined: Self = StObject.set(x, "minDisplayTime", js.undefined)
      
      inline def setState(
        value: DraftIndicatorState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DraftIndicatorState * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
