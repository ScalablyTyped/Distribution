package typings.officeJsPreview.Visio.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling "shapeCollection.toJSON()". */
trait ShapeCollectionData extends StObject {
  
  var items: js.UndefOr[js.Array[ShapeData]] = js.undefined
}
object ShapeCollectionData {
  
  @scala.inline
  def apply(): ShapeCollectionData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShapeCollectionData]
  }
  
  @scala.inline
  implicit class ShapeCollectionDataMutableBuilder[Self <: ShapeCollectionData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[ShapeData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: ShapeData*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
