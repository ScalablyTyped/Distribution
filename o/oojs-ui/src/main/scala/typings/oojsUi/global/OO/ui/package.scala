package typings.oojsUi.global.OO.ui

import typings.jquery.JQuery
import typings.jquery.JQuery.Promise
import typings.oojsUi.OO.ui.MessageDialog.SetupDataMap
import typings.oojsUi.OO.ui.PromptOptions
import typings.oojsUi.OO.ui.Rectangle
import typings.oojsUi.OO.ui.Theme
import typings.oojsUi.OO.ui.ThemeConstructor
import typings.oojsUi.global.OO.ui.^
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Theme_ : ThemeConstructor = ^.asInstanceOf[js.Dynamic].selectDynamic("Theme").asInstanceOf[ThemeConstructor]

inline def alert(text: String): Promise[Unit, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(text.asInstanceOf[js.Any]).asInstanceOf[Promise[Unit, Any, Any]]
inline def alert(text: String, options: SetupDataMap): Promise[Unit, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit, Any, Any]]
/**
  * Display a quick modal alert dialog, using a OO.ui.MessageDialog. While the dialog is open,
  * the rest of the page will be dimmed out and the user won't be able to interact with it.
  * The dialog has only one action button, labelled "OK", clicking it will simply close the
  * dialog.
  *
  * A window manager is created automatically when this function is called for the first time.
  *
  *     OO.ui.alert( 'Something happened!' ).done( function () {
  *         console.log( 'User closed the dialog.' );
  *     } );
  *
  *     OO.ui.alert( 'Something larger happened!', { size: 'large' } );
  *
  * ResourceLoader module: `oojs-ui-windows`
  *
  * @param text Message text to display
  * @param options Additional options, see {@link OO.ui.MessageDialog.getSetupProcess}
  * @return Promise resolved when the user closes the dialog
  */
inline def alert(text: JQuery[HTMLElement]): Promise[Unit, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("alert")(text.asInstanceOf[js.Any]).asInstanceOf[Promise[Unit, Any, Any]]
inline def alert(text: JQuery[HTMLElement], options: SetupDataMap): Promise[Unit, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("alert")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit, Any, Any]]

inline def confirm(text: String): Promise[Boolean, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(text.asInstanceOf[js.Any]).asInstanceOf[Promise[Boolean, Any, Any]]
inline def confirm(text: String, options: SetupDataMap): Promise[Boolean, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Boolean, Any, Any]]
/**
  * Display a quick modal confirmation dialog, using a OO.ui.MessageDialog. While the dialog
  * is open, the rest of the page will be dimmed out and the user won't be able to interact
  * with it. The dialog has two action buttons, one to confirm an operation (labelled "OK")
  * and one to cancel it (labelled "Cancel").
  *
  * A window manager is created automatically when this function is called for the first time.
  *
  *     OO.ui.confirm( 'Are you sure?' ).done( function ( confirmed ) {
  *         if ( confirmed ) {
  *             console.log( 'User clicked "OK"!' );
  *         } else {
  *             console.log( 'User clicked "Cancel" or closed the dialog.' );
  *         }
  *     } );
  *
  * ResourceLoader module: `oojs-ui-windows`
  *
  * @param text Message text to display
  * @param options Additional options, see {@link OO.ui.MessageDialog.getSetupProcess}
  * @return Promise resolved when the user closes the dialog. If the user chose to
  *  confirm, the promise will resolve to boolean `true`; otherwise, it will resolve to
  *  boolean `false`.
  */
