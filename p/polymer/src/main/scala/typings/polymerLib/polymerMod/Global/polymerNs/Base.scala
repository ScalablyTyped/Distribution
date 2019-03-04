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
    $$: js.Function1[/* selector */ java.lang.String, stdLib.Element] = null,
    StringDictionary: /** Need to allow all properties for callback methods. */
  /* prop */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    arrayDelete: js.Function2[/* path */ java.lang.String | js.Array[_], /* item */ js.Any, js.Array[_]] = null,
    async: js.Function2[
      /* callback */ js.Function0[scala.Unit], 
      /* waitTime */ js.UndefOr[scala.Double], 
      scala.Double
    ] = null,
    attached: js.Function0[scala.Unit] = null,
    attachedCallback: js.Function0[scala.Unit] = null,
    attributeChanged: js.Function3[/* name */ java.lang.String, /* oldValue */ js.Any, /* newValue */ js.Any, scala.Unit] = null,
    attributeChangedCallback: js.Function1[/* name */ java.lang.String, scala.Unit] = null,
    attributeFollows: js.Function3[
      /* name */ java.lang.String, 
      /* toElement */ stdLib.HTMLElement, 
      /* fromElement */ stdLib.HTMLElement, 
      scala.Unit
    ] = null,
    beforeRegister: js.Function0[scala.Unit] = null,
    behaviors: js.Array[js.Object] = null,
    cancelAsync: js.Function1[/* handle */ scala.Double, scala.Unit] = null,
    cancelDebouncer: js.Function1[/* jobName */ java.lang.String, scala.Unit] = null,
    classFollows: js.Function3[
      /* name */ java.lang.String, 
      /* toElement */ stdLib.HTMLElement, 
      /* fromElement */ stdLib.HTMLElement, 
      scala.Unit
    ] = null,
    copyOwnProperty: js.Function3[
      /* name */ java.lang.String, 
      /* source */ js.Object, 
      /* target */ js.Object, 
      scala.Unit
    ] = null,
    create: js.Function2[/* tag */ java.lang.String, /* props */ js.Object, stdLib.Element] = null,
    created: js.Function0[scala.Unit] = null,
    createdCallback: js.Function0[scala.Unit] = null,
    debounce: js.Function3[
      /* jobName */ java.lang.String, 
      /* callback */ js.Function, 
      /* wait */ js.UndefOr[scala.Double], 
      scala.Unit
    ] = null,
    deserialize: (js.Function2[/* value */ java.lang.String, /* type */ stdLib.NumberConstructor, scala.Double]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.BooleanConstructor, scala.Boolean]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.ObjectConstructor, js.Object]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.ArrayConstructor, js.Array[_]]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.DateConstructor, stdLib.Date]) with (js.Function2[/* value */ java.lang.String, /* type */ stdLib.StringConstructor, java.lang.String]) = null,
    detached: js.Function0[scala.Unit] = null,
    detachedCallback: js.Function0[scala.Unit] = null,
    distributeContent: js.Function0[scala.Unit] = null,
    domHost: js.Function0[stdLib.Element] = null,
    elementMatches: js.Function2[
      /* selector */ java.lang.String, 
      /* node */ js.UndefOr[stdLib.Element], 
      scala.Boolean
    ] = null,
    extend: js.Function2[/* prototype */ js.Object, /* api */ js.Object, js.Object] = null,
    `extends`: java.lang.String = null,
    factoryImpl: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    fire: js.Function3[
      /* type */ java.lang.String, 
      /* detail */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Object], 
      stdLib.CustomEvent[_]
    ] = null,
    flushDebouncer: js.Function1[/* jobName */ java.lang.String, scala.Unit] = null,
    get: js.Function2[
      /* path */ java.lang.String | (js.Array[java.lang.String | scala.Double]), 
      /* root */ js.UndefOr[js.Object], 
      _
    ] = null,
    getContentChildNodes: js.Function1[/* selector */ java.lang.String, js.Array[stdLib.Node]] = null,
    getContentChildren: js.Function1[/* selector */ java.lang.String, js.Array[stdLib.HTMLElement]] = null,
    getEffectiveChildNodes: js.Function0[js.Array[stdLib.Node]] = null,
    getEffectiveChildren: js.Function0[js.Array[stdLib.Node]] = null,
    getNativePrototype: js.Function1[/* tag */ java.lang.String, js.Object] = null,
    getPropertyInfo: js.Function1[/* property */ java.lang.String, js.Object] = null,
    hostAttributes: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    importHref: js.Function3[
      /* href */ java.lang.String, 
      /* onload */ js.UndefOr[js.Function], 
      /* onerror */ js.UndefOr[js.Function], 
      stdLib.HTMLLinkElement
    ] = null,
    instanceTemplate: js.Function1[/* template */ stdLib.HTMLElement, stdLib.DocumentFragment] = null,
    isDebouncerActive: js.Function1[/* jobName */ java.lang.String, scala.Boolean] = null,
    isLightDescendant: js.Function1[/* node */ stdLib.HTMLElement, scala.Boolean] = null,
    isLocalDescendant: js.Function1[/* node */ stdLib.HTMLElement, scala.Boolean] = null,
    linkPaths: js.Function2[/* to */ java.lang.String, /* from */ js.UndefOr[java.lang.String], scala.Unit] = null,
    listen: js.Function3[
      /* node */ stdLib.Element, 
      /* eventName */ java.lang.String, 
      /* methodName */ java.lang.String, 
      scala.Unit
    ] = null,
    listeners: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    mixin: js.Function2[/* target */ js.Object, /* source */ js.Object, js.Object] = null,
    notifyPath: js.Function3[/* path */ java.lang.String, /* value */ js.Any, /* fromAbove */ js.Any, scala.Unit] = null,
    notifySplices: js.Function2[/* path */ java.lang.String, /* splices */ js.Array[PolymerSplice], scala.Unit] = null,
    observers: js.Array[java.lang.String] = null,
    pop: js.Function1[/* path */ java.lang.String, _] = null,
    properties: org.scalablytyped.runtime.StringDictionary[PropConstructorType | PropObjectType] = null,
    push: js.Function2[/* path */ java.lang.String, /* repeated */ js.Any, scala.Double] = null,
    ready: js.Function0[scala.Unit] = null,
    reflectPropertiesToAttribute: js.Function1[/* name */ java.lang.String, scala.Unit] = null,
    registerCallback: js.Function0[scala.Unit] = null,
    registered: js.Function0[scala.Unit] = null,
    resolveUrl: js.Function1[/* url */ java.lang.String, java.lang.String] = null,
    scopeSubtree: js.Function2[/* container */ stdLib.Element, /* shouldObserve */ scala.Boolean, scala.Unit] = null,
    serialize: js.Function1[/* value */ js.Any, java.lang.String] = null,
    serializeValueToAttribute: js.Function3[
      /* value */ js.Any, 
      /* attribute */ java.lang.String, 
      /* node */ js.UndefOr[stdLib.Element], 
      scala.Unit
    ] = null,
    set: js.Function3[
      /* path */ java.lang.String | (js.Array[java.lang.String | scala.Double]), 
      /* value */ js.Any, 
      /* root */ js.UndefOr[js.Object], 
      scala.Unit
    ] = null,
    setScrollDirection: js.Function2[
      /* direction */ java.lang.String, 
      /* node */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ] = null,
    shift: js.Function1[/* path */ java.lang.String, _] = null,
    splice: js.Function4[
      /* path */ java.lang.String, 
      /* index */ scala.Double, 
      /* removeCount */ scala.Double, 
      /* repeated */ js.Any, 
      scala.Double
    ] = null,
    toggleAttribute: js.Function3[
      /* name */ java.lang.String, 
      /* bool */ js.UndefOr[scala.Boolean], 
      /* node */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ] = null,
    toggleClass: js.Function3[
      /* name */ java.lang.String, 
      /* bool */ js.UndefOr[scala.Boolean], 
      /* node */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ] = null,
    transform: js.Function2[
      /* transform */ java.lang.String, 
      /* node */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ] = null,
    translate3d: js.Function4[
      /* x */ scala.Double, 
      /* y */ scala.Double, 
      /* z */ scala.Double, 
      /* node */ js.UndefOr[stdLib.HTMLElement], 
      scala.Unit
    ] = null,
    unlinkPaths: js.Function1[/* path */ java.lang.String, scala.Unit] = null,
    unlisten: js.Function3[
      /* node */ stdLib.Element, 
      /* eventName */ java.lang.String, 
      /* methodName */ java.lang.String, 
      scala.Unit
    ] = null,
    unshift: js.Function2[/* path */ java.lang.String, /* repeated */ js.Any, scala.Double] = null,
    updateStyles: js.Function1[
      /* styles */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]], 
      scala.Unit
    ] = null
  ): Base = {
    val __obj = js.Dynamic.literal(is = is)
    if ($ != null) __obj.updateDynamic("$")($)
    if ($$ != null) __obj.updateDynamic("$$")($$)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (arrayDelete != null) __obj.updateDynamic("arrayDelete")(arrayDelete)
    if (async != null) __obj.updateDynamic("async")(async)
    if (attached != null) __obj.updateDynamic("attached")(attached)
    if (attachedCallback != null) __obj.updateDynamic("attachedCallback")(attachedCallback)
    if (attributeChanged != null) __obj.updateDynamic("attributeChanged")(attributeChanged)
    if (attributeChangedCallback != null) __obj.updateDynamic("attributeChangedCallback")(attributeChangedCallback)
    if (attributeFollows != null) __obj.updateDynamic("attributeFollows")(attributeFollows)
    if (beforeRegister != null) __obj.updateDynamic("beforeRegister")(beforeRegister)
    if (behaviors != null) __obj.updateDynamic("behaviors")(behaviors)
    if (cancelAsync != null) __obj.updateDynamic("cancelAsync")(cancelAsync)
    if (cancelDebouncer != null) __obj.updateDynamic("cancelDebouncer")(cancelDebouncer)
    if (classFollows != null) __obj.updateDynamic("classFollows")(classFollows)
    if (copyOwnProperty != null) __obj.updateDynamic("copyOwnProperty")(copyOwnProperty)
    if (create != null) __obj.updateDynamic("create")(create)
    if (created != null) __obj.updateDynamic("created")(created)
    if (createdCallback != null) __obj.updateDynamic("createdCallback")(createdCallback)
    if (debounce != null) __obj.updateDynamic("debounce")(debounce)
    if (deserialize != null) __obj.updateDynamic("deserialize")(deserialize)
    if (detached != null) __obj.updateDynamic("detached")(detached)
    if (detachedCallback != null) __obj.updateDynamic("detachedCallback")(detachedCallback)
    if (distributeContent != null) __obj.updateDynamic("distributeContent")(distributeContent)
    if (domHost != null) __obj.updateDynamic("domHost")(domHost)
    if (elementMatches != null) __obj.updateDynamic("elementMatches")(elementMatches)
    if (extend != null) __obj.updateDynamic("extend")(extend)
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (factoryImpl != null) __obj.updateDynamic("factoryImpl")(factoryImpl)
    if (fire != null) __obj.updateDynamic("fire")(fire)
    if (flushDebouncer != null) __obj.updateDynamic("flushDebouncer")(flushDebouncer)
    if (get != null) __obj.updateDynamic("get")(get)
    if (getContentChildNodes != null) __obj.updateDynamic("getContentChildNodes")(getContentChildNodes)
    if (getContentChildren != null) __obj.updateDynamic("getContentChildren")(getContentChildren)
    if (getEffectiveChildNodes != null) __obj.updateDynamic("getEffectiveChildNodes")(getEffectiveChildNodes)
    if (getEffectiveChildren != null) __obj.updateDynamic("getEffectiveChildren")(getEffectiveChildren)
    if (getNativePrototype != null) __obj.updateDynamic("getNativePrototype")(getNativePrototype)
    if (getPropertyInfo != null) __obj.updateDynamic("getPropertyInfo")(getPropertyInfo)
    if (hostAttributes != null) __obj.updateDynamic("hostAttributes")(hostAttributes)
    if (importHref != null) __obj.updateDynamic("importHref")(importHref)
    if (instanceTemplate != null) __obj.updateDynamic("instanceTemplate")(instanceTemplate)
    if (isDebouncerActive != null) __obj.updateDynamic("isDebouncerActive")(isDebouncerActive)
    if (isLightDescendant != null) __obj.updateDynamic("isLightDescendant")(isLightDescendant)
    if (isLocalDescendant != null) __obj.updateDynamic("isLocalDescendant")(isLocalDescendant)
    if (linkPaths != null) __obj.updateDynamic("linkPaths")(linkPaths)
    if (listen != null) __obj.updateDynamic("listen")(listen)
    if (listeners != null) __obj.updateDynamic("listeners")(listeners)
    if (mixin != null) __obj.updateDynamic("mixin")(mixin)
    if (notifyPath != null) __obj.updateDynamic("notifyPath")(notifyPath)
    if (notifySplices != null) __obj.updateDynamic("notifySplices")(notifySplices)
    if (observers != null) __obj.updateDynamic("observers")(observers)
    if (pop != null) __obj.updateDynamic("pop")(pop)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (push != null) __obj.updateDynamic("push")(push)
    if (ready != null) __obj.updateDynamic("ready")(ready)
    if (reflectPropertiesToAttribute != null) __obj.updateDynamic("reflectPropertiesToAttribute")(reflectPropertiesToAttribute)
    if (registerCallback != null) __obj.updateDynamic("registerCallback")(registerCallback)
    if (registered != null) __obj.updateDynamic("registered")(registered)
    if (resolveUrl != null) __obj.updateDynamic("resolveUrl")(resolveUrl)
    if (scopeSubtree != null) __obj.updateDynamic("scopeSubtree")(scopeSubtree)
    if (serialize != null) __obj.updateDynamic("serialize")(serialize)
    if (serializeValueToAttribute != null) __obj.updateDynamic("serializeValueToAttribute")(serializeValueToAttribute)
    if (set != null) __obj.updateDynamic("set")(set)
    if (setScrollDirection != null) __obj.updateDynamic("setScrollDirection")(setScrollDirection)
    if (shift != null) __obj.updateDynamic("shift")(shift)
    if (splice != null) __obj.updateDynamic("splice")(splice)
    if (toggleAttribute != null) __obj.updateDynamic("toggleAttribute")(toggleAttribute)
    if (toggleClass != null) __obj.updateDynamic("toggleClass")(toggleClass)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (translate3d != null) __obj.updateDynamic("translate3d")(translate3d)
    if (unlinkPaths != null) __obj.updateDynamic("unlinkPaths")(unlinkPaths)
    if (unlisten != null) __obj.updateDynamic("unlisten")(unlisten)
    if (unshift != null) __obj.updateDynamic("unshift")(unshift)
    if (updateStyles != null) __obj.updateDynamic("updateStyles")(updateStyles)
    __obj.asInstanceOf[Base]
  }
}

