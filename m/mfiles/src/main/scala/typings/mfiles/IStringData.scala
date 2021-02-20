package typings.mfiles

import typings.mfiles.MFiles.MFStringDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStringData extends StObject {
  
  var AsString: String = js.native
  
  def Clone(): IStringData = js.native
  
  val StringDataType: MFStringDataType = js.native
}
object IStringData {
  
  @scala.inline
  def apply(AsString: String, Clone: () => IStringData, StringDataType: MFStringDataType): IStringData = {
    val __obj = js.Dynamic.literal(AsString = AsString.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), StringDataType = StringDataType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStringData]
  }
  
  @scala.inline
  implicit class IStringDataMutableBuilder[Self <: IStringData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsString(value: String): Self = StObject.set(x, "AsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => IStringData): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStringDataType(value: MFStringDataType): Self = StObject.set(x, "StringDataType", value.asInstanceOf[js.Any])
  }
}
