package typings.pdfmake.interfacesMod

import typings.pdfmake.pdfmakeStrings.Asterisk
import typings.pdfmake.pdfmakeStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Table extends StObject {
  
  /**
    * Two-dimensional array that defines the table's rows and their cells.
    *
    * Given a row and column number (both starting from 0), each cell is addressed as
    * `body[rowIndex][columnIndex]`.
    */
  var body: js.Array[js.Array[TableCell]]
  
  /**
    * Controls whether the contents of a table row should be kept together on the same page.
    *
    * Defaults to `false`.
    */
  var dontBreakRows: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of rows from the top that make up the table's header.
    *
    * If the table spans across multiple pages, the header is repeated on every page.
    *
    * Defaults to `0`.
    */
  var headerRows: js.UndefOr[Double] = js.undefined
  
  /**
    * Row heights of the table.
    * - A number sets an absolute height in `pt` for every row.
    * - `auto` sets the heights based on the content.
    * - Use an array or a callback function to control the height of each row individually.
    *
    * The given values are ignored for rows whose content is higher.
    *
    * Defaults to `auto`.
    */
  var heights: js.UndefOr[Double | auto | (js.Array[Double | auto]) | DynamicRowSize] = js.undefined
  
  /**
    * Number of rows after the given {@link headerRows} that should be kept together with
    * the header rows, without a page break in between.
    *
    * Defaults to `0`.
    */
  var keepWithHeaderRows: js.UndefOr[Double] = js.undefined
  
  /**
    * Column widths of the table.
    * - `*` distributes the width equally, filling the whole available space.
    * - `auto` sets the widths based on the content, filling only the necessary space.
    * - Use an array to control the width of each column individually.
    *   The array must contain widths for all columns.
    *
    * A column width smaller than a cell's content will break the text into multiple lines.
    *
    * Defaults to `auto`.
    */
  var widths: js.UndefOr[Asterisk | auto | js.Array[Size]] = js.undefined
}
object Table {
  
  inline def apply(body: js.Array[js.Array[TableCell]]): Table = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[Table]
  }
  
  extension [Self <: Table](x: Self) {
    
    inline def setBody(value: js.Array[js.Array[TableCell]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyVarargs(value: js.Array[TableCell]*): Self = StObject.set(x, "body", js.Array(value*))
    
    inline def setDontBreakRows(value: Boolean): Self = StObject.set(x, "dontBreakRows", value.asInstanceOf[js.Any])
    
    inline def setDontBreakRowsUndefined: Self = StObject.set(x, "dontBreakRows", js.undefined)
    
    inline def setHeaderRows(value: Double): Self = StObject.set(x, "headerRows", value.asInstanceOf[js.Any])
    
    inline def setHeaderRowsUndefined: Self = StObject.set(x, "headerRows", js.undefined)
    
    inline def setHeights(value: Double | auto | (js.Array[Double | auto]) | DynamicRowSize): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
    
    inline def setHeightsFunction1(value: /* rowIndex */ Double => Double | auto): Self = StObject.set(x, "heights", js.Any.fromFunction1(value))
    
    inline def setHeightsUndefined: Self = StObject.set(x, "heights", js.undefined)
    
    inline def setHeightsVarargs(value: (Double | auto)*): Self = StObject.set(x, "heights", js.Array(value*))
    
    inline def setKeepWithHeaderRows(value: Double): Self = StObject.set(x, "keepWithHeaderRows", value.asInstanceOf[js.Any])
    
    inline def setKeepWithHeaderRowsUndefined: Self = StObject.set(x, "keepWithHeaderRows", js.undefined)
    
    inline def setWidths(value: Asterisk | auto | js.Array[Size]): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
    
    inline def setWidthsUndefined: Self = StObject.set(x, "widths", js.undefined)
    
    inline def setWidthsVarargs(value: Size*): Self = StObject.set(x, "widths", js.Array(value*))
  }
}
