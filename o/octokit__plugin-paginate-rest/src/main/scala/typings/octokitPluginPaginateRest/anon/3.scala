package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Allowmergecommit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `3` extends StObject {
  
  var data: js.Array[Allowmergecommit] = js.native
}
object `3` {
  
  @scala.inline
  def apply(data: js.Array[Allowmergecommit]): `3` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Allowmergecommit]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Allowmergecommit*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
