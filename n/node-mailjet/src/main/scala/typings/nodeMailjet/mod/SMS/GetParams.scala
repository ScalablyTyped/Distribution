package typings.nodeMailjet.mod.SMS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// request params
trait GetParams extends StObject {
  
  var FromTS: js.UndefOr[Double] = js.undefined
  
  var Limit: js.UndefOr[Double] = js.undefined
  
  var Offset: js.UndefOr[Double] = js.undefined
  
  var StatusCode: js.UndefOr[js.Array[Double]] = js.undefined
  
  var To: js.UndefOr[String] = js.undefined
  
  var ToTS: js.UndefOr[Double] = js.undefined
}
object GetParams {
  
  @scala.inline
  def apply(): GetParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetParams]
  }
  
  @scala.inline
  implicit class GetParamsMutableBuilder[Self <: GetParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromTS(value: Double): Self = StObject.set(x, "FromTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromTSUndefined: Self = StObject.set(x, "FromTS", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "Offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "Offset", js.undefined)
    
    @scala.inline
    def setStatusCode(value: js.Array[Double]): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
    
    @scala.inline
    def setStatusCodeVarargs(value: Double*): Self = StObject.set(x, "StatusCode", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: String): Self = StObject.set(x, "To", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToTS(value: Double): Self = StObject.set(x, "ToTS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToTSUndefined: Self = StObject.set(x, "ToTS", js.undefined)
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "To", js.undefined)
  }
}
