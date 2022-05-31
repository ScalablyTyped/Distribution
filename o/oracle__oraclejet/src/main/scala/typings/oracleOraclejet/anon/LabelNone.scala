package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelNone extends StObject {
  
  var labelNone: js.UndefOr[String] = js.undefined
}
object LabelNone {
  
  inline def apply(): LabelNone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelNone]
  }
  
  extension [Self <: LabelNone](x: Self) {
    
    inline def setLabelNone(value: String): Self = StObject.set(x, "labelNone", value.asInstanceOf[js.Any])
    
    inline def setLabelNoneUndefined: Self = StObject.set(x, "labelNone", js.undefined)
  }
}
