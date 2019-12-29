package typings.polymer.polymerMod._Global_.polymer

import org.scalablytyped.runtime.StringDictionary
import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.CustomEvent
import typings.std.Date
import typings.std.DateConstructor
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLLinkElement
import typings.std.Node
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonBase extends js.Object {
  /* polymer-standard */
  // Annotations
  @JSName("$")
  var $: js.UndefOr[js.Any] = js.native
  // Utils
  @JSName("$$")
  var DollarDollar: js.UndefOr[js.Function1[/* selector */ String, Element]] = js.native
  var arrayDelete: js.UndefOr[js.Function2[/* path */ String | js.Array[_], /* item */ js.Any, js.Array[_]]] = js.native
  var async: js.UndefOr[
    js.Function2[/* callback */ js.Function0[Unit], /* waitTime */ js.UndefOr[Double], Double]
  ] = js.native
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  var attachedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  var attributeChanged: js.UndefOr[
    js.Function3[/* name */ String, /* oldValue */ js.Any, /* newValue */ js.Any, Unit]
  ] = js.native
  var attributeChangedCallback: js.UndefOr[
    js.Function4[
      /* attributeName */ String, 
      /* oldValue */ String | Null, 
      /* newValue */ String | Null, 
      /* namespace */ String | Null, 
      Unit
    ]
  ] = js.native
  var attributeFollows: js.UndefOr[
    js.Function3[/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement, Unit]
  ] = js.native
  var beforeRegister: js.UndefOr[js.Function0[Unit]] = js.native
  // Behaviors
  var behaviors: js.UndefOr[js.Array[js.Object]] = js.native
  var cancelAsync: js.UndefOr[js.Function1[/* handle */ Double, Unit]] = js.native
  var cancelDebouncer: js.UndefOr[js.Function1[/* jobName */ String, Unit]] = js.native
  var classFollows: js.UndefOr[
    js.Function3[/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement, Unit]
  ] = js.native
  var copyOwnProperty: js.UndefOr[
    js.Function3[/* name */ String, /* source */ js.Object, /* target */ js.Object, Unit]
  ] = js.native
  var create: js.UndefOr[js.Function2[/* tag */ String, /* props */ js.Object, Element]] = js.native
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  var createdCallback: js.UndefOr[js.Function0[Unit]] = js.native
  // Debouncer
  var debounce: js.UndefOr[
    js.Function3[/* jobName */ String, /* callback */ js.Function, /* wait */ js.UndefOr[Double], Unit]
  ] = js.native
  var deserialize: js.UndefOr[
    (js.Function2[/* value */ String, /* type */ NumberConstructor, Double]) with (js.Function2[/* value */ String, /* type */ BooleanConstructor, Boolean]) with (js.Function2[/* value */ String, /* type */ ObjectConstructor, js.Object]) with (js.Function2[/* value */ String, /* type */ ArrayConstructor, js.Array[_]]) with (js.Function2[/* value */ String, /* type */ DateConstructor, Date]) with (js.Function2[/* value */ String, /* type */ StringConstructor, String])
  ] = js.native
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  var detachedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  var distributeContent: js.UndefOr[js.Function0[Unit]] = js.native
  // Shady
  var domHost: js.UndefOr[js.Function0[Element]] = js.native
  var elementMatches: js.UndefOr[js.Function2[/* selector */ String, /* node */ js.UndefOr[Element], Boolean]] = js.native
  var extend: js.UndefOr[js.Function2[/* prototype */ js.Object, /* api */ js.Object, js.Object]] = js.native
  // Extends
  var `extends`: js.UndefOr[String] = js.native
  // Constructors
  var factoryImpl: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var fire: js.UndefOr[
    js.Function3[
      /* type */ String, 
      /* detail */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Object], 
      CustomEvent[_]
    ]
  ] = js.native
  var flushDebouncer: js.UndefOr[js.Function1[/* jobName */ String, Unit]] = js.native
  var get: js.UndefOr[
    js.Function2[/* path */ String | (js.Array[String | Double]), /* root */ js.UndefOr[js.Object], _]
  ] = js.native
  var getContentChildNodes: js.UndefOr[js.Function1[/* selector */ String, js.Array[Node]]] = js.native
  var getContentChildren: js.UndefOr[js.Function1[/* selector */ String, js.Array[HTMLElement]]] = js.native
  var getEffectiveChildNodes: js.UndefOr[js.Function0[js.Array[Node]]] = js.native
  var getEffectiveChildren: js.UndefOr[js.Function0[js.Array[Node]]] = js.native
  var getNativePrototype: js.UndefOr[js.Function1[/* tag */ String, js.Object]] = js.native
  var getPropertyInfo: js.UndefOr[js.Function1[/* property */ String, js.Object]] = js.native
  /* polymer-micro */
  // Attributes
  var hostAttributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  var importHref: js.UndefOr[
    js.Function3[
      /* href */ String, 
      /* onload */ js.UndefOr[js.Function], 
      /* onerror */ js.UndefOr[js.Function], 
      HTMLLinkElement
    ]
  ] = js.native
  // Template {
  var instanceTemplate: js.UndefOr[js.Function1[/* template */ HTMLElement, DocumentFragment]] = js.native
  // Tag
  var is: String = js.native
  var isDebouncerActive: js.UndefOr[js.Function1[/* jobName */ String, Boolean]] = js.native
  var isLightDescendant: js.UndefOr[js.Function1[/* node */ HTMLElement, Boolean]] = js.native
  var isLocalDescendant: js.UndefOr[js.Function1[/* node */ HTMLElement, Boolean]] = js.native
  var linkPaths: js.UndefOr[js.Function2[/* to */ String, /* from */ js.UndefOr[String], Unit]] = js.native
  var listen: js.UndefOr[
    js.Function3[/* node */ Element, /* eventName */ String, /* methodName */ String, Unit]
  ] = js.native
  // Events
  var listeners: js.UndefOr[StringDictionary[String]] = js.native
  var mixin: js.UndefOr[js.Function2[/* target */ js.Object, /* source */ js.Object, js.Object]] = js.native
  // NotifyPath
  var notifyPath: js.UndefOr[
    js.Function3[/* path */ String, /* value */ js.Any, /* fromAbove */ js.Any, Unit]
  ] = js.native
  var notifySplices: js.UndefOr[js.Function2[/* path */ String, /* splices */ js.Array[PolymerSplice], Unit]] = js.native
  var observers: js.UndefOr[js.Array[String]] = js.native
  var pop: js.UndefOr[js.Function1[/* path */ String, _]] = js.native
  // Properties
  var properties: js.UndefOr[StringDictionary[PropConstructorType | PropObjectType]] = js.native
  var push: js.UndefOr[js.Function2[/* path */ String, /* repeated */ js.Any, Double]] = js.native
  /* polymer-mini */
  // Ready
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
  var reflectPropertiesToAttribute: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
  /* common api */
  var registerCallback: js.UndefOr[js.Function0[Unit]] = js.native
  var registered: js.UndefOr[js.Function0[Unit]] = js.native
  // ResolveUrl
  var resolveUrl: js.UndefOr[js.Function1[/* url */ String, String]] = js.native
  // Styling
  var scopeSubtree: js.UndefOr[js.Function2[/* container */ Element, /* shouldObserve */ Boolean, Unit]] = js.native
  var serialize: js.UndefOr[js.Function1[/* value */ js.Any, String]] = js.native
  var serializeValueToAttribute: js.UndefOr[
    js.Function3[/* value */ js.Any, /* attribute */ String, /* node */ js.UndefOr[Element], Unit]
  ] = js.native
  var set: js.UndefOr[
    js.Function3[
      /* path */ String | (js.Array[String | Double]), 
      /* value */ js.Any, 
      /* root */ js.UndefOr[js.Object], 
      Unit
    ]
  ] = js.native
  // Gestures
  var setScrollDirection: js.UndefOr[js.Function2[/* direction */ String, /* node */ js.UndefOr[HTMLElement], Unit]] = js.native
  var shift: js.UndefOr[js.Function1[/* path */ String, _]] = js.native
  var splice: js.UndefOr[
    js.Function4[
      /* path */ String, 
      /* index */ Double, 
      /* removeCount */ Double, 
      /* repeated */ js.Any, 
      Double
    ]
  ] = js.native
  var toggleClass: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* bool */ js.UndefOr[Boolean], 
      /* node */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ] = js.native
  var transform: js.UndefOr[js.Function2[/* transform */ String, /* node */ js.UndefOr[HTMLElement], Unit]] = js.native
  var translate3d: js.UndefOr[
    js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* node */ js.UndefOr[HTMLElement], Unit]
  ] = js.native
  var unlinkPaths: js.UndefOr[js.Function1[/* path */ String, Unit]] = js.native
  var unlisten: js.UndefOr[
    js.Function3[/* node */ Element, /* eventName */ String, /* methodName */ String, Unit]
  ] = js.native
  var unshift: js.UndefOr[js.Function2[/* path */ String, /* repeated */ js.Any, Double]] = js.native
  // XStyling
  var updateStyles: js.UndefOr[js.Function1[/* styles */ js.UndefOr[StringDictionary[String]], Unit]] = js.native
}

