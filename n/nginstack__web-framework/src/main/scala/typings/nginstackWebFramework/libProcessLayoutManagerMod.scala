package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProcessLayoutManagerMod {
  
  inline def apply(responseObject: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(responseObject.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/process/LayoutManager", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with LayoutManager {
    def this(responseObject: Any) = this()
    
    /* private */ /* CompleteClass */
    var _write: Any = js.native
    
    /* CompleteClass */
    override def add(obj: Any, row: Double, col: Double, args: Any*): Unit = js.native
    
    /* private */ /* CompleteClass */
    var begin: Any = js.native
    
    /* CompleteClass */
    var border: Double = js.native
    
    /* CompleteClass */
    var cellStarted: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var colStarted: Any = js.native
    
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /* private */ /* CompleteClass */
    var end: Any = js.native
    
    /* private */ /* CompleteClass */
    var id: Any = js.native
    
    /* private */ /* CompleteClass */
    var lastColumn: Any = js.native
    
    /* private */ /* CompleteClass */
    var max_col: Any = js.native
    
    /* private */ /* CompleteClass */
    var max_row: Any = js.native
    
    /* private */ /* CompleteClass */
    var reset: Any = js.native
    
    /* private */ /* CompleteClass */
    var responseObject: Any = js.native
    
    /* private */ /* CompleteClass */
    var rowStarted: Any = js.native
    
    /* private */ /* CompleteClass */
    var started: Any = js.native
    
    /* CompleteClass */
    override def write(): Unit = js.native
  }
  @JSImport("@nginstack/web-framework/lib/process/LayoutManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@nginstack/web-framework/lib/process/LayoutManager", "INSTANCE_COUNT")
  @js.native
  val INSTANCE_COUNT: Double = js.native
  
  trait LayoutManager extends StObject {
    
    /* private */ var _write: Any
    
    def add(obj: Any, row: Double, col: Double, args: Any*): Unit
    
    /* private */ var begin: Any
    
    var border: Double
    
    var cellStarted: Boolean
    
    /* private */ var colStarted: Any
    
    var enabled: Boolean
    
    /* private */ var end: Any
    
    /* private */ var id: Any
    
    /* private */ var lastColumn: Any
    
    /* private */ var max_col: Any
    
    /* private */ var max_row: Any
    
    /* private */ var reset: Any
    
    /* private */ var responseObject: Any
    
    /* private */ var rowStarted: Any
    
    /* private */ var started: Any
    
    def write(): Unit
  }
  object LayoutManager {
    
    inline def apply(
      _write: Any,
      add: (Any, Double, Double, /* repeated */ Any) => Unit,
      begin: Any,
      border: Double,
      cellStarted: Boolean,
      colStarted: Any,
      enabled: Boolean,
      end: Any,
      id: Any,
      lastColumn: Any,
      max_col: Any,
      max_row: Any,
      reset: Any,
      responseObject: Any,
      rowStarted: Any,
      started: Any,
      write: () => Unit
    ): LayoutManager = {
      val __obj = js.Dynamic.literal(_write = _write.asInstanceOf[js.Any], add = js.Any.fromFunction4(add), begin = begin.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], cellStarted = cellStarted.asInstanceOf[js.Any], colStarted = colStarted.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lastColumn = lastColumn.asInstanceOf[js.Any], max_col = max_col.asInstanceOf[js.Any], max_row = max_row.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], responseObject = responseObject.asInstanceOf[js.Any], rowStarted = rowStarted.asInstanceOf[js.Any], started = started.asInstanceOf[js.Any], write = js.Any.fromFunction0(write))
      __obj.asInstanceOf[LayoutManager]
    }
    
    extension [Self <: LayoutManager](x: Self) {
      
      inline def setAdd(value: (Any, Double, Double, /* repeated */ Any) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction4(value))
      
      inline def setBegin(value: Any): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBorder(value: Double): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setCellStarted(value: Boolean): Self = StObject.set(x, "cellStarted", value.asInstanceOf[js.Any])
      
      inline def setColStarted(value: Any): Self = StObject.set(x, "colStarted", value.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnd(value: Any): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLastColumn(value: Any): Self = StObject.set(x, "lastColumn", value.asInstanceOf[js.Any])
      
      inline def setMax_col(value: Any): Self = StObject.set(x, "max_col", value.asInstanceOf[js.Any])
      
      inline def setMax_row(value: Any): Self = StObject.set(x, "max_row", value.asInstanceOf[js.Any])
      
      inline def setReset(value: Any): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResponseObject(value: Any): Self = StObject.set(x, "responseObject", value.asInstanceOf[js.Any])
      
      inline def setRowStarted(value: Any): Self = StObject.set(x, "rowStarted", value.asInstanceOf[js.Any])
      
      inline def setStarted(value: Any): Self = StObject.set(x, "started", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: () => Unit): Self = StObject.set(x, "write", js.Any.fromFunction0(value))
      
      inline def set_write(value: Any): Self = StObject.set(x, "_write", value.asInstanceOf[js.Any])
    }
  }
}
