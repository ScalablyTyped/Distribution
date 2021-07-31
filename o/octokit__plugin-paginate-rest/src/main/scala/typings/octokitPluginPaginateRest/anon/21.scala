package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Defaultbranch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `21` extends StObject {
  
  var data: js.Array[Defaultbranch]
}
object `21` {
  
  @scala.inline
  def apply(data: js.Array[Defaultbranch]): `21` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`21`]
  }
  
  @scala.inline
  implicit class `21MutableBuilder`[Self <: `21`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Defaultbranch]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Defaultbranch*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
