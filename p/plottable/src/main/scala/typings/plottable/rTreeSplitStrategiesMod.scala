package typings.plottable

import typings.plottable.rTreeMod.RTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rTreeSplitStrategiesMod {
  
  @JSImport("plottable/build/src/utils/rTreeSplitStrategies", "SplitStrategyLinear")
  @js.native
  class SplitStrategyLinear ()
    extends StObject
       with IRTreeSplitStrategy {
    
    /**
      * Split the next entry. Choose the entry that expands its parent node's
      * area the least.
      */
    /* private */ def addNext[T](entries: js.Any, nodes: js.Any): js.Any = js.native
    
    /**
      * Choose the two farthest-apart entries to begin the split.
      */
    /* private */ def chooseFirstSplit[T](entries: js.Any, nodes: js.Any): js.Any = js.native
    
    /* CompleteClass */
    override def split[T](entries: js.Array[RTreeNode[T]], nodes: NodePair[T]): Unit = js.native
  }
  
  @JSImport("plottable/build/src/utils/rTreeSplitStrategies", "SplitStrategyTrivial")
  @js.native
  class SplitStrategyTrivial ()
    extends StObject
       with IRTreeSplitStrategy {
    
    /* CompleteClass */
    override def split[T](entries: js.Array[RTreeNode[T]], nodes: NodePair[T]): Unit = js.native
  }
  
  trait IRTreeSplitStrategy extends StObject {
    
    def split[T](entries: js.Array[RTreeNode[T]], nodes: NodePair[T]): Unit
  }
  object IRTreeSplitStrategy {
    
    @scala.inline
    def apply(split: (js.Array[RTreeNode[js.Any]], NodePair[js.Any]) => Unit): IRTreeSplitStrategy = {
      val __obj = js.Dynamic.literal(split = js.Any.fromFunction2(split))
      __obj.asInstanceOf[IRTreeSplitStrategy]
    }
    
    @scala.inline
    implicit class IRTreeSplitStrategyMutableBuilder[Self <: IRTreeSplitStrategy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSplit(value: (js.Array[RTreeNode[js.Any]], NodePair[js.Any]) => Unit): Self = StObject.set(x, "split", js.Any.fromFunction2(value))
    }
  }
  
  type NodePair[T] = js.Tuple2[RTreeNode[T], RTreeNode[T]]
}
