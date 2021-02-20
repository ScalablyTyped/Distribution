package typings.officeJs.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the CommentCollection object, for use in "commentCollection.set({ ... })". */
@js.native
trait CommentCollectionUpdateData extends StObject {
  
  var items: js.UndefOr[js.Array[CommentData]] = js.native
}
object CommentCollectionUpdateData {
  
  @scala.inline
  def apply(): CommentCollectionUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentCollectionUpdateData]
  }
  
  @scala.inline
  implicit class CommentCollectionUpdateDataMutableBuilder[Self <: CommentCollectionUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[CommentData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: CommentData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
