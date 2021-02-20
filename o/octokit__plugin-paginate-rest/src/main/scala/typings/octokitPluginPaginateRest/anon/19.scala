package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `19` extends StObject {
  
  var data: js.Array[Labels] = js.native
}
object `19` {
  
  @scala.inline
  def apply(data: js.Array[Labels]): `19` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`19`]
  }
  
  @scala.inline
  implicit class `19MutableBuilder`[Self <: `19`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Labels]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Labels*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
