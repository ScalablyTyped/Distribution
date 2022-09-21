package typings.obliterator

import typings.obliterator.typesMod.IntoInterator
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapMod {
  
  @JSImport("obliterator/map", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[S, T](target: IntoInterator[S], predicate: MapFunction[S, T]): IterableIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[IterableIterator[T]]
  
  type MapFunction[S, T] = js.Function1[/* item */ S, T]
}
