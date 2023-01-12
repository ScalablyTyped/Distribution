package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGridAggregateBarMod {
  
  inline def apply(grid: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(grid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/grid/AggregateBar", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AggregateBar {
    def this(grid: Any) = this()
    
    /* CompleteClass */
    override def add(aggr: Any): Unit = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    var count: Double = js.native
    
    /* private */ /* CompleteClass */
    var fReadOnly: Any = js.native
    
    /* CompleteClass */
    override def getChanges(): String = js.native
    
    /* private */ /* CompleteClass */
    var getReadOnly: Any = js.native
    
    /* CompleteClass */
    var grid: Any = js.native
    
    /* CompleteClass */
    override def resetLastSentValues(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var setReadOnly: Any = js.native
  }
  @JSImport("@nginstack/web-framework/lib/grid/AggregateBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AggregateBar extends StObject {
    
    def add(aggr: Any): Unit
    
    def clear(): Unit
    
    var count: Double
    
    /* private */ var fReadOnly: Any
    
    def getChanges(): String
    
    /* private */ var getReadOnly: Any
    
    var grid: Any
    
    def resetLastSentValues(): Unit
    
    /* private */ var setReadOnly: Any
  }
  object AggregateBar {
    
    inline def apply(
      add: Any => Unit,
      clear: () => Unit,
      count: Double,
      fReadOnly: Any,
      getChanges: () => String,
      getReadOnly: Any,
      grid: Any,
      resetLastSentValues: () => Unit,
      setReadOnly: Any
    ): AggregateBar = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), count = count.asInstanceOf[js.Any], fReadOnly = fReadOnly.asInstanceOf[js.Any], getChanges = js.Any.fromFunction0(getChanges), getReadOnly = getReadOnly.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], resetLastSentValues = js.Any.fromFunction0(resetLastSentValues), setReadOnly = setReadOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[AggregateBar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AggregateBar] (val x: Self) extends AnyVal {
      
      inline def setAdd(value: Any => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setFReadOnly(value: Any): Self = StObject.set(x, "fReadOnly", value.asInstanceOf[js.Any])
      
      inline def setGetChanges(value: () => String): Self = StObject.set(x, "getChanges", js.Any.fromFunction0(value))
      
      inline def setGetReadOnly(value: Any): Self = StObject.set(x, "getReadOnly", value.asInstanceOf[js.Any])
      
      inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setResetLastSentValues(value: () => Unit): Self = StObject.set(x, "resetLastSentValues", js.Any.fromFunction0(value))
      
      inline def setSetReadOnly(value: Any): Self = StObject.set(x, "setReadOnly", value.asInstanceOf[js.Any])
    }
  }
}
