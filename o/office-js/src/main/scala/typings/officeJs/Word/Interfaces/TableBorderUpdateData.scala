package typings.officeJs.Word.Interfaces

import typings.officeJs.Word.BorderType
import typings.officeJs.officeJsStrings.DashDotStroked
import typings.officeJs.officeJsStrings.Dashed
import typings.officeJs.officeJsStrings.DashedSmall
import typings.officeJs.officeJsStrings.Dot2Dashed
import typings.officeJs.officeJsStrings.DotDashed
import typings.officeJs.officeJsStrings.Dotted
import typings.officeJs.officeJsStrings.Double
import typings.officeJs.officeJsStrings.DoubleWave
import typings.officeJs.officeJsStrings.Mixed
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.Single
import typings.officeJs.officeJsStrings.ThickThinLarge
import typings.officeJs.officeJsStrings.ThickThinMed
import typings.officeJs.officeJsStrings.ThickThinSmall
import typings.officeJs.officeJsStrings.ThinThickLarge
import typings.officeJs.officeJsStrings.ThinThickMed
import typings.officeJs.officeJsStrings.ThinThickSmall
import typings.officeJs.officeJsStrings.ThinThickThinLarge
import typings.officeJs.officeJsStrings.ThinThickThinMed
import typings.officeJs.officeJsStrings.ThinThickThinSmall
import typings.officeJs.officeJsStrings.ThreeDEmboss
import typings.officeJs.officeJsStrings.ThreeDEngrave
import typings.officeJs.officeJsStrings.Triple
import typings.officeJs.officeJsStrings.Wave
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the TableBorder object, for use in `tableBorder.set({ ... })`. */
trait TableBorderUpdateData extends StObject {
  
  /**
    * Gets or sets the table border color.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * Gets or sets the type of the table border.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
  ] = js.undefined
  
  /**
    * Gets or sets the width, in points, of the table border. Not applicable to table border types that have fixed widths.
    *
    * @remarks
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}
object TableBorderUpdateData {
  
  inline def apply(): TableBorderUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderUpdateData]
  }
  
  extension [Self <: TableBorderUpdateData](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setType(
      value: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: scala.Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
