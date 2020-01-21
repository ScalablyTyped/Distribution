package typings.oracleOraclejet.ojprogresslistMod

import typings.oracleOraclejet.ojprogresslistMod.ProgressItem.EventType
import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressItem_ extends js.Object {
  def addEventListener(eventType: EventType, listener: EventListener): Unit
  def removeEventListener(eventType: EventType, listener: EventListener): Unit
}

object ProgressItem_ {
  @scala.inline
  def apply(
    addEventListener: (EventType, EventListener) => Unit,
    removeEventListener: (EventType, EventListener) => Unit
  ): ProgressItem_ = {
    val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), removeEventListener = js.Any.fromFunction2(removeEventListener))
  
    __obj.asInstanceOf[ProgressItem_]
  }
}

