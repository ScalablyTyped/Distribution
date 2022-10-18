package typings.nivoGenerators.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataGroups extends StObject {
  
  var data: js.Array[Categories]
  
  var groups: js.Array[String]
}
object DataGroups {
  
  inline def apply(data: js.Array[Categories], groups: js.Array[String]): DataGroups = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGroups]
  }
  
  extension [Self <: DataGroups](x: Self) {
    
    inline def setData(value: js.Array[Categories]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Categories*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
  }
}
