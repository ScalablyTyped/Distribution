package typings.ngTable

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resultsMod {
  
  type DataResult[T] = T | IDataRowGroup[T]
  
  @js.native
  trait DataResults[T]
    extends StObject
       with Array[T] {
    
    var visibleColumnCount: Double = js.native
  }
  
  @js.native
  trait GroupedDataResults[T]
    extends StObject
       with Array[IDataRowGroup[T]] {
    
    var visibleColumnCount: Double = js.native
  }
  
  trait IDataRowGroup[T] extends StObject {
    
    @JSName("$hideRows")
    var $hideRows: Boolean
    
    var data: js.Array[T]
    
    var value: String
  }
  object IDataRowGroup {
    
    @scala.inline
    def apply[T]($hideRows: Boolean, data: js.Array[T], value: String): IDataRowGroup[T] = {
      val __obj = js.Dynamic.literal($hideRows = $hideRows.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDataRowGroup[T]]
    }
    
    @scala.inline
    implicit class IDataRowGroupMutableBuilder[Self <: IDataRowGroup[?], T] (val x: Self & IDataRowGroup[T]) extends AnyVal {
      
      @scala.inline
      def set$hideRows(value: Boolean): Self = StObject.set(x, "$hideRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
