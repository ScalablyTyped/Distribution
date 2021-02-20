package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableRowStyle extends StObject {
  
  /** The minimum height of the row. The row will be rendered in the Docs editor at a height equal to or greater than this value in order to show all the content in the row's cells. */
  var minRowHeight: js.UndefOr[Dimension] = js.native
}
object TableRowStyle {
  
  @scala.inline
  def apply(): TableRowStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRowStyle]
  }
  
  @scala.inline
  implicit class TableRowStyleMutableBuilder[Self <: TableRowStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMinRowHeight(value: Dimension): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
  }
}
