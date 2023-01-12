package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.p13n.IContent
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMP13nBasePanelMod {
  
  @JSImport("sap/m/p13n/BasePanel", JSImport.Default)
  @js.native
  /**
    * Constructor for a new `BasePanel`.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends BasePanel {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: BasePanelSettings) = this()
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
    mSettings: BasePanelSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: BasePanelSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_m_p13n_IContent: Boolean = js.native
    
    /**
      * @EXPERIMENTAL
      *
      * Returns the title, which should be displayed in the P13nPopup to describe related content.
      *
      * @returns The title for the corresponding content to be displayed in the `sap.m.p13n.Popup`.
      */
    /* CompleteClass */
    override def getTitle(): String = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/p13n/BasePanel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.p13n.BasePanel with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, BasePanel]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, BasePanel],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.p13n.BasePanel.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait BasePanel
    extends typings.openui5.sapUiCoreControlMod.default
       with IContent {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.p13n.BasePanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.p13n.BasePanel` itself.
      *
      * This event is fired if any change has been made within the `BasePanel` control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.p13n.BasePanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:change change} event of this `sap.m.p13n.BasePanel`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.p13n.BasePanel` itself.
      *
      * This event is fired if any change has been made within the `BasePanel` control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.p13n.BasePanel` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Destroys the messageStrip in the aggregation {@link #getMessageStrip messageStrip}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyMessageStrip(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:change change} event of this `sap.m.p13n.BasePanel`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Fires event {@link #event:change change} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireChange(): this.type = js.native
    def fireChange(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Gets current value of property {@link #getEnableReorder enableReorder}.
      *
      * Determines whether the reordering of personalization items is enabled.
      *
      * Default value is `true`.
      *
      * @returns Value of property `enableReorder`
      */
    def getEnableReorder(): Boolean = js.native
    
    /**
      * Getter for the `messageStrip` aggregation.
      *
      * @returns The BasePanel instance
      */
    def getMessageStrip(): BasePanel = js.native
    
    /**
      * Returns the personalization state that is currently displayed by the `BasePanel`.
      *
      * @returns An array containing the personalization state that is currently displayed by the `BasePanel`
      */
    def getP13nData(/**
      * Determines whether only the present items is included
      */
    bOnlyActive: Boolean): js.Array[Item] = js.native
    
    /**
      * The `enableReorder` property determines whether additional move buttons are shown when hovering over
      * the inner list. In addition, drag and drop will be enabled for the inner list control.
      *
      * @returns The BasePanel instance
      */
    def setEnableReorder(/**
      * Determines whether reordering is enabled
      */
    bEnableReorder: Boolean): BasePanel = js.native
    
    /**
      * Displays a `sap.m.MessageStrip` instance in the content area of the `BasePanel`.
      *
      * @returns The `BasePanel` instance
      */
    def setMessageStrip(/**
      * Instance of a sap.m.MessageStrip
      */
    oStrip: typings.openui5.sapMMessageStripMod.default): BasePanel = js.native
    
    /**
      * Sets the personalization state of the panel instance.
      *
      * @returns The BasePanel instance
      */
    def setP13nData(
      /**
      * An array containing the personalization state that is represented by the `BasePanel`.
      */
    aP13nData: js.Array[Item]
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * A short text describing the panel. **Note:** This text will only be displayed if the panel is being used
      * in a `sap.m.p13n.Popup`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
  }
  
  trait BasePanelSettings
    extends StObject
       with ControlSettings {
    
    /**
      * This event is fired if any change has been made within the `BasePanel` control.
      */
    var change: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Determines whether the reordering of personalization items is enabled.
      */
    var enableReorder: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines an optional message strip to be displayed in the content area.
      */
    var messageStrip: js.UndefOr[typings.openui5.sapMMessageStripMod.default] = js.undefined
    
    /**
      * A short text describing the panel. **Note:** This text will only be displayed if the panel is being used
      * in a `sap.m.p13n.Popup`.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
  }
  object BasePanelSettings {
    
    inline def apply(): BasePanelSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasePanelSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BasePanelSettings] (val x: Self) extends AnyVal {
      
      inline def setChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setEnableReorder(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "enableReorder", value.asInstanceOf[js.Any])
      
      inline def setEnableReorderUndefined: Self = StObject.set(x, "enableReorder", js.undefined)
      
      inline def setMessageStrip(value: typings.openui5.sapMMessageStripMod.default): Self = StObject.set(x, "messageStrip", value.asInstanceOf[js.Any])
      
      inline def setMessageStripUndefined: Self = StObject.set(x, "messageStrip", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Item extends StObject {
    
    /**
      * The label describing the personalization item
      */
    var label: String
    
    /**
      * The unique key of the item
      */
    var name: String
    
    /**
      * Defines the selection state of the personalization item
      */
    var visible: Boolean
  }
  object Item {
    
    inline def apply(label: String, name: String, visible: Boolean): Item = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
}
