package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMetadataCardMultiValuePart extends StObject {
  
  val ID: js.Any = js.native
  
  val Value: js.Any = js.native
}
object IMetadataCardMultiValuePart {
  
  @scala.inline
  def apply(ID: js.Any, Value: js.Any): IMetadataCardMultiValuePart = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMetadataCardMultiValuePart]
  }
  
  @scala.inline
  implicit class IMetadataCardMultiValuePartMutableBuilder[Self <: IMetadataCardMultiValuePart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setID(value: js.Any): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
