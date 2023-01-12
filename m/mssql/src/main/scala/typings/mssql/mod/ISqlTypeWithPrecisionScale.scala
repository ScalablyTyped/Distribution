package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISqlTypeWithPrecisionScale
  extends StObject
     with ISqlType {
  
  var precision: Double
  
  var scale: Double
  
  @JSName("type")
  def type_MISqlTypeWithPrecisionScale(): ISqlTypeWithPrecisionScale
  @JSName("type")
  def type_MISqlTypeWithPrecisionScale(precision: Double): ISqlTypeWithPrecisionScale
  @JSName("type")
  def type_MISqlTypeWithPrecisionScale(precision: Double, scale: Double): ISqlTypeWithPrecisionScale
  @JSName("type")
  def type_MISqlTypeWithPrecisionScale(precision: Unit, scale: Double): ISqlTypeWithPrecisionScale
  @JSName("type")
  var type_Original: ISqlTypeFactoryWithPrecisionScale
}
object ISqlTypeWithPrecisionScale {
  
  inline def apply(precision: Double, scale: Double, `type`: ISqlTypeFactoryWithPrecisionScale): ISqlTypeWithPrecisionScale = {
    val __obj = js.Dynamic.literal(precision = precision.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISqlTypeWithPrecisionScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISqlTypeWithPrecisionScale] (val x: Self) extends AnyVal {
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setType(value: ISqlTypeFactoryWithPrecisionScale): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
