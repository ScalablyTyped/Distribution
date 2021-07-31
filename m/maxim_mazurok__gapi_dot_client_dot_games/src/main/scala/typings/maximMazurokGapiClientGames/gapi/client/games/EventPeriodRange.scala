package typings.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventPeriodRange extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#eventPeriodRange`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The time when this update period ends, in millis, since 1970 UTC (Unix Epoch). */
  var periodEndMillis: js.UndefOr[String] = js.undefined
  
  /** The time when this update period begins, in millis, since 1970 UTC (Unix Epoch). */
  var periodStartMillis: js.UndefOr[String] = js.undefined
}
object EventPeriodRange {
  
  @scala.inline
  def apply(): EventPeriodRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventPeriodRange]
  }
  
  @scala.inline
  implicit class EventPeriodRangeMutableBuilder[Self <: EventPeriodRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPeriodEndMillis(value: String): Self = StObject.set(x, "periodEndMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodEndMillisUndefined: Self = StObject.set(x, "periodEndMillis", js.undefined)
    
    @scala.inline
    def setPeriodStartMillis(value: String): Self = StObject.set(x, "periodStartMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodStartMillisUndefined: Self = StObject.set(x, "periodStartMillis", js.undefined)
  }
}
