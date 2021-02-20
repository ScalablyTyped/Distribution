package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `contentControlCollection.toJSON()`. */
@js.native
trait ContentControlCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ContentControlData]] = js.native
}
object ContentControlCollectionData {
  
  @scala.inline
  def apply(): ContentControlCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentControlCollectionData]
  }
  
  @scala.inline
  implicit class ContentControlCollectionDataMutableBuilder[Self <: ContentControlCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ContentControlData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ContentControlData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
