package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InRange extends StObject {
  
  var inRange: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[String] = js.native
  
  var min: js.UndefOr[String] = js.native
}
object InRange {
  
  @scala.inline
  def apply(): InRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InRange]
  }
  
  @scala.inline
  implicit class InRangeMutableBuilder[Self <: InRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInRange(value: String): Self = StObject.set(x, "inRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInRangeUndefined: Self = StObject.set(x, "inRange", js.undefined)
    
    @scala.inline
    def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
