package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Createdby
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `22` extends StObject {
  
  var data: js.Array[Createdby] = js.native
}
object `22` {
  
  @scala.inline
  def apply(data: js.Array[Createdby]): `22` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`22`]
  }
  
  @scala.inline
  implicit class `22MutableBuilder`[Self <: `22`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Createdby]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Createdby*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
