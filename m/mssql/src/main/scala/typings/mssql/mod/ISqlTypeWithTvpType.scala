package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISqlTypeWithTvpType
  extends StObject
     with ISqlType {
  
  var tvpType: Any
  
  @JSName("type")
  def type_MISqlTypeWithTvpType(): ISqlTypeWithTvpType
  @JSName("type")
  def type_MISqlTypeWithTvpType(tvpType: Any): ISqlTypeWithTvpType
  @JSName("type")
  var type_Original: ISqlTypeFactoryWithTvpType
}
object ISqlTypeWithTvpType {
  
  inline def apply(tvpType: Any, `type`: ISqlTypeFactoryWithTvpType): ISqlTypeWithTvpType = {
    val __obj = js.Dynamic.literal(tvpType = tvpType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISqlTypeWithTvpType]
  }
  
  extension [Self <: ISqlTypeWithTvpType](x: Self) {
    
    inline def setTvpType(value: Any): Self = StObject.set(x, "tvpType", value.asInstanceOf[js.Any])
    
    inline def setType(value: ISqlTypeFactoryWithTvpType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
