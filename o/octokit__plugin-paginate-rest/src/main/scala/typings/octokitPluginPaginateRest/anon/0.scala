package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Busy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends StObject {
  
  var data: js.Array[Busy] = js.native
}
object `0` {
  
  @scala.inline
  def apply(data: js.Array[Busy]): `0` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Busy]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Busy*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
