package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreElementMod.ElementSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMQuickViewGroupMod {
  
  @JSImport("sap/m/QuickViewGroup", JSImport.Default)
  @js.native
  /**
    * Constructor for a new QuickViewGroup.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends QuickViewGroup {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: QuickViewGroupSettings) = this()
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
    mSettings: QuickViewGroupSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: QuickViewGroupSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/QuickViewGroup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.QuickViewGroup with name `sClassName` and enriches it with the
      * information contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, QuickViewGroup]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, QuickViewGroup],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.QuickViewGroup.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait QuickViewGroup
    extends typings.openui5.sapUiCoreElementMod.default {
    
    /**
      * Adds some element to the aggregation {@link #getElements elements}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addElement(
      /**
      * The element to add; if empty, nothing is inserted
      */
    oElement: typings.openui5.sapMQuickViewGroupElementMod.default
    ): this.type = js.native
    
    /**
      * Binds aggregation {@link #getElements elements} to model data.
      *
      * See {@link sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
      * of the possible properties of `oBindingInfo`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def bindElements(/**
      * The binding information
      */
    oBindingInfo: AggregationBindingInfo): this.type = js.native
    
    /**
      * Destroys all the elements in the aggregation {@link #getElements elements}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyElements(): this.type = js.native
    
    /**
      * Gets content of aggregation {@link #getElements elements}.
      *
      * A combination of one label and another control (Link or Text) associated to this label.
      */
    def getElements(): js.Array[typings.openui5.sapMQuickViewGroupElementMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getHeading heading}.
      *
      * The title of the group
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `heading`
      */
    def getHeading(): String = js.native
    
    /**
      * Gets current value of property {@link #getVisible visible}.
      *
      * Determines whether the group is visible on the screen.
      *
      * Default value is `true`.
      *
      * @returns Value of property `visible`
      */
    def getVisible(): Boolean = js.native
    
    /**
      * Checks for the provided `sap.m.QuickViewGroupElement` in the aggregation {@link #getElements elements}.
      * and returns its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfElement(
      /**
      * The element whose index is looked for
      */
    oElement: typings.openui5.sapMQuickViewGroupElementMod.default
    ): int = js.native
    
    /**
      * Inserts a element into the aggregation {@link #getElements elements}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertElement(
      /**
      * The element to insert; if empty, nothing is inserted
      */
    oElement: typings.openui5.sapMQuickViewGroupElementMod.default,
      /**
      * The `0`-based index the element should be inserted at; for a negative value of `iIndex`, the element
      * is inserted at position 0; for a value greater than the current size of the aggregation, the element
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getElements elements}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllElements(): js.Array[typings.openui5.sapMQuickViewGroupElementMod.default] = js.native
    
    def removeElement(/**
      * The element to remove or its index or id
      */
    vElement: String): typings.openui5.sapMQuickViewGroupElementMod.default | Null = js.native
    /**
      * Removes a element from the aggregation {@link #getElements elements}.
      *
      * @returns The removed element or `null`
      */
    def removeElement(/**
      * The element to remove or its index or id
      */
    vElement: int): typings.openui5.sapMQuickViewGroupElementMod.default | Null = js.native
    def removeElement(
      /**
      * The element to remove or its index or id
      */
    vElement: typings.openui5.sapMQuickViewGroupElementMod.default
    ): typings.openui5.sapMQuickViewGroupElementMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getHeading heading}.
      *
      * The title of the group
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeading(): this.type = js.native
    def setHeading(/**
      * New value for property `heading`
      */
    sHeading: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getVisible visible}.
      *
      * Determines whether the group is visible on the screen.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setVisible(): this.type = js.native
    def setVisible(/**
      * New value for property `visible`
      */
    bVisible: Boolean): this.type = js.native
    
    /**
      * Unbinds aggregation {@link #getElements elements} from model data.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def unbindElements(): this.type = js.native
  }
  
  trait QuickViewGroupSettings
    extends StObject
       with ElementSettings {
    
    /**
      * A combination of one label and another control (Link or Text) associated to this label.
      */
    var elements: js.UndefOr[
        js.Array[typings.openui5.sapMQuickViewGroupElementMod.default] | typings.openui5.sapMQuickViewGroupElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * The title of the group
      */
    var heading: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Determines whether the group is visible on the screen.
      */
    var visible: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object QuickViewGroupSettings {
    
    inline def apply(): QuickViewGroupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuickViewGroupSettings]
    }
    
    extension [Self <: QuickViewGroupSettings](x: Self) {
      
      inline def setElements(
        value: js.Array[typings.openui5.sapMQuickViewGroupElementMod.default] | typings.openui5.sapMQuickViewGroupElementMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setElementsVarargs(value: typings.openui5.sapMQuickViewGroupElementMod.default*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setHeading(value: String | PropertyBindingInfo): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
      
      inline def setVisible(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
