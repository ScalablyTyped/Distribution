package typings.nextSeo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Closes extends StObject {
  
  var `@type`: String
  
  var closes: String
  
  var dayOfWeek: String | js.Array[String]
  
  var opens: String
  
  var validFrom: js.UndefOr[String] = js.undefined
  
  var validThrough: js.UndefOr[String] = js.undefined
}
object Closes {
  
  inline def apply(`@type`: String, closes: String, dayOfWeek: String | js.Array[String], opens: String): Closes = {
    val __obj = js.Dynamic.literal(closes = closes.asInstanceOf[js.Any], dayOfWeek = dayOfWeek.asInstanceOf[js.Any], opens = opens.asInstanceOf[js.Any])
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Closes]
  }
  
  extension [Self <: Closes](x: Self) {
    
    inline def `set@type`(value: String): Self = StObject.set(x, "@type", value.asInstanceOf[js.Any])
    
    inline def setCloses(value: String): Self = StObject.set(x, "closes", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeek(value: String | js.Array[String]): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    inline def setDayOfWeekVarargs(value: String*): Self = StObject.set(x, "dayOfWeek", js.Array(value*))
    
    inline def setOpens(value: String): Self = StObject.set(x, "opens", value.asInstanceOf[js.Any])
    
    inline def setValidFrom(value: String): Self = StObject.set(x, "validFrom", value.asInstanceOf[js.Any])
    
    inline def setValidFromUndefined: Self = StObject.set(x, "validFrom", js.undefined)
    
    inline def setValidThrough(value: String): Self = StObject.set(x, "validThrough", value.asInstanceOf[js.Any])
    
    inline def setValidThroughUndefined: Self = StObject.set(x, "validThrough", js.undefined)
  }
}
