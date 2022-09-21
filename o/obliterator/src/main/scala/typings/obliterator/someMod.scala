package typings.obliterator

import typings.obliterator.typesMod.IntoInterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object someMod {
  
  @JSImport("obliterator/some", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](target: IntoInterator[T], predicate: PredicateFunction[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type PredicateFunction[T] = js.Function1[/* item */ T, Boolean]
}
