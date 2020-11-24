package typings.ol.dragAndDropMod

import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.addfeatures
import typings.std.DragEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DragAndDrop
  extends typings.ol.interactionInteractionMod.default {
  
  def handleDrop(event: DragEvent): Unit = js.native
  
  def handleStop(event: DragEvent): Unit = js.native
  
  @JSName("on")
  def on_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): EventsKey = js.native
  
  @JSName("once")
  def once_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): EventsKey = js.native
  
  @JSName("un")
  def un_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): Unit = js.native
}
