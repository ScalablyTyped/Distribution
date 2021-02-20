package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Value extends StObject {
  
  var done: js.UndefOr[scala.Nothing] = js.native
  
  var value: OctokitResponse[_] = js.native
}
object Value {
  
  @scala.inline
  def apply(value: OctokitResponse[_]): Value = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  
  @scala.inline
  implicit class ValueMutableBuilder[Self <: Value] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: OctokitResponse[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
