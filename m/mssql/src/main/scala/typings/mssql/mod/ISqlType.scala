package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISqlType extends StObject {
  
  var `type`: ISqlTypeFactory
}
object ISqlType {
  
  inline def apply(`type`: ISqlTypeFactory): ISqlType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISqlType]
  }
  
  extension [Self <: ISqlType](x: Self) {
    
    inline def setType(value: ISqlTypeFactory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
