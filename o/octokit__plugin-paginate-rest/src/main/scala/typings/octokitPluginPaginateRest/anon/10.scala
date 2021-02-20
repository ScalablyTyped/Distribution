package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Checkrunurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10` extends StObject {
  
  var data: js.Array[Checkrunurl] = js.native
}
object `10` {
  
  @scala.inline
  def apply(data: js.Array[Checkrunurl]): `10` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Checkrunurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Checkrunurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
