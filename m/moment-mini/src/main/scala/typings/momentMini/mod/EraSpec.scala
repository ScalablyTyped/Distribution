package typings.momentMini.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EraSpec extends StObject {
  
  var abbr: String
  
  var name: String
  
  var narrow: String
  
  var offset: Double
  
  var since: String | Double
  
  var until: String | Double
}
object EraSpec {
  
  inline def apply(
    abbr: String,
    name: String,
    narrow: String,
    offset: Double,
    since: String | Double,
    until: String | Double
  ): EraSpec = {
    val __obj = js.Dynamic.literal(abbr = abbr.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], narrow = narrow.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], since = since.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
    __obj.asInstanceOf[EraSpec]
  }
  
  extension [Self <: EraSpec](x: Self) {
    
    inline def setAbbr(value: String): Self = StObject.set(x, "abbr", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNarrow(value: String): Self = StObject.set(x, "narrow", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setSince(value: String | Double): Self = StObject.set(x, "since", value.asInstanceOf[js.Any])
    
    inline def setUntil(value: String | Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
  }
}
