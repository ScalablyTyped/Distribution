package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookRangeFill
  extends StObject
     with Entity {
  
  /**
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. 'FFA500') or as a named HTML color
    * (e.g. 'orange')
    */
  var color: js.UndefOr[NullableOption[String]] = js.undefined
}
object WorkbookRangeFill {
  
  inline def apply(): WorkbookRangeFill = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookRangeFill]
  }
  
  extension [Self <: WorkbookRangeFill](x: Self) {
    
    inline def setColor(value: NullableOption[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorNull: Self = StObject.set(x, "color", null)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
