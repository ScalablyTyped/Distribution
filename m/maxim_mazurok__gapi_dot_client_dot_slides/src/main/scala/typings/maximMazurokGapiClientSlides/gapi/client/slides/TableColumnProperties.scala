package typings.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableColumnProperties extends StObject {
  
  /** Width of a column. */
  var columnWidth: js.UndefOr[Dimension] = js.native
}
object TableColumnProperties {
  
  @scala.inline
  def apply(): TableColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumnProperties]
  }
  
  @scala.inline
  implicit class TableColumnPropertiesMutableBuilder[Self <: TableColumnProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnWidth(value: Dimension): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
  }
}
