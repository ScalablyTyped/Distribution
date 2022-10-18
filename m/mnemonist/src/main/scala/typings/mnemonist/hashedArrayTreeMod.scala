package typings.mnemonist

import typings.mnemonist.utilsTypesMod.IArrayLikeConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hashedArrayTreeMod {
  
  @JSImport("mnemonist/hashed-array-tree", JSImport.Default)
  @js.native
  open class default[T] protected ()
    extends StObject
       with HashedArrayTree[T] {
    // Constructor
    def this(ArrayClass: IArrayLikeConstructor, capacity: Double) = this()
    def this(ArrayClass: IArrayLikeConstructor, options: HashedArrayTreeOptions) = this()
    
    // Members
    /* CompleteClass */
    var blockSize: Double = js.native
    
    /* CompleteClass */
    var capacity: Double = js.native
    
    /* CompleteClass */
    override def get(index: Double): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def grow(capacity: Double): this.type = js.native
    
    /* CompleteClass */
    override def inspect(): Any = js.native
    
    /* CompleteClass */
    var length: Double = js.native
    
    /* CompleteClass */
    override def pop(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def push(value: T): Double = js.native
    
    /* CompleteClass */
    override def resize(length: Double): this.type = js.native
    
    // Methods
    /* CompleteClass */
    override def set(index: Double, value: T): this.type = js.native
  }
  
  trait HashedArrayTree[T] extends StObject {
    
    // Members
    var blockSize: Double
    
    var capacity: Double
    
    def get(index: Double): js.UndefOr[T]
    
    def grow(capacity: Double): this.type
    
    def inspect(): Any
    
    var length: Double
    
    def pop(): js.UndefOr[T]
    
    def push(value: T): Double
    
    def resize(length: Double): this.type
    
    // Methods
    def set(index: Double, value: T): this.type
  }
  object HashedArrayTree {
    
    inline def apply[T](
      blockSize: Double,
      capacity: Double,
      get: Double => js.UndefOr[T],
      grow: Double => HashedArrayTree[T],
      inspect: () => Any,
      length: Double,
      pop: () => js.UndefOr[T],
      push: T => Double,
      resize: Double => HashedArrayTree[T],
      set: (Double, T) => HashedArrayTree[T]
    ): HashedArrayTree[T] = {
      val __obj = js.Dynamic.literal(blockSize = blockSize.asInstanceOf[js.Any], capacity = capacity.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), grow = js.Any.fromFunction1(grow), inspect = js.Any.fromFunction0(inspect), length = length.asInstanceOf[js.Any], pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), resize = js.Any.fromFunction1(resize), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[HashedArrayTree[T]]
    }
    
    extension [Self <: HashedArrayTree[?], T](x: Self & HashedArrayTree[T]) {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setGet(value: Double => js.UndefOr[T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGrow(value: Double => HashedArrayTree[T]): Self = StObject.set(x, "grow", js.Any.fromFunction1(value))
      
      inline def setInspect(value: () => Any): Self = StObject.set(x, "inspect", js.Any.fromFunction0(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPop(value: () => js.UndefOr[T]): Self = StObject.set(x, "pop", js.Any.fromFunction0(value))
      
      inline def setPush(value: T => Double): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setResize(value: Double => HashedArrayTree[T]): Self = StObject.set(x, "resize", js.Any.fromFunction1(value))
      
      inline def setSet(value: (Double, T) => HashedArrayTree[T]): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  trait HashedArrayTreeOptions extends StObject {
    
    var blockSize: js.UndefOr[Double] = js.undefined
    
    var initialCapacity: js.UndefOr[Double] = js.undefined
    
    var initialLength: js.UndefOr[Double] = js.undefined
  }
  object HashedArrayTreeOptions {
    
    inline def apply(): HashedArrayTreeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HashedArrayTreeOptions]
    }
    
    extension [Self <: HashedArrayTreeOptions](x: Self) {
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setInitialCapacity(value: Double): Self = StObject.set(x, "initialCapacity", value.asInstanceOf[js.Any])
      
      inline def setInitialCapacityUndefined: Self = StObject.set(x, "initialCapacity", js.undefined)
      
      inline def setInitialLength(value: Double): Self = StObject.set(x, "initialLength", value.asInstanceOf[js.Any])
      
      inline def setInitialLengthUndefined: Self = StObject.set(x, "initialLength", js.undefined)
    }
  }
}
