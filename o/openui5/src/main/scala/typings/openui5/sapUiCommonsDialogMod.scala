package typings.openui5

import typings.openui5.anon.Height
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.AggregationBindingInfo
import typings.openui5.sapUiBaseManagedObjectMod.PropertyBindingInfo
import typings.openui5.sapUiCommonsLibraryMod.enums.BorderDesign
import typings.openui5.sapUiCoreControlMod.ControlSettings
import typings.openui5.sapUiCoreLibraryMod.AccessibleRole
import typings.openui5.sapUiCoreLibraryMod.CSSSize
import typings.openui5.sapUiCoreLibraryMod.ID
import typings.openui5.sapUiCoreLibraryMod.OpenState
import typings.openui5.sapUiCoreLibraryMod.PopupInterface
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsDialogMod {
  
  @JSImport("sap/ui/commons/Dialog", JSImport.Default)
  @js.native
  /**
    * Constructor for a new Dialog.
    *
    * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
    * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
    * of the syntax of the settings object.
    */
  open class default () extends Dialog {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: DialogSettings) = this()
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
    mSettings: DialogSettings
    ) = this()
    def this(
      /**
      * ID for the new control, generated automatically if no ID is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: DialogSettings
    ) = this()
    
    /* CompleteClass */
    var __implements__sap_ui_core_PopupInterface: Boolean = js.native
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/commons/Dialog", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new subclass of class sap.ui.commons.Dialog with name `sClassName` and enriches it with the
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
    oClassInfo: ClassInfo[T, Dialog]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Dialog],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns a metadata object for class sap.ui.commons.Dialog.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiCoreElementMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiCoreElementMetadataMod.default]
  }
  
  @js.native
  trait Dialog
    extends typings.openui5.sapUiCoreControlMod.default
       with PopupInterface {
    
    /**
      * Adds some button to the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addButton(
      /**
      * The button to add; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Adds some content to the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def addContent(
      /**
      * The content to add; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.commons.Dialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Dialog` itself.
      *
      * Event is fired when the dialog has been closed (after closing-animation etc.). Event parameters provide
      * information about last position and last size.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachClosed(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Dialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.commons.Dialog`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.commons.Dialog` itself.
      *
      * Event is fired when the dialog has been closed (after closing-animation etc.). Event parameters provide
      * information about last position and last size.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachClosed(
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
    def attachClosed(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.commons.Dialog` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the dialog control instance.
      */
    def close(): Unit = js.native
    
    /**
      * Destroys all the buttons in the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyButtons(): this.type = js.native
    
    /**
      * Destroys all the content in the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def destroyContent(): this.type = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:closed closed} event of this `sap.ui.commons.Dialog`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachClosed(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachClosed(
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
      * Fires event {@link #event:closed closed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClosed(): this.type = js.native
    def fireClosed(/**
      * Parameters to pass along with the event
      */
    mParameters: Height): this.type = js.native
    
    /**
      * Gets current value of property {@link #getAccessibleRole accessibleRole}.
      *
      * The ARIA role for the control. E.g. for alert-style Dialogs this can be set to "AlertDialog".
      *
      * Default value is `Dialog`.
      *
      * @returns Value of property `accessibleRole`
      */
    def getAccessibleRole(): AccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleRole * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getApplyContentPadding applyContentPadding}.
      *
      * Padding is theme-dependent. When set to "false", the content extends to the dialog borders.
      *
      * Default value is `true`.
      *
      * @returns Value of property `applyContentPadding`
      */
    def getApplyContentPadding(): Boolean = js.native
    
    /**
      * @SINCE 1.10
      *
      * Gets current value of property {@link #getAutoClose autoClose}.
      *
      * If this property is set to true the Dialog will close if the Dialog loses its focus
      *
      * Default value is `false`.
      *
      * @returns Value of property `autoClose`
      */
    def getAutoClose(): Boolean = js.native
    
    /**
      * Gets content of aggregation {@link #getButtons buttons}.
      *
      * Aggregation of the buttons to display at the bottom of the dialog, for example OK and Cancel. Association
      * defaultButton can be used for one of the defined buttons.
      */
    def getButtons(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets content of aggregation {@link #getContent content}.
      *
      * Aggregation of the content of the dialog (one or more controls).
      *
      * Warning: when content is added with width given as a percentage, the Dialog itself should have a width
      * set.
      */
    def getContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Gets current value of property {@link #getContentBorderDesign contentBorderDesign}.
      *
      * Specifies the border design. Border design is theme dependent.
      *
      * Default value is `None`.
      *
      * @returns Value of property `contentBorderDesign`
      */
    def getContentBorderDesign(): BorderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.BorderDesign * / any */ String) = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getDefaultButton defaultButton},
      * or `null`.
      */
    def getDefaultButton(): ID = js.native
    
    /**
      * @EXPERIMENTAL - Whether a dialog is regarded as "enabled" during the state transitions (OPENING, CLOSING)
      * is not fully decided. Currently, it is enabled during the OPENING phase and disabled during the CLOSING
      * phase. The only potential change would be to treat the OPENING phase as disabled as well. Applications
      * should be prepared to receive events from "enabled" controls after they called open() on the dialog until
      * close() is called on it. If the mentioned potential change should happen, the dialog will become enabled
      * only after the transition to OPEN. Events from "enabled" children then can still only arrive between
      * open() and close(), so applications that obey the previous rule should continue to work. Only end users
      * or code that explicitly triggers pseudo user events will notice a difference.
      *  A second aspect that might change is the visual behavior of the content: during the CLOSING phase it
      * 'looks' enabled but in fact it is already disabled. This avoids unnecessary redraws for content that
      * becomes hidden soon. Should this show to be confusing for end users, it might be changed.
      *
      * Determines whether the dialog is currently enabled or not.
      *
      * Applications can't control the enabled state via a property. A dialog is implicitly enabled depending
      * on its `openState`. Descendant controls that honor the enabled state of their ancestors will appear disabled
      * after the dialog is closed.
      *
      * @returns indicates whether the dialog is currently enabled or not.
      */
    def getEnabled(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getHeight height}.
      *
      * Outer height of dialog window. When not set and not constrained by one of the height parameters (minHeight/maxHeight),
      * the window size is automatically adapted to the content.
      *
      * @returns Value of property `height`
      */
    def getHeight(): CSSSize = js.native
    
    /**
      * ID of the element which is the current target of the association {@link #getInitialFocus initialFocus},
      * or `null`.
      */
    def getInitialFocus(): ID = js.native
    
    /**
      * @SINCE 1.9.0
      *
      * Gets current value of property {@link #getKeepInWindow keepInWindow}.
      *
      * Specifies whether Dialog movement should be restricted to the visible area of the window. This only affects
      * drag&drop movements by the user. This doesn't affect modal dialogs -> modal dialogs always stay in the
      * window.
      *
      * Default value is `false`.
      *
      * @returns Value of property `keepInWindow`
      */
    def getKeepInWindow(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getMaxHeight maxHeight}.
      *
      * Maximum outer height of the dialog window. If set, neither the user nor some layout settings can make
      * the window larger.
      *
      * @returns Value of property `maxHeight`
      */
    def getMaxHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getMaxWidth maxWidth}.
      *
      * Maximum outer width of the dialog window. If set, neither the user nor some layout settings can make
      * the window larger.
      *
      * @returns Value of property `maxWidth`
      */
    def getMaxWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getMinHeight minHeight}.
      *
      * Minimum outer height of the dialog window. When set, neither the user nor some layout settings can make
      * the window smaller.
      *
      * @returns Value of property `minHeight`
      */
    def getMinHeight(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getMinWidth minWidth}.
      *
      * Minimum outer width of the dialog window. When set, neither the user nor some layout settings can make
      * the window smaller.
      *
      * @returns Value of property `minWidth`
      */
    def getMinWidth(): CSSSize = js.native
    
    /**
      * Gets current value of property {@link #getModal modal}.
      *
      * Specifies whether the dialog should be modal, or not. In case of `true` the focus is kept inside the
      * dialog.
      *
      * Default value is `false`.
      *
      * @returns Value of property `modal`
      */
    def getModal(): Boolean = js.native
    
    /**
      * Indicates whether the Dialog is currently open, closed, or transitioning between these states.
      */
    def getOpenState(): OpenState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenState * / any */ String) = js.native
    
    /**
      * Gets current value of property {@link #getResizable resizable}.
      *
      * Specifies whether the dialog window can be resized by the user. The dialog frame contains the visual
      * symbol.
      *
      * Default value is `true`.
      *
      * @returns Value of property `resizable`
      */
    def getResizable(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getScrollLeft scrollLeft}.
      *
      * Scroll position from left to right. "0" means leftmost position.
      *
      * Default value is `0`.
      *
      * @returns Value of property `scrollLeft`
      */
    def getScrollLeft(): int = js.native
    
    /**
      * Gets current value of property {@link #getScrollTop scrollTop}.
      *
      * Scroll position from top to bottom. "0" means topmost position.
      *
      * Default value is `0`.
      *
      * @returns Value of property `scrollTop`
      */
    def getScrollTop(): int = js.native
    
    /**
      * Gets current value of property {@link #getShowCloseButton showCloseButton}.
      *
      * Displays a close button in the title bar.
      *
      * Default value is `true`.
      *
      * @returns Value of property `showCloseButton`
      */
    def getShowCloseButton(): Boolean = js.native
    
    /**
      * Gets current value of property {@link #getTitle title}.
      *
      * Dialog title displayed in the header.
      *
      * Default value is `empty string`.
      *
      * @returns Value of property `title`
      */
    def getTitle(): String = js.native
    
    /**
      * Gets current value of property {@link #getWidth width}.
      *
      * Outer width of dialog window. When not set and not constrained by one of the width parameters (minWidth/maxWidth),
      * the window size is automatically adapted to the content.
      *
      * @returns Value of property `width`
      */
    def getWidth(): CSSSize = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getButtons buttons}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfButton(
      /**
      * The button whose index is looked for
      */
    oButton: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Checks for the provided `sap.ui.core.Control` in the aggregation {@link #getContent content}. and returns
      * its index if found or -1 otherwise.
      *
      * @returns The index of the provided control in the aggregation if found, or -1 otherwise
      */
    def indexOfContent(
      /**
      * The content whose index is looked for
      */
    oContent: typings.openui5.sapUiCoreControlMod.default
    ): int = js.native
    
    /**
      * Inserts a button into the aggregation {@link #getButtons buttons}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertButton(
      /**
      * The button to insert; if empty, nothing is inserted
      */
    oButton: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the button should be inserted at; for a negative value of `iIndex`, the button is
      * inserted at position 0; for a value greater than the current size of the aggregation, the button is inserted
      * at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Inserts a content into the aggregation {@link #getContent content}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def insertContent(
      /**
      * The content to insert; if empty, nothing is inserted
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * The `0`-based index the content should be inserted at; for a negative value of `iIndex`, the content
      * is inserted at position 0; for a value greater than the current size of the aggregation, the content
      * is inserted at the last position
      */
    iIndex: int
    ): this.type = js.native
    
    /**
      * Indicates whether the Dialog is open (this includes opening and closing animations). For more detailed
      * information about the current state check Dialog.getOpenState().
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Opens the dialog control instance.
      */
    def open(): Unit = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getButtons buttons}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllButtons(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    /**
      * Removes all the controls from the aggregation {@link #getContent content}.
      *
      * Additionally, it unregisters them from the hosting UIArea.
      *
      * @returns An array of the removed elements (might be empty)
      */
    def removeAllContent(): js.Array[typings.openui5.sapUiCoreControlMod.default] = js.native
    
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a button from the aggregation {@link #getButtons buttons}.
      *
      * @returns The removed button or `null`
      */
    def removeButton(/**
      * The button to remove or its index or id
      */
    vButton: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeButton(
      /**
      * The button to remove or its index or id
      */
    vButton: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: String): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    /**
      * Removes a content from the aggregation {@link #getContent content}.
      *
      * @returns The removed content or `null`
      */
    def removeContent(/**
      * The content to remove or its index or id
      */
    vContent: int): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    def removeContent(
      /**
      * The content to remove or its index or id
      */
    vContent: typings.openui5.sapUiCoreControlMod.default
    ): typings.openui5.sapUiCoreControlMod.default | Null = js.native
    
    /**
      * Sets a new value for property {@link #getAccessibleRole accessibleRole}.
      *
      * The ARIA role for the control. E.g. for alert-style Dialogs this can be set to "AlertDialog".
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `Dialog`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAccessibleRole(): this.type = js.native
    def setAccessibleRole(
      /**
      * New value for property `accessibleRole`
      */
    sAccessibleRole: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleRole * / any */ String
    ): this.type = js.native
    def setAccessibleRole(/**
      * New value for property `accessibleRole`
      */
    sAccessibleRole: AccessibleRole): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getApplyContentPadding applyContentPadding}.
      *
      * Padding is theme-dependent. When set to "false", the content extends to the dialog borders.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setApplyContentPadding(): this.type = js.native
    def setApplyContentPadding(/**
      * New value for property `applyContentPadding`
      */
    bApplyContentPadding: Boolean): this.type = js.native
    
    /**
      * @SINCE 1.10
      *
      * Sets a new value for property {@link #getAutoClose autoClose}.
      *
      * If this property is set to true the Dialog will close if the Dialog loses its focus
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setAutoClose(): this.type = js.native
    def setAutoClose(/**
      * New value for property `autoClose`
      */
    bAutoClose: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getContentBorderDesign contentBorderDesign}.
      *
      * Specifies the border design. Border design is theme dependent.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `None`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setContentBorderDesign(): this.type = js.native
    def setContentBorderDesign(
      /**
      * New value for property `contentBorderDesign`
      */
    sContentBorderDesign: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.BorderDesign * / any */ String
    ): this.type = js.native
    def setContentBorderDesign(/**
      * New value for property `contentBorderDesign`
      */
    sContentBorderDesign: BorderDesign): this.type = js.native
    
    def setDefaultButton(
      /**
      * ID of an element which becomes the new target of this defaultButton association; alternatively, an element
      * instance may be given
      */
    oDefaultButton: typings.openui5.sapUiCommonsButtonMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getDefaultButton defaultButton}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setDefaultButton(
      /**
      * ID of an element which becomes the new target of this defaultButton association; alternatively, an element
      * instance may be given
      */
    oDefaultButton: ID
    ): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getHeight height}.
      *
      * Outer height of dialog window. When not set and not constrained by one of the height parameters (minHeight/maxHeight),
      * the window size is automatically adapted to the content.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setHeight(): this.type = js.native
    def setHeight(/**
      * New value for property `height`
      */
    sHeight: CSSSize): this.type = js.native
    
    def setInitialFocus(
      /**
      * ID of an element which becomes the new target of this initialFocus association; alternatively, an element
      * instance may be given
      */
    oInitialFocus: typings.openui5.sapUiCoreControlMod.default
    ): this.type = js.native
    /**
      * Sets the associated {@link #getInitialFocus initialFocus}.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setInitialFocus(
      /**
      * ID of an element which becomes the new target of this initialFocus association; alternatively, an element
      * instance may be given
      */
    oInitialFocus: ID
    ): this.type = js.native
    
    /**
      * @SINCE 1.9.0
      *
      * Sets a new value for property {@link #getKeepInWindow keepInWindow}.
      *
      * Specifies whether Dialog movement should be restricted to the visible area of the window. This only affects
      * drag&drop movements by the user. This doesn't affect modal dialogs -> modal dialogs always stay in the
      * window.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setKeepInWindow(): this.type = js.native
    def setKeepInWindow(/**
      * New value for property `keepInWindow`
      */
    bKeepInWindow: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxHeight maxHeight}.
      *
      * Maximum outer height of the dialog window. If set, neither the user nor some layout settings can make
      * the window larger.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxHeight(): this.type = js.native
    def setMaxHeight(/**
      * New value for property `maxHeight`
      */
    sMaxHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMaxWidth maxWidth}.
      *
      * Maximum outer width of the dialog window. If set, neither the user nor some layout settings can make
      * the window larger.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMaxWidth(): this.type = js.native
    def setMaxWidth(/**
      * New value for property `maxWidth`
      */
    sMaxWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinHeight minHeight}.
      *
      * Minimum outer height of the dialog window. When set, neither the user nor some layout settings can make
      * the window smaller.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinHeight(): this.type = js.native
    def setMinHeight(/**
      * New value for property `minHeight`
      */
    sMinHeight: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getMinWidth minWidth}.
      *
      * Minimum outer width of the dialog window. When set, neither the user nor some layout settings can make
      * the window smaller.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setMinWidth(): this.type = js.native
    def setMinWidth(/**
      * New value for property `minWidth`
      */
    sMinWidth: CSSSize): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getModal modal}.
      *
      * Specifies whether the dialog should be modal, or not. In case of `true` the focus is kept inside the
      * dialog.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `false`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setModal(): this.type = js.native
    def setModal(/**
      * New value for property `modal`
      */
    bModal: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getResizable resizable}.
      *
      * Specifies whether the dialog window can be resized by the user. The dialog frame contains the visual
      * symbol.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setResizable(): this.type = js.native
    def setResizable(/**
      * New value for property `resizable`
      */
    bResizable: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getScrollLeft scrollLeft}.
      *
      * Scroll position from left to right. "0" means leftmost position.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScrollLeft(): this.type = js.native
    def setScrollLeft(/**
      * New value for property `scrollLeft`
      */
    iScrollLeft: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getScrollTop scrollTop}.
      *
      * Scroll position from top to bottom. "0" means topmost position.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `0`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setScrollTop(): this.type = js.native
    def setScrollTop(/**
      * New value for property `scrollTop`
      */
    iScrollTop: int): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getShowCloseButton showCloseButton}.
      *
      * Displays a close button in the title bar.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `true`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setShowCloseButton(): this.type = js.native
    def setShowCloseButton(/**
      * New value for property `showCloseButton`
      */
    bShowCloseButton: Boolean): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getTitle title}.
      *
      * Dialog title displayed in the header.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * Default value is `empty string`.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setTitle(): this.type = js.native
    def setTitle(/**
      * New value for property `title`
      */
    sTitle: String): this.type = js.native
    
    /**
      * Sets a new value for property {@link #getWidth width}.
      *
      * Outer width of dialog window. When not set and not constrained by one of the width parameters (minWidth/maxWidth),
      * the window size is automatically adapted to the content.
      *
      * When called with a value of `null` or `undefined`, the default value of the property will be restored.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def setWidth(): this.type = js.native
    def setWidth(/**
      * New value for property `width`
      */
    sWidth: CSSSize): this.type = js.native
  }
  
  trait DialogSettings
    extends StObject
       with ControlSettings {
    
    /**
      * The ARIA role for the control. E.g. for alert-style Dialogs this can be set to "AlertDialog".
      */
    var accessibleRole: js.UndefOr[
        AccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleRole * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Padding is theme-dependent. When set to "false", the content extends to the dialog borders.
      */
    var applyContentPadding: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * @SINCE 1.10
      *
      * If this property is set to true the Dialog will close if the Dialog loses its focus
      */
    var autoClose: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Aggregation of the buttons to display at the bottom of the dialog, for example OK and Cancel. Association
      * defaultButton can be used for one of the defined buttons.
      */
    var buttons: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Event is fired when the dialog has been closed (after closing-animation etc.). Event parameters provide
      * information about last position and last size.
      */
    var closed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    /**
      * Aggregation of the content of the dialog (one or more controls).
      *
      * Warning: when content is added with width given as a percentage, the Dialog itself should have a width
      * set.
      */
    var content: js.UndefOr[
        js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies the border design. Border design is theme dependent.
      */
    var contentBorderDesign: js.UndefOr[
        BorderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.BorderDesign * / any */ String) | PropertyBindingInfo
      ] = js.undefined
    
    /**
      * Defines one of the buttons that have been provided via button aggregation to be the default button. This
      * default button is initially selected, if no control is set via the initialFocus association explicitly.
      * The default button is activated when Enter is pressed in the context of the dialog and when the currently
      * selected element does not handle the Enter event itself.
      */
    var defaultButton: js.UndefOr[typings.openui5.sapUiCommonsButtonMod.default | String] = js.undefined
    
    /**
      * Outer height of dialog window. When not set and not constrained by one of the height parameters (minHeight/maxHeight),
      * the window size is automatically adapted to the content.
      */
    var height: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Defines the control that shall get the focus when the dialog is opened.
      */
    var initialFocus: js.UndefOr[typings.openui5.sapUiCoreControlMod.default | String] = js.undefined
    
    /**
      * @SINCE 1.9.0
      *
      * Specifies whether Dialog movement should be restricted to the visible area of the window. This only affects
      * drag&drop movements by the user. This doesn't affect modal dialogs -> modal dialogs always stay in the
      * window.
      */
    var keepInWindow: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Maximum outer height of the dialog window. If set, neither the user nor some layout settings can make
      * the window larger.
      */
    var maxHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Maximum outer width of the dialog window. If set, neither the user nor some layout settings can make
      * the window larger.
      */
    var maxWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Minimum outer height of the dialog window. When set, neither the user nor some layout settings can make
      * the window smaller.
      */
    var minHeight: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Minimum outer width of the dialog window. When set, neither the user nor some layout settings can make
      * the window smaller.
      */
    var minWidth: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies whether the dialog should be modal, or not. In case of `true` the focus is kept inside the
      * dialog.
      */
    var modal: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Specifies whether the dialog window can be resized by the user. The dialog frame contains the visual
      * symbol.
      */
    var resizable: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Scroll position from left to right. "0" means leftmost position.
      */
    var scrollLeft: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Scroll position from top to bottom. "0" means topmost position.
      */
    var scrollTop: js.UndefOr[int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)] = js.undefined
    
    /**
      * Displays a close button in the title bar.
      */
    var showCloseButton: js.UndefOr[
        Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
    
    /**
      * Dialog title displayed in the header.
      */
    var title: js.UndefOr[String | PropertyBindingInfo] = js.undefined
    
    /**
      * Outer width of dialog window. When not set and not constrained by one of the width parameters (minWidth/maxWidth),
      * the window size is automatically adapted to the content.
      */
    var width: js.UndefOr[
        CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)
      ] = js.undefined
  }
  object DialogSettings {
    
    inline def apply(): DialogSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogSettings] (val x: Self) extends AnyVal {
      
      inline def setAccessibleRole(
        value: AccessibleRole | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AccessibleRole * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "accessibleRole", value.asInstanceOf[js.Any])
      
      inline def setAccessibleRoleUndefined: Self = StObject.set(x, "accessibleRole", js.undefined)
      
      inline def setApplyContentPadding(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "applyContentPadding", value.asInstanceOf[js.Any])
      
      inline def setApplyContentPaddingUndefined: Self = StObject.set(x, "applyContentPadding", js.undefined)
      
      inline def setAutoClose(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "autoClose", value.asInstanceOf[js.Any])
      
      inline def setAutoCloseUndefined: Self = StObject.set(x, "autoClose", js.undefined)
      
      inline def setButtons(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setClosed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setContent(
        value: js.Array[typings.openui5.sapUiCoreControlMod.default] | typings.openui5.sapUiCoreControlMod.default | AggregationBindingInfo | (/* template literal string: {${string}} */ String)
      ): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentBorderDesign(
        value: BorderDesign | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof enums.BorderDesign * / any */ String) | PropertyBindingInfo
      ): Self = StObject.set(x, "contentBorderDesign", value.asInstanceOf[js.Any])
      
      inline def setContentBorderDesignUndefined: Self = StObject.set(x, "contentBorderDesign", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentVarargs(value: typings.openui5.sapUiCoreControlMod.default*): Self = StObject.set(x, "content", js.Array(value*))
      
      inline def setDefaultButton(value: typings.openui5.sapUiCommonsButtonMod.default | String): Self = StObject.set(x, "defaultButton", value.asInstanceOf[js.Any])
      
      inline def setDefaultButtonUndefined: Self = StObject.set(x, "defaultButton", js.undefined)
      
      inline def setHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInitialFocus(value: typings.openui5.sapUiCoreControlMod.default | String): Self = StObject.set(x, "initialFocus", value.asInstanceOf[js.Any])
      
      inline def setInitialFocusUndefined: Self = StObject.set(x, "initialFocus", js.undefined)
      
      inline def setKeepInWindow(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "keepInWindow", value.asInstanceOf[js.Any])
      
      inline def setKeepInWindowUndefined: Self = StObject.set(x, "keepInWindow", js.undefined)
      
      inline def setMaxHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinHeight(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setModal(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
      
      inline def setResizable(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
      
      inline def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
      
      inline def setScrollLeft(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollLeftUndefined: Self = StObject.set(x, "scrollLeft", js.undefined)
      
      inline def setScrollTop(value: int | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
      
      inline def setScrollTopUndefined: Self = StObject.set(x, "scrollTop", js.undefined)
      
      inline def setShowCloseButton(value: Boolean | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      inline def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      inline def setTitle(value: String | PropertyBindingInfo): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: CSSSize | PropertyBindingInfo | (/* template literal string: {${string}} */ String)): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
