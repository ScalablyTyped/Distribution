package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowEventHandlers extends js.Object {
  var onafterprint: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onbeforeprint: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onbeforeunload: (js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]) | scala.Null = js.native
  var onhashchange: (js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]) | scala.Null = js.native
  var onlanguagechange: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onmessage: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]) | scala.Null = js.native
  var onmessageerror: (js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]) | scala.Null = js.native
  var onoffline: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var ononline: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onpagehide: (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]) | scala.Null = js.native
  var onpageshow: (js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]) | scala.Null = js.native
  var onpopstate: (js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]) | scala.Null = js.native
  var onrejectionhandled: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onstorage: (js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]) | scala.Null = js.native
  var onunhandledrejection: (js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]) | scala.Null = js.native
  var onunload: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_afterprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_beforeunload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_hashchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_languagechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_messageerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_offline(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_online(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pagehide(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pageshow(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_popstate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_rejectionhandled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_storage(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unhandledrejection(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  def removeEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: EventListenerOptions
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_afterprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.afterprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeprint(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeprint,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_beforeunload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.beforeunload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ BeforeUnloadEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_hashchange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.hashchange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ HashChangeEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_languagechange(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.languagechange,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_messageerror(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.messageerror,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ MessageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_offline(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.offline,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_online(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.online,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pagehide(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pagehide,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pageshow(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pageshow,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PageTransitionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_popstate(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.popstate,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PopStateEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_rejectionhandled(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.rejectionhandled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_storage(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.storage,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ StorageEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unhandledrejection(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unhandledrejection,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ PromiseRejectionEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.unload,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
}

