package typings.mobx

import typings.std.IterableIterator
import typings.std.Iterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iterableMod {
  
  @JSImport("mobx/lib/utils/iterable", "makeIterable")
  @js.native
  def makeIterable[T](iterator: Iterator[T, _, js.UndefOr[scala.Nothing]]): IterableIterator[T] = js.native
}
