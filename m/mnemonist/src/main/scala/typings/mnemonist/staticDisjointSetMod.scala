package typings.mnemonist

import typings.mnemonist.typesMod.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticDisjointSetMod {
  
  @JSImport("mnemonist/static-disjoint-set", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with StaticDisjointSet {
    // Constructor
    def this(size: Double) = this()
    
    /* CompleteClass */
    override def compile(): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def connected(x: Double, y: Double): Boolean = js.native
    
    // Members
    /* CompleteClass */
    var dimension: Double = js.native
    
    // Methods
    /* CompleteClass */
    override def find(x: Double): Double = js.native
    
    /* CompleteClass */
    override def inspect(): Any = js.native
    
    /* CompleteClass */
    override def mapping(): ArrayLike = js.native
    
    /* CompleteClass */
    var size: Double = js.native
    
    /* CompleteClass */
    override def union(x: Double, y: Double): this.type = js.native
  }
  
  trait StaticDisjointSet extends StObject {
    
    def compile(): js.Array[js.Array[Double]]
    
    def connected(x: Double, y: Double): Boolean
    
    // Members
    var dimension: Double
    
    // Methods
    def find(x: Double): Double
    
    def inspect(): Any
    
    def mapping(): ArrayLike
    
    var size: Double
    
    def union(x: Double, y: Double): this.type
  }
  object StaticDisjointSet {
    
    inline def apply(
      compile: () => js.Array[js.Array[Double]],
      connected: (Double, Double) => Boolean,
      dimension: Double,
      find: Double => Double,
      inspect: () => Any,
      mapping: () => ArrayLike,
      size: Double,
      union: (Double, Double) => StaticDisjointSet
    ): StaticDisjointSet = {
      val __obj = js.Dynamic.literal(compile = js.Any.fromFunction0(compile), connected = js.Any.fromFunction2(connected), dimension = dimension.asInstanceOf[js.Any], find = js.Any.fromFunction1(find), inspect = js.Any.fromFunction0(inspect), mapping = js.Any.fromFunction0(mapping), size = size.asInstanceOf[js.Any], union = js.Any.fromFunction2(union))
      __obj.asInstanceOf[StaticDisjointSet]
    }
    
    extension [Self <: StaticDisjointSet](x: Self) {
      
      inline def setCompile(value: () => js.Array[js.Array[Double]]): Self = StObject.set(x, "compile", js.Any.fromFunction0(value))
      
      inline def setConnected(value: (Double, Double) => Boolean): Self = StObject.set(x, "connected", js.Any.fromFunction2(value))
      
      inline def setDimension(value: Double): Self = StObject.set(x, "dimension", value.asInstanceOf[js.Any])
      
      inline def setFind(value: Double => Double): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setInspect(value: () => Any): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setMapping(value: () => ArrayLike): Self = StObject.set(x, "mapping", js.Any.fromFunction0(value))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setUnion(value: (Double, Double) => StaticDisjointSet): Self = StObject.set(x, "union", js.Any.fromFunction2(value))
    }
  }
}
