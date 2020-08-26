package typings.polymer.mod.global.polymer

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
  var deserialize: (js.UndefOr[js.Function2[/* value */ String, /* type */ NumberConstructor, Double]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ BooleanConstructor, Boolean]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ ObjectConstructor, js.Object]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ ArrayConstructor, js.Array[_]]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ DateConstructor, Date]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ StringConstructor, String]]) = js.native
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

object CommonBase {
  @scala.inline
  def apply(
    deserialize: (js.UndefOr[js.Function2[/* value */ String, /* type */ NumberConstructor, Double]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ BooleanConstructor, Boolean]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ ObjectConstructor, js.Object]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ ArrayConstructor, js.Array[_]]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ DateConstructor, Date]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ StringConstructor, String]]),
    is: String
  ): CommonBase = {
    val __obj = js.Dynamic.literal(deserialize = deserialize.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonBase]
  }
  @scala.inline
  implicit class CommonBaseOps[Self <: CommonBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeserialize(
      value: (js.UndefOr[js.Function2[/* value */ String, /* type */ NumberConstructor, Double]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ BooleanConstructor, Boolean]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ ObjectConstructor, js.Object]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ ArrayConstructor, js.Array[_]]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ DateConstructor, Date]]) with (js.UndefOr[js.Function2[/* value */ String, /* type */ StringConstructor, String]])
    ): Self = this.set("deserialize", value.asInstanceOf[js.Any])
    @scala.inline
    def setIs(value: String): Self = this.set("is", value.asInstanceOf[js.Any])
    @scala.inline
    def set$(value: js.Any): Self = this.set("$", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$: Self = this.set("$", js.undefined)
    @scala.inline
    def setDollarDollar(value: /* selector */ String => Element): Self = this.set("$$", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDollarDollar: Self = this.set("$$", js.undefined)
    @scala.inline
    def setArrayDelete(value: (/* path */ String | js.Array[_], /* item */ js.Any) => js.Array[_]): Self = this.set("arrayDelete", js.Any.fromFunction2(value))
    @scala.inline
    def deleteArrayDelete: Self = this.set("arrayDelete", js.undefined)
    @scala.inline
    def setAsync(value: (/* callback */ js.Function0[Unit], /* waitTime */ js.UndefOr[Double]) => Double): Self = this.set("async", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setAttached(value: () => Unit): Self = this.set("attached", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAttached: Self = this.set("attached", js.undefined)
    @scala.inline
    def setAttachedCallback(value: () => Unit): Self = this.set("attachedCallback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteAttachedCallback: Self = this.set("attachedCallback", js.undefined)
    @scala.inline
    def setAttributeChanged(value: (/* name */ String, /* oldValue */ js.Any, /* newValue */ js.Any) => Unit): Self = this.set("attributeChanged", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAttributeChanged: Self = this.set("attributeChanged", js.undefined)
    @scala.inline
    def setAttributeChangedCallback(
      value: (/* attributeName */ String, /* oldValue */ String | Null, /* newValue */ String | Null, /* namespace */ String | Null) => Unit
    ): Self = this.set("attributeChangedCallback", js.Any.fromFunction4(value))
    @scala.inline
    def deleteAttributeChangedCallback: Self = this.set("attributeChangedCallback", js.undefined)
    @scala.inline
    def setAttributeFollows(value: (/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement) => Unit): Self = this.set("attributeFollows", js.Any.fromFunction3(value))
    @scala.inline
    def deleteAttributeFollows: Self = this.set("attributeFollows", js.undefined)
    @scala.inline
    def setBeforeRegister(value: () => Unit): Self = this.set("beforeRegister", js.Any.fromFunction0(value))
    @scala.inline
    def deleteBeforeRegister: Self = this.set("beforeRegister", js.undefined)
    @scala.inline
    def setBehaviorsVarargs(value: js.Object*): Self = this.set("behaviors", js.Array(value :_*))
    @scala.inline
    def setBehaviors(value: js.Array[js.Object]): Self = this.set("behaviors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBehaviors: Self = this.set("behaviors", js.undefined)
    @scala.inline
    def setCancelAsync(value: /* handle */ Double => Unit): Self = this.set("cancelAsync", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCancelAsync: Self = this.set("cancelAsync", js.undefined)
    @scala.inline
    def setCancelDebouncer(value: /* jobName */ String => Unit): Self = this.set("cancelDebouncer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCancelDebouncer: Self = this.set("cancelDebouncer", js.undefined)
    @scala.inline
    def setClassFollows(value: (/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement) => Unit): Self = this.set("classFollows", js.Any.fromFunction3(value))
    @scala.inline
    def deleteClassFollows: Self = this.set("classFollows", js.undefined)
    @scala.inline
    def setCopyOwnProperty(value: (/* name */ String, /* source */ js.Object, /* target */ js.Object) => Unit): Self = this.set("copyOwnProperty", js.Any.fromFunction3(value))
    @scala.inline
    def deleteCopyOwnProperty: Self = this.set("copyOwnProperty", js.undefined)
    @scala.inline
    def setCreate(value: (/* tag */ String, /* props */ js.Object) => Element): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCreated(value: () => Unit): Self = this.set("created", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setCreatedCallback(value: () => Unit): Self = this.set("createdCallback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCreatedCallback: Self = this.set("createdCallback", js.undefined)
    @scala.inline
    def setDebounce(value: (/* jobName */ String, /* callback */ js.Function, /* wait */ js.UndefOr[Double]) => Unit): Self = this.set("debounce", js.Any.fromFunction3(value))
    @scala.inline
    def deleteDebounce: Self = this.set("debounce", js.undefined)
    @scala.inline
    def setDetached(value: () => Unit): Self = this.set("detached", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDetached: Self = this.set("detached", js.undefined)
    @scala.inline
    def setDetachedCallback(value: () => Unit): Self = this.set("detachedCallback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDetachedCallback: Self = this.set("detachedCallback", js.undefined)
    @scala.inline
    def setDistributeContent(value: () => Unit): Self = this.set("distributeContent", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDistributeContent: Self = this.set("distributeContent", js.undefined)
    @scala.inline
    def setDomHost(value: () => Element): Self = this.set("domHost", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDomHost: Self = this.set("domHost", js.undefined)
    @scala.inline
    def setElementMatches(value: (/* selector */ String, /* node */ js.UndefOr[Element]) => Boolean): Self = this.set("elementMatches", js.Any.fromFunction2(value))
    @scala.inline
    def deleteElementMatches: Self = this.set("elementMatches", js.undefined)
    @scala.inline
    def setExtend(value: (/* prototype */ js.Object, /* api */ js.Object) => js.Object): Self = this.set("extend", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    @scala.inline
    def setExtends(value: String): Self = this.set("extends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    @scala.inline
    def setFactoryImpl(value: /* repeated */ js.Any => Unit): Self = this.set("factoryImpl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFactoryImpl: Self = this.set("factoryImpl", js.undefined)
    @scala.inline
    def setFire(
      value: (/* type */ String, /* detail */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object]) => CustomEvent[_]
    ): Self = this.set("fire", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFire: Self = this.set("fire", js.undefined)
    @scala.inline
    def setFlushDebouncer(value: /* jobName */ String => Unit): Self = this.set("flushDebouncer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFlushDebouncer: Self = this.set("flushDebouncer", js.undefined)
    @scala.inline
    def setGet(value: (/* path */ String | (js.Array[String | Double]), /* root */ js.UndefOr[js.Object]) => _): Self = this.set("get", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGet: Self = this.set("get", js.undefined)
    @scala.inline
    def setGetContentChildNodes(value: /* selector */ String => js.Array[Node]): Self = this.set("getContentChildNodes", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetContentChildNodes: Self = this.set("getContentChildNodes", js.undefined)
    @scala.inline
    def setGetContentChildren(value: /* selector */ String => js.Array[HTMLElement]): Self = this.set("getContentChildren", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetContentChildren: Self = this.set("getContentChildren", js.undefined)
    @scala.inline
    def setGetEffectiveChildNodes(value: () => js.Array[Node]): Self = this.set("getEffectiveChildNodes", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetEffectiveChildNodes: Self = this.set("getEffectiveChildNodes", js.undefined)
    @scala.inline
    def setGetEffectiveChildren(value: () => js.Array[Node]): Self = this.set("getEffectiveChildren", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetEffectiveChildren: Self = this.set("getEffectiveChildren", js.undefined)
    @scala.inline
    def setGetNativePrototype(value: /* tag */ String => js.Object): Self = this.set("getNativePrototype", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetNativePrototype: Self = this.set("getNativePrototype", js.undefined)
    @scala.inline
    def setGetPropertyInfo(value: /* property */ String => js.Object): Self = this.set("getPropertyInfo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetPropertyInfo: Self = this.set("getPropertyInfo", js.undefined)
    @scala.inline
    def setHostAttributes(value: StringDictionary[js.Any]): Self = this.set("hostAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostAttributes: Self = this.set("hostAttributes", js.undefined)
    @scala.inline
    def setImportHref(
      value: (/* href */ String, /* onload */ js.UndefOr[js.Function], /* onerror */ js.UndefOr[js.Function]) => HTMLLinkElement
    ): Self = this.set("importHref", js.Any.fromFunction3(value))
    @scala.inline
    def deleteImportHref: Self = this.set("importHref", js.undefined)
    @scala.inline
    def setInstanceTemplate(value: /* template */ HTMLElement => DocumentFragment): Self = this.set("instanceTemplate", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInstanceTemplate: Self = this.set("instanceTemplate", js.undefined)
    @scala.inline
    def setIsDebouncerActive(value: /* jobName */ String => Boolean): Self = this.set("isDebouncerActive", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsDebouncerActive: Self = this.set("isDebouncerActive", js.undefined)
    @scala.inline
    def setIsLightDescendant(value: /* node */ HTMLElement => Boolean): Self = this.set("isLightDescendant", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsLightDescendant: Self = this.set("isLightDescendant", js.undefined)
    @scala.inline
    def setIsLocalDescendant(value: /* node */ HTMLElement => Boolean): Self = this.set("isLocalDescendant", js.Any.fromFunction1(value))
    @scala.inline
    def deleteIsLocalDescendant: Self = this.set("isLocalDescendant", js.undefined)
    @scala.inline
    def setLinkPaths(value: (/* to */ String, /* from */ js.UndefOr[String]) => Unit): Self = this.set("linkPaths", js.Any.fromFunction2(value))
    @scala.inline
    def deleteLinkPaths: Self = this.set("linkPaths", js.undefined)
    @scala.inline
    def setListen(value: (/* node */ Element, /* eventName */ String, /* methodName */ String) => Unit): Self = this.set("listen", js.Any.fromFunction3(value))
    @scala.inline
    def deleteListen: Self = this.set("listen", js.undefined)
    @scala.inline
    def setListeners(value: StringDictionary[String]): Self = this.set("listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
    @scala.inline
    def setMixin(value: (/* target */ js.Object, /* source */ js.Object) => js.Object): Self = this.set("mixin", js.Any.fromFunction2(value))
    @scala.inline
    def deleteMixin: Self = this.set("mixin", js.undefined)
    @scala.inline
    def setNotifyPath(value: (/* path */ String, /* value */ js.Any, /* fromAbove */ js.Any) => Unit): Self = this.set("notifyPath", js.Any.fromFunction3(value))
    @scala.inline
    def deleteNotifyPath: Self = this.set("notifyPath", js.undefined)
    @scala.inline
    def setNotifySplices(value: (/* path */ String, /* splices */ js.Array[PolymerSplice]) => Unit): Self = this.set("notifySplices", js.Any.fromFunction2(value))
    @scala.inline
    def deleteNotifySplices: Self = this.set("notifySplices", js.undefined)
    @scala.inline
    def setObserversVarargs(value: String*): Self = this.set("observers", js.Array(value :_*))
    @scala.inline
    def setObservers(value: js.Array[String]): Self = this.set("observers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObservers: Self = this.set("observers", js.undefined)
    @scala.inline
    def setPop(value: /* path */ String => _): Self = this.set("pop", js.Any.fromFunction1(value))
    @scala.inline
    def deletePop: Self = this.set("pop", js.undefined)
    @scala.inline
    def setProperties(value: StringDictionary[PropConstructorType | PropObjectType]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setPush(value: (/* path */ String, /* repeated */ js.Any) => Double): Self = this.set("push", js.Any.fromFunction2(value))
    @scala.inline
    def deletePush: Self = this.set("push", js.undefined)
    @scala.inline
    def setReady(value: () => Unit): Self = this.set("ready", js.Any.fromFunction0(value))
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    @scala.inline
    def setReflectPropertiesToAttribute(value: /* name */ String => Unit): Self = this.set("reflectPropertiesToAttribute", js.Any.fromFunction1(value))
    @scala.inline
    def deleteReflectPropertiesToAttribute: Self = this.set("reflectPropertiesToAttribute", js.undefined)
    @scala.inline
    def setRegisterCallback(value: () => Unit): Self = this.set("registerCallback", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRegisterCallback: Self = this.set("registerCallback", js.undefined)
    @scala.inline
    def setRegistered(value: () => Unit): Self = this.set("registered", js.Any.fromFunction0(value))
    @scala.inline
    def deleteRegistered: Self = this.set("registered", js.undefined)
    @scala.inline
    def setResolveUrl(value: /* url */ String => String): Self = this.set("resolveUrl", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResolveUrl: Self = this.set("resolveUrl", js.undefined)
    @scala.inline
    def setScopeSubtree(value: (/* container */ Element, /* shouldObserve */ Boolean) => Unit): Self = this.set("scopeSubtree", js.Any.fromFunction2(value))
    @scala.inline
    def deleteScopeSubtree: Self = this.set("scopeSubtree", js.undefined)
    @scala.inline
    def setSerialize(value: /* value */ js.Any => String): Self = this.set("serialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    @scala.inline
    def setSerializeValueToAttribute(value: (/* value */ js.Any, /* attribute */ String, /* node */ js.UndefOr[Element]) => Unit): Self = this.set("serializeValueToAttribute", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSerializeValueToAttribute: Self = this.set("serializeValueToAttribute", js.undefined)
    @scala.inline
    def setSet(
      value: (/* path */ String | (js.Array[String | Double]), /* value */ js.Any, /* root */ js.UndefOr[js.Object]) => Unit
    ): Self = this.set("set", js.Any.fromFunction3(value))
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
    @scala.inline
    def setSetScrollDirection(value: (/* direction */ String, /* node */ js.UndefOr[HTMLElement]) => Unit): Self = this.set("setScrollDirection", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSetScrollDirection: Self = this.set("setScrollDirection", js.undefined)
    @scala.inline
    def setShift(value: /* path */ String => _): Self = this.set("shift", js.Any.fromFunction1(value))
    @scala.inline
    def deleteShift: Self = this.set("shift", js.undefined)
    @scala.inline
    def setSplice(
      value: (/* path */ String, /* index */ Double, /* removeCount */ Double, /* repeated */ js.Any) => Double
    ): Self = this.set("splice", js.Any.fromFunction4(value))
    @scala.inline
    def deleteSplice: Self = this.set("splice", js.undefined)
    @scala.inline
    def setToggleClass(
      value: (/* name */ String, /* bool */ js.UndefOr[Boolean], /* node */ js.UndefOr[HTMLElement]) => Unit
    ): Self = this.set("toggleClass", js.Any.fromFunction3(value))
    @scala.inline
    def deleteToggleClass: Self = this.set("toggleClass", js.undefined)
    @scala.inline
    def setTransform(value: (/* transform */ String, /* node */ js.UndefOr[HTMLElement]) => Unit): Self = this.set("transform", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
    @scala.inline
    def setTranslate3d(
      value: (/* x */ Double, /* y */ Double, /* z */ Double, /* node */ js.UndefOr[HTMLElement]) => Unit
    ): Self = this.set("translate3d", js.Any.fromFunction4(value))
    @scala.inline
    def deleteTranslate3d: Self = this.set("translate3d", js.undefined)
    @scala.inline
    def setUnlinkPaths(value: /* path */ String => Unit): Self = this.set("unlinkPaths", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnlinkPaths: Self = this.set("unlinkPaths", js.undefined)
    @scala.inline
    def setUnlisten(value: (/* node */ Element, /* eventName */ String, /* methodName */ String) => Unit): Self = this.set("unlisten", js.Any.fromFunction3(value))
    @scala.inline
    def deleteUnlisten: Self = this.set("unlisten", js.undefined)
    @scala.inline
    def setUnshift(value: (/* path */ String, /* repeated */ js.Any) => Double): Self = this.set("unshift", js.Any.fromFunction2(value))
    @scala.inline
    def deleteUnshift: Self = this.set("unshift", js.undefined)
    @scala.inline
    def setUpdateStyles(value: /* styles */ js.UndefOr[StringDictionary[String]] => Unit): Self = this.set("updateStyles", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUpdateStyles: Self = this.set("updateStyles", js.undefined)
  }
  
}

