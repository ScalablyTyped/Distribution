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
    
    @scala.inline
    def apply(): AllColumns = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllColumns]
    }
    
    @scala.inline
    implicit class AllColumnsMutableBuilder[Self <: AllColumns] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllColumns(value: Boolean): Self = StObject.set(x, "allColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllColumnsUndefined: Self = StObject.set(x, "allColumns", js.undefined)
      
      @scala.inline
      def setAppend(value: Boolean): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendUndefined: Self = StObject.set(x, "append", js.undefined)
      
      @scala.inline
      def setBom(value: Boolean): Self = StObject.set(x, "bom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBomUndefined: Self = StObject.set(x, "bom", js.undefined)
    }
  }
}
