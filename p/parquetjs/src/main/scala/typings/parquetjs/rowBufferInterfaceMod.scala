package typings.parquetjs

import org.scalablytyped.runtime.StringDictionary
import typings.parquetjs.anon.Count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowBufferInterfaceMod {
  
  trait RowBufferInterface extends StObject {
    
    var columnData: StringDictionary[Count]
    
    var rowCount: Double
  }
  object RowBufferInterface {
    
    @scala.inline
    def apply(columnData: StringDictionary[Count], rowCount: Double): RowBufferInterface = {
      val __obj = js.Dynamic.literal(columnData = columnData.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowBufferInterface]
    }
    
    @scala.inline
    implicit class RowBufferInterfaceMutableBuilder[Self <: RowBufferInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColumnData(value: StringDictionary[Count]): Self = StObject.set(x, "columnData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
    }
  }
}
