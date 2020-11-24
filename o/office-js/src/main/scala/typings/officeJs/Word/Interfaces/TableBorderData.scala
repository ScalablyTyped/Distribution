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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `tableBorder.toJSON()`. */
@js.native
trait TableBorderData extends js.Object {
  
  /**
    *
    * Gets or sets the table border color.
    *
    * [Api set: WordApi 1.3]
    */
  var color: js.UndefOr[String] = js.native
  
  /**
    *
    * Gets or sets the type of the table border.
    *
    * [Api set: WordApi 1.3]
    */
  var `type`: js.UndefOr[
    BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
  ] = js.native
  
  /**
    *
    * Gets or sets the width, in points, of the table border. Not applicable to table border types that have fixed widths.
    *
    * [Api set: WordApi 1.3]
    */
  var width: js.UndefOr[scala.Double] = js.native
}
object TableBorderData {
  
  @scala.inline
  def apply(): TableBorderData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableBorderData]
  }
  
  @scala.inline
  implicit class TableBorderDataOps[Self <: TableBorderData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setType(
      value: BorderType | Mixed | None | Single | Double | Dotted | Dashed | DotDashed | Dot2Dashed | Triple | ThinThickSmall | ThickThinSmall | ThinThickThinSmall | ThinThickMed | ThickThinMed | ThinThickThinMed | ThinThickLarge | ThickThinLarge | ThinThickThinLarge | Wave | DoubleWave | DashedSmall | DashDotStroked | ThreeDEmboss | ThreeDEngrave
    ): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setWidth(value: scala.Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
