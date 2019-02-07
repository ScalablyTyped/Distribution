package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonBase extends js.Object {
  /* polymer-standard */
  // Annotations
  @JSName("$")
  var $: js.UndefOr[js.Any] = js.undefined
  // Utils
  @JSName("$$")
  var $$: js.UndefOr[js.Function1[/* selector */ java.lang.String, stdLib.Element]] = js.undefined
  var arrayDelete: js.UndefOr[
    js.Function2[/* path */ java.lang.String | js.Array[_], /* item */ js.Any, js.Array[_]]
  ] = js.undefined
  var async: js.UndefOr[
    js.Function2[
      /* callback */ js.Function0[scala.Unit], 
      /* waitTime */ js.UndefOr[scala.Double], 
      scala.Double
    ]
  ] = js.undefined
  var attached: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var attachedCallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var attributeChanged: js.UndefOr[
    js.Function3[/* name */ java.lang.String, /* oldValue */ js.Any, /* newValue */ js.Any, scala.Unit]
  ] = js.undefined
  var attributeChangedCallback: js.UndefOr[js.Function1[/* name */ java.lang.String, scala.Unit]] = js.undefined
  var attributeFollows: js.UndefOr[
    js.Function3[
      /* name */ java.lang.String, 
      /* toElement */ stdLib.HTMLElement, 
      /* fromElement */ stdLib.HTMLElement, 
      scala.Unit
    ]
  ] = js.undefined
  var beforeRegister: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  // Behaviors
  var behaviors: js.UndefOr[js.Array[js.Object]] = js.undefined
  var cancelAsync: js.UndefOr[js.Function1[/* handle */ scala.Double, scala.Unit]] = js.undefined
  var cancelDebouncer: js.UndefOr[js.Function1[/* jobName */ java.lang.String, scala.Unit]] = js.undefined
  var classFollows: js.UndefOr[
    js.Function3[
      /* name */ java.lang.String, 
      /* toElement */ stdLib.HTMLElement, 
      /* fromElement */ stdLib.HTMLElement, 
      scala.Unit
    ]
  ] = js.undefined
  var copyOwnProperty: js.UndefOr[
    js.Function3[
      /* name */ java.lang.String, 
      /* source */ js.Object, 
      /* target */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var create: js.UndefOr[js.Function2[/* tag */ java.lang.String, /* props */ js.Object, stdLib.Element]] = js.undefined
  var created: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var createdCallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  // Debouncer
  var debounce: js.UndefOr[
    js.Function3[
      /* jobName */ java.lang.String, 
      /* callback */ js.Function, 
      /* wait */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ] = js.undefined
  var deserialize: js.UndefOr[
    (js.Function2[/* value */ java.lang.String, /* type */ stdLib.NumberConstructor, scala.Double]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.BooleanConstructor, scala.Boolean]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.ObjectConstructor, js.Object]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.ArrayConstructor, js.Array[_]]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.DateConstructor, stdLib.Date]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.StringConstructor, java.lang.String])
  ] = js.undefined
  var detached: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var detachedCallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var distributeContent: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  // Shady
  var domHost: js.UndefOr[js.Function0[stdLib.Element]] = js.undefined
  var elementMatches: js.UndefOr[
    js.Function2[
      /* selector */ java.lang.String, 
      /* node */ js.UndefOr[stdLib.Element], 
      scala.Boolean
    ]
  ] = js.undefined
  var extend: js.UndefOr[js.Function2[/* prototype */ js.Object, /* api */ js.Object, js.Object]] = js.undefined
  // Extends
  var `extends`: js.UndefOr[java.lang.String] = js.undefined
  // Constructors
  var factoryImpl: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var fire: js.UndefOr[
    js.Function3[
      /* type */ java.lang.String, 
      /* detail */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Object], 
      stdLib.CustomEvent[_]
    ]
  ] = js.undefined
  var flushDebouncer: js.UndefOr[js.Function1[/* jobName */ java.lang.String, scala.Unit]] = js.undefined
  var get: js.UndefOr[
    js.Function2[
      /* path */ java.lang.String | (js.Array[java.lang.String | scala.Double]), 
      /* root */ js.UndefOr[js.Object], 
      _
    ]
  ] = js.undefined
  var getContentChildNodes: js.UndefOr[js.Function1[/* selector */ java.lang.String, js.Array[stdLib.Node]]] = js.undefined
  var getContentChildren: js.UndefOr[js.Function1[/* selector */ java.lang.String, js.Array[stdLib.HTMLElement]]] = js.undefined
  var getEffectiveChildNodes: js.UndefOr[js.Function0[js.Array[stdLib.Node]]] = js.undefined
  var getEffectiveChildren: js.UndefOr[js.Function0[js.Array[stdLib.Node]]] = js.undefined
  var getNativePrototype: js.UndefOr[js.Function1[/* tag */ java.lang.String, js.Object]] = js.undefined
  var getPropertyInfo: js.UndefOr[js.Function1[/* property */ java.lang.String, js.Object]] = js.undefined
  /* polymer-micro */
  // Attributes
  var hostAttributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var importHref: js.UndefOr[
    js.Function3[
      /* href */ java.lang.String, 
      /* onload */ js.UndefOr[js.Function], 
      /* onerror */ js.UndefOr[js.Function], 
      stdLib.HTMLLinkElement
    ]
  ] = js.undefined
  // Template {
  var instanceTemplate: js.UndefOr[js.Function1[/* template */ stdLib.HTMLElement, stdLib.DocumentFragment]] = js.undefined
  // Tag
  var is: java.lang.String
  var isDebouncerActive: js.UndefOr[js.Function1[/* jobName */ java.lang.String, scala.Boolean]] = js.undefined
  var isLightDescendant: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, scala.Boolean]] = js.undefined
  var isLocalDescendant: js.UndefOr[js.Function1[/* node */ stdLib.HTMLElement, scala.Boolean]] = js.undefined
  var linkPaths: js.UndefOr[
    js.Function2[/* to */ java.lang.String, /* from */ js.UndefOr[java.lang.String], scala.Unit]
  ] = js.undefined
  var listen: js.UndefOr[
    js.Function3[
      /* node */ stdLib.Element, 
      /* eventName */ java.lang.String, 
      /* methodName */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  // Events
  var listeners: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var mixin: js.UndefOr[js.Function2[/* target */ js.Object, /* source */ js.Object, js.Object]] = js.undefined
  // NotifyPath
  var notifyPath: js.UndefOr[
    js.Function3[/* path */ java.lang.String, /* value */ js.Any, /* fromAbove */ js.Any, scala.Unit]
  ] = js.undefined
  var notifySplices: js.UndefOr[
    js.Function2[/* path */ java.lang.String, /* splices */ js.Array[PolymerSplice], scala.Unit]
  ] = js.undefined
  var observers: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var pop: js.UndefOr[js.Function1[/* path */ java.lang.String, _]] = js.undefined
  // Properties
  var properties: js.UndefOr[org.scalablytyped.runtime.StringDictionary[PropConstructorType | PropObjectType]] = js.undefined
  var push: js.UndefOr[js.Function2[/* path */ java.lang.String, /* repeated */ js.Any, scala.Double]] = js.undefined
  /* polymer-mini */
  // Ready
  var ready: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var reflectPropertiesToAttribute: js.UndefOr[js.Function1[/* name */ java.lang.String, scala.Unit]] = js.undefined
  /* common api */
  var registerCallback: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var registered: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  // ResolveUrl
  var resolveUrl: js.UndefOr[js.Function1[/* url */ java.lang.String, java.lang.String]] = js.undefined
  // Styling
  var scopeSubtree: js.UndefOr[
    js.Function2[/* container */ stdLib.Element, /* shouldObserve */ scala.Boolean, scala.Unit]
  ] = js.undefined
  var serialize: js.UndefOr[js.Function1[/* value */ js.Any, java.lang.String]] = js.undefined
  var serializeValueToAttribute: js.UndefOr[
    js.Function3[
      /* value */ js.Any, 
      /* attribute */ java.lang.String, 
      /* node */ js.UndefOr[stdLib.Element], 
      scala.Unit
    ]
  ] = js.undefined
  var set: js.UndefOr[
    js.Function3[
      /* path */ java.lang.String | (js.Array[java.lang.String | scala.Double]), 
      /* value */ js.Any, 
      /* root */ js.UndefOr[js.Object], 
      scala.Unit
    ]
  ] = js.undefined
  // Gestures
  var setScrollDirection: js.UndefOr[
    js.Function2[
      /* direction */ java.lang.String, 
      /* node */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  var shift: js.UndefOr[js.Function1[/* path */ java.lang.String, _]] = js.undefined
  var splice: js.UndefOr[
    js.Function4[
      /* path */ java.lang.String, 
      /* index */ scala.Double, 
      /* removeCount */ scala.Double, 
      /* repeated */ js.Any, 
      scala.Double
    ]
  ] = js.undefined
  var toggleClass: js.UndefOr[
    js.Function3[
      /* name */ java.lang.String, 
      /* bool */ js.UndefOr[scala.Boolean], 
      /* node */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  var transform: js.UndefOr[
    js.Function2[
      /* transform */ java.lang.String, 
      /* node */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  var translate3d: js.UndefOr[
    js.Function4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* z */ scala.Double, 
      /* node */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
  var unlinkPaths: js.UndefOr[js.Function1[/* path */ java.lang.String, scala.Unit]] = js.undefined
  var unlisten: js.UndefOr[
    js.Function3[
      /* node */ stdLib.Element, 
      /* eventName */ java.lang.String, 
      /* methodName */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var unshift: js.UndefOr[js.Function2[/* path */ java.lang.String, /* repeated */ js.Any, scala.Double]] = js.undefined
  // XStyling
  var updateStyles: js.UndefOr[
    js.Function1[
      /* styles */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]], 
      scala.Unit
    ]
  ] = js.undefined
}

