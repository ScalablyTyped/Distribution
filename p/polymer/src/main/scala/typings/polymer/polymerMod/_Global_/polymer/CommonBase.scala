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

trait CommonBase extends js.Object {
  /* polymer-standard */
  // Annotations
  @JSName("$")
  var $: js.UndefOr[js.Any] = js.undefined
  // Utils
  @JSName("$$")
  var $$: js.UndefOr[js.Function1[/* selector */ String, Element]] = js.undefined
  var arrayDelete: js.UndefOr[js.Function2[/* path */ String | js.Array[_], /* item */ js.Any, js.Array[_]]] = js.undefined
  var async: js.UndefOr[
    js.Function2[/* callback */ js.Function0[Unit], /* waitTime */ js.UndefOr[Double], Double]
  ] = js.undefined
  var attached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var attachedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var attributeChanged: js.UndefOr[
    js.Function3[/* name */ String, /* oldValue */ js.Any, /* newValue */ js.Any, Unit]
  ] = js.undefined
  var attributeChangedCallback: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
  var attributeFollows: js.UndefOr[
    js.Function3[/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement, Unit]
  ] = js.undefined
  var beforeRegister: js.UndefOr[js.Function0[Unit]] = js.undefined
  // Behaviors
  var behaviors: js.UndefOr[js.Array[js.Object]] = js.undefined
  var cancelAsync: js.UndefOr[js.Function1[/* handle */ Double, Unit]] = js.undefined
  var cancelDebouncer: js.UndefOr[js.Function1[/* jobName */ String, Unit]] = js.undefined
  var classFollows: js.UndefOr[
    js.Function3[/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement, Unit]
  ] = js.undefined
  var copyOwnProperty: js.UndefOr[
    js.Function3[/* name */ String, /* source */ js.Object, /* target */ js.Object, Unit]
  ] = js.undefined
  var create: js.UndefOr[js.Function2[/* tag */ String, /* props */ js.Object, Element]] = js.undefined
  var created: js.UndefOr[js.Function0[Unit]] = js.undefined
  var createdCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  // Debouncer
  var debounce: js.UndefOr[
    js.Function3[/* jobName */ String, /* callback */ js.Function, /* wait */ js.UndefOr[Double], Unit]
  ] = js.undefined
  var deserialize: js.UndefOr[
    (js.Function2[/* value */ String, /* type */ NumberConstructor, Double]) with (js.Function2[/* value */ String, /* type */ BooleanConstructor, Boolean]) with (js.Function2[/* value */ String, /* type */ ObjectConstructor, js.Object]) with (js.Function2[/* value */ String, /* type */ ArrayConstructor, js.Array[_]]) with (js.Function2[/* value */ String, /* type */ DateConstructor, Date]) with (js.Function2[/* value */ String, /* type */ StringConstructor, String])
  ] = js.undefined
  var detached: js.UndefOr[js.Function0[Unit]] = js.undefined
  var detachedCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var distributeContent: js.UndefOr[js.Function0[Unit]] = js.undefined
  // Shady
  var domHost: js.UndefOr[js.Function0[Element]] = js.undefined
  var elementMatches: js.UndefOr[js.Function2[/* selector */ String, /* node */ js.UndefOr[Element], Boolean]] = js.undefined
  var extend: js.UndefOr[js.Function2[/* prototype */ js.Object, /* api */ js.Object, js.Object]] = js.undefined
  // Extends
  var `extends`: js.UndefOr[String] = js.undefined
  // Constructors
  var factoryImpl: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var fire: js.UndefOr[
    js.Function3[
      /* type */ String, 
      /* detail */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Object], 
      CustomEvent[_]
    ]
  ] = js.undefined
  var flushDebouncer: js.UndefOr[js.Function1[/* jobName */ String, Unit]] = js.undefined
  var get: js.UndefOr[
    js.Function2[/* path */ String | (js.Array[String | Double]), /* root */ js.UndefOr[js.Object], _]
  ] = js.undefined
  var getContentChildNodes: js.UndefOr[js.Function1[/* selector */ String, js.Array[Node]]] = js.undefined
  var getContentChildren: js.UndefOr[js.Function1[/* selector */ String, js.Array[HTMLElement]]] = js.undefined
  var getEffectiveChildNodes: js.UndefOr[js.Function0[js.Array[Node]]] = js.undefined
  var getEffectiveChildren: js.UndefOr[js.Function0[js.Array[Node]]] = js.undefined
  var getNativePrototype: js.UndefOr[js.Function1[/* tag */ String, js.Object]] = js.undefined
  var getPropertyInfo: js.UndefOr[js.Function1[/* property */ String, js.Object]] = js.undefined
  /* polymer-micro */
  // Attributes
  var hostAttributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var importHref: js.UndefOr[
    js.Function3[
      /* href */ String, 
      /* onload */ js.UndefOr[js.Function], 
      /* onerror */ js.UndefOr[js.Function], 
      HTMLLinkElement
    ]
  ] = js.undefined
  // Template {
  var instanceTemplate: js.UndefOr[js.Function1[/* template */ HTMLElement, DocumentFragment]] = js.undefined
  // Tag
  var is: String
  var isDebouncerActive: js.UndefOr[js.Function1[/* jobName */ String, Boolean]] = js.undefined
  var isLightDescendant: js.UndefOr[js.Function1[/* node */ HTMLElement, Boolean]] = js.undefined
  var isLocalDescendant: js.UndefOr[js.Function1[/* node */ HTMLElement, Boolean]] = js.undefined
  var linkPaths: js.UndefOr[js.Function2[/* to */ String, /* from */ js.UndefOr[String], Unit]] = js.undefined
  var listen: js.UndefOr[
    js.Function3[/* node */ Element, /* eventName */ String, /* methodName */ String, Unit]
  ] = js.undefined
  // Events
  var listeners: js.UndefOr[StringDictionary[String]] = js.undefined
  var mixin: js.UndefOr[js.Function2[/* target */ js.Object, /* source */ js.Object, js.Object]] = js.undefined
  // NotifyPath
  var notifyPath: js.UndefOr[
    js.Function3[/* path */ String, /* value */ js.Any, /* fromAbove */ js.Any, Unit]
  ] = js.undefined
  var notifySplices: js.UndefOr[js.Function2[/* path */ String, /* splices */ js.Array[PolymerSplice], Unit]] = js.undefined
  var observers: js.UndefOr[js.Array[String]] = js.undefined
  var pop: js.UndefOr[js.Function1[/* path */ String, _]] = js.undefined
  // Properties
  var properties: js.UndefOr[StringDictionary[PropConstructorType | PropObjectType]] = js.undefined
  var push: js.UndefOr[js.Function2[/* path */ String, /* repeated */ js.Any, Double]] = js.undefined
  /* polymer-mini */
  // Ready
  var ready: js.UndefOr[js.Function0[Unit]] = js.undefined
  var reflectPropertiesToAttribute: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.undefined
  /* common api */
  var registerCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  var registered: js.UndefOr[js.Function0[Unit]] = js.undefined
  // ResolveUrl
  var resolveUrl: js.UndefOr[js.Function1[/* url */ String, String]] = js.undefined
  // Styling
  var scopeSubtree: js.UndefOr[js.Function2[/* container */ Element, /* shouldObserve */ Boolean, Unit]] = js.undefined
  var serialize: js.UndefOr[js.Function1[/* value */ js.Any, String]] = js.undefined
  var serializeValueToAttribute: js.UndefOr[
    js.Function3[/* value */ js.Any, /* attribute */ String, /* node */ js.UndefOr[Element], Unit]
  ] = js.undefined
  var set: js.UndefOr[
    js.Function3[
      /* path */ String | (js.Array[String | Double]), 
      /* value */ js.Any, 
      /* root */ js.UndefOr[js.Object], 
      Unit
    ]
  ] = js.undefined
  // Gestures
  var setScrollDirection: js.UndefOr[js.Function2[/* direction */ String, /* node */ js.UndefOr[HTMLElement], Unit]] = js.undefined
  var shift: js.UndefOr[js.Function1[/* path */ String, _]] = js.undefined
  var splice: js.UndefOr[
    js.Function4[
      /* path */ String, 
      /* index */ Double, 
      /* removeCount */ Double, 
      /* repeated */ js.Any, 
      Double
    ]
  ] = js.undefined
  var toggleClass: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* bool */ js.UndefOr[Boolean], 
      /* node */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ] = js.undefined
  var transform: js.UndefOr[js.Function2[/* transform */ String, /* node */ js.UndefOr[HTMLElement], Unit]] = js.undefined
  var translate3d: js.UndefOr[
    js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* node */ js.UndefOr[HTMLElement], Unit]
  ] = js.undefined
  var unlinkPaths: js.UndefOr[js.Function1[/* path */ String, Unit]] = js.undefined
  var unlisten: js.UndefOr[
    js.Function3[/* node */ Element, /* eventName */ String, /* methodName */ String, Unit]
  ] = js.undefined
  var unshift: js.UndefOr[js.Function2[/* path */ String, /* repeated */ js.Any, Double]] = js.undefined
  // XStyling
  var updateStyles: js.UndefOr[js.Function1[/* styles */ js.UndefOr[StringDictionary[String]], Unit]] = js.undefined
}

