package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrimaryText extends StObject {
  
  var primaryText: js.UndefOr[String] = js.native
  
  var secondaryText: js.UndefOr[String] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
}
object PrimaryText {
  
  @scala.inline
  def apply(): PrimaryText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrimaryText]
  }
  
  @scala.inline
  implicit class PrimaryTextMutableBuilder[Self <: PrimaryText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrimaryText(value: String): Self = StObject.set(x, "primaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryTextUndefined: Self = StObject.set(x, "primaryText", js.undefined)
    
    @scala.inline
    def setSecondaryText(value: String): Self = StObject.set(x, "secondaryText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryTextUndefined: Self = StObject.set(x, "secondaryText", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
  }
}
