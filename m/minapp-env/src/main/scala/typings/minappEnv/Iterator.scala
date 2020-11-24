package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Iterator[T] extends js.Object {
  
  def next(): IteratorResult[T] = js.native
  def next(value: js.Any): IteratorResult[T] = js.native
  
  var `return`: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], IteratorResult[T]]] = js.native
  
  var `throw`: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], IteratorResult[T]]] = js.native
}
