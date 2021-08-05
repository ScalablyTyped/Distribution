package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposGetClonesResponseData extends StObject {
  
  var clones: js.Array[Count]
  
  var count: Double
  
  var uniques: Double
}
object ReposGetClonesResponseData {
  
  inline def apply(clones: js.Array[Count], count: Double, uniques: Double): ReposGetClonesResponseData = {
    val __obj = js.Dynamic.literal(clones = clones.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], uniques = uniques.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetClonesResponseData]
  }
  
  extension [Self <: ReposGetClonesResponseData](x: Self) {
    
    inline def setClones(value: js.Array[Count]): Self = StObject.set(x, "clones", value.asInstanceOf[js.Any])
    
    inline def setClonesVarargs(value: Count*): Self = StObject.set(x, "clones", js.Array(value :_*))
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setUniques(value: Double): Self = StObject.set(x, "uniques", value.asInstanceOf[js.Any])
  }
}
