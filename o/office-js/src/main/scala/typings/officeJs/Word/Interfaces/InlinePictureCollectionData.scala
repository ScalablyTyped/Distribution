package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `inlinePictureCollection.toJSON()`. */
trait InlinePictureCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[InlinePictureData]] = js.undefined
}
object InlinePictureCollectionData {
  
  @scala.inline
  def apply(): InlinePictureCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlinePictureCollectionData]
  }
  
  @scala.inline
  implicit class InlinePictureCollectionDataMutableBuilder[Self <: InlinePictureCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[InlinePictureData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: InlinePictureData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
