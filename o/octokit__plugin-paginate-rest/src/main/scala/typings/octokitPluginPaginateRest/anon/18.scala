package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Parents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `18` extends StObject {
  
  var data: js.Array[Parents]
}
object `18` {
  
  @scala.inline
  def apply(data: js.Array[Parents]): `18` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`18`]
  }
  
  @scala.inline
  implicit class `18MutableBuilder`[Self <: `18`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Parents]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Parents*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
