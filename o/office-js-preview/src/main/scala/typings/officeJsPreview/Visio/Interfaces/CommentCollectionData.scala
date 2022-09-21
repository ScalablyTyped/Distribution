package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `commentCollection.toJSON()`. */
trait CommentCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[CommentData]] = js.undefined
}
object CommentCollectionData {
  
  inline def apply(): CommentCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentCollectionData]
  }
  
  extension [Self <: CommentCollectionData](x: Self) {
    
    inline def setItems(value: js.Array[CommentData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: CommentData*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
