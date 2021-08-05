package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Archivedownloadurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var data: js.Array[Archivedownloadurl]
}
object `8` {
  
  inline def apply(data: js.Array[Archivedownloadurl]): `8` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setData(value: js.Array[Archivedownloadurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Archivedownloadurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
