package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Artifactsurl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  var data: js.Array[Artifactsurl]
}
object `9` {
  
  inline def apply(data: js.Array[Artifactsurl]): `9` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setData(value: js.Array[Artifactsurl]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Artifactsurl*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
