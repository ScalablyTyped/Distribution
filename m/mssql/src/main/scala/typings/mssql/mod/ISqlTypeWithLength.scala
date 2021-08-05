package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISqlTypeWithLength
  extends StObject
     with ISqlType {
  
  var length: Double
  
  @JSName("type")
  def type_MISqlTypeWithLength(): ISqlTypeWithLength
  @JSName("type")
  def type_MISqlTypeWithLength(length: Double): ISqlTypeWithLength
  @JSName("type")
  var type_Original: ISqlTypeFactoryWithLength
}
object ISqlTypeWithLength {
  
  inline def apply(length: Double, `type`: ISqlTypeFactoryWithLength): ISqlTypeWithLength = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISqlTypeWithLength]
  }
  
  extension [Self <: ISqlTypeWithLength](x: Self) {
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setType(value: ISqlTypeFactoryWithLength): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
