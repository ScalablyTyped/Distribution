package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrimaryText extends StObject {
  
  var primaryText: js.UndefOr[String] = js.undefined
  
  var secondaryText: js.UndefOr[String] = js.undefined
  
  var threshold: js.UndefOr[Double] = js.undefined
}
object PrimaryText {
  
  inline def apply(): PrimaryText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryText]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrimaryText] (val x: Self) extends AnyVal {
    
    inline def setPrimaryText(value: String): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
    
    inline def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
    
    inline def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
    
    inline def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
    
    inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
