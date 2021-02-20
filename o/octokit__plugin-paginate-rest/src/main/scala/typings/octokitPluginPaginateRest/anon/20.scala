package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Score
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `20` extends StObject {
  
  var data: js.Array[Score] = js.native
}
object `20` {
  
  @scala.inline
  def apply(data: js.Array[Score]): `20` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  
  @scala.inline
  implicit class `20MutableBuilder`[Self <: `20`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Score]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Score*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
