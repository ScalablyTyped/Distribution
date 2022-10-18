package typings.nginstackWebFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSimpleLayoutAccumulatorMod {
  
  inline def apply(simpleLayout: SimpleLayout): Unit = ^.asInstanceOf[js.Dynamic].apply(simpleLayout.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/web-framework/lib/simple-layout/Accumulator", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Accumulator {
    def this(simpleLayout: SimpleLayout) = this()
    
    /* CompleteClass */
    override def feed(value: Any): Unit = js.native
    
    /* CompleteClass */
    override def getValue(groupIndex: Any): Any = js.native
    
    /* CompleteClass */
    var groupingValues: js.Array[Any] = js.native
    
    /* CompleteClass */
    override def reset(groupIndex: Any): Unit = js.native
    
    /* CompleteClass */
    override def setGroupingDepth(width: Any): Unit = js.native
    
    /* CompleteClass */
    var simpleLayout: SimpleLayout = js.native
  }
  @JSImport("@nginstack/web-framework/lib/simple-layout/Accumulator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Accumulator extends StObject {
    
    def feed(value: Any): Unit
    
    def getValue(groupIndex: Any): Any
    
    var groupingValues: js.Array[Any]
    
    def reset(groupIndex: Any): Unit
    
    def setGroupingDepth(width: Any): Unit
    
    var simpleLayout: SimpleLayout
  }
  object Accumulator {
    
    inline def apply(
      feed: Any => Unit,
      getValue: Any => Any,
      groupingValues: js.Array[Any],
      reset: Any => Unit,
      setGroupingDepth: Any => Unit,
      simpleLayout: SimpleLayout
    ): Accumulator = {
      val __obj = js.Dynamic.literal(feed = js.Any.fromFunction1(feed), getValue = js.Any.fromFunction1(getValue), groupingValues = groupingValues.asInstanceOf[js.Any], reset = js.Any.fromFunction1(reset), setGroupingDepth = js.Any.fromFunction1(setGroupingDepth), simpleLayout = simpleLayout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accumulator]
    }
    
    extension [Self <: Accumulator](x: Self) {
      
      inline def setFeed(value: Any => Unit): Self = StObject.set(x, "feed", js.Any.fromFunction1(value))
      
      inline def setGetValue(value: Any => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setGroupingValues(value: js.Array[Any]): Self = StObject.set(x, "groupingValues", value.asInstanceOf[js.Any])
      
      inline def setGroupingValuesVarargs(value: Any*): Self = StObject.set(x, "groupingValues", js.Array(value*))
      
      inline def setReset(value: Any => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setSetGroupingDepth(value: Any => Unit): Self = StObject.set(x, "setGroupingDepth", js.Any.fromFunction1(value))
      
      inline def setSimpleLayout(value: SimpleLayout): Self = StObject.set(x, "simpleLayout", value.asInstanceOf[js.Any])
    }
  }
  
  type SimpleLayout = typings.nginstackWebFramework.libSimpleLayoutSimpleLayoutMod.^
}
