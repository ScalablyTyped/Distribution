package typings.officeJsPreview.anon

import typings.officeJsPreview.Excel.CellValuePropertyMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyMetadata extends StObject {
  
  var propertyMetadata: js.UndefOr[CellValuePropertyMetadata] = js.undefined
}
object PropertyMetadata {
  
  inline def apply(): PropertyMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PropertyMetadata] (val x: Self) extends AnyVal {
    
    inline def setPropertyMetadata(value: CellValuePropertyMetadata): Self = StObject.set(x, "propertyMetadata", value.asInstanceOf[js.Any])
    
    inline def setPropertyMetadataUndefined: Self = StObject.set(x, "propertyMetadata", js.undefined)
  }
}
