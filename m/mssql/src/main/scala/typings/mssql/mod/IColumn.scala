package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumn extends ISqlType {
  
  var name: String = js.native
  
  var nullable: Boolean = js.native
  
  var primary: Boolean = js.native
}
object IColumn {
  
  @scala.inline
  def apply(name: String, nullable: Boolean, primary: Boolean, `type`: ISqlTypeFactory): IColumn = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], nullable = nullable.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColumn]
  }
  
  @scala.inline
  implicit class IColumnMutableBuilder[Self <: IColumn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullable(value: Boolean): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary(value: Boolean): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
  }
}
