package typings.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "inkWordCollection.toJSON()". */
@js.native
trait InkWordCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[InkWordData]] = js.native
}
object InkWordCollectionData {
  
  @scala.inline
  def apply(): InkWordCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InkWordCollectionData]
  }
  
  @scala.inline
  implicit class InkWordCollectionDataMutableBuilder[Self <: InkWordCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[InkWordData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: InkWordData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
