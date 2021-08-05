package typings.octokitPluginPaginateRest.anon

import typings.octokitTypes.anon.Allowrebasemerge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var data: js.Array[Allowrebasemerge]
}
object `1` {
  
  inline def apply(data: js.Array[Allowrebasemerge]): `1` = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setData(value: js.Array[Allowrebasemerge]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Allowrebasemerge*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
