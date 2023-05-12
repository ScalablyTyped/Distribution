package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZone extends StObject {
  
  /**
    * The IANA time zone ID; the configured time zone by default
    */
  var timeZone: js.UndefOr[String] = js.undefined
}
object TimeZone {
  
  inline def apply(): TimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeZone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeZone] (val x: Self) extends AnyVal {
    
    inline def setTimeZone(value: String): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
  }
}
