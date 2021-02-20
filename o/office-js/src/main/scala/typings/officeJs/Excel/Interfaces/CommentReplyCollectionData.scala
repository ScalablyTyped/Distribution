package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `commentReplyCollection.toJSON()`. */
@js.native
trait CommentReplyCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[CommentReplyData]] = js.native
}
object CommentReplyCollectionData {
  
  @scala.inline
  def apply(): CommentReplyCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentReplyCollectionData]
  }
  
  @scala.inline
  implicit class CommentReplyCollectionDataMutableBuilder[Self <: CommentReplyCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[CommentReplyData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: CommentReplyData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
