package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Organizationsurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `23` extends StObject {
  
  var data: js.Array[Organizationsurl] = js.native
}
object `23` {
  
  @scala.inline
  def apply(data: js.Array[Organizationsurl]): `23` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`23`]
  }
  
  @scala.inline
  implicit class `23MutableBuilder`[Self <: `23`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Organizationsurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Organizationsurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
