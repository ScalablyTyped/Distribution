package typings.msRest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UrlParameterValue extends StObject {
  
  var skipUrlEncoding: Boolean = js.native
  
  var value: js.Any = js.native
}
object UrlParameterValue {
  
  @scala.inline
  def apply(skipUrlEncoding: Boolean, value: js.Any): UrlParameterValue = {
    val __obj = js.Dynamic.literal(skipUrlEncoding = skipUrlEncoding.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlParameterValue]
  }
  
  @scala.inline
  implicit class UrlParameterValueMutableBuilder[Self <: UrlParameterValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSkipUrlEncoding(value: Boolean): Self = StObject.set(x, "skipUrlEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
