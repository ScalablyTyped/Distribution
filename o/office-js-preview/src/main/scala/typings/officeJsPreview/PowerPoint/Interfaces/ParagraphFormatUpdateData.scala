package typings.officeJsPreview.PowerPoint.Interfaces

import typings.officeJsPreview.PowerPoint.ParagraphHorizontalAlignment
import typings.officeJsPreview.officeJsPreviewStrings.Center
import typings.officeJsPreview.officeJsPreviewStrings.Distributed
import typings.officeJsPreview.officeJsPreviewStrings.Justify
import typings.officeJsPreview.officeJsPreviewStrings.JustifyLow
import typings.officeJsPreview.officeJsPreviewStrings.Left
import typings.officeJsPreview.officeJsPreviewStrings.Right
import typings.officeJsPreview.officeJsPreviewStrings.ThaiDistributed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the ParagraphFormat object, for use in `paragraphFormat.set({ ... })`. */
trait ParagraphFormatUpdateData extends StObject {
  
  /**
    * Represents the horizontal alignment of the paragraph. Returns 'null' if the 'TextRange' includes text fragments with different horizontal alignment values. See {@link PowerPoint.ParagraphHorizontalAlignment} for details.
    *
    * @remarks
    * [Api set: PowerPointApi 1.4]
    */
  var horizontalAlignment: js.UndefOr[
    ParagraphHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
  ] = js.undefined
}
object ParagraphFormatUpdateData {
  
  inline def apply(): ParagraphFormatUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphFormatUpdateData]
  }
  
  extension [Self <: ParagraphFormatUpdateData](x: Self) {
    
    inline def setHorizontalAlignment(
      value: ParagraphHorizontalAlignment | Left | Center | Right | Justify | JustifyLow | Distributed | ThaiDistributed
    ): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
    
    inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
  }
}
