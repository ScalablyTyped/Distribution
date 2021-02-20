package typings.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "sectionGroupCollection.toJSON()". */
@js.native
trait SectionGroupCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SectionGroupData]] = js.native
}
object SectionGroupCollectionData {
  
  @scala.inline
  def apply(): SectionGroupCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionGroupCollectionData]
  }
  
  @scala.inline
  implicit class SectionGroupCollectionDataMutableBuilder[Self <: SectionGroupCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SectionGroupData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SectionGroupData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