object CommonBase {
  @scala.inline
  def apply(
    is: String,
    $: js.Any = null,
    $$: /* selector */ String => Element = null,
    arrayDelete: (/* path */ String | js.Array[_], /* item */ js.Any) => js.Array[_] = null,
    async: (/* callback */ js.Function0[Unit], /* waitTime */ js.UndefOr[Double]) => Double = null,
    attached: () => Unit = null,
    attachedCallback: () => Unit = null,
    attributeChanged: (/* name */ String, /* oldValue */ js.Any, /* newValue */ js.Any) => Unit = null,
    attributeChangedCallback: /* name */ String => Unit = null,
    attributeFollows: (/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement) => Unit = null,
    beforeRegister: () => Unit = null,
    behaviors: js.Array[js.Object] = null,
    cancelAsync: /* handle */ Double => Unit = null,
    cancelDebouncer: /* jobName */ String => Unit = null,
    classFollows: (/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement) => Unit = null,
    copyOwnProperty: (/* name */ String, /* source */ js.Object, /* target */ js.Object) => Unit = null,
    create: (/* tag */ String, /* props */ js.Object) => Element = null,
    created: () => Unit = null,
    createdCallback: () => Unit = null,
    debounce: (/* jobName */ String, /* callback */ js.Function, /* wait */ js.UndefOr[Double]) => Unit = null,
    deserialize: (js.Function2[/* value */ String, /* type */ NumberConstructor, Double]) with (js.Function2[/* value */ String, /* type */ BooleanConstructor, Boolean]) with (js.Function2[/* value */ String, /* type */ ObjectConstructor, js.Object]) with (js.Function2[/* value */ String, /* type */ ArrayConstructor, js.Array[_]]) with (js.Function2[/* value */ String, /* type */ DateConstructor, Date]) with (js.Function2[/* value */ String, /* type */ StringConstructor, String]) = null,
    detached: () => Unit = null,
    detachedCallback: () => Unit = null,
    distributeContent: () => Unit = null,
    domHost: () => Element = null,
    elementMatches: (/* selector */ String, /* node */ js.UndefOr[Element]) => Boolean = null,
    extend: (/* prototype */ js.Object, /* api */ js.Object) => js.Object = null,
    `extends`: String = null,
    factoryImpl: /* repeated */ js.Any => Unit = null,
    fire: (/* type */ String, /* detail */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object]) => CustomEvent[_] = null,
    flushDebouncer: /* jobName */ String => Unit = null,
    get: (/* path */ String | (js.Array[String | Double]), /* root */ js.UndefOr[js.Object]) => _ = null,
    getContentChildNodes: /* selector */ String => js.Array[Node] = null,
    getContentChildren: /* selector */ String => js.Array[HTMLElement] = null,
    getEffectiveChildNodes: () => js.Array[Node] = null,
    getEffectiveChildren: () => js.Array[Node] = null,
    getNativePrototype: /* tag */ String => js.Object = null,
    getPropertyInfo: /* property */ String => js.Object = null,
    hostAttributes: StringDictionary[js.Any] = null,
    importHref: (/* href */ String, /* onload */ js.UndefOr[js.Function], /* onerror */ js.UndefOr[js.Function]) => HTMLLinkElement = null,
    instanceTemplate: /* template */ HTMLElement => DocumentFragment = null,
    isDebouncerActive: /* jobName */ String => Boolean = null,
    isLightDescendant: /* node */ HTMLElement => Boolean = null,
    isLocalDescendant: /* node */ HTMLElement => Boolean = null,
    linkPaths: (/* to */ String, /* from */ js.UndefOr[String]) => Unit = null,
    listen: (/* node */ Element, /* eventName */ String, /* methodName */ String) => Unit = null,
    listeners: StringDictionary[String] = null,
    mixin: (/* target */ js.Object, /* source */ js.Object) => js.Object = null,
    notifyPath: (/* path */ String, /* value */ js.Any, /* fromAbove */ js.Any) => Unit = null,
    notifySplices: (/* path */ String, /* splices */ js.Array[PolymerSplice]) => Unit = null,
    observers: js.Array[String] = null,
    pop: /* path */ String => _ = null,
    properties: StringDictionary[PropConstructorType | PropObjectType] = null,
    push: (/* path */ String, /* repeated */ js.Any) => Double = null,
    ready: () => Unit = null,
    reflectPropertiesToAttribute: /* name */ String => Unit = null,
    registerCallback: () => Unit = null,
    registered: () => Unit = null,
    resolveUrl: /* url */ String => String = null,
    scopeSubtree: (/* container */ Element, /* shouldObserve */ Boolean) => Unit = null,
    serialize: /* value */ js.Any => String = null,
    serializeValueToAttribute: (/* value */ js.Any, /* attribute */ String, /* node */ js.UndefOr[Element]) => Unit = null,
    set: (/* path */ String | (js.Array[String | Double]), /* value */ js.Any, /* root */ js.UndefOr[js.Object]) => Unit = null,
    setScrollDirection: (/* direction */ String, /* node */ js.UndefOr[HTMLElement]) => Unit = null,
    shift: /* path */ String => _ = null,
    splice: (/* path */ String, /* index */ Double, /* removeCount */ Double, /* repeated */ js.Any) => Double = null,
    toggleClass: (/* name */ String, /* bool */ js.UndefOr[Boolean], /* node */ js.UndefOr[HTMLElement]) => Unit = null,
    transform: (/* transform */ String, /* node */ js.UndefOr[HTMLElement]) => Unit = null,
    translate3d: (/* x */ Double, /* y */ Double, /* z */ Double, /* node */ js.UndefOr[HTMLElement]) => Unit = null,
    unlinkPaths: /* path */ String => Unit = null,
    unlisten: (/* node */ Element, /* eventName */ String, /* methodName */ String) => Unit = null,
    unshift: (/* path */ String, /* repeated */ js.Any) => Double = null,
    updateStyles: /* styles */ js.UndefOr[StringDictionary[String]] => Unit = null
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

