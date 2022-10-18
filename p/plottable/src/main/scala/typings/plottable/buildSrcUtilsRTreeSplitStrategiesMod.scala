package typings.plottable

import typings.plottable.buildSrcUtilsRTreeMod.RTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsRTreeSplitStrategiesMod {
  
  @JSImport("plottable/build/src/utils/rTreeSplitStrategies", "SplitStrategyLinear")
  @js.native
  open class SplitStrategyLinear ()
    extends StObject
       with IRTreeSplitStrategy {
    
    /**
      * Split the next entry. Choose the entry that expands its parent node's
      * area the least.
      */
    /* private */ var addNext: Any = js.native
    
    /**
      * Choose the two farthest-apart entries to begin the split.
      */
    /* private */ var chooseFirstSplit: Any = js.native
    
    /* CompleteClass */
    override def split[T](entries: js.Array[RTreeNode[T]], nodes: NodePair[T]): Unit = js.native
  }
  
  @JSImport("plottable/build/src/utils/rTreeSplitStrategies", "SplitStrategyTrivial")
  @js.native
  open class SplitStrategyTrivial ()
    extends StObject
       with IRTreeSplitStrategy {
    
    /* CompleteClass */
    override def split[T](entries: js.Array[RTreeNode[T]], nodes: NodePair[T]): Unit = js.native
  }
  
  trait IRTreeSplitStrategy extends StObject {
    
    def split[T](entries: js.Array[RTreeNode[T]], nodes: NodePair[T]): Unit
  }
  object IRTreeSplitStrategy {
    
    inline def apply(split: (js.Array[RTreeNode[Any]], NodePair[Any]) => Unit): IRTreeSplitStrategy = {
      val __obj = js.Dynamic.literal(split = js.Any.fromFunction2(split))
      __obj.asInstanceOf[IRTreeSplitStrategy]
    }
    
    extension [Self <: IRTreeSplitStrategy](x: Self) {
      
      inline def setSplit(value: (js.Array[RTreeNode[Any]], NodePair[Any]) => Unit): Self = StObject.set(x, "split", js.Any.fromFunction2(value))
    }
  }
  
  type NodePair[T] = js.Tuple2[RTreeNode[T], RTreeNode[T]]
}
