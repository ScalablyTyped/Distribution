package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISqlTypeWithScale
  extends StObject
     with ISqlType {
  
  var scale: Double
  
  @JSName("type")
  def type_MISqlTypeWithScale(): ISqlTypeWithScale
  @JSName("type")
  def type_MISqlTypeWithScale(scale: Double): ISqlTypeWithScale
  @JSName("type")
  var type_Original: ISqlTypeFactoryWithScale
}
object ISqlTypeWithScale {
  
  inline def apply(scale: Double, `type`: ISqlTypeFactoryWithScale): ISqlTypeWithScale = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISqlTypeWithScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISqlTypeWithScale] (val x: Self) extends AnyVal {
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setType(value: ISqlTypeFactoryWithScale): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
