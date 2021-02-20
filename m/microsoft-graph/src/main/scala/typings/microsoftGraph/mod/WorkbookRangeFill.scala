package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookRangeFill extends Entity {
  
  /**
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color
    * (e.g. 'orange')
    */
  var color: js.UndefOr[NullableOption[String]] = js.native
}
object WorkbookRangeFill {
  
  @scala.inline
  def apply(): WorkbookRangeFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeFill]
  }
  
  @scala.inline
  implicit class WorkbookRangeFillMutableBuilder[Self <: WorkbookRangeFill] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: NullableOption[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorNull: Self = StObject.set(x, "color", null)
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
