package typings.openui5

import typings.openui5.anon.Top
import typings.openui5.jQuery.Event
import typings.openui5.sap.ClassInfo
import typings.openui5.sapUiBaseManagedObjectMod.ManagedObjectSettings
import typings.openui5.sapUiCoreLibraryMod.Collision
import typings.openui5.sapUiCoreLibraryMod.OpenState
import typings.std.Element
import typings.std.HTMLElement
import typings.std.Record
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCorePopupMod {
  
  @JSImport("sap/ui/core/Popup", JSImport.Default)
  @js.native
  open class default protected () extends Popup {
    /**
      * Creates an instance of `sap.ui.core.Popup` that can be used to open controls as a Popup, visually appearing
      * in front of other controls.
      *
      * Accepts an object literal `mSettings` that defines initial property values, aggregated and associated
      * objects as well as event handlers. See {@link sap.ui.base.ManagedObject#constructor} for a general description
      * of the syntax of the settings object.
      */
    def this(/**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default) = this()
    def this(/**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreElementMod.default) = this()
    def this(/**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: Element) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreElementMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: Element,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Boolean,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Unit,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreElementMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Boolean,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreElementMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Unit,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: Element,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Boolean,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: Element,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Unit,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Boolean,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Boolean,
      /**
      * whether the popup should automatically close when the focus moves out of the popup
      */
    bAutoClose: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Boolean,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Unit,
      /**
      * whether the popup should automatically close when the focus moves out of the popup
      */
    bAutoClose: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Unit,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Boolean,
      /**
      * whether the popup should automatically close when the focus moves out of the popup
      */
    bAutoClose: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreControlMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Unit,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Unit,
      /**
      * whether the popup should automatically close when the focus moves out of the popup
      */
    bAutoClose: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreElementMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Boolean,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Boolean,
      /**
      * whether the popup should automatically close when the focus moves out of the popup
      */
    bAutoClose: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreElementMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Boolean,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Unit,
      /**
      * whether the popup should automatically close when the focus moves out of the popup
      */
    bAutoClose: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreElementMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Unit,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Boolean,
      /**
      * whether the popup should automatically close when the focus moves out of the popup
      */
    bAutoClose: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: typings.openui5.sapUiCoreElementMod.default,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Unit,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Unit,
      /**
      * whether the popup should automatically close when the focus moves out of the popup
      */
    bAutoClose: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: Element,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Boolean,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Boolean,
      /**
      * whether the popup should automatically close when the focus moves out of the popup
      */
    bAutoClose: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: Element,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Boolean,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Unit,
      /**
      * whether the popup should automatically close when the focus moves out of the popup
      */
    bAutoClose: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: Element,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Unit,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Boolean,
      /**
      * whether the popup should automatically close when the focus moves out of the popup
      */
    bAutoClose: Boolean
    ) = this()
    def this(
      /**
      * the content to render in the popup. In case of sap.ui.core.Element or DOMNode, the content must be present
      * in the page (i.e. rendered). In case of sap.ui.core.Control, the Popup ensures rendering before opening.
      */
    oContent: Element,
      /**
      * whether the popup should be opened in a modal way (i.e. with blocking background). Setting this to "true"
      * effectively blocks all attempts to focus content outside the modal popup. A modal popup also automatically
      * sets the focus back to whatever was focused when the popup opened.
      */
    bModal: Unit,
      /**
      * whether the popup should be have a visual shadow underneath (shadow appearance depends on active theme
      * and browser support)
      */
    bShadow: Unit,
      /**
      * whether the popup should automatically close when the focus moves out of the popup
      */
    bAutoClose: Boolean
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/Popup", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def addExternalContent(/**
      * One query selector or an array of query selectors to be added
      */
    vSelectors: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExternalContent")(vSelectors.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addExternalContent(
      /**
      * One query selector or an array of query selectors to be added
      */
    vSelectors: String,
      /**
      * Whether the external content should be marked instantly as user selectable. If the external content which
      * matches the given or default selector is added after a modal popup is opened, this parameter needs to
      * be set to `true` to make the external content user selectable.
      */
    bMarkAsSelectable: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExternalContent")(vSelectors.asInstanceOf[js.Any], bMarkAsSelectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * @SINCE 1.75
      *
      * Adds a DOM query selector for determining additional external popup content.
      *
      * When the browser focus is switched from the main popup content (which is set by calling {@link #setContent})
      * to another DOM element, this DOM element is tested against the selector to determine:
      *
      *
      * 	 - Autoclose popup: whether the popup should be kept open
      * 	 - Modal popup: whether the focus is allowed to be taken away
      */
    inline def addExternalContent(
      /**
      * One query selector or an array of query selectors to be added
      */
    vSelectors: js.Array[String]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addExternalContent")(vSelectors.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def addExternalContent(
      /**
      * One query selector or an array of query selectors to be added
      */
    vSelectors: js.Array[String],
      /**
      * Whether the external content should be marked instantly as user selectable. If the external content which
      * matches the given or default selector is added after a modal popup is opened, this parameter needs to
      * be set to `true` to make the external content user selectable.
      */
    bMarkAsSelectable: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addExternalContent")(vSelectors.asInstanceOf[js.Any], bMarkAsSelectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Attaches event handler `fnFunction` to the static {@link #.blockLayerStateChange blockLayerStateChange}
      * event.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to a dummy event provider object.
      *
      * The event gets triggered in case of modal popups when the first of multiple popups opens and closes.
      */
    inline def attachBlockLayerStateChange(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachBlockLayerStateChange")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def attachBlockLayerStateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to a dummy event provider object
      */
    oListener: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachBlockLayerStateChange")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * Attaches event handler `fnFunction` to the static {@link #.blockLayerStateChange blockLayerStateChange}
      * event.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to a dummy event provider object.
      *
      * The event gets triggered in case of modal popups when the first of multiple popups opens and closes.
      */
    inline def attachBlockLayerStateChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachBlockLayerStateChange")(oData.asInstanceOf[js.Any], fnFunction.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def attachBlockLayerStateChange(
      /**
      * An application-specific payload object that will be passed to the event handler along with the event
      * object when firing the event
      */
    oData: js.Object,
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object to call the event handler with. Defaults to a dummy event provider object
      */
    oListener: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("attachBlockLayerStateChange")(oData.asInstanceOf[js.Any], fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Removes a previously attached event handler `fnFunction` from the static {@link #.blockLayerStateChange
      * blockLayerStateChange} event.
      *
      * The event gets triggered in case of modal popups when the first of multiple popups opens and closes.
      */
    inline def detachBlockLayerStateChange(/**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detachBlockLayerStateChange")(fnFunction.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def detachBlockLayerStateChange(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function,
      /**
      * Context object on which the given function had to be called
      */
    oListener: js.Object
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detachBlockLayerStateChange")(fnFunction.asInstanceOf[js.Any], oListener.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Creates a new subclass of class sap.ui.core.Popup with name `sClassName` and enriches it with the information
      * contained in `oClassInfo`.
      *
      * `oClassInfo` might contain the same kind of information as described in {@link sap.ui.base.ManagedObject.extend}.
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
    oClassInfo: ClassInfo[T, Popup]
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    inline def extend[T /* <: Record[String, Any] */](
      /**
      * Name of the class being created
      */
    sClassName: String,
      /**
      * Object literal with information about the class
      */
    oClassInfo: ClassInfo[T, Popup],
      /**
      * Constructor function for the metadata object; if not given, it defaults to the metadata implementation
      * used by this class
      */
    FNMetaImpl: js.Function
    ): js.Function = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(sClassName.asInstanceOf[js.Any], oClassInfo.asInstanceOf[js.Any], FNMetaImpl.asInstanceOf[js.Any])).asInstanceOf[js.Function]
    
    /**
      * Returns the last z-index that has been handed out. does not increase the internal z-index counter.
      *
      * @returns The z-index value
      */
    inline def getLastZIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getLastZIndex")().asInstanceOf[Double]
    
    /**
      * Returns a metadata object for class sap.ui.core.Popup.
      *
      * @returns Metadata object describing this class
      */
    inline def getMetadata(): typings.openui5.sapUiBaseManagedObjectMetadataMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")().asInstanceOf[typings.openui5.sapUiBaseManagedObjectMetadataMod.default]
    
    /**
      * Returns the next available z-index on top of the existing/previous popups. Each call increases the internal
      * z-index counter and the returned z-index.
      *
      * @returns the next z-index on top of the Popup stack
      */
    inline def getNextZIndex(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextZIndex")().asInstanceOf[Double]
    
    /**
      * @SINCE 1.89.0
      *
      * Returns the value that has been set by {@link sap.ui.core.Popup.setWithinArea}. When a DOM element that
      * represents the within area is needed, use {@link sap.ui.core.Popup.getWithinAreaDomRef} instead.
      *
      * If no within area is specified, `undefined` is returned.
      *
      * @returns The specfied within area
      */
    inline def getWithinArea(): String | Element | typings.openui5.sapUiCoreElementMod.default | Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getWithinArea")().asInstanceOf[String | Element | typings.openui5.sapUiCoreElementMod.default | Window]
    
    /**
      * @SINCE 1.89.0
      *
      * Returns the actual DOM element of the value that has been set by {@link sap.ui.core.Popup.setWithinArea}.
      * It returns `window` by default when no within area has been set using {@link sap.ui.core.Popup.setWithinArea}.
      *
      * When an {@link sap.ui.core.Element} is set as a within area, `document.documentElement` is returned before
      * element is rendered.
      *
      * @returns The DOM Element or the window object
      */
    inline def getWithinAreaDomRef(): Element | Window = ^.asInstanceOf[js.Dynamic].applyDynamic("getWithinAreaDomRef")().asInstanceOf[Element | Window]
    
    /**
      * @SINCE 1.77
      *
      * Marks the external content as not user selectable
      */
    inline def markExternalContentAsNotSelectable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markExternalContentAsNotSelectable")().asInstanceOf[Unit]
    
    /**
      * @SINCE 1.77
      *
      * Marks the external content as user selectable
      */
    inline def markExternalContentAsSelectable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("markExternalContentAsSelectable")().asInstanceOf[Unit]
    
    inline def removeExternalContent(/**
      * One query selector or an array of query selectors to be deleted
      */
    vSelectors: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeExternalContent")(vSelectors.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeExternalContent(
      /**
      * One query selector or an array of query selectors to be deleted
      */
    vSelectors: String,
      /**
      * Whether the external content should be marked instantly as not user selectable. If the selector is removed
      * while a modal popup is still open, this parameter needs to be set to `true` to make the external content
      * not user selectable.
      */
    bMarkAsNotSelectable: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeExternalContent")(vSelectors.asInstanceOf[js.Any], bMarkAsNotSelectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * @SINCE 1.75
      *
      * Removes a DOM query selector which has been added by {@link sap.ui.core.Popup.addExternalContent}.
      *
      * The default query selector `[data-sap-ui-integration-popup-content]` can't be deleted.
      */
    inline def removeExternalContent(
      /**
      * One query selector or an array of query selectors to be deleted
      */
    vSelectors: js.Array[String]
    ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeExternalContent")(vSelectors.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def removeExternalContent(
      /**
      * One query selector or an array of query selectors to be deleted
      */
    vSelectors: js.Array[String],
      /**
      * Whether the external content should be marked instantly as not user selectable. If the selector is removed
      * while a modal popup is still open, this parameter needs to be set to `true` to make the external content
      * not user selectable.
      */
    bMarkAsNotSelectable: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeExternalContent")(vSelectors.asInstanceOf[js.Any], bMarkAsNotSelectable.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * @SINCE 1.30.0
      *
      * Set an initial z-index that should be used by all Popup so all Popups start at least with the set z-index.
      * If the given z-index is lower than any current available z-index the highest z-index will be used.
      */
    inline def setInitialZIndex(/**
      * is the initial z-index
      */
    iInitialZIndex: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setInitialZIndex")(iInitialZIndex.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * @SINCE 1.89.0
      *
      * Sets a within area that is used as the area available for positioning the popup. It mainly affects the
      * collision detection. The position of the popup can then be further adapted depending on the "collision"
      * parameter that is set with {@link sap.ui.core.Popup#open} or {@link sap.ui.core.Popup#setPosition} when
      * the popup overflows the within area.
      *
      * If no within area is specified, all popups use the `window` as within area.
      *
      * When an {@link sap.ui.core.Element} is set as the within area, make sure that the control is rendered
      * when the popup opens, otherwise the `window` is used as the within area.
      */
    inline def setWithinArea(/**
      * The within area
      */
    vValue: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWithinArea")(vValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setWithinArea(/**
      * The within area
      */
    vValue: typings.openui5.sapUiCoreElementMod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWithinArea")(vValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setWithinArea(/**
      * The within area
      */
    vValue: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWithinArea")(vValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def setWithinArea(/**
      * The within area
      */
    vValue: Window): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWithinArea")(vValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @js.native
  sealed trait Dock extends StObject
  @JSImport("sap/ui/core/Popup", "Dock")
  @js.native
  object Dock extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Dock & String] = js.native
    
    @js.native
    sealed trait BeginBottom
      extends StObject
         with Dock
    /* "begin bottom" */ val BeginBottom: typings.openui5.sapUiCorePopupMod.Dock.BeginBottom & String = js.native
    
    @js.native
    sealed trait BeginCenter
      extends StObject
         with Dock
    /* "begin center" */ val BeginCenter: typings.openui5.sapUiCorePopupMod.Dock.BeginCenter & String = js.native
    
    @js.native
    sealed trait BeginTop
      extends StObject
         with Dock
    /* "begin top" */ val BeginTop: typings.openui5.sapUiCorePopupMod.Dock.BeginTop & String = js.native
    
    @js.native
    sealed trait CenterBottom
      extends StObject
         with Dock
    /* "center bottom" */ val CenterBottom: typings.openui5.sapUiCorePopupMod.Dock.CenterBottom & String = js.native
    
    @js.native
    sealed trait CenterCenter
      extends StObject
         with Dock
    /* "center center" */ val CenterCenter: typings.openui5.sapUiCorePopupMod.Dock.CenterCenter & String = js.native
    
    @js.native
    sealed trait CenterTop
      extends StObject
         with Dock
    /* "center top" */ val CenterTop: typings.openui5.sapUiCorePopupMod.Dock.CenterTop & String = js.native
    
    @js.native
    sealed trait EndBottom
      extends StObject
         with Dock
    /* "end bottom" */ val EndBottom: typings.openui5.sapUiCorePopupMod.Dock.EndBottom & String = js.native
    
    @js.native
    sealed trait EndCenter
      extends StObject
         with Dock
    /* "end center" */ val EndCenter: typings.openui5.sapUiCorePopupMod.Dock.EndCenter & String = js.native
    
    @js.native
    sealed trait EndTop
      extends StObject
         with Dock
    /* "end top" */ val EndTop: typings.openui5.sapUiCorePopupMod.Dock.EndTop & String = js.native
    
    @js.native
    sealed trait LeftBottom
      extends StObject
         with Dock
    /* "left bottom" */ val LeftBottom: typings.openui5.sapUiCorePopupMod.Dock.LeftBottom & String = js.native
    
    @js.native
    sealed trait LeftCenter
      extends StObject
         with Dock
    /* "left center" */ val LeftCenter: typings.openui5.sapUiCorePopupMod.Dock.LeftCenter & String = js.native
    
    @js.native
    sealed trait LeftTop
      extends StObject
         with Dock
    /* "left top" */ val LeftTop: typings.openui5.sapUiCorePopupMod.Dock.LeftTop & String = js.native
    
    @js.native
    sealed trait RightBottom
      extends StObject
         with Dock
    /* "right bottom" */ val RightBottom: typings.openui5.sapUiCorePopupMod.Dock.RightBottom & String = js.native
    
    @js.native
    sealed trait RightCenter
      extends StObject
         with Dock
    /* "right center" */ val RightCenter: typings.openui5.sapUiCorePopupMod.Dock.RightCenter & String = js.native
    
    @js.native
    sealed trait RightTop
      extends StObject
         with Dock
    /* "right top" */ val RightTop: typings.openui5.sapUiCorePopupMod.Dock.RightTop & String = js.native
  }
  
  @js.native
  trait Popup
    extends typings.openui5.sapUiBaseManagedObjectMod.default {
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.core.Popup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.Popup` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.Popup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:closed closed} event of this `sap.ui.core.Popup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.Popup` itself.
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.Popup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Attaches event handler `fnFunction` to the {@link #event:opened opened} event of this `sap.ui.core.Popup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.Popup` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpened(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def attachOpened(
      /**
      * The function to be called when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit],
      /**
      * Context object to call the event handler with. Defaults to this `sap.ui.core.Popup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    /**
      * Attaches event handler `fnFunction` to the {@link #event:opened opened} event of this `sap.ui.core.Popup`.
      *
      * When called, the context of the event handler (its `this`) will be bound to `oListener` if specified,
      * otherwise it will be bound to this `sap.ui.core.Popup` itself.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def attachOpened(
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
    def attachOpened(
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
      * Context object to call the event handler with. Defaults to this `sap.ui.core.Popup` itself
      */
    oListener: js.Object
    ): this.type = js.native
    
    /**
      * Closes the popup.
      *
      * If the Popup is already closed or in the process of closing, calling this method does nothing. If the
      * Popup is in the process of being opened and closed with a duration of 0, calling this method does nothing.
      * If the Popup is in the process of being opened and closed with an animation duration, the animation will
      * be chained, but this functionality is dangerous, may lead to inconsistent behavior and is thus not recommended
      * and may even be removed.
      */
    def close(): Unit = js.native
    def close(
      /**
      * Animation duration in milliseconds. For `iDuration` == 0 the closing happens synchronously without animation.
      */
    iDuration: int
    ): Unit = js.native
    
    /**
      * Detaches event handler `fnFunction` from the {@link #event:closed closed} event of this `sap.ui.core.Popup`.
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
      * Detaches event handler `fnFunction` from the {@link #event:opened opened} event of this `sap.ui.core.Popup`.
      *
      * The passed function and listener object must match the ones used for event registration.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def detachOpened(
      /**
      * The function to be called, when the event occurs
      */
    fnFunction: js.Function1[/* p1 */ typings.openui5.sapUiBaseEventMod.default, Unit]
    ): this.type = js.native
    def detachOpened(
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
      * When the Popup is being destroyed all corresponding references should be deleted as well to prevent any
      * memory leaks.
      */
    def exit(): Unit = js.native
    
    /**
      * Fires event {@link #event:closed closed} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireClosed(): this.type = js.native
    def fireClosed(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * Fires event {@link #event:opened opened} to attached listeners.
      *
      * @returns Reference to `this` in order to allow method chaining
      */
    def fireOpened(): this.type = js.native
    def fireOpened(/**
      * Parameters to pass along with the event
      */
    mParameters: js.Object): this.type = js.native
    
    /**
      * @SINCE 1.16
      *
      * Determines whether the Popup should auto closes or not.
      *
      * @returns `true` if auto close is enabled, `false` if no auto close is configured for this popup instance
      */
    def getAutoClose(): Boolean = js.native
    
    /**
      * Returns this Popup's content.
      *
      * @returns the content that has been set previously (if any)
      */
    def getContent(): typings.openui5.sapUiCoreControlMod.default | Element = js.native
    
    /**
      * @SINCE 1.13.0
      *
      * This returns true/false if the default followOf method should be used. If a separate followOf-handler
      * was previously added the corresponding function is returned.
      *
      * @returns if a function was set it is returned otherwise a boolean value whether the follow of is activated
      */
    def getFollowOf(): Boolean | js.Function = js.native
    
    /**
      * Returns the last z-index that has been handed out. does not increase the internal z-index counter.
      *
      * @returns Th z-index value
      */
    def getLastZIndex(): Double = js.native
    
    /**
      * Returns the value if a Popup is of modal type
      *
      * @returns bModal whether the Popup is of modal type
      */
    def getModal(): Boolean = js.native
    
    /**
      * Returns the next available z-index on top of the existing/previous popups. Each call increases the internal
      * z-index counter and the returned z-index.
      *
      * @returns the next z-index on top of the Popup stack
      */
    def getNextZIndex(): Double = js.native
    
    /**
      * Returns whether the Popup is currently open, closed, or in a transition between these states.
      *
      * @returns whether the Popup is opened
      */
    def getOpenState(): OpenState | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof OpenState * / any */ String) = js.native
    
    /**
      * Returns whether the Popup is currently open (this includes opening and closing animations).
      *
      * @returns whether the Popup is opened (or currently being opened or closed)
      */
    def isOpen(): Boolean = js.native
    
    /**
      * Opens the popup's content at the position either specified here or beforehand via {@link #setPosition}.
      * Content must be capable of being positioned via "position:absolute;" All parameters are optional (open()
      * may be called without any parameters). iDuration may just be omitted, but if any of "at", "of", "offset",
      * "collision" is given, also the preceding positional parameters ("my", at",...) must be given.
      *
      * If the Popup's OpenState is different from "CLOSED" (i.e. if the Popup is already open, opening or closing),
      * the call is ignored.
      */
    def open(
      /**
      * animation duration in milliseconds. For `iDuration` == 0 the opening happens synchronously without animation.
      */
    iDuration: js.UndefOr[int],
      /**
      * the popup content's reference position for docking
      */
    my: js.UndefOr[Dock],
      /**
      * the "of" element's reference point for docking to
      */
    at: js.UndefOr[Dock],
      /**
      * specifies the reference element to which the given content should dock to
      */
    of: js.UndefOr[
          String | typings.openui5.sapUiCoreElementMod.default | Element | jQuery[HTMLElement] | Event
        ],
      /**
      * the offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "10 0" to move the popup 10 pixels to the right). If the docking of both "my" and "at" are both RTL-sensitive
      * ("begin" or "end"), this offset is automatically mirrored in the RTL case as well.
      */
    offset: js.UndefOr[String],
      /**
      * defines how the position of an element should be adjusted in case it overflows the within area in some
      * direction.
      */
    collision: js.UndefOr[Collision],
      /**
      * defines the area the popup should be placed in. This affects the collision detection.
      */
    within: js.UndefOr[String | typings.openui5.sapUiCoreElementMod.default | Element | Window],
      /**
      * defines whether the popup should follow the dock reference when the reference changes its position.
      */
    followOf: js.UndefOr[Boolean | js.Function | Null]
    ): Unit = js.native
    
    /**
      * Sets the animation functions to use for opening and closing the Popup. Any null value will be ignored
      * and not change the respective animation function. When called, the animation functions receive three
      * parameters: - the jQuery object wrapping the DomRef of the popup - the requested animation duration -
      * a function that MUST be called once the animation has completed
      *
      * @returns `this` to allow method chaining
      */
    def setAnimations(
      /**
      * The function which executes the custom opening animation
      */
    fnOpen: js.Function,
      /**
      * The function which executes the custom closing animation
      */
    fnClose: js.Function
    ): this.type = js.native
    
    /**
      * Used to specify whether the Popup should close as soon as - for non-touch environment: the focus leaves
      * - for touch environment: user clicks the area which is outside the popup itself, the DOM element which
      * the popup aligns to (except document), and any extra popup content set by calling setExtraContent.
      *
      * @returns `this` to allow method chaining
      */
    def setAutoClose(/**
      * whether the Popup should close as soon as the focus leaves
      */
    bAutoClose: Boolean): this.type = js.native
    
    /**
      * @deprecated (since 1.75) - please use {@link #setExtraContent} instead.
      */
    def setAutoCloseAreas(): Unit = js.native
    
    /**
      * Sets the content this instance of the Popup should render. Content must be capable of being positioned
      * via position:absolute;
      *
      * @returns `this` to allow method chaining
      */
    def setContent(/**
      * The content of the popup
      */
    oContent: typings.openui5.sapUiCoreControlMod.default): this.type = js.native
    def setContent(/**
      * The content of the popup
      */
    oContent: Element): this.type = js.native
    
    /**
      * Sets the durations for opening and closing animations. Null values and values < 0 are ignored. A duration
      * of 0 means no animation.
      *
      * @returns `this` to allow method chaining
      */
    def setDurations(): this.type = js.native
    def setDurations(/**
      * in milliseconds
      */
    iOpenDuration: Unit, /**
      * in milliseconds
      */
    iCloseDuration: int): this.type = js.native
    def setDurations(/**
      * in milliseconds
      */
    iOpenDuration: int): this.type = js.native
    def setDurations(/**
      * in milliseconds
      */
    iOpenDuration: int, /**
      * in milliseconds
      */
    iCloseDuration: int): this.type = js.native
    
    /**
      * @SINCE 1.75
      *
      * Sets additional content that are considered part of the Popup.
      *
      * A popup with autoclose {@link #setAutoClose} enabled allows the focus to be moved into the extra content
      * without closing itself.
      *
      * A popup with modal {@link #setModal} enabled allows the focus to be shifted into the extra content without
      * taking it back to the previous focused element in the popup.
      *
      * @returns `this` to allow method chaining
      */
    def setExtraContent(
      /**
      * An array containing DOM elements, sap.ui.core.Element or an ID which are considered to be part of the
      * Popup; a value of null removes all previous content
      */
    aContent: js.Array[Element | String | typings.openui5.sapUiCoreElementMod.default]
    ): this.type = js.native
    
    /**
      * @SINCE 1.13.0
      *
      * This enabled/disables the Popup to follow its opening reference. If the Popup is open and a followOf
      * should be set the corresponding listener will be attached.
      */
    def setFollowOf(): Unit = js.native
    def setFollowOf(
      /**
      * a boolean value enabled/disables the default followOf-Handler. Or an individual handler can be given.
      * null deletes all followOf settings.
      */
    followOf: js.Function
    ): Unit = js.native
    def setFollowOf(
      /**
      * a boolean value enabled/disables the default followOf-Handler. Or an individual handler can be given.
      * null deletes all followOf settings.
      */
    followOf: Boolean
    ): Unit = js.native
    
    /**
      * Sets the ID of the element that should be focused once the popup opens. If the given ID is the ID of
      * an existing Control, this Control's focusDomRef will be focused instead, which may be an HTML element
      * with a different ID (usually a sub-element inside the Control). If no existing element ID is supplied
      * and the Popup is modal or auto-close, the Popup will instead focus the first focusable element.
      */
    def setInitialFocusId(/**
      * the ID of the DOM element to focus
      */
    sId: String): Unit = js.native
    
    /**
      * Used to specify whether the Popup should be modal. A modal popup will put some fading "block layer" over
      * the background and prevent attempts to put the focus outside/below the popup. Setting this while the
      * popup is open will change "block layer" immediately.
      *
      * @returns `this` to allow method chaining
      */
    def setModal(/**
      * whether the Popup is of modal type
      */
    bModal: Boolean): this.type = js.native
    def setModal(
      /**
      * whether the Popup is of modal type
      */
    bModal: Boolean,
      /**
      * a CSS class (or space-separated list of classes) that should be added to the block layer
      */
    sModalCSSClass: String
    ): this.type = js.native
    
    /**
      * Sets the position of the Popup (if you refer to a Control as anchor then do not use the DOMRef of the
      * control which might change after re-renderings). Optional parameters can only be omitted when all subsequent
      * parameters are omitted as well.
      *
      * @returns `this` to allow method chaining
      */
    def setPosition(
      /**
      * specifies which point of the given Content should be aligned
      */
    my: Dock,
      /**
      * specifies the point of the reference element to which the given Content should be aligned
      */
    at: Dock | Top,
      /**
      * specifies the reference element to which the given content should be aligned as specified in the other
      * parameters
      */
    of: js.UndefOr[
          String | typings.openui5.sapUiCoreElementMod.default | Element | jQuery[HTMLElement] | Event
        ],
      /**
      * the offset relative to the docking point, specified as a string with space-separated pixel values (e.g.
      * "0 10" to move the popup 10 pixels to the right). If the docking of both "my" and "at" are both RTL-sensitive
      * ("begin" or "end"), this offset is automatically mirrored in the RTL case as well.
      */
    offset: js.UndefOr[String],
      /**
      * defines how the position of an element should be adjusted in case it overflows the within area in some
      * direction.
      */
    collision: js.UndefOr[Collision],
      /**
      * defines the area the popup should be placed in. This affects the collision detection.
      */
    within: js.UndefOr[String | typings.openui5.sapUiCoreElementMod.default | Element | Window]
    ): this.type = js.native
    
    /**
      * Determines whether the Popup should have a shadow (in supporting browsers). This also affects a currently
      * open popup.
      *
      * @returns `this` to allow method chaining
      */
    def setShadow(/**
      * whether to show a shadow
      */
    bShowShadow: Boolean): this.type = js.native
  }
  
  trait PopupSettings
    extends StObject
       with ManagedObjectSettings {
    
    var closed: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
    
    var opened: js.UndefOr[js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default, Unit]] = js.undefined
  }
  object PopupSettings {
    
    inline def apply(): PopupSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupSettings] (val x: Self) extends AnyVal {
      
      inline def setClosed(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "closed", js.Any.fromFunction1(value))
      
      inline def setClosedUndefined: Self = StObject.set(x, "closed", js.undefined)
      
      inline def setOpened(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default => Unit): Self = StObject.set(x, "opened", js.Any.fromFunction1(value))
      
      inline def setOpenedUndefined: Self = StObject.set(x, "opened", js.undefined)
    }
  }
}
