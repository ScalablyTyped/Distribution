package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFCardsBaseHeaderMod {
  
  @JSImport("sap/f/cards/BaseHeader", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `BaseHeader`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends BaseHeader {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BaseHeaderSettings) = this()
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
    mSettings: BaseHeaderSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BaseHeaderSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/cards/BaseHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.cards.BaseHeader with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, BaseHeader]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BaseHeader],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.cards.BaseHeader.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait BaseHeader
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * @SINCE 1.86
      * @EXPERIMENTAL (since 1.86)
      *
      * Destroys the toolbar in the aggregation {@link #getToolbar toolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyToolbar(): this.type = js.native
    
    /**
      * @EXPERIMENTAL (since 1.89)
      *
      * Gets current value of property {@link #getDataTimestamp dataTimestamp}.
      *
      * Defines the timestamp of the oldest data in the card. Use this to show to the end user how fresh the
      * information in the card is.
      *
      * Must be specified in ISO 8601 format.
      *
      * Will be shown as a relative time like "5 minutes ago".
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `dataTimestamp`
      */
    def getDataTimestamp(): String = js.native
    
    /**
      * @SINCE 1.86
      * @EXPERIMENTAL (since 1.86)
      *
      * Gets content of aggregation {@link #getToolbar toolbar}.
      *
      * Defines the toolbar.
      */
    def getToolbar(): typings.openui5.sapUiCoreControlMod.default = js.native
    
    /**
      * @SINCE 1.86
      * @EXPERIMENTAL (since 1.86)
      *
      * Sets the aggregated {@link #getToolbar toolbar}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setToolbar(/**
      * The toolbar to set
      */
    oToolbar: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
  }
  
  trait BaseHeaderSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @EXPERIMENTAL (since 1.89)
      *
      * Defines the timestamp of the oldest data in the card. Use this to show to the end user how fresh the
      * information in the card is.
      *
      * Must be specified in ISO 8601 format.
      *
      * Will be shown as a relative time like "5 minutes ago".
      */
    var dataTimestamp: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.86
      * @EXPERIMENTAL (since 1.86)
      *
      * Defines the toolbar.
      */
    var toolbar: js.UndefOr[typings.openui5.sapUiCoreControlMod.default] = js.undefined
  }
  object BaseHeaderSettings {
    
    inline def apply(): BaseHeaderSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseHeaderSettings]
    }
    
    extension [Self <: BaseHeaderSettings](x: Self) {
      
      inline def setDataTimestamp(value: String | PropertyBindingInfo): Self = StObject.set(x, "dataTimestamp", value.asInstanceOf[js.Any])
      
      inline def setDataTimestampUndefined: Self = StObject.set(x, "dataTimestamp", js.undefined)
      
      inline def setToolbar(value: typings.openui5.sapUiCoreControlMod.default): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    }
  }
}
