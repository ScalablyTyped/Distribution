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

object CommonBase {
  @scala.inline
  def apply(
    is: java.lang.String,
    $: js.Any = null,
    $$: /* selector */ java.lang.String => stdLib.Element = null,
    arrayDelete: (/* path */ java.lang.String | js.Array[_], /* item */ js.Any) => js.Array[_] = null,
    async: (/* callback */ js.Function0[scala.Unit], /* waitTime */ js.UndefOr[scala.Double]) => scala.Double = null,
    attached: () => scala.Unit = null,
    attachedCallback: () => scala.Unit = null,
    attributeChanged: (/* name */ java.lang.String, /* oldValue */ js.Any, /* newValue */ js.Any) => scala.Unit = null,
    attributeChangedCallback: /* name */ java.lang.String => scala.Unit = null,
    attributeFollows: (/* name */ java.lang.String, /* toElement */ stdLib.HTMLElement, /* fromElement */ stdLib.HTMLElement) => scala.Unit = null,
    beforeRegister: () => scala.Unit = null,
    behaviors: js.Array[js.Object] = null,
    cancelAsync: /* handle */ scala.Double => scala.Unit = null,
    cancelDebouncer: /* jobName */ java.lang.String => scala.Unit = null,
    classFollows: (/* name */ java.lang.String, /* toElement */ stdLib.HTMLElement, /* fromElement */ stdLib.HTMLElement) => scala.Unit = null,
    copyOwnProperty: (/* name */ java.lang.String, /* source */ js.Object, /* target */ js.Object) => scala.Unit = null,
    create: (/* tag */ java.lang.String, /* props */ js.Object) => stdLib.Element = null,
    created: () => scala.Unit = null,
    createdCallback: () => scala.Unit = null,
    debounce: (/* jobName */ java.lang.String, /* callback */ js.Function, /* wait */ js.UndefOr[scala.Double]) => scala.Unit = null,
    deserialize: (js.Function2[/* value */ java.lang.String, /* type */ stdLib.NumberConstructor, scala.Double]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.BooleanConstructor, scala.Boolean]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.ObjectConstructor, js.Object]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.ArrayConstructor, js.Array[_]]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.DateConstructor, stdLib.Date]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.StringConstructor, java.lang.String]) = null,
    detached: () => scala.Unit = null,
    detachedCallback: () => scala.Unit = null,
    distributeContent: () => scala.Unit = null,
    domHost: () => stdLib.Element = null,
    elementMatches: (/* selector */ java.lang.String, /* node */ js.UndefOr[stdLib.Element]) => scala.Boolean = null,
    extend: (/* prototype */ js.Object, /* api */ js.Object) => js.Object = null,
    `extends`: java.lang.String = null,
    factoryImpl: /* repeated */ js.Any => scala.Unit = null,
    fire: (/* type */ java.lang.String, /* detail */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object]) => stdLib.CustomEvent[_] = null,
    flushDebouncer: /* jobName */ java.lang.String => scala.Unit = null,
    get: (/* path */ java.lang.String | (js.Array[java.lang.String | scala.Double]), /* root */ js.UndefOr[js.Object]) => _ = null,
    getContentChildNodes: /* selector */ java.lang.String => js.Array[stdLib.Node] = null,
    getContentChildren: /* selector */ java.lang.String => js.Array[stdLib.HTMLElement] = null,
    getEffectiveChildNodes: () => js.Array[stdLib.Node] = null,
    getEffectiveChildren: () => js.Array[stdLib.Node] = null,
    getNativePrototype: /* tag */ java.lang.String => js.Object = null,
    getPropertyInfo: /* property */ java.lang.String => js.Object = null,
    hostAttributes: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    importHref: (/* href */ java.lang.String, /* onload */ js.UndefOr[js.Function], /* onerror */ js.UndefOr[js.Function]) => stdLib.HTMLLinkElement = null,
    instanceTemplate: /* template */ stdLib.HTMLElement => stdLib.DocumentFragment = null,
    isDebouncerActive: /* jobName */ java.lang.String => scala.Boolean = null,
    isLightDescendant: /* node */ stdLib.HTMLElement => scala.Boolean = null,
    isLocalDescendant: /* node */ stdLib.HTMLElement => scala.Boolean = null,
    linkPaths: (/* to */ java.lang.String, /* from */ js.UndefOr[java.lang.String]) => scala.Unit = null,
    listen: (/* node */ stdLib.Element, /* eventName */ java.lang.String, /* methodName */ java.lang.String) => scala.Unit = null,
    listeners: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    mixin: (/* target */ js.Object, /* source */ js.Object) => js.Object = null,
    notifyPath: (/* path */ java.lang.String, /* value */ js.Any, /* fromAbove */ js.Any) => scala.Unit = null,
    notifySplices: (/* path */ java.lang.String, /* splices */ js.Array[PolymerSplice]) => scala.Unit = null,
    observers: js.Array[java.lang.String] = null,
    pop: /* path */ java.lang.String => _ = null,
    properties: org.scalablytyped.runtime.StringDictionary[PropConstructorType | PropObjectType] = null,
    push: (/* path */ java.lang.String, /* repeated */ js.Any) => scala.Double = null,
    ready: () => scala.Unit = null,
    reflectPropertiesToAttribute: /* name */ java.lang.String => scala.Unit = null,
    registerCallback: () => scala.Unit = null,
    registered: () => scala.Unit = null,
    resolveUrl: /* url */ java.lang.String => java.lang.String = null,
    scopeSubtree: (/* container */ stdLib.Element, /* shouldObserve */ scala.Boolean) => scala.Unit = null,
    serialize: /* value */ js.Any => java.lang.String = null,
    serializeValueToAttribute: (/* value */ js.Any, /* attribute */ java.lang.String, /* node */ js.UndefOr[stdLib.Element]) => scala.Unit = null,
    set: (/* path */ java.lang.String | (js.Array[java.lang.String | scala.Double]), /* value */ js.Any, /* root */ js.UndefOr[js.Object]) => scala.Unit = null,
    setScrollDirection: (/* direction */ java.lang.String, /* node */ js.UndefOr[stdLib.HTMLElement]) => scala.Unit = null,
    shift: /* path */ java.lang.String => _ = null,
    splice: (/* path */ java.lang.String, /* index */ scala.Double, /* removeCount */ scala.Double, /* repeated */ js.Any) => scala.Double = null,
    toggleClass: (/* name */ java.lang.String, /* bool */ js.UndefOr[scala.Boolean], /* node */ js.UndefOr[stdLib.HTMLElement]) => scala.Unit = null,
    transform: (/* transform */ java.lang.String, /* node */ js.UndefOr[stdLib.HTMLElement]) => scala.Unit = null,
    translate3d: (/* x */ scala.Double, /* y */ scala.Double, /* z */ scala.Double, /* node */ js.UndefOr[stdLib.HTMLElement]) => scala.Unit = null,
    unlinkPaths: /* path */ java.lang.String => scala.Unit = null,
    unlisten: (/* node */ stdLib.Element, /* eventName */ java.lang.String, /* methodName */ java.lang.String) => scala.Unit = null,
    unshift: (/* path */ java.lang.String, /* repeated */ js.Any) => scala.Double = null,
    updateStyles: /* styles */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] => scala.Unit = null
  ): CommonBase = {
    val __obj = js.Dynamic.literal(is = is)
    if ($ != null) __obj.updateDynamic("$")($)
    if ($$ != null) __obj.updateDynamic("$$")(js.Any.fromFunction1($$))
    if (arrayDelete != null) __obj.updateDynamic("arrayDelete")(js.Any.fromFunction2(arrayDelete))
    if (async != null) __obj.updateDynamic("async")(js.Any.fromFunction2(async))
    if (attached != null) __obj.updateDynamic("attached")(js.Any.fromFunction0(attached))
    if (attachedCallback != null) __obj.updateDynamic("attachedCallback")(js.Any.fromFunction0(attachedCallback))
    if (attributeChanged != null) __obj.updateDynamic("attributeChanged")(js.Any.fromFunction3(attributeChanged))
    if (attributeChangedCallback != null) __obj.updateDynamic("attributeChangedCallback")(js.Any.fromFunction1(attributeChangedCallback))
    if (attributeFollows != null) __obj.updateDynamic("attributeFollows")(js.Any.fromFunction3(attributeFollows))
    if (beforeRegister != null) __obj.updateDynamic("beforeRegister")(js.Any.fromFunction0(beforeRegister))
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors)
    if (cancelAsync != null) __obj.updateDynamic("cancelAsync")(js.Any.fromFunction1(cancelAsync))
    if (cancelDebouncer != null) __obj.updateDynamic("cancelDebouncer")(js.Any.fromFunction1(cancelDebouncer))
    if (classFollows != null) __obj.updateDynamic("classFollows")(js.Any.fromFunction3(classFollows))
    if (copyOwnProperty != null) __obj.updateDynamic("copyOwnProperty")(js.Any.fromFunction3(copyOwnProperty))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction2(create))
    if (created != null) __obj.updateDynamic("created")(js.Any.fromFunction0(created))
    if (createdCallback != null) __obj.updateDynamic("createdCallback")(js.Any.fromFunction0(createdCallback))
    if (debounce != null) __obj.updateDynamic("debounce")(js.Any.fromFunction3(debounce))
    if (deserialize != null) __obj.updateDynamic("deserialize")(deserialize)
    if (detached != null) __obj.updateDynamic("detached")(js.Any.fromFunction0(detached))
    if (detachedCallback != null) __obj.updateDynamic("detachedCallback")(js.Any.fromFunction0(detachedCallback))
    if (distributeContent != null) __obj.updateDynamic("distributeContent")(js.Any.fromFunction0(distributeContent))
    if (domHost != null) __obj.updateDynamic("domHost")(js.Any.fromFunction0(domHost))
    if (elementMatches != null) __obj.updateDynamic("elementMatches")(js.Any.fromFunction2(elementMatches))
    if (extend != null) __obj.updateDynamic("extend")(js.Any.fromFunction2(extend))
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (factoryImpl != null) __obj.updateDynamic("factoryImpl")(js.Any.fromFunction1(factoryImpl))
    if (fire != null) __obj.updateDynamic("fire")(js.Any.fromFunction3(fire))
    if (flushDebouncer != null) __obj.updateDynamic("flushDebouncer")(js.Any.fromFunction1(flushDebouncer))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction2(get))
    if (getContentChildNodes != null) __obj.updateDynamic("getContentChildNodes")(js.Any.fromFunction1(getContentChildNodes))
    if (getContentChildren != null) __obj.updateDynamic("getContentChildren")(js.Any.fromFunction1(getContentChildren))
    if (getEffectiveChildNodes != null) __obj.updateDynamic("getEffectiveChildNodes")(js.Any.fromFunction0(getEffectiveChildNodes))
    if (getEffectiveChildren != null) __obj.updateDynamic("getEffectiveChildren")(js.Any.fromFunction0(getEffectiveChildren))
    if (getNativePrototype != null) __obj.updateDynamic("getNativePrototype")(js.Any.fromFunction1(getNativePrototype))
    if (getPropertyInfo != null) __obj.updateDynamic("getPropertyInfo")(js.Any.fromFunction1(getPropertyInfo))
    if (hostAttributes != null) __obj.updateDynamic("hostAttributes")(hostAttributes)
    if (importHref != null) __obj.updateDynamic("importHref")(js.Any.fromFunction3(importHref))
    if (instanceTemplate != null) __obj.updateDynamic("instanceTemplate")(js.Any.fromFunction1(instanceTemplate))
    if (isDebouncerActive != null) __obj.updateDynamic("isDebouncerActive")(js.Any.fromFunction1(isDebouncerActive))
    if (isLightDescendant != null) __obj.updateDynamic("isLightDescendant")(js.Any.fromFunction1(isLightDescendant))
    if (isLocalDescendant != null) __obj.updateDynamic("isLocalDescendant")(js.Any.fromFunction1(isLocalDescendant))
    if (linkPaths != null) __obj.updateDynamic("linkPaths")(js.Any.fromFunction2(linkPaths))
    if (listen != null) __obj.updateDynamic("listen")(js.Any.fromFunction3(listen))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixin != null) __obj.updateDynamic("mixin")(js.Any.fromFunction2(mixin))
    if (notifyPath != null) __obj.updateDynamic("notifyPath")(js.Any.fromFunction3(notifyPath))
    if (notifySplices != null) __obj.updateDynamic("notifySplices")(js.Any.fromFunction2(notifySplices))
    if (observers != null) __obj.updateDynamic("observers")(observers)
    if (pop != null) __obj.updateDynamic("pop")(js.Any.fromFunction1(pop))
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (push != null) __obj.updateDynamic("push")(js.Any.fromFunction2(push))
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction0(ready))
    if (reflectPropertiesToAttribute != null) __obj.updateDynamic("reflectPropertiesToAttribute")(js.Any.fromFunction1(reflectPropertiesToAttribute))
    if (registerCallback != null) __obj.updateDynamic("registerCallback")(js.Any.fromFunction0(registerCallback))
    if (registered != null) __obj.updateDynamic("registered")(js.Any.fromFunction0(registered))
    if (resolveUrl != null) __obj.updateDynamic("resolveUrl")(js.Any.fromFunction1(resolveUrl))
    if (scopeSubtree != null) __obj.updateDynamic("scopeSubtree")(js.Any.fromFunction2(scopeSubtree))
    if (serialize != null) __obj.updateDynamic("serialize")(js.Any.fromFunction1(serialize))
    if (serializeValueToAttribute != null) __obj.updateDynamic("serializeValueToAttribute")(js.Any.fromFunction3(serializeValueToAttribute))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction3(set))
    if (setScrollDirection != null) __obj.updateDynamic("setScrollDirection")(js.Any.fromFunction2(setScrollDirection))
    if (shift != null) __obj.updateDynamic("shift")(js.Any.fromFunction1(shift))
    if (splice != null) __obj.updateDynamic("splice")(js.Any.fromFunction4(splice))
    if (toggleClass != null) __obj.updateDynamic("toggleClass")(js.Any.fromFunction3(toggleClass))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    if (translate3d != null) __obj.updateDynamic("translate3d")(js.Any.fromFunction4(translate3d))
    if (unlinkPaths != null) __obj.updateDynamic("unlinkPaths")(js.Any.fromFunction1(unlinkPaths))
    if (unlisten != null) __obj.updateDynamic("unlisten")(js.Any.fromFunction3(unlisten))
    if (unshift != null) __obj.updateDynamic("unshift")(js.Any.fromFunction2(unshift))
    if (updateStyles != null) __obj.updateDynamic("updateStyles")(js.Any.fromFunction1(updateStyles))
    __obj.asInstanceOf[CommonBase]
  }
}

