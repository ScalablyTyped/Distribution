package typings.ngPackagr.anon

import typings.ngPackagr.libGraphBuildGraphMod.ComplexPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call[T, R /* <: T */]
  extends StObject
     with ComplexPredicate[T, R] {
  
  def apply(value: T, index: Double): /* is R */ Boolean = js.native
  
  var and: js.UndefOr[js.Function1[/* criteria */ ComplexPredicate[T, R], ComplexPredicate[T, R]]] = js.native
}
