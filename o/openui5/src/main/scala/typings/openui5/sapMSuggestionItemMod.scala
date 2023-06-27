package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreItemMod.ItemSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMSuggestionItemMod {
  
  @JSImport("sap/m/SuggestionItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new SuggestionItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends SuggestionItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: SuggestionItemSettings) = this()
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
    mSettings: SuggestionItemSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: SuggestionItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/SuggestionItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.SuggestionItem with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.core.Item.extend}.
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
    oClassInfo: ClassInfo[T, SuggestionItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, SuggestionItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.SuggestionItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait SuggestionItem
    extends typings.openui5.sapUiCoreItemMod.default {
    
    /**
      * Gets current value of property {@link #getDescription description}.
      *
      * Additional text of type string, optionally to be displayed along with this item.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `description`
      */
    def getDescription(): String = js.native
    
    /**
      * Gets current value of property {@link #getIcon icon}.
      *
      * The icon belonging to this list item instance. This can be a URI to an image or an icon font URI.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `icon`
      */
    def getIcon(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Return suggestion text. By default, it is the value of the `text` property.
      *
      * Subclasses may override this function.
      *
      * @returns suggestion text.
      */
    def getSuggestionText(): String = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Produces the HTML of the suggestion item and writes it to render-output-buffer.
      *
      * Subclasses may override this function.
      */
    def render(
      /**
      * The `RenderManager`
      */
    oRM: typings.openui5.sapUiCoreRenderManagerMod.default,
      /**
      * The item which should be rendered
      */
    oItem: SuggestionItem,
      /**
      * The search text that should be emphasized
      */
    sSearch: String,
      /**
      * The item is selected
      */
    bSelected: Boolean
    ): Unit = js.native
    
    /**
      * Sets a new value for property {@link #getDescription description}.
      *
      * Additional text of type string, optionally to be displayed along with this item.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDescription(): this.type = js.native
    def setDescription(/**
      * New value for property `description`
      */
    sDescription: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getIcon icon}.
      *
      * The icon belonging to this list item instance. This can be a URI to an image or an icon font URI.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setIcon(): this.type = js.native
    def setIcon(/**
      * New value for property `icon`
      */
    sIcon: String): this.type = js.native
  }
  
  trait SuggestionItemSettings
    extends StObject
       with ItemSettings {
    
    /**
      * Additional text of type string, optionally to be displayed along with this item.
      */
    var description: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * The icon belonging to this list item instance. This can be a URI to an image or an icon font URI.
      */
    var icon: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object SuggestionItemSettings {
    
    inline def apply(): SuggestionItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuggestionItemSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuggestionItemSettings] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String | PropertyBindingInfo): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setIcon(value: String | PropertyBindingInfo): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    }
  }
}
