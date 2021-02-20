package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Allowrebasemerge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends StObject {
  
  var data: js.Array[Allowrebasemerge] = js.native
}
object `1` {
  
  @scala.inline
  def apply(data: js.Array[Allowrebasemerge]): `1` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Allowrebasemerge]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Allowrebasemerge*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
