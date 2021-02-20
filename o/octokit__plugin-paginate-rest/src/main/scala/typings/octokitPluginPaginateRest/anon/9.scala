package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Artifactsurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `9` extends StObject {
  
  var data: js.Array[Artifactsurl] = js.native
}
object `9` {
  
  @scala.inline
  def apply(data: js.Array[Artifactsurl]): `9` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  
  @scala.inline
  implicit class `9MutableBuilder`[Self <: `9`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Artifactsurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Artifactsurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
