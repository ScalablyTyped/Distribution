package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Groups extends StObject {
  
  var groups: DataTypes = js.native
  
  var items: DataTypes = js.native
  
  var series: DataTypes = js.native
}
object Groups {
  
  @scala.inline
  def apply(groups: DataTypes, items: DataTypes, series: DataTypes): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  
  @scala.inline
  implicit class GroupsMutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: DataTypes): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: DataTypes): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries(value: DataTypes): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
  }
}
