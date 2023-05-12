package typings.openui5

import typings.openui5.sap.ClassInfo
import typings.openui5.sapMLibraryMod.ListType
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMListItemBaseMod {
  
  @JSImport("sap/m/ListItemBase", JSImport.Default)
  @js.native
  /**
    * Constructor for a new ListItemBase.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends ListItemBase {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: ListItemBaseSettings) = this()
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
    mSettings: ListItemBaseSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: ListItemBaseSettings
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/m/ListItemBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.m.ListItemBase with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
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
    oClassInfo: ClassInfo[T, ListItemBase]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, ListItemBase],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.m.ListItemBase.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait ListItemBase
    extends typings.openui5.sapUiCoreControlMod.default {
    
    def addAriaLabelledBy(
      /**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * @SINCE 1.28.0
      *
      * Adds some ariaLabelledBy into the association {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addAriaLabelledBy(/**
      * The ariaLabelledBy to add; if empty, nothing is inserted
      */
    vAriaLabelledBy: ID): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:detailPress detailPress} event of this `sap.m.ListItemBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListItemBase` itself.
      *
      * Fires when the user clicks on the detail button of the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDetailPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDetailPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ListItemBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:detailPress detailPress} event of this `sap.m.ListItemBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListItemBase` itself.
      *
      * Fires when the user clicks on the detail button of the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDetailPress(
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
    def attachDetailPress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListItemBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.20.0) - Instead, use `detailPress` event.
      *
      * Attaches event handler `fnFunction` to the {@link #event:detailTap detailTap} event of this `sap.m.ListItemBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListItemBase` itself.
      *
      * Fires when the user taps on the detail button of the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDetailTap(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachDetailTap(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ListItemBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.20.0) - Instead, use `detailPress` event.
      *
      * Attaches event handler `fnFunction` to the {@link #event:detailTap detailTap} event of this `sap.m.ListItemBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListItemBase` itself.
      *
      * Fires when the user taps on the detail button of the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachDetailTap(
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
    def attachDetailTap(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListItemBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.ListItemBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListItemBase` itself.
      *
      * Fires when the user clicks on the control. **Note:** This event is not fired when the parent `mode` is
      * `SingleSelectMaster` or when the `includeItemInSelection` property is set to `true`. If there is an interactive
      * element that handles its own `press` event then the list item's `press` event is not fired. Also see
      * {@link sap.m.ListBase#attachItemPress}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachPress(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ListItemBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:press press} event of this `sap.m.ListItemBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListItemBase` itself.
      *
      * Fires when the user clicks on the control. **Note:** This event is not fired when the parent `mode` is
      * `SingleSelectMaster` or when the `includeItemInSelection` property is set to `true`. If there is an interactive
      * element that handles its own `press` event then the list item's `press` event is not fired. Also see
      * {@link sap.m.ListBase#attachItemPress}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachPress(
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
    def attachPress(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListItemBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * @deprecated (since 1.20.0) - Instead, use `press` event.
      *
      * Attaches event handler `fnFunction` to the {@link #event:tap tap} event of this `sap.m.ListItemBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListItemBase` itself.
      *
      * Fires when the user taps on the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTap(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachTap(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.m.ListItemBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * @deprecated (since 1.20.0) - Instead, use `press` event.
      *
      * Attaches event handler `fnFunction` to the {@link #event:tap tap} event of this `sap.m.ListItemBase`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.m.ListItemBase` itself.
      *
      * Fires when the user taps on the control.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachTap(
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
    def attachTap(
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
      * Context object to call the event handler with. Defaults to this `sap.m.ListItemBase` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:detailPress detailPress} event of this `sap.m.ListItemBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDetailPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDetailPress(
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
      * @deprecated (since 1.20.0) - Instead, use `detailPress` event.
      *
      * Detaches event handler `fnFunction` from the {@link #event:detailTap detailTap} event of this `sap.m.ListItemBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachDetailTap(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachDetailTap(
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
      * Detaches event handler `fnFunction` from the {@link #event:press press} event of this `sap.m.ListItemBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachPress(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachPress(
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
      * @deprecated (since 1.20.0) - Instead, use `press` event.
      *
      * Detaches event handler `fnFunction` from the {@link #event:tap tap} event of this `sap.m.ListItemBase`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachTap(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachTap(
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
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:detailPress detailPress} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDetailPress(): this.type = js.native
    def fireDetailPress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @deprecated (since 1.20.0) - Instead, use `detailPress` event.
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:detailTap detailTap} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireDetailTap(): this.type = js.native
    def fireDetailTap(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:press press} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def firePress(): this.type = js.native
    def firePress(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @deprecated (since 1.20.0) - Instead, use `press` event.
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Fires event {@link #event:tap tap} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireTap(): this.type = js.native
    def fireTap(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Returns array of IDs of the elements which are the current targets of the association {@link #getAriaLabelledBy
      * ariaLabelledBy}.
      */
    def getAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns the accessibility announcement for the content.
      *
      * Hook for the subclasses.
      */
    def getContentAnnouncement(): String = js.native
    
    /**
      * Gets current value of property {@link #getCounter counter}.
      *
      * Defines the counter value of the list items.
      *
      * @returns Value of property `counter`
      */
    def getCounter(): int = js.native
    
    /**
      * @SINCE 1.44.0
      *
      * Gets current value of property {@link #getHighlight highlight}.
      *
      * Defines the highlight state of the list items.
      *
      * Valid values for the `highlight` property are values of the enumerations {@link sap.ui.core.MessageType}
      * or {@link sap.ui.core.IndicationColor}.
      *
      * Accessibility support is provided through the associated {@link sap.m.ListItemBase#setHighlightText highlightText}
      * property. If the `highlight` property is set to a value of {@link sap.ui.core.MessageType}, the `highlightText`
      * property does not need to be set because a default text is used. However, the default text can be overridden
      * by setting the `highlightText` property. In all other cases the `highlightText` property must be set.
      *
      * Default value is `"None"`.
      *
      * @returns Value of property `highlight`
      */
    def getHighlight(): String = js.native
    
    /**
      * @SINCE 1.62
      *
      * Gets current value of property {@link #getHighlightText highlightText}.
      *
      * Defines the semantics of the {@link sap.m.ListItemBase#setHighlight highlight} property for accessibility
      * purposes.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `highlightText`
      */
    def getHighlightText(): String = js.native
    
    /**
      * @SINCE 1.72
      *
      * Gets current value of property {@link #getNavigated navigated}.
      *
      * The navigated state of the list item.
      *
      * If set to `true`, a navigation indicator is displayed at the end of the list item. **Note:** This property
      * must be set for **one** list item only.
      *
      * Default value is `false`.
      *
      * @returns Value of property `navigated`
      */
    def getNavigated(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getSelected selected}.
      *
      * Defines the selected state of the list items. **Note:** Binding the `selected` property in single selection
      * modes may cause unwanted results if you have more than one selected items in your binding.
      *
      * Default value is `false`.
      *
      * @returns Value of property `selected`
      */
    def getSelected(): Boolean = js.native
    
    /**
      * @SINCE 1.26
      * @PROTECTED - DO NOT USE IN APPLICATIONS (only for related classes in the framework)
      *
      * Returns the tabbable DOM elements as a jQuery collection
      *
      * @returns jQuery object
      */
    def getTabbables(): jQuery[HTMLElement] = js.native
    
    /**
      * Gets current value of property {@link #getType type}.
      *
      * Defines the visual indication and behavior of the list items, e.g. `Active`, `Navigation`, `Detail`.
      *
      * Default value is `Inactive`.
      *
      * @returns Value of property `type`
      */
    def getType(): ListType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListType * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getUnread unread}.
      *
      * Activates the unread indicator for the list item, if set to `true`. **Note:** This flag is ignored when
      * the `showUnread` property of the parent is set to `false`.
      *
      * Default value is `false`.
      *
      * @returns Value of property `unread`
      */
    def getUnread(): Boolean = js.native
    
    /**
      * @deprecated (since 1.10.2) - API Change makes this method unnecessary. Use the {@link #getSelected} method
      * instead.
      *
      * Returns the state of the item selection as a boolean
      */
    def isSelected(): Boolean = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Removes all the controls in the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllAriaLabelledBy(): js.Array[ID] = js.native
    
    /**
      * @SINCE 1.28.0
      *
      * Removes an ariaLabelledBy from the association named {@link #getAriaLabelledBy ariaLabelledBy}.
      *
      * @returns The removed ariaLabelledBy or `null`
      */
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: int): ID | Null = js.native
    def removeAriaLabelledBy(
      /**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: typings.openui5.sapUiCoreControlMod.default
    ): ID | Null = js.native
    def removeAriaLabelledBy(/**
      * The ariaLabelledBy to be removed or its index or ID
      */
    vAriaLabelledBy: ID): ID | Null = js.native
    
    /**
      * Sets a new value for property {@link #getCounter counter}.
      *
      * Defines the counter value of the list items.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setCounter(): this.type = js.native
    def setCounter(/**
      * New value for property `counter`
      */
    iCounter: int): this.type = js.native
    
    /**
      * @SINCE 1.44.0
      *
      * Sets a new value for property {@link #getHighlight highlight}.
      *
      * Defines the highlight state of the list items.
      *
      * Valid values for the `highlight` property are values of the enumerations {@link sap.ui.core.MessageType}
      * or {@link sap.ui.core.IndicationColor}.
      *
      * Accessibility support is provided through the associated {@link sap.m.ListItemBase#setHighlightText highlightText}
      * property. If the `highlight` property is set to a value of {@link sap.ui.core.MessageType}, the `highlightText`
      * property does not need to be set because a default text is used. However, the default text can be overridden
      * by setting the `highlightText` property. In all other cases the `highlightText` property must be set.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `"None"`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHighlight(): this.type = js.native
    def setHighlight(/**
      * New value for property `highlight`
      */
    sHighlight: String): this.type = js.native
    
    /**
      * @SINCE 1.62
      *
      * Sets a new value for property {@link #getHighlightText highlightText}.
      *
      * Defines the semantics of the {@link sap.m.ListItemBase#setHighlight highlight} property for accessibility
      * purposes.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHighlightText(): this.type = js.native
    def setHighlightText(/**
      * New value for property `highlightText`
      */
    sHighlightText: String): this.type = js.native
    
    /**
      * @SINCE 1.72
      *
      * Sets a new value for property {@link #getNavigated navigated}.
      *
      * The navigated state of the list item.
      *
      * If set to `true`, a navigation indicator is displayed at the end of the list item. **Note:** This property
      * must be set for **one** list item only.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setNavigated(): this.type = js.native
    def setNavigated(/**
      * New value for property `navigated`
      */
    bNavigated: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getSelected selected}.
      *
      * Defines the selected state of the list items. **Note:** Binding the `selected` property in single selection
      * modes may cause unwanted results if you have more than one selected items in your binding.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setSelected(): this.type = js.native
    def setSelected(/**
      * New value for property `selected`
      */
    bSelected: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getType type}.
      *
      * Defines the visual indication and behavior of the list items, e.g. `Active`, `Navigation`, `Detail`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Inactive`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setType(): this.type = js.native
    def setType(
      /**
      * New value for property `type`
      */
    sType: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListType * / any */ String
    ): this.type = js.native
    def setType(/**
      * New value for property `type`
      */
    sType: ListType): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getUnread unread}.
      *
      * Activates the unread indicator for the list item, if set to `true`. **Note:** This flag is ignored when
      * the `showUnread` property of the parent is set to `false`.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setUnread(): this.type = js.native
    def setUnread(/**
      * New value for property `unread`
      */
    bUnread: Boolean): this.type = js.native
  }
  
  trait ListItemBaseSettings
    extends StObject
       with ControlSettings {
    
    /**
      * @SINCE 1.28.0
      *
      * Association to controls / ids which label this control (see WAI-ARIA attribute aria-labelledby).
      */
    var ariaLabelledBy: js.UndefOr[js.Array[typings.openui5.sapUiCoreControlMod.default | String]] = js.undefined
    
    /**
      * Defines the counter value of the list items.
      */
    var counter: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Fires when the user clicks on the detail button of the control.
      */
    var detailPress: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @deprecated (since 1.20.0) - Instead, use `detailPress` event.
      *
      * Fires when the user taps on the detail button of the control.
      */
    var detailTap: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * @SINCE 1.44.0
      *
      * Defines the highlight state of the list items.
      *
      * Valid values for the `highlight` property are values of the enumerations {@link sap.ui.core.MessageType}
      * or {@link sap.ui.core.IndicationColor}.
      *
      * Accessibility support is provided through the associated {@link sap.m.ListItemBase#setHighlightText highlightText}
      * property. If the `highlight` property is set to a value of {@link sap.ui.core.MessageType}, the `highlightText`
      * property does not need to be set because a default text is used. However, the default text can be overridden
      * by setting the `highlightText` property. In all other cases the `highlightText` property must be set.
      */
    var highlight: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.62
      *
      * Defines the semantics of the {@link sap.m.ListItemBase#setHighlight highlight} property for accessibility
      * purposes.
      */
    var highlightText: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * @SINCE 1.72
      *
      * The navigated state of the list item.
      *
      * If set to `true`, a navigation indicator is displayed at the end of the list item. **Note:** This property
      * must be set for **one** list item only.
      */
    var navigated: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Fires when the user clicks on the control. **Note:** This event is not fired when the parent `mode` is
      * `SingleSelectMaster` or when the `includeItemInSelection` property is set to `true`. If there is an interactive
      * element that handles its own `press` event then the list item's `press` event is not fired. Also see
      * {@link sap.m.ListBase#attachItemPress}.
      */
    var press: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the selected state of the list items. **Note:** Binding the `selected` property in single selection
      * modes may cause unwanted results if you have more than one selected items in your binding.
      */
    var selected: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @deprecated (since 1.20.0) - Instead, use `press` event.
      *
      * Fires when the user taps on the control.
      */
    var tap: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Defines the visual indication and behavior of the list items, e.g. `Active`, `Navigation`, `Detail`.
      */
    var `type`: js.UndefOr[
        ListType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListType * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Activates the unread indicator for the list item, if set to `true`. **Note:** This flag is ignored when
      * the `showUnread` property of the parent is set to `false`.
      */
    var unread: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object ListItemBaseSettings {
    
    inline def apply(): ListItemBaseSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListItemBaseSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ListItemBaseSettings] (val x: Self) extends AnyVal {
      
      inline def setAriaLabelledBy(value: js.Array[typings.openui5.sapUiCoreControlMod.default | String]): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      inline def setAriaLabelledByVarargs(value: (typings.openui5.sapUiCoreControlMod.default | String)*): Self = StObject.set(x, "ariaLabelledBy", js.Array(value*))
      
      inline def setCounter(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
      
      inline def setDetailPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "detailPress", js.Any.fromFunction1(value))
      
      inline def setDetailPressUndefined: Self = StObject.set(x, "detailPress", js.undefined)
      
      inline def setDetailTap(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "detailTap", js.Any.fromFunction1(value))
      
      inline def setDetailTapUndefined: Self = StObject.set(x, "detailTap", js.undefined)
      
      inline def setHighlight(value: String | PropertyBindingInfo): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightText(value: String | PropertyBindingInfo): Self = StObject.set(x, "highlightText", value.asInstanceOf[js.Any])
      
      inline def setHighlightTextUndefined: Self = StObject.set(x, "highlightText", js.undefined)
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setNavigated(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "navigated", value.asInstanceOf[js.Any])
      
      inline def setNavigatedUndefined: Self = StObject.set(x, "navigated", js.undefined)
      
      inline def setPress(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "press", js.Any.fromFunction1(value))
      
      inline def setPressUndefined: Self = StObject.set(x, "press", js.undefined)
      
      inline def setSelected(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTap(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "tap", js.Any.fromFunction1(value))
      
      inline def setTapUndefined: Self = StObject.set(x, "tap", js.undefined)
      
      inline def setType(
        value: ListType | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ListType * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUnread(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "unread", value.asInstanceOf[js.Any])
      
      inline def setUnreadUndefined: Self = StObject.set(x, "unread", js.undefined)
    }
  }
}
