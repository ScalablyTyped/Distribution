package typings.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableCellStyle extends StObject {
  
  /** The background color of the cell. */
  var backgroundColor: js.UndefOr[OptionalColor] = js.native
  
  /** The bottom border of the cell. */
  var borderBottom: js.UndefOr[TableCellBorder] = js.native
  
  /** The left border of the cell. */
  var borderLeft: js.UndefOr[TableCellBorder] = js.native
  
  /** The right border of the cell. */
  var borderRight: js.UndefOr[TableCellBorder] = js.native
  
  /** The top border of the cell. */
  var borderTop: js.UndefOr[TableCellBorder] = js.native
  
  /** The column span of the cell. This property is read-only. */
  var columnSpan: js.UndefOr[Double] = js.native
  
  /** The alignment of the content in the table cell. The default alignment matches the alignment for newly created table cells in the Docs editor. */
  var contentAlignment: js.UndefOr[String] = js.native
  
  /** The bottom padding of the cell. */
  var paddingBottom: js.UndefOr[Dimension] = js.native
  
  /** The left padding of the cell. */
  var paddingLeft: js.UndefOr[Dimension] = js.native
  
  /** The right padding of the cell. */
  var paddingRight: js.UndefOr[Dimension] = js.native
  
  /** The top padding of the cell. */
  var paddingTop: js.UndefOr[Dimension] = js.native
  
  /** The row span of the cell. This property is read-only. */
  var rowSpan: js.UndefOr[Double] = js.native
}
object TableCellStyle {
  
  @scala.inline
  def apply(): TableCellStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellStyle]
  }
  
  @scala.inline
  implicit class TableCellStyleMutableBuilder[Self <: TableCellStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackgroundColor(value: OptionalColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderBottom(value: TableCellBorder): Self = StObject.set(x, "borderBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderBottomUndefined: Self = StObject.set(x, "borderBottom", js.undefined)
    
    @scala.inline
    def setBorderLeft(value: TableCellBorder): Self = StObject.set(x, "borderLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderLeftUndefined: Self = StObject.set(x, "borderLeft", js.undefined)
    
    @scala.inline
    def setBorderRight(value: TableCellBorder): Self = StObject.set(x, "borderRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderRightUndefined: Self = StObject.set(x, "borderRight", js.undefined)
    
    @scala.inline
    def setBorderTop(value: TableCellBorder): Self = StObject.set(x, "borderTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderTopUndefined: Self = StObject.set(x, "borderTop", js.undefined)
    
    @scala.inline
    def setColumnSpan(value: Double): Self = StObject.set(x, "columnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSpanUndefined: Self = StObject.set(x, "columnSpan", js.undefined)
    
    @scala.inline
    def setContentAlignment(value: String): Self = StObject.set(x, "contentAlignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentAlignmentUndefined: Self = StObject.set(x, "contentAlignment", js.undefined)
    
    @scala.inline
    def setPaddingBottom(value: Dimension): Self = StObject.set(x, "paddingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingBottomUndefined: Self = StObject.set(x, "paddingBottom", js.undefined)
    
    @scala.inline
    def setPaddingLeft(value: Dimension): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingLeftUndefined: Self = StObject.set(x, "paddingLeft", js.undefined)
    
    @scala.inline
    def setPaddingRight(value: Dimension): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingRightUndefined: Self = StObject.set(x, "paddingRight", js.undefined)
    
    @scala.inline
    def setPaddingTop(value: Dimension): Self = StObject.set(x, "paddingTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingTopUndefined: Self = StObject.set(x, "paddingTop", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
  }
}
