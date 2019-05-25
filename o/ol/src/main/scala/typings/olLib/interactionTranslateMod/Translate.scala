package typings
package olLib.interactionTranslateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translate
  extends olLib.interactionPointerMod.default {
  def getHitTolerance(): scala.Double = js.native
  @JSName("on")
  def on_translateend(
    `type`: olLib.olLibStrings.translateend,
    listener: js.Function1[/* evt */ TranslateEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_translatestart(
    `type`: olLib.olLibStrings.translatestart,
    listener: js.Function1[/* evt */ TranslateEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("on")
  def on_translating(
    `type`: olLib.olLibStrings.translating,
    listener: js.Function1[/* evt */ TranslateEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_translateend(
    `type`: olLib.olLibStrings.translateend,
    listener: js.Function1[/* evt */ TranslateEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_translatestart(
    `type`: olLib.olLibStrings.translatestart,
    listener: js.Function1[/* evt */ TranslateEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_translating(
    `type`: olLib.olLibStrings.translating,
    listener: js.Function1[/* evt */ TranslateEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def setHitTolerance(hitTolerance: scala.Double): scala.Unit = js.native
  @JSName("un")
  def un_translateend(
    `type`: olLib.olLibStrings.translateend,
    listener: js.Function1[/* evt */ TranslateEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_translatestart(
    `type`: olLib.olLibStrings.translatestart,
    listener: js.Function1[/* evt */ TranslateEvent, scala.Unit]
  ): scala.Unit = js.native
  @JSName("un")
  def un_translating(
    `type`: olLib.olLibStrings.translating,
    listener: js.Function1[/* evt */ TranslateEvent, scala.Unit]
  ): scala.Unit = js.native
}

