package typings.obliterator

import typings.obliterator.typesMod.Sequence
import typings.std.IterableIterator
import typings.std.IteratorResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iteratorMod {
  
  @JSImport("obliterator/iterator", JSImport.Default)
  @js.native
  open class default[V] protected ()
    extends StObject
       with ObliteratorIterator[V] {
    // Constructor
    def this(next: NextFunction[V]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("obliterator/iterator", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty[T](): ObliteratorIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[ObliteratorIterator[T]]
    
    inline def fromSequence[T](sequence: Sequence[T]): ObliteratorIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSequence")(sequence.asInstanceOf[js.Any]).asInstanceOf[ObliteratorIterator[T]]
    
    inline def is(value: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    // Static methods
    inline def of[T](args: T*): ObliteratorIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("of")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ObliteratorIterator[T]]
  }
  
  type NextFunction[V] = js.Function0[IteratorResult[V, Any]]
  
  @js.native
  trait ObliteratorIterator[V]
    extends StObject
       with IterableIterator[V] {
    
    // Well-known methods
    def next(): IteratorResult[V, Any] = js.native
  }
}
