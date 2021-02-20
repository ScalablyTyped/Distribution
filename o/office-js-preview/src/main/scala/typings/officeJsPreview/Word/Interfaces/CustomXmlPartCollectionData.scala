package typings.officeJsPreview.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `customXmlPartCollection.toJSON()`. */
@js.native
trait CustomXmlPartCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[CustomXmlPartData]] = js.native
}
object CustomXmlPartCollectionData {
  
  @scala.inline
  def apply(): CustomXmlPartCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomXmlPartCollectionData]
  }
  
  @scala.inline
  implicit class CustomXmlPartCollectionDataMutableBuilder[Self <: CustomXmlPartCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[CustomXmlPartData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: CustomXmlPartData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
