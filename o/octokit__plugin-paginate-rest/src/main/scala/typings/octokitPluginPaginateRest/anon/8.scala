package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Archivedownloadurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `8` extends StObject {
  
  var data: js.Array[Archivedownloadurl] = js.native
}
object `8` {
  
  @scala.inline
  def apply(data: js.Array[Archivedownloadurl]): `8` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  
  @scala.inline
  implicit class `8MutableBuilder`[Self <: `8`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Archivedownloadurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Archivedownloadurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
