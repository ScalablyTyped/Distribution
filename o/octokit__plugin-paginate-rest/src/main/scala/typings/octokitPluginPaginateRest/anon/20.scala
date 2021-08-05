package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Score
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `20` extends StObject {
  
  var data: js.Array[Score]
}
object `20` {
  
  inline def apply(data: js.Array[Score]): `20` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`20`]
  }
  
  extension [Self <: `20`](x: Self) {
    
    inline def setData(value: js.Array[Score]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Score*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
