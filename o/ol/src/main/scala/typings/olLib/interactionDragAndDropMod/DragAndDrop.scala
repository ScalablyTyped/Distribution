package typings
package olLib.interactionDragAndDropMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragAndDrop
  extends olLib.interactionInteractionMod.default {
  @JSName("on")
  def on_addfeatures(
    `type`: olLib.olLibStrings.addfeatures,
    listener: js.Function1[/* evt */ DragAndDropEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_addfeatures(
    `type`: olLib.olLibStrings.addfeatures,
    listener: js.Function1[/* evt */ DragAndDropEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("un")
  def un_addfeatures(
    `type`: olLib.olLibStrings.addfeatures,
    listener: js.Function1[/* evt */ DragAndDropEvent, scala.Unit]
  ): scala.Unit = js.native
}

