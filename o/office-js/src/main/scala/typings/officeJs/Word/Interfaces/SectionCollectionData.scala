package typings.officeJs.Word.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `sectionCollection.toJSON()`. */
@js.native
trait SectionCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[SectionData]] = js.native
}
object SectionCollectionData {
  
  @scala.inline
  def apply(): SectionCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionCollectionData]
  }
  
  @scala.inline
  implicit class SectionCollectionDataMutableBuilder[Self <: SectionCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[SectionData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SectionData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
