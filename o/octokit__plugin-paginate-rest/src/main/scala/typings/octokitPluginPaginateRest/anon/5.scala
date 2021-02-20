package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Archiveurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `5` extends StObject {
  
  var data: js.Array[Archiveurl] = js.native
}
object `5` {
  
  @scala.inline
  def apply(data: js.Array[Archiveurl]): `5` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  @scala.inline
  implicit class `5MutableBuilder`[Self <: `5`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Archiveurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Archiveurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