inline def confirm(text: JQuery[HTMLElement]): Promise[Boolean, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(text.asInstanceOf[js.Any]).asInstanceOf[Promise[Boolean, Any, Any]]
inline def confirm(text: JQuery[HTMLElement], options: SetupDataMap): Promise[Boolean, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("confirm")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[Boolean, Any, Any]]

inline def contains(containers: js.Array[HTMLElement], contained: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(containers.asInstanceOf[js.Any], contained.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def contains(containers: js.Array[HTMLElement], contained: HTMLElement, matchContainers: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(containers.asInstanceOf[js.Any], contained.asInstanceOf[js.Any], matchContainers.asInstanceOf[js.Any])).asInstanceOf[Boolean]
/**
  * Check if a node is contained within another node.
  *
  * Similar to {@link JQueryStatic.contains $.contains} except a list of containers can be
  * supplied and a boolean argument allows you to include the container in the match list
  *
  * @param containers Container node(s) to search in
  * @param contained Node to find
  * @param matchContainers Include the container(s) in the list of nodes to match,
  *  otherwise only match descendants
  * @return The node is in the list of target nodes
  */
inline def contains(containers: HTMLElement, contained: HTMLElement): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(containers.asInstanceOf[js.Any], contained.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def contains(containers: HTMLElement, contained: HTMLElement, matchContainers: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(containers.asInstanceOf[js.Any], contained.asInstanceOf[js.Any], matchContainers.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
  * Return a function, that, as long as it continues to be invoked, will not
  * be triggered. The function will be called after it stops being called for
  * N milliseconds. If `immediate` is passed, trigger the function on the
  * leading edge, instead of the trailing.
  *
  * Ported from: http://underscorejs.org/underscore.js
  *
  * @param func Function to debounce
  * @param wait Wait period in milliseconds
  * @param immediate Trigger on leading edge
  * @return Debounced function
  */
inline def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[T]
inline def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[T]
inline def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double, immediate: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[T]
inline def debounce[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Unit, immediate: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any], immediate.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * Package a message and arguments for deferred resolution.
  *
  * Use this when you are statically specifying a message and the message may not yet be
  * present.
  *
  * @param key Message key
  * @param params Message parameters
  * @return Function that returns the resolved message when executed
  */
inline def deferMsg(key: String, params: Any*): js.Function0[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("deferMsg")(scala.List(key.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function0[String]]

/**
  * Find a focusable child.
  *
  * @param $container Container to search in
  * @param backwards Search backwards
  * @return Focusable child, or an empty jQuery object if none found
  */
inline def findFocusable($container: JQuery[HTMLElement]): JQuery[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFocusable")($container.asInstanceOf[js.Any]).asInstanceOf[JQuery[HTMLElement]]
inline def findFocusable($container: JQuery[HTMLElement], backwards: Boolean): JQuery[HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("findFocusable")($container.asInstanceOf[js.Any], backwards.asInstanceOf[js.Any])).asInstanceOf[JQuery[HTMLElement]]

/**
  * Generate a unique ID for element
  *
  * @return ID
  */
inline def generateElementId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateElementId")().asInstanceOf[String]

/**
  * Get the default overlay, which is used by various widgets when they are passed
  * `$overlay: true`.
  * See <https://www.mediawiki.org/wiki/OOUI/Concepts#Overlays>.
  *
  * @return Default overlay node
  */
inline def getDefaultOverlay(): JQuery[HTMLDivElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultOverlay")().asInstanceOf[JQuery[HTMLDivElement]]

/**
  * Get a value in an object keyed by language code.
  *
  * @param obj Object keyed by language code
  * @param lang Language code, if omitted or null defaults to any user language
  * @param fallback Fallback code, used if no matching language can be found
  * @return Local value
  */
inline def getLocalValue[T /* <: Record[String, Any] */, K1 /* <: String | Null */, K2 /* <: String */](obj: T): /* import warning: importer.ImportType#apply Failed type conversion: K1 extends keyof T ? T[K1] : K2 extends keyof T ? T[K2] : T[keyof T] | undefined */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getLocalValue")(obj.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: K1 extends keyof T ? T[K1] : K2 extends keyof T ? T[K2] : T[keyof T] | undefined */ js.Any]
inline def getLocalValue[T /* <: Record[String, Any] */, K1 /* <: String | Null */, K2 /* <: String */](obj: T, lang: K1): /* import warning: importer.ImportType#apply Failed type conversion: K1 extends keyof T ? T[K1] : K2 extends keyof T ? T[K2] : T[keyof T] | undefined */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalValue")(obj.asInstanceOf[js.Any], lang.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: K1 extends keyof T ? T[K1] : K2 extends keyof T ? T[K2] : T[keyof T] | undefined */ js.Any]
inline def getLocalValue[T /* <: Record[String, Any] */, K1 /* <: String | Null */, K2 /* <: String */](obj: T, lang: K1, fallback: K2): /* import warning: importer.ImportType#apply Failed type conversion: K1 extends keyof T ? T[K1] : K2 extends keyof T ? T[K2] : T[keyof T] | undefined */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalValue")(obj.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: K1 extends keyof T ? T[K1] : K2 extends keyof T ? T[K2] : T[keyof T] | undefined */ js.Any]
inline def getLocalValue[T /* <: Record[String, Any] */, K1 /* <: String | Null */, K2 /* <: String */](obj: T, lang: Unit, fallback: K2): /* import warning: importer.ImportType#apply Failed type conversion: K1 extends keyof T ? T[K1] : K2 extends keyof T ? T[K2] : T[keyof T] | undefined */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalValue")(obj.asInstanceOf[js.Any], lang.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: K1 extends keyof T ? T[K1] : K2 extends keyof T ? T[K2] : T[keyof T] | undefined */ js.Any]

/**
  * Get the user's language and any fallback languages.
  *
  * These language codes are used to localize user interface elements in the user's language.
  *
  * In environments that provide a localization system, this function should be overridden to
  * return the user's language(s). The default implementation returns English (en) only.
  *
  * @return Language codes, in descending order of priority
  */
inline def getUserLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUserLanguages")().asInstanceOf[js.Array[String]]

/**
  * Get the additional spacing that should be taken into account when displaying elements that
  * are clipped to the viewport, e.g. dropdown menus and popups. This is meant to be overridden
  * to avoid such menus overlapping any fixed headers/toolbars/navigation used by the site.
  *
  * @return Object with the properties 'top', 'right', 'bottom', 'left', each representing
  *  the extra spacing from that edge of viewport (in pixels)
  */
inline def getViewportSpacing(): Rectangle = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewportSpacing")().asInstanceOf[Rectangle]

/**
  * @deprecated
  *
  * Reconstitute a JavaScript object corresponding to a widget created by
  * the PHP implementation.
  *
  * This is an alias for {@link OO.ui.Element.static.infuse()}.
  *
  * @param node A selector (deprecated).
  * @param config Configuration options
  * @return
  *   The `OO.ui.Element` corresponding to this (infusible) document node.
  */
// To mark this as deprecated
// tslint:disable-next-line:unified-signatures
inline def infuse(node: String): typings.oojsUi.OO.ui.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("infuse")(node.asInstanceOf[js.Any]).asInstanceOf[typings.oojsUi.OO.ui.Element]
inline def infuse(node: String, config: js.Object): typings.oojsUi.OO.ui.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("infuse")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.oojsUi.OO.ui.Element]
inline def infuse(node: JQuery[HTMLElement]): typings.oojsUi.OO.ui.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("infuse")(node.asInstanceOf[js.Any]).asInstanceOf[typings.oojsUi.OO.ui.Element]
inline def infuse(node: JQuery[HTMLElement], config: js.Object): typings.oojsUi.OO.ui.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("infuse")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.oojsUi.OO.ui.Element]
/**
  * Reconstitute a JavaScript object corresponding to a widget created by
  * the PHP implementation.
  *
  * This is an alias for {@link OO.ui.Element.static.infuse()}.
  *
  * @param node A single node for the widget to infuse.
  * @param config Configuration options
  * @return
  *   The `OO.ui.Element` corresponding to this (infusible) document node.
  */
inline def infuse(node: HTMLElement): typings.oojsUi.OO.ui.Element = ^.asInstanceOf[js.Dynamic].applyDynamic("infuse")(node.asInstanceOf[js.Any]).asInstanceOf[typings.oojsUi.OO.ui.Element]
inline def infuse(node: HTMLElement, config: js.Object): typings.oojsUi.OO.ui.Element = (^.asInstanceOf[js.Dynamic].applyDynamic("infuse")(node.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.oojsUi.OO.ui.Element]

/**
  * Check if an element is focusable.
  * Inspired by :focusable in jQueryUI v1.11.4 - 2015-04-14
  *
  * @param $element Element to test
  * @return Element is focusable
  */
inline def isFocusableElement($element: JQuery[HTMLElement]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFocusableElement")($element.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Check if the user has a 'mobile' device.
  *
  * For our purposes this means the user is primarily using an
  * on-screen keyboard, touch input instead of a mouse and may
  * have a physically small display.
  *
  * It is left up to implementors to decide how to compute this
  * so the default implementation always returns false.
  *
  * @return User is on a mobile device
  */
inline def isMobile(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMobile")().asInstanceOf[Boolean]

/**
  * @param url
  * @return
  */
inline def isSafeUrl(url: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSafeUrl")(url.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
  * Get a localized message.
  *
  * After the message key, message parameters may optionally be passed. In the default
  * implementation, any occurrences of $1 are replaced with the first parameter, $2 with the
  * second parameter, etc.
  * Alternative implementations of OO.ui.msg may use any substitution system they like, as long
  * as they support unnamed, ordered message parameters.
  *
  * In environments that provide a localization system, this function should be overridden to
  * return the message translated in the user's language. The default implementation always
  * returns English messages. An example of doing this with
  * [jQuery.i18n](https://github.com/wikimedia/jquery.i18n) follows.
  *
  *     var messagePath = 'oojs-ui/dist/i18n/',
  *         languages = [ $.i18n().locale, 'ur', 'en' ],
  *         languageMap = {};
  *
  *     for ( var i = 0, iLen = languages.length; i < iLen; i++ ) {
  *         languageMap[ languages[ i ] ] = messagePath + languages[ i ].toLowerCase() + '.json';
  *     }
  *
  *     $.i18n().load( languageMap ).done( function() {
  *         // Replace the built-in `msg` only once we've loaded the internationalization.
  *         // OOUI uses `OO.ui.deferMsg` for all initially-loaded messages. So long as
  *         // you put off creating any widgets until this promise is complete, no English
  *         // will be displayed.
  *         OO.ui.msg = $.i18n;
  *
  *         // A button displaying "OK" in the default locale
  *         var button = new OO.ui.ButtonWidget( {
  *             label: OO.ui.msg( 'ooui-dialog-message-accept' ),
  *             icon: 'check'
  *         } );
  *         $( document.body ).append( button.$element );
  *
  *         // A button displaying "OK" in Urdu
  *         $.i18n().locale = 'ur';
  *         button = new OO.ui.ButtonWidget( {
  *             label: OO.ui.msg( 'ooui-dialog-message-accept' ),
  *             icon: 'check'
  *         } );
  *         $( document.body ).append( button.$element );
  *     } );
  *
  * @param key Message key
  * @param params Message parameters
  * @return Translated message with parameters substituted
  */
inline def msg(key: String, params: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("msg")(scala.List(key.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]

inline def prompt(text: String): Promise[String | Null, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(text.asInstanceOf[js.Any]).asInstanceOf[Promise[String | Null, Any, Any]]
inline def prompt(text: String, options: PromptOptions): Promise[String | Null, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[String | Null, Any, Any]]
/**
  * Display a quick modal prompt dialog, using a OO.ui.MessageDialog. While the dialog is open,
  * the rest of the page will be dimmed out and the user won't be able to interact with it.
  * The dialog has a text input widget and two action buttons, one to confirm an operation
  * (labelled "OK") and one to cancel it (labelled "Cancel").
  *
  * A window manager is created automatically when this function is called for the first time.
  *
  *     OO.ui.prompt( 'Choose a line to go to', {
  *         textInput: { placeholder: 'Line number' }
  *     } ).done( function ( result ) {
  *         if ( result !== null ) {
  *             console.log( 'User typed "' + result + '" then clicked "OK".' );
  *         } else {
  *             console.log( 'User clicked "Cancel" or closed the dialog.' );
  *         }
  *     } );
  *
  * ResourceLoader module: `oojs-ui-windows`
  *
  * @param text Message text to display
  * @param options Additional options, see {@link OO.ui.MessageDialog.getSetupProcess}
  * @return Promise resolved when the user closes the dialog. If the user chose to
  *  confirm, the promise will resolve with the value of the text input widget; otherwise,
  *  it will resolve to `null`.
  */
inline def prompt(text: JQuery[HTMLElement]): Promise[String | Null, Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(text.asInstanceOf[js.Any]).asInstanceOf[Promise[String | Null, Any, Any]]
inline def prompt(text: JQuery[HTMLElement], options: PromptOptions): Promise[String | Null, Any, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("prompt")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Promise[String | Null, Any, Any]]

/**
  * Resolve a message.
  *
  * If the message is a function it will be executed, otherwise it will pass through directly.
  *
  * @param msg
  * @return Resolved message when there was something to resolve, pass through
  *  otherwise
  */
inline def resolveMsg(msg: js.Function0[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[String]
/**
  * Resolve a message.
  *
  * If the message is a function it will be executed, otherwise it will pass through directly.
  *
  * @param msg
  * @return Resolved message when there was something to resolve, pass through
  *  otherwise
  */
inline def resolveMsg[T](msg: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[T]

inline def theme: Theme = ^.asInstanceOf[js.Dynamic].selectDynamic("theme").asInstanceOf[Theme]
inline def theme_=(x: Theme): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])

/**
  * Returns a function, that, when invoked, will only be triggered at most once
  * during a given window of time. If called again during that window, it will
  * wait until the window ends and then trigger itself again.
  *
  * As it's not knowable to the caller whether the function will actually run
  * when the wrapper is called, return values from the function are entirely
  * discarded.
  *
  * @param func Function to throttle
  * @param wait Throttle window length, in milliseconds
  * @return Throttled function
  */
inline def throttle[T /* <: js.Function1[/* repeated */ Any, Any] */](func: T, wait: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("throttle")(func.asInstanceOf[js.Any], wait.asInstanceOf[js.Any])).asInstanceOf[T]

/**
  * Puts a console warning with provided message.
  *
  * @param message Message
  */
inline def warnDeprecation(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnDeprecation")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
