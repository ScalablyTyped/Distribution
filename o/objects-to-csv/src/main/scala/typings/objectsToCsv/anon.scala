package typings.objectsToCsv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AllColumns extends StObject {
    
    var allColumns: js.UndefOr[Boolean] = js.undefined
    
    var append: js.UndefOr[Boolean] = js.undefined
    
    var bom: js.UndefOr[Boolean] = js.undefined
  }
  object AllColumns {
    
    inline def apply(): AllColumns = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllColumns]
    }
    
    extension [Self <: AllColumns](x: Self) {
      
      inline def setAllColumns(value: Boolean): Self = StObject.set(x, "allColumns", value.asInstanceOf[js.Any])
      
      inline def setAllColumnsUndefined: Self = StObject.set(x, "allColumns", js.undefined)
      
      inline def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      inline def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      inline def setBom(value: Boolean): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      inline def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
    }
  }
}
