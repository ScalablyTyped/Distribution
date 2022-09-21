package typings.ngPackagr

import typings.chokidar.mod.FSWatcher
import typings.ngPackagr.nodeMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildGraphMod {
  
  @JSImport("ng-packagr/lib/graph/build-graph", "BuildGraph")
  @js.native
  open class BuildGraph ()
    extends StObject
       with Traversable[Node] {
    
    def entries(): js.Array[Node] = js.native
    
    /* CompleteClass */
    override def filter[R /* <: Node */](by: ComplexPredicate[Node, R]): js.Array[R] = js.native
    
    /* CompleteClass */
    override def find[R /* <: Node */](by: ComplexPredicate[Node, R]): js.UndefOr[R] = js.native
    
    def get(url: String): Node = js.native
    
    def has(url: String): Boolean = js.native
    
    /* private */ var insert: Any = js.native
    
    def put(value: js.Array[Node]): this.type = js.native
    def put(value: Node): this.type = js.native
    
    def size: Double = js.native
    
    /* CompleteClass */
    override def some(by: SimplePredicate[Node]): Boolean = js.native
    
    /* private */ var store: Any = js.native
    
    var watcher: js.UndefOr[FSWatcher] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ngPackagr.buildGraphMod.SimplePredicate[T]
    - typings.ngPackagr.anon.Call[T, R]
  */
  trait ComplexPredicate[T, R /* <: T */] extends StObject
  
  @js.native
  trait SimplePredicate[T]
    extends StObject
       with ComplexPredicate[T, Any] {
    
    def apply(value: T, index: Double): Boolean = js.native
    
    var and: js.UndefOr[js.Function1[/* criteria */ SimplePredicate[T], SimplePredicate[T]]] = js.native
  }
  
  trait Traversable[T] extends StObject {
    
    def filter[R /* <: T */](by: ComplexPredicate[T, R]): js.Array[R]
    
    def find[R /* <: T */](by: ComplexPredicate[T, R]): js.UndefOr[R]
    
    def some(by: SimplePredicate[T]): Boolean
  }
  object Traversable {
    
    inline def apply[T](
      filter: ComplexPredicate[T, Any] => js.Array[Any],
      find: ComplexPredicate[T, Any] => js.UndefOr[Any],
      some: SimplePredicate[T] => Boolean
    ): Traversable[T] = {
      val __obj = js.Dynamic.literal(filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), some = js.Any.fromFunction1(some))
      __obj.asInstanceOf[Traversable[T]]
    }
    
    extension [Self <: Traversable[?], T](x: Self & Traversable[T]) {
      
      inline def setFilter(value: ComplexPredicate[T, Any] => js.Array[Any]): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFind(value: ComplexPredicate[T, Any] => js.UndefOr[Any]): Self = StObject.set(x, "find", js.Any.fromFunction1(value))
      
      inline def setSome(value: SimplePredicate[T] => Boolean): Self = StObject.set(x, "some", js.Any.fromFunction1(value))
    }
  }
}
