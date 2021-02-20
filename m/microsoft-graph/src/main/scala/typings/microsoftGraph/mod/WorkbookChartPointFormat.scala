package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChartPointFormat extends Entity {
  
  // Represents the fill format of a chart, which includes background formating information. Read-only.
  var fill: js.UndefOr[NullableOption[WorkbookChartFill]] = js.native
}
object WorkbookChartPointFormat {
  
  @scala.inline
  def apply(): WorkbookChartPointFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartPointFormat]
  }
  
  @scala.inline
  implicit class WorkbookChartPointFormatMutableBuilder[Self <: WorkbookChartPointFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: NullableOption[WorkbookChartFill]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillNull: Self = StObject.set(x, "fill", null)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
  }
}
