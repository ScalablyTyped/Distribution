package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timestamp extends StObject {
  
  /**
    * Non-negative fractions of a second at nanosecond resolution. Negative second values with fractions must still have non-negative nanos values that count forward in time. Must be from
    * 0 to 999,999,999 inclusive.
    */
  var nanos: js.UndefOr[Double] = js.undefined
  
  /** Represents seconds of UTC time since Unix epoch 1970-01-01T00:00:00Z. Must be from 0001-01-01T00:00:00Z to 9999-12-31T23:59:59Z inclusive. */
  var seconds: js.UndefOr[String] = js.undefined
}
object Timestamp {
  
  @scala.inline
  def apply(): Timestamp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Timestamp]
  }
  
  @scala.inline
  implicit class TimestampMutableBuilder[Self <: Timestamp] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNanos(value: Double): Self = StObject.set(x, "nanos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanosUndefined: Self = StObject.set(x, "nanos", js.undefined)
    
    @scala.inline
    def setSeconds(value: String): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
  }
}
