package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookRangeBorder extends Entity {
  
  /**
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color
    * (e.g. 'orange').
    */
  var color: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * Constant value that indicates the specific side of the border. The possible values are: EdgeTop, EdgeBottom, EdgeLeft,
    * EdgeRight, InsideVertical, InsideHorizontal, DiagonalDown, DiagonalUp. Read-only.
    */
  var sideIndex: js.UndefOr[NullableOption[String]] = js.native
  
  /**
    * One of the constants of line style specifying the line style for the border. The possible values are: None, Continuous,
    * Dash, DashDot, DashDotDot, Dot, Double, SlantDashDot.
    */
  var style: js.UndefOr[NullableOption[String]] = js.native
  
  // Specifies the weight of the border around a range. The possible values are: Hairline, Thin, Medium, Thick.
  var weight: js.UndefOr[NullableOption[String]] = js.native
}
object WorkbookRangeBorder {
  
  @scala.inline
  def apply(): WorkbookRangeBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeBorder]
  }
  
  @scala.inline
  implicit class WorkbookRangeBorderOps[Self <: WorkbookRangeBorder] (val x: Self) extends AnyVal {
    
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
    def setColor(value: NullableOption[String]): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setColorNull: Self = this.set("color", null)
    
    @scala.inline
    def setSideIndex(value: NullableOption[String]): Self = this.set("sideIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideIndex: Self = this.set("sideIndex", js.undefined)
    
    @scala.inline
    def setSideIndexNull: Self = this.set("sideIndex", null)
    
    @scala.inline
    def setStyle(value: NullableOption[String]): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
    
    @scala.inline
    def setWeight(value: NullableOption[String]): Self = this.set("weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
    
    @scala.inline
    def setWeightNull: Self = this.set("weight", null)
  }
}
