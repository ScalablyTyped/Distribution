package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChartPoint extends Entity {
  
  // Encapsulates the format properties chart point. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartPointFormat]] = js.native
  
  // Returns the value of a chart point. Read-only.
  var value: js.UndefOr[NullableOption[_]] = js.native
}
object WorkbookChartPoint {
  
  @scala.inline
  def apply(): WorkbookChartPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartPoint]
  }
  
  @scala.inline
  implicit class WorkbookChartPointMutableBuilder[Self <: WorkbookChartPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: NullableOption[WorkbookChartPointFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatNull: Self = StObject.set(x, "format", null)
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setValue(value: NullableOption[_]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
