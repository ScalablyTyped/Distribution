package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISqlTypeWithTvpType
  extends StObject
     with ISqlType {
  
  var tvpType: js.Any
  
  @JSName("type")
  def type_MISqlTypeWithTvpType(): ISqlTypeWithTvpType
  @JSName("type")
  def type_MISqlTypeWithTvpType(tvpType: js.Any): ISqlTypeWithTvpType
  @JSName("type")
  var type_Original: ISqlTypeFactoryWithTvpType
}
object ISqlTypeWithTvpType {
  
  @scala.inline
  def apply(tvpType: js.Any, `type`: ISqlTypeFactoryWithTvpType): ISqlTypeWithTvpType = {
    val __obj = js.Dynamic.literal(tvpType = tvpType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISqlTypeWithTvpType]
  }
  
  @scala.inline
  implicit class ISqlTypeWithTvpTypeMutableBuilder[Self <: ISqlTypeWithTvpType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTvpType(value: js.Any): Self = StObject.set(x, "tvpType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ISqlTypeFactoryWithTvpType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
