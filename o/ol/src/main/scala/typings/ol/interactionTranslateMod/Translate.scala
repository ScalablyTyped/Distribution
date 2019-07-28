package typings.ol.interactionTranslateMod

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.translateend
import typings.ol.olStrings.translatestart
import typings.ol.olStrings.translating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translate
  extends typings.ol.interactionPointerMod.default {
  def getHitTolerance(): Double = js.native
  @JSName("on")
  def on_translateend(`type`: translateend, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_translatestart(`type`: translatestart, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_translating(`type`: translating, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_translateend(`type`: translateend, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_translatestart(`type`: translatestart, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_translating(`type`: translating, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
  def setHitTolerance(hitTolerance: Double): Unit = js.native
  @JSName("un")
  def un_translateend(`type`: translateend, listener: js.Function1[/* evt */ TranslateEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_translatestart(`type`: translatestart, listener: js.Function1[/* evt */ TranslateEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_translating(`type`: translating, listener: js.Function1[/* evt */ TranslateEvent, Unit]): Unit = js.native
}

