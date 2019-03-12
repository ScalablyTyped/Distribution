package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base
  extends CommonBase
     with /** Need to allow all properties for callback methods. */
/* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  // Has to live on Base because it is incompatible with
  // HTMLElement#toggleAttribute
  var toggleAttribute: js.UndefOr[
    js.Function3[
      /* name */ java.lang.String, 
      /* bool */ js.UndefOr[scala.Boolean], 
      /* node */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ]
  ] = js.undefined
}

object Base {
  @scala.inline
  def apply(
    is: java.lang.String,
    $: js.Any = null,
    $$: /* selector */ java.lang.String => stdLib.Element = null,
    StringDictionary: /** Need to allow all properties for callback methods. */
  /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
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
    toggleAttribute: (/* name */ java.lang.String, /* bool */ js.UndefOr[scala.Boolean], /* node */ js.UndefOr[stdLib.HTMLElement]) => scala.Unit = null,
    toggleClass: (/* name */ java.lang.String, /* bool */ js.UndefOr[scala.Boolean], /* node */ js.UndefOr[stdLib.HTMLElement]) => scala.Unit = null,
    transform: (/* transform */ java.lang.String, /* node */ js.UndefOr[stdLib.HTMLElement]) => scala.Unit = null,
    translate3d: (/* x */ scala.Double, /* y */ scala.Double, /* z */ scala.Double, /* node */ js.UndefOr[stdLib.HTMLElement]) => scala.Unit = null,
    unlinkPaths: /* path */ java.lang.String => scala.Unit = null,
    unlisten: (/* node */ stdLib.Element, /* eventName */ java.lang.String, /* methodName */ java.lang.String) => scala.Unit = null,
    unshift: (/* path */ java.lang.String, /* repeated */ js.Any) => scala.Double = null,
    updateStyles: /* styles */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] => scala.Unit = null
  ): Base = {
    val __obj = js.Dynamic.literal(is = is)
    if ($ != null) __obj.updateDynamic("$")($)
    if ($$ != null) __obj.updateDynamic("$$")(js.Any.fromFunction1($$))
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    if (toggleAttribute != null) __obj.updateDynamic("toggleAttribute")(js.Any.fromFunction3(toggleAttribute))
    if (toggleClass != null) __obj.updateDynamic("toggleClass")(js.Any.fromFunction3(toggleClass))
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction2(transform))
    if (translate3d != null) __obj.updateDynamic("translate3d")(js.Any.fromFunction4(translate3d))
    if (unlinkPaths != null) __obj.updateDynamic("unlinkPaths")(js.Any.fromFunction1(unlinkPaths))
    if (unlisten != null) __obj.updateDynamic("unlisten")(js.Any.fromFunction3(unlisten))
    if (unshift != null) __obj.updateDynamic("unshift")(js.Any.fromFunction2(unshift))
    if (updateStyles != null) __obj.updateDynamic("updateStyles")(js.Any.fromFunction1(updateStyles))
    __obj.asInstanceOf[Base]
  }
}

