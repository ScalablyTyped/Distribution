package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `commentCollection.toJSON()`. */
@js.native
trait CommentCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[CommentData]] = js.native
}
object CommentCollectionData {
  
  @scala.inline
  def apply(): CommentCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentCollectionData]
  }
  
  @scala.inline
  implicit class CommentCollectionDataMutableBuilder[Self <: CommentCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[CommentData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: CommentData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
