package typings.atOracleOraclejet.ojprogresslistMod

import typings.atOracleOraclejet.ojprogresslistMod.ProgressItemNs.EventType
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressItem extends js.Object {
  def addEventListener(eventType: EventType, listener: EventListener): Unit
  def removeEventListener(eventType: EventType, listener: EventListener): Unit
}

object ProgressItem {
  @scala.inline
  def apply(
    addEventListener: (EventType, EventListener) => Unit,
    removeEventListener: (EventType, EventListener) => Unit
  ): ProgressItem = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[ProgressItem]
  }
}

