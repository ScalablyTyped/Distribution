package typings.officeJsPreview.Word.Interfaces

import typings.officeJsPreview.Word.BorderType
import typings.officeJsPreview.officeJsPreviewStrings.DashDotStroked
import typings.officeJsPreview.officeJsPreviewStrings.Dashed
import typings.officeJsPreview.officeJsPreviewStrings.DashedSmall
import typings.officeJsPreview.officeJsPreviewStrings.Dot2Dashed
import typings.officeJsPreview.officeJsPreviewStrings.DotDashed
import typings.officeJsPreview.officeJsPreviewStrings.Dotted
import typings.officeJsPreview.officeJsPreviewStrings.Double
import typings.officeJsPreview.officeJsPreviewStrings.DoubleWave
import typings.officeJsPreview.officeJsPreviewStrings.Mixed
import typings.officeJsPreview.officeJsPreviewStrings.None
import typings.officeJsPreview.officeJsPreviewStrings.Single
import typings.officeJsPreview.officeJsPreviewStrings.ThickThinLarge
import typings.officeJsPreview.officeJsPreviewStrings.ThickThinMed
import typings.officeJsPreview.officeJsPreviewStrings.ThickThinSmall
import typings.officeJsPreview.officeJsPreviewStrings.ThinThickLarge
import typings.officeJsPreview.officeJsPreviewStrings.ThinThickMed
import typings.officeJsPreview.officeJsPreviewStrings.ThinThickSmall
import typings.officeJsPreview.officeJsPreviewStrings.ThinThickThinLarge
import typings.officeJsPreview.officeJsPreviewStrings.ThinThickThinMed
import typings.officeJsPreview.officeJsPreviewStrings.ThinThickThinSmall
import typings.officeJsPreview.officeJsPreviewStrings.ThreeDEmboss
import typings.officeJsPreview.officeJsPreviewStrings.ThreeDEngrave
import typings.officeJsPreview.officeJsPreviewStrings.Triple
import typings.officeJsPreview.officeJsPreviewStrings.Wave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableBorder.toJSON()`. */
trait TableBorderData extends StObject {
  
  /**
    *
    * Gets or sets the table border color.
    *
    * [Api set: WordApi 1.3]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Gets or sets the type of the table border.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
  ] = js.undefined
  
  /**
    *
    * Gets or sets the width, in points, of the table border. Not applicable to table border types that have fixed widths.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}
object TableBorderData {
  
  @scala.inline
  def apply(): TableBorderData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderData]
  }
  
  @scala.inline
  implicit class TableBorderDataMutableBuilder[Self <: TableBorderData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setType(
      value: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: scala.Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
