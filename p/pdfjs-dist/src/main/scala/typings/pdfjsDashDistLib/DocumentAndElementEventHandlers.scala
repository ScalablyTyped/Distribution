package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentAndElementEventHandlers extends js.Object {
  var oncopy: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | scala.Null = js.native
  var oncut: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | scala.Null = js.native
  var onpaste: (js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]) | scala.Null = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): scala.Unit = js.native
  def addEventListener(
    `type`: java.lang.String,
    listener: EventListenerOrEventListenerObject,
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, options: scala.Boolean): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_copy(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_cut(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_paste(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
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
  def removeEventListener_copy(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_copy(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.copy,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_cut(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.cut,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_paste(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.paste,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ ClipboardEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
}

