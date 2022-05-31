package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groups extends StObject {
  
  var groups: DataTypes
  
  var items: DataTypes
  
  var series: DataTypes
}
object Groups {
  
  inline def apply(groups: DataTypes, items: DataTypes, series: DataTypes): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  
  extension [Self <: Groups](x: Self) {
    
    inline def setGroups(value: DataTypes): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setItems(value: DataTypes): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setSeries(value: DataTypes): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
  }
}
