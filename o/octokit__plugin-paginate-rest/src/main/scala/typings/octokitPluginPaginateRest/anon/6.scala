package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Permissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var data: js.Array[Permissions]
}
object `6` {
  
  @scala.inline
  def apply(data: js.Array[Permissions]): `6` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  
  @scala.inline
  implicit class `6MutableBuilder`[Self <: `6`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Permissions]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Permissions*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
