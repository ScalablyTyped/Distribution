package typings.octokitPluginPaginateRest.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  var data: js.Array[String]
}
object `16` {
  
  @scala.inline
  def apply(data: js.Array[String]): `16` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  @scala.inline
  implicit class `16MutableBuilder`[Self <: `16`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: String*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
