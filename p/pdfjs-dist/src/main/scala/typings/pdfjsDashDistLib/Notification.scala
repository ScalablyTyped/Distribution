package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notification extends EventTarget {
  val actions: js.Array[NotificationAction] = js.native
  val badge: java.lang.String = js.native
  val body: java.lang.String = js.native
  val data: js.Any = js.native
  val dir: NotificationDirection = js.native
  val icon: java.lang.String = js.native
  val image: java.lang.String = js.native
  val lang: java.lang.String = js.native
  var onclick: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onclose: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  var onshow: (js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]) | scala.Null = js.native
  val renotify: scala.Boolean = js.native
  val requireInteraction: scala.Boolean = js.native
  val silent: scala.Boolean = js.native
  val tag: java.lang.String = js.native
  val timestamp: scala.Double = js.native
  val title: java.lang.String = js.native
  val vibrate: js.Array[scala.Double] = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_show(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.show,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_show(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.show,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_show(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.show,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  def close(): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_click(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.click,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_close(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.close,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_show(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.show,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_show(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.show,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_show(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.show,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ Event, _],
    options: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("Notification")
@js.native
object Notification
  extends org.scalablytyped.runtime.Instantiable1[/* title */ java.lang.String, Notification]
     with org.scalablytyped.runtime.Instantiable2[/* title */ java.lang.String, /* options */ NotificationOptions, Notification] {
  val maxActions: scala.Double = js.native
  val permission: pdfjsDashDistLib.NotificationPermission = js.native
  def requestPermission(): js.Promise[pdfjsDashDistLib.NotificationPermission] = js.native
  def requestPermission(deprecatedCallback: pdfjsDashDistLib.NotificationPermissionCallback): js.Promise[pdfjsDashDistLib.NotificationPermission] = js.native
}

