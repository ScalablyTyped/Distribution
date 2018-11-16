package typings
package openui5Lib.sapNs.uiNs.coreNs.mvcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.core.mvc.View")
@js.native
class View protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
             * Constructor for a new View.Accepts an object literal <code>mSettings</code> that defines
             * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
             * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
             * object.
             * @param sId id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String) = this()
  /**
             * Constructor for a new View.Accepts an object literal <code>mSettings</code> that defines
             * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
             * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
             * object.
             * @param sId id for the new control, generated automatically if no id is given
             * @param mSettings initial settings for the new control
            */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
             * Adds some content to the aggregation <code>content</code>.
             * @param oContent the content to add; if empty, nothing is inserted
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def addContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): View = js.native
  /**
             * Attaches event handler <code>fnFunction</code> to the <code>afterInit</code> event of this
             * <code>sap.ui.core.mvc.View</code>.When called, the context of the event handler (its
             * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
             * to this <code>sap.ui.core.mvc.View</code> itself.Fired when the View has parsed the UI description
             * and instantiated the contained controls (/control tree).
             * @param oData An application-specific payload object that will be passed to the event handler along
             * with the event object when firing the event
             * @param fnFunction The function to be called when the event occurs
             * @param oListener Context object to call the event handler with. Defaults to this
             * <code>sap.ui.core.mvc.View</code> itself
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def attachAfterInit(oData: js.Any, fnFunction: js.Any): View = js.native
  /**
             * Attaches event handler <code>fnFunction</code> to the <code>afterInit</code> event of this
             * <code>sap.ui.core.mvc.View</code>.When called, the context of the event handler (its
             * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
             * to this <code>sap.ui.core.mvc.View</code> itself.Fired when the View has parsed the UI description
             * and instantiated the contained controls (/control tree).
             * @param oData An application-specific payload object that will be passed to the event handler along
             * with the event object when firing the event
             * @param fnFunction The function to be called when the event occurs
             * @param oListener Context object to call the event handler with. Defaults to this
             * <code>sap.ui.core.mvc.View</code> itself
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def attachAfterInit(oData: js.Any, fnFunction: js.Any, oListener: js.Any): View = js.native
  /**
             * Attaches event handler <code>fnFunction</code> to the <code>afterRendering</code> event of this
             * <code>sap.ui.core.mvc.View</code>.When called, the context of the event handler (its
             * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
             * to this <code>sap.ui.core.mvc.View</code> itself.Fired when the View has been (re-)rendered and its
             * HTML is present in the DOM.
             * @param oData An application-specific payload object that will be passed to the event handler along
             * with the event object when firing the event
             * @param fnFunction The function to be called when the event occurs
             * @param oListener Context object to call the event handler with. Defaults to this
             * <code>sap.ui.core.mvc.View</code> itself
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def attachAfterRendering(oData: js.Any, fnFunction: js.Any): View = js.native
  /**
             * Attaches event handler <code>fnFunction</code> to the <code>afterRendering</code> event of this
             * <code>sap.ui.core.mvc.View</code>.When called, the context of the event handler (its
             * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
             * to this <code>sap.ui.core.mvc.View</code> itself.Fired when the View has been (re-)rendered and its
             * HTML is present in the DOM.
             * @param oData An application-specific payload object that will be passed to the event handler along
             * with the event object when firing the event
             * @param fnFunction The function to be called when the event occurs
             * @param oListener Context object to call the event handler with. Defaults to this
             * <code>sap.ui.core.mvc.View</code> itself
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def attachAfterRendering(oData: js.Any, fnFunction: js.Any, oListener: js.Any): View = js.native
  /**
             * Attaches event handler <code>fnFunction</code> to the <code>beforeExit</code> event of this
             * <code>sap.ui.core.mvc.View</code>.When called, the context of the event handler (its
             * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
             * to this <code>sap.ui.core.mvc.View</code> itself.Fired when the view has received the request to
             * destroy itself, but before it has destroyed anything.
             * @param oData An application-specific payload object that will be passed to the event handler along
             * with the event object when firing the event
             * @param fnFunction The function to be called when the event occurs
             * @param oListener Context object to call the event handler with. Defaults to this
             * <code>sap.ui.core.mvc.View</code> itself
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def attachBeforeExit(oData: js.Any, fnFunction: js.Any): View = js.native
  /**
             * Attaches event handler <code>fnFunction</code> to the <code>beforeExit</code> event of this
             * <code>sap.ui.core.mvc.View</code>.When called, the context of the event handler (its
             * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
             * to this <code>sap.ui.core.mvc.View</code> itself.Fired when the view has received the request to
             * destroy itself, but before it has destroyed anything.
             * @param oData An application-specific payload object that will be passed to the event handler along
             * with the event object when firing the event
             * @param fnFunction The function to be called when the event occurs
             * @param oListener Context object to call the event handler with. Defaults to this
             * <code>sap.ui.core.mvc.View</code> itself
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def attachBeforeExit(oData: js.Any, fnFunction: js.Any, oListener: js.Any): View = js.native
  /**
             * Attaches event handler <code>fnFunction</code> to the <code>beforeRendering</code> event of this
             * <code>sap.ui.core.mvc.View</code>.When called, the context of the event handler (its
             * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
             * to this <code>sap.ui.core.mvc.View</code> itself.Fired before this View is re-rendered. Use to
             * unbind event handlers from HTML elements etc.
             * @param oData An application-specific payload object that will be passed to the event handler along
             * with the event object when firing the event
             * @param fnFunction The function to be called when the event occurs
             * @param oListener Context object to call the event handler with. Defaults to this
             * <code>sap.ui.core.mvc.View</code> itself
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def attachBeforeRendering(oData: js.Any, fnFunction: js.Any): View = js.native
  /**
             * Attaches event handler <code>fnFunction</code> to the <code>beforeRendering</code> event of this
             * <code>sap.ui.core.mvc.View</code>.When called, the context of the event handler (its
             * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
             * to this <code>sap.ui.core.mvc.View</code> itself.Fired before this View is re-rendered. Use to
             * unbind event handlers from HTML elements etc.
             * @param oData An application-specific payload object that will be passed to the event handler along
             * with the event object when firing the event
             * @param fnFunction The function to be called when the event occurs
             * @param oListener Context object to call the event handler with. Defaults to this
             * <code>sap.ui.core.mvc.View</code> itself
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def attachBeforeRendering(oData: js.Any, fnFunction: js.Any, oListener: js.Any): View = js.native
  /**
             * Returns an element by its ID in the context of the view.
             * @param sId View local ID of the element
             * @returns element by its ID or <code>undefined</code>
            */
  def byId(sId: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
             * Convert the given view local element ID to a globally unique IDby prefixing it with the view ID.
             * @param sId View local ID of the element
             * @returns prefixed id
            */
  def createId(sId: java.lang.String): java.lang.String = js.native
  /**
             * Destroys all the content in the aggregation <code>content</code>.
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def destroyContent(): View = js.native
  /**
             * Detaches event handler <code>fnFunction</code> from the <code>afterInit</code> event of this
             * <code>sap.ui.core.mvc.View</code>.The passed function and listener object must match the ones used
             * for event registration.
             * @param fnFunction The function to be called, when the event occurs
             * @param oListener Context object on which the given function had to be called
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def detachAfterInit(fnFunction: js.Any, oListener: js.Any): View = js.native
  /**
             * Detaches event handler <code>fnFunction</code> from the <code>afterRendering</code> event of this
             * <code>sap.ui.core.mvc.View</code>.The passed function and listener object must match the ones used
             * for event registration.
             * @param fnFunction The function to be called, when the event occurs
             * @param oListener Context object on which the given function had to be called
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def detachAfterRendering(fnFunction: js.Any, oListener: js.Any): View = js.native
  /**
             * Detaches event handler <code>fnFunction</code> from the <code>beforeExit</code> event of this
             * <code>sap.ui.core.mvc.View</code>.The passed function and listener object must match the ones used
             * for event registration.
             * @param fnFunction The function to be called, when the event occurs
             * @param oListener Context object on which the given function had to be called
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def detachBeforeExit(fnFunction: js.Any, oListener: js.Any): View = js.native
  /**
             * Detaches event handler <code>fnFunction</code> from the <code>beforeRendering</code> event of this
             * <code>sap.ui.core.mvc.View</code>.The passed function and listener object must match the ones used
             * for event registration.
             * @param fnFunction The function to be called, when the event occurs
             * @param oListener Context object on which the given function had to be called
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def detachBeforeRendering(fnFunction: js.Any, oListener: js.Any): View = js.native
  /**
             * Fires event <code>afterInit</code> to attached listeners.
             * @param mArguments The arguments to pass along with the event
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def fireAfterInit(mArguments: js.Any): View = js.native
  /**
             * Fires event <code>afterRendering</code> to attached listeners.
             * @param mArguments The arguments to pass along with the event
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def fireAfterRendering(mArguments: js.Any): View = js.native
  /**
             * Fires event <code>beforeExit</code> to attached listeners.
             * @param mArguments The arguments to pass along with the event
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def fireBeforeExit(mArguments: js.Any): View = js.native
  /**
             * Fires event <code>beforeRendering</code> to attached listeners.
             * @param mArguments The arguments to pass along with the event
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def fireBeforeRendering(mArguments: js.Any): View = js.native
  /**
             * Gets content of aggregation <code>content</code>.Child Controls of the view
            */
  def getContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
             * Returns the view's Controller instance or null for a controller-less View.
             * @returns Controller of this view.
            */
  def getController(): js.Any = js.native
  /**
             * An (optional) method to be implemented by Views. When no controller instance is given at View
             * instantiation timeAND this method exists and returns the (package and class) name of a controller,
             * the View tries to load andinstantiate the controller and to connect it to itself.
             * @returns the name of the controller
            */
  def getControllerName(): java.lang.String = js.native
  /**
             * Gets current value of property <code>displayBlock</code>.Whether the CSS display should be set to
             * "block".Set this to "true" if the default display "inline-block" causes a vertical scrollbar with
             * Views that are set to 100% height.Do not set this to "true" if you want to display other content in
             * the same HTML parent on either side of the View (setting to "true" may push that other content to
             * the next/previous line).Default value is <code>false</code>.
             * @returns Value of property <code>displayBlock</code>
            */
  def getDisplayBlock(): scala.Boolean = js.native
  /**
             * Gets current value of property <code>height</code>.The height
             * @returns Value of property <code>height</code>
            */
  def getHeight(): js.Any = js.native
  /**
             * Returns the local ID of an element by removing the view ID prefix or<code>null</code> if the ID does
             * not contain a prefix.
             * @since 1.39.0
             * @param sId Prefixed ID
             * @returns ID without prefix or <code>null</code>
            */
  def getLocalId(sId: java.lang.String): java.lang.String = js.native
  /**
             * Returns the info object which is also passed to the preprocessors
             * @param bSync Describes the view execution, true if sync
             * @returns Info object for the view
            */
  def getPreprocessorInfo(bSync: scala.Boolean): js.Any = js.native
  /**
             * Returns user specific data object
             * @returns viewData
            */
  def getViewData(): js.Any = js.native
  /**
             * Gets current value of property <code>viewName</code>.Name of the View
             * @returns Value of property <code>viewName</code>
            */
  def getViewName(): java.lang.String = js.native
  /**
             * Gets current value of property <code>width</code>.The widthDefault value is <code>100%</code>.
             * @returns Value of property <code>width</code>
            */
  def getWidth(): js.Any = js.native
  /**
             * Checks if any preprocessors are active for the specified type
             * @param sType Type of the preprocessor, e.g. "raw", "xml" or "controls"
             * @returns <code>true</code> if a preprocessor is active
            */
  def hasPreprocessor(sType: java.lang.String): scala.Boolean = js.native
  /**
             * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
             * returns its index if found or -1 otherwise.
             * @param oContent The content whose index is looked for
             * @returns The index of the provided control in the aggregation if found, or -1 otherwise
            */
  def indexOfContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
             * Inserts a content into the aggregation <code>content</code>.
             * @param oContent the content to insert; if empty, nothing is inserted
             * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
             * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
             *  greater than the current size of the aggregation, the content is inserted at             the last
             * position
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def insertContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): View = js.native
  /**
             * Creates a Promise representing the state of the view initialization.For views that are loading
             * asynchronously (by setting async=true) this Promise is created by viewinitialization. Synchronously
             * loading views get wrapped in an immediately resolving Promise.
             * @since 1.30
             * @returns resolves with the complete view instance, reject with any thrown error
            */
  def loaded(): jqueryLib.JQueryPromise[_] = js.native
  /**
             * Register a preprocessor for all views of a specific type.The preprocessor can be registered for
             * several stages of view initialization, which aredependant from the view type, e.g. "raw", "xml" or
             * already initialized "controls". If there is a preprocessorpassed to or activated at the view
             * instance already, that one is used. When several preprocessors are registeredfor one hook, it has to
             * be made sure that they do not conflict when beeing processed serially.It can be either a module name
             * as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor} or afunction with a
             * signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.<strong>Note</strong>:
             * Preprocessors only work in async views and will be ignored when the view is instantiatedin sync mode
             * by default, as this could have unexpected side effects. You may override this behaviour by setting
             * the<code>bSyncSupport</code> flag to <code>true</code>.
             * @param sType the type of content to be processed
             * @param vPreprocessor module path of the preprocessor implementation or a preprocessor function
             * @param sViewType type of the calling view, e.g. <code>XML</code>
             * @param bSyncSupport declares if the vPreprocessor ensures safe sync processing. This means the
             * preprocessor will be executed		also for sync views. Please be aware that any kind of async
             * processing (like Promises, XHR, etc) may		break the view initialization and lead to unexpected
             * results.
             * @param bOnDemand on-demand preprocessor which enables developers to quickly activate the
             * preprocessor for a view,		by setting <code>preprocessors : { xml }</code>, for example. This should
             * be false except for very special		cases. There can only be one on-demand preprocessor per content
             * type.
             * @param mSettings optional configuration for preprocessor
            */
  def registerPreprocessor(sType: java.lang.String, vPreprocessor: java.lang.String, bSyncSupport: scala.Boolean): scala.Unit = js.native
  /**
             * Register a preprocessor for all views of a specific type.The preprocessor can be registered for
             * several stages of view initialization, which aredependant from the view type, e.g. "raw", "xml" or
             * already initialized "controls". If there is a preprocessorpassed to or activated at the view
             * instance already, that one is used. When several preprocessors are registeredfor one hook, it has to
             * be made sure that they do not conflict when beeing processed serially.It can be either a module name
             * as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor} or afunction with a
             * signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.<strong>Note</strong>:
             * Preprocessors only work in async views and will be ignored when the view is instantiatedin sync mode
             * by default, as this could have unexpected side effects. You may override this behaviour by setting
             * the<code>bSyncSupport</code> flag to <code>true</code>.
             * @param sType the type of content to be processed
             * @param vPreprocessor module path of the preprocessor implementation or a preprocessor function
             * @param sViewType type of the calling view, e.g. <code>XML</code>
             * @param bSyncSupport declares if the vPreprocessor ensures safe sync processing. This means the
             * preprocessor will be executed		also for sync views. Please be aware that any kind of async
             * processing (like Promises, XHR, etc) may		break the view initialization and lead to unexpected
             * results.
             * @param bOnDemand on-demand preprocessor which enables developers to quickly activate the
             * preprocessor for a view,		by setting <code>preprocessors : { xml }</code>, for example. This should
             * be false except for very special		cases. There can only be one on-demand preprocessor per content
             * type.
             * @param mSettings optional configuration for preprocessor
            */
  def registerPreprocessor(
    sType: java.lang.String,
    vPreprocessor: java.lang.String,
    bSyncSupport: scala.Boolean,
    bOnDemand: scala.Boolean
  ): scala.Unit = js.native
  /**
             * Register a preprocessor for all views of a specific type.The preprocessor can be registered for
             * several stages of view initialization, which aredependant from the view type, e.g. "raw", "xml" or
             * already initialized "controls". If there is a preprocessorpassed to or activated at the view
             * instance already, that one is used. When several preprocessors are registeredfor one hook, it has to
             * be made sure that they do not conflict when beeing processed serially.It can be either a module name
             * as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor} or afunction with a
             * signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.<strong>Note</strong>:
             * Preprocessors only work in async views and will be ignored when the view is instantiatedin sync mode
             * by default, as this could have unexpected side effects. You may override this behaviour by setting
             * the<code>bSyncSupport</code> flag to <code>true</code>.
             * @param sType the type of content to be processed
             * @param vPreprocessor module path of the preprocessor implementation or a preprocessor function
             * @param sViewType type of the calling view, e.g. <code>XML</code>
             * @param bSyncSupport declares if the vPreprocessor ensures safe sync processing. This means the
             * preprocessor will be executed		also for sync views. Please be aware that any kind of async
             * processing (like Promises, XHR, etc) may		break the view initialization and lead to unexpected
             * results.
             * @param bOnDemand on-demand preprocessor which enables developers to quickly activate the
             * preprocessor for a view,		by setting <code>preprocessors : { xml }</code>, for example. This should
             * be false except for very special		cases. There can only be one on-demand preprocessor per content
             * type.
             * @param mSettings optional configuration for preprocessor
            */
  def registerPreprocessor(
    sType: java.lang.String,
    vPreprocessor: java.lang.String,
    bSyncSupport: scala.Boolean,
    bOnDemand: scala.Boolean,
    mSettings: js.Any
  ): scala.Unit = js.native
  /**
             * Register a preprocessor for all views of a specific type.The preprocessor can be registered for
             * several stages of view initialization, which aredependant from the view type, e.g. "raw", "xml" or
             * already initialized "controls". If there is a preprocessorpassed to or activated at the view
             * instance already, that one is used. When several preprocessors are registeredfor one hook, it has to
             * be made sure that they do not conflict when beeing processed serially.It can be either a module name
             * as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor} or afunction with a
             * signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.<strong>Note</strong>:
             * Preprocessors only work in async views and will be ignored when the view is instantiatedin sync mode
             * by default, as this could have unexpected side effects. You may override this behaviour by setting
             * the<code>bSyncSupport</code> flag to <code>true</code>.
             * @param sType the type of content to be processed
             * @param vPreprocessor module path of the preprocessor implementation or a preprocessor function
             * @param sViewType type of the calling view, e.g. <code>XML</code>
             * @param bSyncSupport declares if the vPreprocessor ensures safe sync processing. This means the
             * preprocessor will be executed		also for sync views. Please be aware that any kind of async
             * processing (like Promises, XHR, etc) may		break the view initialization and lead to unexpected
             * results.
             * @param bOnDemand on-demand preprocessor which enables developers to quickly activate the
             * preprocessor for a view,		by setting <code>preprocessors : { xml }</code>, for example. This should
             * be false except for very special		cases. There can only be one on-demand preprocessor per content
             * type.
             * @param mSettings optional configuration for preprocessor
            */
  def registerPreprocessor(sType: java.lang.String, vPreprocessor: js.Any, bSyncSupport: scala.Boolean): scala.Unit = js.native
  /**
             * Register a preprocessor for all views of a specific type.The preprocessor can be registered for
             * several stages of view initialization, which aredependant from the view type, e.g. "raw", "xml" or
             * already initialized "controls". If there is a preprocessorpassed to or activated at the view
             * instance already, that one is used. When several preprocessors are registeredfor one hook, it has to
             * be made sure that they do not conflict when beeing processed serially.It can be either a module name
             * as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor} or afunction with a
             * signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.<strong>Note</strong>:
             * Preprocessors only work in async views and will be ignored when the view is instantiatedin sync mode
             * by default, as this could have unexpected side effects. You may override this behaviour by setting
             * the<code>bSyncSupport</code> flag to <code>true</code>.
             * @param sType the type of content to be processed
             * @param vPreprocessor module path of the preprocessor implementation or a preprocessor function
             * @param sViewType type of the calling view, e.g. <code>XML</code>
             * @param bSyncSupport declares if the vPreprocessor ensures safe sync processing. This means the
             * preprocessor will be executed		also for sync views. Please be aware that any kind of async
             * processing (like Promises, XHR, etc) may		break the view initialization and lead to unexpected
             * results.
             * @param bOnDemand on-demand preprocessor which enables developers to quickly activate the
             * preprocessor for a view,		by setting <code>preprocessors : { xml }</code>, for example. This should
             * be false except for very special		cases. There can only be one on-demand preprocessor per content
             * type.
             * @param mSettings optional configuration for preprocessor
            */
  def registerPreprocessor(
    sType: java.lang.String,
    vPreprocessor: js.Any,
    bSyncSupport: scala.Boolean,
    bOnDemand: scala.Boolean
  ): scala.Unit = js.native
  /**
             * Register a preprocessor for all views of a specific type.The preprocessor can be registered for
             * several stages of view initialization, which aredependant from the view type, e.g. "raw", "xml" or
             * already initialized "controls". If there is a preprocessorpassed to or activated at the view
             * instance already, that one is used. When several preprocessors are registeredfor one hook, it has to
             * be made sure that they do not conflict when beeing processed serially.It can be either a module name
             * as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor} or afunction with a
             * signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.<strong>Note</strong>:
             * Preprocessors only work in async views and will be ignored when the view is instantiatedin sync mode
             * by default, as this could have unexpected side effects. You may override this behaviour by setting
             * the<code>bSyncSupport</code> flag to <code>true</code>.
             * @param sType the type of content to be processed
             * @param vPreprocessor module path of the preprocessor implementation or a preprocessor function
             * @param sViewType type of the calling view, e.g. <code>XML</code>
             * @param bSyncSupport declares if the vPreprocessor ensures safe sync processing. This means the
             * preprocessor will be executed		also for sync views. Please be aware that any kind of async
             * processing (like Promises, XHR, etc) may		break the view initialization and lead to unexpected
             * results.
             * @param bOnDemand on-demand preprocessor which enables developers to quickly activate the
             * preprocessor for a view,		by setting <code>preprocessors : { xml }</code>, for example. This should
             * be false except for very special		cases. There can only be one on-demand preprocessor per content
             * type.
             * @param mSettings optional configuration for preprocessor
            */
  def registerPreprocessor(
    sType: java.lang.String,
    vPreprocessor: js.Any,
    bSyncSupport: scala.Boolean,
    bOnDemand: scala.Boolean,
    mSettings: js.Any
  ): scala.Unit = js.native
  /**
             * Register a preprocessor for all views of a specific type.The preprocessor can be registered for
             * several stages of view initialization, which aredependant from the view type, e.g. "raw", "xml" or
             * already initialized "controls". If there is a preprocessorpassed to or activated at the view
             * instance already, that one is used. When several preprocessors are registeredfor one hook, it has to
             * be made sure that they do not conflict when beeing processed serially.It can be either a module name
             * as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor} or afunction with a
             * signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.<strong>Note</strong>:
             * Preprocessors only work in async views and will be ignored when the view is instantiatedin sync mode
             * by default, as this could have unexpected side effects. You may override this behaviour by setting
             * the<code>bSyncSupport</code> flag to <code>true</code>.
             * @param sType the type of content to be processed
             * @param vPreprocessor module path of the preprocessor implementation or a preprocessor function
             * @param sViewType type of the calling view, e.g. <code>XML</code>
             * @param bSyncSupport declares if the vPreprocessor ensures safe sync processing. This means the
             * preprocessor will be executed		also for sync views. Please be aware that any kind of async
             * processing (like Promises, XHR, etc) may		break the view initialization and lead to unexpected
             * results.
             * @param bOnDemand on-demand preprocessor which enables developers to quickly activate the
             * preprocessor for a view,		by setting <code>preprocessors : { xml }</code>, for example. This should
             * be false except for very special		cases. There can only be one on-demand preprocessor per content
             * type.
             * @param mSettings optional configuration for preprocessor
            */
  def registerPreprocessor(
    sType: openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType,
    vPreprocessor: java.lang.String,
    bSyncSupport: scala.Boolean
  ): scala.Unit = js.native
  /**
             * Register a preprocessor for all views of a specific type.The preprocessor can be registered for
             * several stages of view initialization, which aredependant from the view type, e.g. "raw", "xml" or
             * already initialized "controls". If there is a preprocessorpassed to or activated at the view
             * instance already, that one is used. When several preprocessors are registeredfor one hook, it has to
             * be made sure that they do not conflict when beeing processed serially.It can be either a module name
             * as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor} or afunction with a
             * signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.<strong>Note</strong>:
             * Preprocessors only work in async views and will be ignored when the view is instantiatedin sync mode
             * by default, as this could have unexpected side effects. You may override this behaviour by setting
             * the<code>bSyncSupport</code> flag to <code>true</code>.
             * @param sType the type of content to be processed
             * @param vPreprocessor module path of the preprocessor implementation or a preprocessor function
             * @param sViewType type of the calling view, e.g. <code>XML</code>
             * @param bSyncSupport declares if the vPreprocessor ensures safe sync processing. This means the
             * preprocessor will be executed		also for sync views. Please be aware that any kind of async
             * processing (like Promises, XHR, etc) may		break the view initialization and lead to unexpected
             * results.
             * @param bOnDemand on-demand preprocessor which enables developers to quickly activate the
             * preprocessor for a view,		by setting <code>preprocessors : { xml }</code>, for example. This should
             * be false except for very special		cases. There can only be one on-demand preprocessor per content
             * type.
             * @param mSettings optional configuration for preprocessor
            */
  def registerPreprocessor(
    sType: openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType,
    vPreprocessor: java.lang.String,
    bSyncSupport: scala.Boolean,
    bOnDemand: scala.Boolean
  ): scala.Unit = js.native
  /**
             * Register a preprocessor for all views of a specific type.The preprocessor can be registered for
             * several stages of view initialization, which aredependant from the view type, e.g. "raw", "xml" or
             * already initialized "controls". If there is a preprocessorpassed to or activated at the view
             * instance already, that one is used. When several preprocessors are registeredfor one hook, it has to
             * be made sure that they do not conflict when beeing processed serially.It can be either a module name
             * as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor} or afunction with a
             * signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.<strong>Note</strong>:
             * Preprocessors only work in async views and will be ignored when the view is instantiatedin sync mode
             * by default, as this could have unexpected side effects. You may override this behaviour by setting
             * the<code>bSyncSupport</code> flag to <code>true</code>.
             * @param sType the type of content to be processed
             * @param vPreprocessor module path of the preprocessor implementation or a preprocessor function
             * @param sViewType type of the calling view, e.g. <code>XML</code>
             * @param bSyncSupport declares if the vPreprocessor ensures safe sync processing. This means the
             * preprocessor will be executed		also for sync views. Please be aware that any kind of async
             * processing (like Promises, XHR, etc) may		break the view initialization and lead to unexpected
             * results.
             * @param bOnDemand on-demand preprocessor which enables developers to quickly activate the
             * preprocessor for a view,		by setting <code>preprocessors : { xml }</code>, for example. This should
             * be false except for very special		cases. There can only be one on-demand preprocessor per content
             * type.
             * @param mSettings optional configuration for preprocessor
            */
  def registerPreprocessor(
    sType: openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType,
    vPreprocessor: java.lang.String,
    bSyncSupport: scala.Boolean,
    bOnDemand: scala.Boolean,
    mSettings: js.Any
  ): scala.Unit = js.native
  /**
             * Register a preprocessor for all views of a specific type.The preprocessor can be registered for
             * several stages of view initialization, which aredependant from the view type, e.g. "raw", "xml" or
             * already initialized "controls". If there is a preprocessorpassed to or activated at the view
             * instance already, that one is used. When several preprocessors are registeredfor one hook, it has to
             * be made sure that they do not conflict when beeing processed serially.It can be either a module name
             * as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor} or afunction with a
             * signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.<strong>Note</strong>:
             * Preprocessors only work in async views and will be ignored when the view is instantiatedin sync mode
             * by default, as this could have unexpected side effects. You may override this behaviour by setting
             * the<code>bSyncSupport</code> flag to <code>true</code>.
             * @param sType the type of content to be processed
             * @param vPreprocessor module path of the preprocessor implementation or a preprocessor function
             * @param sViewType type of the calling view, e.g. <code>XML</code>
             * @param bSyncSupport declares if the vPreprocessor ensures safe sync processing. This means the
             * preprocessor will be executed		also for sync views. Please be aware that any kind of async
             * processing (like Promises, XHR, etc) may		break the view initialization and lead to unexpected
             * results.
             * @param bOnDemand on-demand preprocessor which enables developers to quickly activate the
             * preprocessor for a view,		by setting <code>preprocessors : { xml }</code>, for example. This should
             * be false except for very special		cases. There can only be one on-demand preprocessor per content
             * type.
             * @param mSettings optional configuration for preprocessor
            */
  def registerPreprocessor(
    sType: openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType,
    vPreprocessor: js.Any,
    bSyncSupport: scala.Boolean
  ): scala.Unit = js.native
  /**
             * Register a preprocessor for all views of a specific type.The preprocessor can be registered for
             * several stages of view initialization, which aredependant from the view type, e.g. "raw", "xml" or
             * already initialized "controls". If there is a preprocessorpassed to or activated at the view
             * instance already, that one is used. When several preprocessors are registeredfor one hook, it has to
             * be made sure that they do not conflict when beeing processed serially.It can be either a module name
             * as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor} or afunction with a
             * signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.<strong>Note</strong>:
             * Preprocessors only work in async views and will be ignored when the view is instantiatedin sync mode
             * by default, as this could have unexpected side effects. You may override this behaviour by setting
             * the<code>bSyncSupport</code> flag to <code>true</code>.
             * @param sType the type of content to be processed
             * @param vPreprocessor module path of the preprocessor implementation or a preprocessor function
             * @param sViewType type of the calling view, e.g. <code>XML</code>
             * @param bSyncSupport declares if the vPreprocessor ensures safe sync processing. This means the
             * preprocessor will be executed		also for sync views. Please be aware that any kind of async
             * processing (like Promises, XHR, etc) may		break the view initialization and lead to unexpected
             * results.
             * @param bOnDemand on-demand preprocessor which enables developers to quickly activate the
             * preprocessor for a view,		by setting <code>preprocessors : { xml }</code>, for example. This should
             * be false except for very special		cases. There can only be one on-demand preprocessor per content
             * type.
             * @param mSettings optional configuration for preprocessor
            */
  def registerPreprocessor(
    sType: openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType,
    vPreprocessor: js.Any,
    bSyncSupport: scala.Boolean,
    bOnDemand: scala.Boolean
  ): scala.Unit = js.native
  /**
             * Register a preprocessor for all views of a specific type.The preprocessor can be registered for
             * several stages of view initialization, which aredependant from the view type, e.g. "raw", "xml" or
             * already initialized "controls". If there is a preprocessorpassed to or activated at the view
             * instance already, that one is used. When several preprocessors are registeredfor one hook, it has to
             * be made sure that they do not conflict when beeing processed serially.It can be either a module name
             * as string of an implementation of {@link sap.ui.core.mvc.View.Preprocessor} or afunction with a
             * signature according to {@link sap.ui.core.mvc.View.Preprocessor.process}.<strong>Note</strong>:
             * Preprocessors only work in async views and will be ignored when the view is instantiatedin sync mode
             * by default, as this could have unexpected side effects. You may override this behaviour by setting
             * the<code>bSyncSupport</code> flag to <code>true</code>.
             * @param sType the type of content to be processed
             * @param vPreprocessor module path of the preprocessor implementation or a preprocessor function
             * @param sViewType type of the calling view, e.g. <code>XML</code>
             * @param bSyncSupport declares if the vPreprocessor ensures safe sync processing. This means the
             * preprocessor will be executed		also for sync views. Please be aware that any kind of async
             * processing (like Promises, XHR, etc) may		break the view initialization and lead to unexpected
             * results.
             * @param bOnDemand on-demand preprocessor which enables developers to quickly activate the
             * preprocessor for a view,		by setting <code>preprocessors : { xml }</code>, for example. This should
             * be false except for very special		cases. There can only be one on-demand preprocessor per content
             * type.
             * @param mSettings optional configuration for preprocessor
            */
  def registerPreprocessor(
    sType: openui5Lib.sapNs.uiNs.coreNs.mvcNs.XMLViewNs.PreprocessorType,
    vPreprocessor: js.Any,
    bSyncSupport: scala.Boolean,
    bOnDemand: scala.Boolean,
    mSettings: js.Any
  ): scala.Unit = js.native
  /**
             * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
             * from the hosting UIArea.
             * @returns An array of the removed elements (might be empty)
            */
  def removeAllContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
             * Removes a content from the aggregation <code>content</code>.
             * @param vContent The content to remove or its index or id
             * @returns The removed content or <code>null</code>
            */
  def removeContent(vContent: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
             * Removes a content from the aggregation <code>content</code>.
             * @param vContent The content to remove or its index or id
             * @returns The removed content or <code>null</code>
            */
  def removeContent(vContent: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
             * Removes a content from the aggregation <code>content</code>.
             * @param vContent The content to remove or its index or id
             * @returns The removed content or <code>null</code>
            */
  def removeContent(vContent: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
             * Executes preprocessors for a type of source
             * @param sType the type of preprocessor, e.g. "raw", "xml" or "controls"
             * @param vSource the view source as a JSON object, a raw text, an XML document element or a Promise
             * resolving with those
             * @param bSync describes the view execution, true if sync
             * @returns a promise resolving with the processed source or an error | the source when bSync=true
            */
  def runPreprocessor(sType: java.lang.String, vSource: java.lang.String): jqueryLib.JQueryPromise[_] | js.Any | java.lang.String | openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
             * Executes preprocessors for a type of source
             * @param sType the type of preprocessor, e.g. "raw", "xml" or "controls"
             * @param vSource the view source as a JSON object, a raw text, an XML document element or a Promise
             * resolving with those
             * @param bSync describes the view execution, true if sync
             * @returns a promise resolving with the processed source or an error | the source when bSync=true
            */
  def runPreprocessor(sType: java.lang.String, vSource: java.lang.String, bSync: scala.Boolean): jqueryLib.JQueryPromise[_] | js.Any | java.lang.String | openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
             * Executes preprocessors for a type of source
             * @param sType the type of preprocessor, e.g. "raw", "xml" or "controls"
             * @param vSource the view source as a JSON object, a raw text, an XML document element or a Promise
             * resolving with those
             * @param bSync describes the view execution, true if sync
             * @returns a promise resolving with the processed source or an error | the source when bSync=true
            */
  def runPreprocessor(sType: java.lang.String, vSource: js.Any): jqueryLib.JQueryPromise[_] | js.Any | java.lang.String | openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
             * Executes preprocessors for a type of source
             * @param sType the type of preprocessor, e.g. "raw", "xml" or "controls"
             * @param vSource the view source as a JSON object, a raw text, an XML document element or a Promise
             * resolving with those
             * @param bSync describes the view execution, true if sync
             * @returns a promise resolving with the processed source or an error | the source when bSync=true
            */
  def runPreprocessor(sType: java.lang.String, vSource: js.Any, bSync: scala.Boolean): jqueryLib.JQueryPromise[_] | js.Any | java.lang.String | openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
             * Executes preprocessors for a type of source
             * @param sType the type of preprocessor, e.g. "raw", "xml" or "controls"
             * @param vSource the view source as a JSON object, a raw text, an XML document element or a Promise
             * resolving with those
             * @param bSync describes the view execution, true if sync
             * @returns a promise resolving with the processed source or an error | the source when bSync=true
            */
  def runPreprocessor(sType: java.lang.String, vSource: openui5Lib.sapNs.uiNs.coreNs.Element): jqueryLib.JQueryPromise[_] | js.Any | java.lang.String | openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
             * Executes preprocessors for a type of source
             * @param sType the type of preprocessor, e.g. "raw", "xml" or "controls"
             * @param vSource the view source as a JSON object, a raw text, an XML document element or a Promise
             * resolving with those
             * @param bSync describes the view execution, true if sync
             * @returns a promise resolving with the processed source or an error | the source when bSync=true
            */
  def runPreprocessor(sType: java.lang.String, vSource: openui5Lib.sapNs.uiNs.coreNs.Element, bSync: scala.Boolean): jqueryLib.JQueryPromise[_] | js.Any | java.lang.String | openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
             * Sets a new value for property <code>displayBlock</code>.Whether the CSS display should be set to
             * "block".Set this to "true" if the default display "inline-block" causes a vertical scrollbar with
             * Views that are set to 100% height.Do not set this to "true" if you want to display other content in
             * the same HTML parent on either side of the View (setting to "true" may push that other content to
             * the next/previous line).When called with a value of <code>null</code> or <code>undefined</code>, the
             * default value of the property will be restored.Default value is <code>false</code>.
             * @param bDisplayBlock New value for property <code>displayBlock</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setDisplayBlock(bDisplayBlock: scala.Boolean): View = js.native
  /**
             * Sets a new value for property <code>height</code>.The heightWhen called with a value of
             * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
             * @param sHeight New value for property <code>height</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setHeight(sHeight: js.Any): View = js.native
  /**
             * Sets a new value for property <code>viewName</code>.Name of the ViewWhen called with a value of
             * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
             * @param sViewName New value for property <code>viewName</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setViewName(sViewName: java.lang.String): View = js.native
  /**
             * Sets a new value for property <code>width</code>.The widthWhen called with a value of
             * <code>null</code> or <code>undefined</code>, the default value of the property will be
             * restored.Default value is <code>100%</code>.
             * @param sWidth New value for property <code>width</code>
             * @returns Reference to <code>this</code> in order to allow method chaining
            */
  def setWidth(sWidth: js.Any): View = js.native
}

