package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `styleCollection.toJSON()`. */
@js.native
trait StyleCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[StyleData]] = js.native
}
object StyleCollectionData {
  
  @scala.inline
  def apply(): StyleCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleCollectionData]
  }
  
  @scala.inline
  implicit class StyleCollectionDataMutableBuilder[Self <: StyleCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[StyleData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: StyleData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
