package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpeechSynthesisUtterance extends EventTarget {
  var lang: java.lang.String = js.native
  var onboundary: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | scala.Null = js.native
  var onend: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | scala.Null = js.native
  var onerror: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _]) | scala.Null = js.native
  var onmark: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | scala.Null = js.native
  var onpause: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | scala.Null = js.native
  var onresume: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | scala.Null = js.native
  var onstart: (js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]) | scala.Null = js.native
  var pitch: scala.Double = js.native
  var rate: scala.Double = js.native
  var text: java.lang.String = js.native
  var voice: SpeechSynthesisVoice = js.native
  var volume: scala.Double = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_boundary(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_end(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_mark(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_resume(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: AddEventListenerOptions
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_start(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_boundary(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_boundary(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_boundary(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.boundary,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_end(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.end,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_error(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.error,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisErrorEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mark(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mark(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_mark(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.mark,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_pause(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.pause,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_resume(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.resume,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: EventListenerOptions
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_start(
    `type`: pdfjsDashDistLib.pdfjsDashDistLibStrings.start,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ SpeechSynthesisEvent, _],
    options: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("SpeechSynthesisUtterance")
@js.native
object SpeechSynthesisUtterance
  extends org.scalablytyped.runtime.Instantiable0[SpeechSynthesisUtterance]
     with org.scalablytyped.runtime.Instantiable1[/* text */ java.lang.String, SpeechSynthesisUtterance]

