package typings.nodeHueApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Major extends StObject {
  
  var major: String
  
  var minor: String
}
object Major {
  
  inline def apply(major: String, minor: String): Major = {
    val __obj = js.Dynamic.literal(major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Major]
  }
  
  extension [Self <: Major](x: Self) {
    
    inline def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    inline def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
  }
}
