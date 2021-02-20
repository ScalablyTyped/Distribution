package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueCount extends StObject {
  
  /** The amount of times that expression returned. */
  var count: js.UndefOr[Double] = js.native
  
  /** The return value of the expression */
  var value: js.UndefOr[js.Any] = js.native
}
object ValueCount {
  
  @scala.inline
  def apply(): ValueCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueCount]
  }
  
  @scala.inline
  implicit class ValueCountMutableBuilder[Self <: ValueCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
