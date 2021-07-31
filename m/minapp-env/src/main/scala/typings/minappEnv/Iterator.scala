package typings.minappEnv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iterator[T] extends StObject {
  
  def next(): IteratorResult[T] = js.native
  def next(value: js.Any): IteratorResult[T] = js.native
  
  var `return`: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], IteratorResult[T]]] = js.native
  
  var `throw`: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], IteratorResult[T]]] = js.native
}
