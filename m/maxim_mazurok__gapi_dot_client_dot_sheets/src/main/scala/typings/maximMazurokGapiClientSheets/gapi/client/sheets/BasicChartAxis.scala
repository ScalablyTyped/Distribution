package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicChartAxis extends js.Object {
  
  /** The format of the title. Only valid if the axis is not associated with the domain. */
  var format: js.UndefOr[TextFormat] = js.native
  
  /** The position of this axis. */
  var position: js.UndefOr[String] = js.native
  
  /** The title of this axis. If set, this overrides any title inferred from headers of the data. */
  var title: js.UndefOr[String] = js.native
  
  /** The axis title text position. */
  var titleTextPosition: js.UndefOr[TextPosition] = js.native
  
  /** The view window options for this axis. */
  var viewWindowOptions: js.UndefOr[ChartAxisViewWindowOptions] = js.native
}
object BasicChartAxis {
  
  @scala.inline
  def apply(): BasicChartAxis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicChartAxis]
  }
  
  @scala.inline
  implicit class BasicChartAxisOps[Self <: BasicChartAxis] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: TextFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTitleTextPosition(value: TextPosition): Self = this.set("titleTextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleTextPosition: Self = this.set("titleTextPosition", js.undefined)
    
    @scala.inline
    def setViewWindowOptions(value: ChartAxisViewWindowOptions): Self = this.set("viewWindowOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewWindowOptions: Self = this.set("viewWindowOptions", js.undefined)
  }
}
