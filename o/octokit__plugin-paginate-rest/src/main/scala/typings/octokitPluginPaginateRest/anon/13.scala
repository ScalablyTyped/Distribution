package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `13` extends StObject {
  
  var data: js.Array[App]
}
object `13` {
  
  @scala.inline
  def apply(data: js.Array[App]): `13` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`13`]
  }
  
  @scala.inline
  implicit class `13MutableBuilder`[Self <: `13`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[App]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: App*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
