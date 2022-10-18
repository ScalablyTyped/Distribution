package typings.nivoGenerators.anon

import typings.nivoGenerators.distTypesSwarmplotMod.SwarmPlotDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var data: js.Array[SwarmPlotDatum]
  
  var groups: js.Array[String]
}
object Groups {
  
  inline def apply(data: js.Array[SwarmPlotDatum], groups: js.Array[String]): Groups = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  
  extension [Self <: Groups](x: Self) {
    
    inline def setData(value: js.Array[SwarmPlotDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: SwarmPlotDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
  }
}
