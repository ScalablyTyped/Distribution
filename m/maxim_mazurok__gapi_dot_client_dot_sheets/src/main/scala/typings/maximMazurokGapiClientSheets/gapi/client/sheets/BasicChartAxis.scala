package typings.maximMazurokGapiClientSheets.gapi.client.sheets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicChartAxis extends StObject {
  
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
  implicit class BasicChartAxisMutableBuilder[Self <: BasicChartAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: TextFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextPosition(value: TextPosition): Self = StObject.set(x, "titleTextPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleTextPositionUndefined: Self = StObject.set(x, "titleTextPosition", js.undefined)
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setViewWindowOptions(value: ChartAxisViewWindowOptions): Self = StObject.set(x, "viewWindowOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewWindowOptionsUndefined: Self = StObject.set(x, "viewWindowOptions", js.undefined)
  }
}
