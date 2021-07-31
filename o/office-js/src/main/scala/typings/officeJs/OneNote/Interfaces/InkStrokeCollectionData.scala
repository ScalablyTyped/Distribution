package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "inkStrokeCollection.toJSON()". */
trait InkStrokeCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[InkStrokeData]] = js.undefined
}
object InkStrokeCollectionData {
  
  @scala.inline
  def apply(): InkStrokeCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkStrokeCollectionData]
  }
  
  @scala.inline
  implicit class InkStrokeCollectionDataMutableBuilder[Self <: InkStrokeCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[InkStrokeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: InkStrokeData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
