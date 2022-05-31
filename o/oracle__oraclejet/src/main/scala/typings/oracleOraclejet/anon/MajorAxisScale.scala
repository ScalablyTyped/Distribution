package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MajorAxisScale
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var majorAxisScale: String
  
  var minorAxisScale: String
  
  var viewportEnd: String
  
  var viewportStart: String
}
object MajorAxisScale {
  
  inline def apply(majorAxisScale: String, minorAxisScale: String, viewportEnd: String, viewportStart: String): MajorAxisScale = {
    val __obj = js.Dynamic.literal(majorAxisScale = majorAxisScale.asInstanceOf[js.Any], minorAxisScale = minorAxisScale.asInstanceOf[js.Any], viewportEnd = viewportEnd.asInstanceOf[js.Any], viewportStart = viewportStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[MajorAxisScale]
  }
  
  extension [Self <: MajorAxisScale](x: Self) {
    
    inline def setMajorAxisScale(value: String): Self = StObject.set(x, "majorAxisScale", value.asInstanceOf[js.Any])
    
    inline def setMinorAxisScale(value: String): Self = StObject.set(x, "minorAxisScale", value.asInstanceOf[js.Any])
    
    inline def setViewportEnd(value: String): Self = StObject.set(x, "viewportEnd", value.asInstanceOf[js.Any])
    
    inline def setViewportStart(value: String): Self = StObject.set(x, "viewportStart", value.asInstanceOf[js.Any])
  }
}
