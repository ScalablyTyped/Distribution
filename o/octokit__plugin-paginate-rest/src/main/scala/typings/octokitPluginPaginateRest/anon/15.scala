package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Avatarurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15` extends StObject {
  
  var data: js.Array[Avatarurl]
}
object `15` {
  
  @scala.inline
  def apply(data: js.Array[Avatarurl]): `15` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`15`]
  }
  
  @scala.inline
  implicit class `15MutableBuilder`[Self <: `15`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Avatarurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Avatarurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
