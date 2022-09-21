package typings.obliterator

import typings.obliterator.typesMod.IntoInterator
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object filterMod {
  
  @JSImport("obliterator/filter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](target: IntoInterator[T], predicate: PredicateFunction[T]): IterableIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[T]]
  
  type PredicateFunction[T] = js.Function1[/* item */ T, Boolean]
}
