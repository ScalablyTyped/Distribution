package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.bottom
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.middle
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import typings.oracleOraclejet.oracleOraclejetStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Halign extends StObject {
  
  var halign: start | end | center
  
  var height: Double
  
  var rendered: on | off
  
  var valign: top | bottom | middle
  
  var width: Double
}
object Halign {
  
  inline def apply(
    halign: start | end | center,
    height: Double,
    rendered: on | off,
    valign: top | bottom | middle,
    width: Double
  ): Halign = {
    val __obj = js.Dynamic.literal(halign = halign.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], rendered = rendered.asInstanceOf[js.Any], valign = valign.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Halign]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Halign] (val x: Self) extends AnyVal {
    
    inline def setHalign(value: start | end | center): Self = StObject.set(x, "halign", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setRendered(value: on | off): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setValign(value: top | bottom | middle): Self = StObject.set(x, "valign", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
