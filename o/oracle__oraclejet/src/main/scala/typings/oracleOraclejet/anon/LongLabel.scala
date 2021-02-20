package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LongLabel extends StObject {
  
  var id: String = js.native
  
  var longLabel: js.UndefOr[String] = js.native
  
  var shortLabel: js.UndefOr[String] = js.native
}
object LongLabel {
  
  @scala.inline
  def apply(id: String): LongLabel = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[LongLabel]
  }
  
  @scala.inline
  implicit class LongLabelMutableBuilder[Self <: LongLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongLabel(value: String): Self = StObject.set(x, "longLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongLabelUndefined: Self = StObject.set(x, "longLabel", js.undefined)
    
    @scala.inline
    def setShortLabel(value: String): Self = StObject.set(x, "shortLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortLabelUndefined: Self = StObject.set(x, "shortLabel", js.undefined)
  }
}
