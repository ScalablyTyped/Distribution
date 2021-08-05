package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Archiveurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  var data: js.Array[Archiveurl]
}
object `5` {
  
  inline def apply(data: js.Array[Archiveurl]): `5` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setData(value: js.Array[Archiveurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Archiveurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
