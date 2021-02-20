package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Badgeurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `12` extends StObject {
  
  var data: js.Array[Badgeurl] = js.native
}
object `12` {
  
  @scala.inline
  def apply(data: js.Array[Badgeurl]): `12` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Badgeurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Badgeurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
