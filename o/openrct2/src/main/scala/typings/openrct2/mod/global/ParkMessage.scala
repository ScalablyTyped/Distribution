package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParkMessage extends StObject {
  
  /**
    * The day of the month this message was posted.
    */
  var day: Double
  
  /**
    * Whether the message has been shown and archived.
    */
  val isArchived: Boolean
  
  /**
    * The date this message was posted in total elapsed months.
    */
  var month: Double
  
  /**
    * Removes the message.
    */
  def remove(): Unit
  
  /**
    * Ride ID for attraction.
    * Entity ID for peep_on_attraction or peep.
    * Researched item for research.
    */
  var subject: js.UndefOr[Double] = js.undefined
  
  /**
    * The actual message content.
    */
  var text: String
  
  /**
    * How old the message is in number of ticks.
    */
  var tickCount: Double
  
  /**
    * The format of the message such as the icon and whether location is enabled.
    */
  var `type`: ParkMessageType
}
object ParkMessage {
  
  inline def apply(
    day: Double,
    isArchived: Boolean,
    month: Double,
    remove: () => Unit,
    text: String,
    tickCount: Double,
    `type`: ParkMessageType
  ): ParkMessage = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], isArchived = isArchived.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], remove = js.Any.fromFunction0(remove), text = text.asInstanceOf[js.Any], tickCount = tickCount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParkMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParkMessage] (val x: Self) extends AnyVal {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setIsArchived(value: Boolean): Self = StObject.set(x, "isArchived", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setRemove(value: () => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction0(value))
    
    inline def setSubject(value: Double): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTickCount(value: Double): Self = StObject.set(x, "tickCount", value.asInstanceOf[js.Any])
    
    inline def setType(value: ParkMessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
