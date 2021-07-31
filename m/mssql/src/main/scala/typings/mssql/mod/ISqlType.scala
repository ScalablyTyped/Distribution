package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISqlType extends StObject {
  
  var `type`: ISqlTypeFactory
}
object ISqlType {
  
  @scala.inline
  def apply(`type`: ISqlTypeFactory): ISqlType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISqlType]
  }
  
  @scala.inline
  implicit class ISqlTypeMutableBuilder[Self <: ISqlType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ISqlTypeFactory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
