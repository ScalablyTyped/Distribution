package typings.openui5

import typings.openui5.openui5Strings._empty
import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.ListMode
import typings.openui5.sapMListItemBaseMod.ListItemBaseSettings
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMActionListItemMod {
  
  @JSImport("sap/m/ActionListItem", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ActionListItem.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link fiori:/action-list-item/ Action List Item}
    */
  open class default () extends ActionListItem {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ActionListItemSettings) = this()
    def this(/**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: ActionListItemSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ActionListItemSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ActionListItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ActionListItem with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.ListItemBase.extend}.
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
    oClassInfo: ClassInfo[T, ActionListItem]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ActionListItem],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ActionListItem.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ActionListItem
    extends typings.openui5.sapMListItemBaseMod.default {
    
    /**
      * Determines item specific mode.
      *
      * ActionListItems are not selectable because they are command controls (like Button or Link), so triggering
      * the associated command, rather than selection is appropriate to happen upon user action on these items.
      *
      * By overwriting `getMode` (inherited from `ListItemBase`), we exclude the item from processing steps that
      * are specific for selectable list-items.
      *
      * @returns Mode of the list item.
      */
    def getMode(): ListMode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListMode * / any */ String) | _empty = js.native
    
    /**
      * Gets current value of property {@link #getText text}.
      *
      * Defines the text that appears in the control.
      *
      * @returns Value of property `text`
      */
    def getText(): String = js.native
    
    /**
      * Sets a new value for property {@link #getText text}.
      *
      * Defines the text that appears in the control.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setText(): this.type = js.native
    def setText(/**
      * New value for property `text`
      */
    sText: String): this.type = js.native
  }
  
  trait ActionListItemSettings
    extends StObject
       with ListItemBaseSettings {
    
    /**
      * Defines the text that appears in the control.
      */
    var text: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object ActionListItemSettings {
    
    inline def apply(): ActionListItemSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionListItemSettings]
    }
    
    extension [Self <: ActionListItemSettings](x: Self) {
      
      inline def setText(value: String | PropertyBindingInfo): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
