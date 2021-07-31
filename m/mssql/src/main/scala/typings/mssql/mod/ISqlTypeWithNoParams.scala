package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISqlTypeWithNoParams
  extends StObject
     with ISqlType {
  
  @JSName("type")
  def type_MISqlTypeWithNoParams(): ISqlTypeWithNoParams
  @JSName("type")
  var type_Original: ISqlTypeFactoryWithNoParams
}
object ISqlTypeWithNoParams {
  
  @scala.inline
  def apply(`type`: ISqlTypeFactoryWithNoParams): ISqlTypeWithNoParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISqlTypeWithNoParams]
  }
  
  @scala.inline
  implicit class ISqlTypeWithNoParamsMutableBuilder[Self <: ISqlTypeWithNoParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: ISqlTypeFactoryWithNoParams): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
