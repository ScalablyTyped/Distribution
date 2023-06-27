package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreDndDragDropBaseMod {
  
  @JSImport("sap/ui/core/dnd/DragDropBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new DragDropBase.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    * See:
    * 	{@link https://ui5.sap.com/#/topic/3ddb6cde6a8d416598ac8ced3f5d82d5 Drag and Drop}
    */
  open class default () extends DragDropBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DragDropBaseSettings) = this()
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
    mSettings: DragDropBaseSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DragDropBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/dnd/DragDropBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.core.dnd.DragDropBase with name `sClassName` and enriches it with
      * the information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, DragDropBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, DragDropBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.core.dnd.DragDropBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait DragDropBase
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * @since 1.56
      *
      * Gets current value of property {@link #getEnabled enabled}.
      *
      * Indicates whether this configuration is active or not.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enabled`
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getGroupName groupName}.
      *
      * Defines the name of the group to which this object belongs. If `groupName` is specified, then this object
      * will only interacts with other drag-and-drop objects within the same group.
      *
      * @returns Value of property `groupName`
      */
    def getGroupName(): String = js.native
    
    /**
      * @since 1.56
      *
      * Sets a new value for property {@link #getEnabled enabled}.
      *
      * Indicates whether this configuration is active or not.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnabled(): this.type = js.native
    def setEnabled(/**
      * New value for property `enabled`
      */
    bEnabled: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getGroupName groupName}.
      *
      * Defines the name of the group to which this object belongs. If `groupName` is specified, then this object
      * will only interacts with other drag-and-drop objects within the same group.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setGroupName(): this.type = js.native
    def setGroupName(/**
      * New value for property `groupName`
      */
    sGroupName: String): this.type = js.native
  }
  
  trait DragDropBaseSettings
    extends StObject
       with ElementSettings {
    
    /**
      * @since 1.56
      *
      * Indicates whether this configuration is active or not.
      */
    var enabled: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the name of the group to which this object belongs. If `groupName` is specified, then this object
      * will only interacts with other drag-and-drop objects within the same group.
      */
    var groupName: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object DragDropBaseSettings {
    
    inline def apply(): DragDropBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragDropBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragDropBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setGroupName(value: String | PropertyBindingInfo): Self = StObject.set(x, "groupName", value.asInstanceOf[js.Any])
      
      inline def setGroupNameUndefined: Self = StObject.set(x, "groupName", js.undefined)
    }
  }
}
