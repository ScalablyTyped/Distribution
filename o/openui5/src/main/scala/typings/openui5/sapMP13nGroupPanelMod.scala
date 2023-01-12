package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.std.Object
import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nGroupPanelMod {
  
  @JSImport("sap/m/p13n/GroupPanel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `GroupPanel`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default ()
    extends StObject
       with GroupPanel {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: GroupPanelSettings) = this()
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
    mSettings: GroupPanelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: GroupPanelSettings
    ) = this()
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* standard es5 */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/p13n/GroupPanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.p13n.GroupPanel with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.m.p13n.QueryPanel.extend}.
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
    oClassInfo: ClassInfo[T, GroupPanel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, GroupPanel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.p13n.GroupPanel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
    
    /**
      * Sets the personalization state of the panel instance.
      *
      * @returns The GroupPanel instance
      */
    inline def setP13nData(/**
      * An array containing the personalization state
      */
    aP13nData: GroupItem): GroupPanel = ^.asInstanceOf[js.Dynamic].applyDynamic("setP13nData")(aP13nData.asInstanceOf[js.Any]).asInstanceOf[GroupPanel]
  }
  
  trait GroupItem extends StObject {
    
    /**
      * Defines the grouping state of the personalization item
      */
    var grouped: Boolean
    
    /**
      * The label describing the personalization item
      */
    var label: String
    
    /**
      * The unique key of the item
      */
    var name: String
  }
  object GroupItem {
    
    inline def apply(grouped: Boolean, label: String, name: String): GroupItem = {
      val __obj = js.Dynamic.literal(grouped = grouped.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupItem] (val x: Self) extends AnyVal {
      
      inline def setGrouped(value: Boolean): Self = StObject.set(x, "grouped", value.asInstanceOf[js.Any])
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GroupPanel
    extends StObject
       with Object {
    
    /**
      * Gets current value of property {@link #getEnableShowField enableShowField}.
      *
      * Toggles an additional checkbox in the group panel to define whether items are made visible.
      *
      * Default value is `false`.
      *
      * @returns Value of property `enableShowField`
      */
    def getEnableShowField(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * A short text describing the panel. **Note:** This text will only be displayed if the panel is being used
      * in a `sap.m.p13n.Popup`.
      *
      * Default value is `...see text or source`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Sets a new value for property {@link #getEnableShowField enableShowField}.
      *
      * Toggles an additional checkbox in the group panel to define whether items are made visible.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setEnableShowField(): this.type = js.native
    def setEnableShowField(/**
      * New value for property `enableShowField`
      */
    bEnableShowField: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * A short text describing the panel. **Note:** This text will only be displayed if the panel is being used
      * in a `sap.m.p13n.Popup`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `...see text or source`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait GroupPanelSettings
    extends StObject
       with Object {
    
    /**
      * Toggles an additional checkbox in the group panel to define whether items are made visible.
      */
    var enableShowField: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * A short text describing the panel. **Note:** This text will only be displayed if the panel is being used
      * in a `sap.m.p13n.Popup`.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object GroupPanelSettings {
    
    inline def apply(
      constructor: js.Function,
      hasOwnProperty: PropertyKey => Boolean,
      propertyIsEnumerable: PropertyKey => Boolean
    ): GroupPanelSettings = {
      val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
      __obj.asInstanceOf[GroupPanelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupPanelSettings] (val x: Self) extends AnyVal {
      
      inline def setEnableShowField(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableShowField", value.asInstanceOf[js.Any])
      
      inline def setEnableShowFieldUndefined: Self = StObject.set(x, "enableShowField", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
