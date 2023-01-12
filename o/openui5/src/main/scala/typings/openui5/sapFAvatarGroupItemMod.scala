package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.URI
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFAvatarGroupItemMod {
  
  @JSImport("sap/f/AvatarGroupItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `AvatarGroupItem`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends AvatarGroupItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: AvatarGroupItemSettings) = this()
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
    mSettings: AvatarGroupItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: AvatarGroupItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/f/AvatarGroupItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.f.AvatarGroupItem with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, AvatarGroupItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, AvatarGroupItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.f.AvatarGroupItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait AvatarGroupItem
    extends typings.openui5.sapUiCoreControlMod.default {
    
    /**
      * Returns the color of the avatar.
      *
      * @returns The color of the avatar
      */
    def getAvatarColor(): String = js.native
    
    /**
      * Gets current value of property {@link #getFallbackIcon fallbackIcon}.
      *
      * Defines the fallback icon displayed in case of wrong image src and no initials set.
      *
      * **Notes:**
      * 	 - If not set, a default fallback icon is displayed.
      * 	 - Accepted values are only icons from the SAP icon font.
      *
      * @returns Value of property `fallbackIcon`
      */
    def getFallbackIcon(): String = js.native
    
    /**
      * Gets current value of property {@link #getInitials initials}.
      *
      * Defines the displayed initials.
      *
      * @returns Value of property `initials`
      */
    def getInitials(): String = js.native
    
    /**
      * Gets current value of property {@link #getSrc src}.
      *
      * Determines the path to the desired image or icon.
      *
      * @returns Value of property `src`
      */
    def getSrc(): URI = js.native
    
    /**
      * Sets a new value for property {@link #getFallbackIcon fallbackIcon}.
      *
      * Defines the fallback icon displayed in case of wrong image src and no initials set.
      *
      * **Notes:**
      * 	 - If not set, a default fallback icon is displayed.
      * 	 - Accepted values are only icons from the SAP icon font.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setFallbackIcon(): this.type = js.native
    def setFallbackIcon(/**
      * New value for property `fallbackIcon`
      */
    sFallbackIcon: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getInitials initials}.
      *
      * Defines the displayed initials.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitials(): this.type = js.native
    def setInitials(/**
      * New value for property `initials`
      */
    sInitials: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSrc src}.
      *
      * Determines the path to the desired image or icon.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSrc(): this.type = js.native
    def setSrc(/**
      * New value for property `src`
      */
    sSrc: URI): this.type = js.native
  }
  
  trait AvatarGroupItemSettings
    extends StObject
       with ControlSettings {
    
    /**
      * Defines the fallback icon displayed in case of wrong image src and no initials set.
      *
      * **Notes:**
      * 	 - If not set, a default fallback icon is displayed.
      * 	 - Accepted values are only icons from the SAP icon font.
      */
    var fallbackIcon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Defines the displayed initials.
      */
    var initials: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines the path to the desired image or icon.
      */
    var src: js.UndefOr[URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
  }
  object AvatarGroupItemSettings {
    
    inline def apply(): AvatarGroupItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarGroupItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarGroupItemSettings] (val x: Self) extends AnyVal {
      
      inline def setFallbackIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "fallbackIcon", value.asInstanceOf[js.Any])
      
      inline def setFallbackIconUndefined: Self = StObject.set(x, "fallbackIcon", js.undefined)
      
      inline def setInitials(value: String | PropertyBindingInfo): Self = StObject.set(x, "initials", value.asInstanceOf[js.Any])
      
      inline def setInitialsUndefined: Self = StObject.set(x, "initials", js.undefined)
      
      inline def setSrc(value: URI | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    }
  }
}
