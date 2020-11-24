package typings.mermaid.mermaidAPIMod.mermaidAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GanttConfig extends js.Object {
  
  /**
    * **axisFormat** - datetime format of the axis, this might need adjustment to match your locale and preferences
    * default: '%Y-%m-%d'
    */
  var axisFormat: js.UndefOr[String] = js.native
  
  /**
    * **barGap** - the margin between the different activities in the gantt diagram
    * default: 4
    */
  var barGap: js.UndefOr[Double] = js.native
  
  /**
    * **barHeight** - the height of the bars in the graph
    * default: 20
    */
  var barHeight: js.UndefOr[Double] = js.native
  
  /**
    * **fontFamily** - font family ...
    * default:  '"Open-Sans", "sans-serif"'
    */
  var fontFamily: js.UndefOr[String] = js.native
  
  /**
    *  **fontSize** - font size ...
    * default: 11
    */
  var fontSize: js.UndefOr[Double] = js.native
  
  /**
    *  **gridLineStartPadding** - Vertical starting position of the grid lines
    * default: 35
    */
  var gridLineStartPadding: js.UndefOr[Double] = js.native
  
  /**
    *  **leftPadding** - the space allocated for the section name to the left of the activities.
    * default: 75
    */
  var leftPadding: js.UndefOr[Double] = js.native
  
  /**
    * **numberSectionStyles** - the number of alternating section styles
    * default: 4
    */
  var numberSectionStyles: js.UndefOr[Double] = js.native
  
  /**
    * **titleTopMargin** - margin top for the text over the gantt diagram
    * default: 25
    */
  var titleTopMargin: js.UndefOr[Double] = js.native
  
  /**
    *  **topPadding** - margin between title and gantt diagram and between axis and gantt diagram.
    * default: 50
    */
  var topPadding: js.UndefOr[Double] = js.native
}
object GanttConfig {
  
  @scala.inline
  def apply(): GanttConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GanttConfig]
  }
  
  @scala.inline
  implicit class GanttConfigOps[Self <: GanttConfig] (val x: Self) extends AnyVal {
    
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
    def setAxisFormat(value: String): Self = this.set("axisFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisFormat: Self = this.set("axisFormat", js.undefined)
    
    @scala.inline
    def setBarGap(value: Double): Self = this.set("barGap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarGap: Self = this.set("barGap", js.undefined)
    
    @scala.inline
    def setBarHeight(value: Double): Self = this.set("barHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBarHeight: Self = this.set("barHeight", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontFamily: Self = this.set("fontFamily", js.undefined)
    
    @scala.inline
    def setFontSize(value: Double): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontSize: Self = this.set("fontSize", js.undefined)
    
    @scala.inline
    def setGridLineStartPadding(value: Double): Self = this.set("gridLineStartPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridLineStartPadding: Self = this.set("gridLineStartPadding", js.undefined)
    
    @scala.inline
    def setLeftPadding(value: Double): Self = this.set("leftPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftPadding: Self = this.set("leftPadding", js.undefined)
    
    @scala.inline
    def setNumberSectionStyles(value: Double): Self = this.set("numberSectionStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberSectionStyles: Self = this.set("numberSectionStyles", js.undefined)
    
    @scala.inline
    def setTitleTopMargin(value: Double): Self = this.set("titleTopMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTopMargin: Self = this.set("titleTopMargin", js.undefined)
    
    @scala.inline
    def setTopPadding(value: Double): Self = this.set("topPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopPadding: Self = this.set("topPadding", js.undefined)
  }
}
