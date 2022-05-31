package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.auto
import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionStyle extends StObject {
  
  var position: js.UndefOr[center | start | auto] = js.undefined
  
  var style: js.UndefOr[js.Object] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object PositionStyle {
  
  inline def apply(): PositionStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionStyle]
  }
  
  extension [Self <: PositionStyle](x: Self) {
    
    inline def setPosition(value: center | start | auto): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
