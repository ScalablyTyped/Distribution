package typings.ow

import typings.ow.predicateMod.Predicate
import typings.std.IterableIterator
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ofTypeMod {
  
  @JSImport("ow/dist/source/utils/of-type", JSImport.Default)
  @js.native
  def default[T](source: js.Array[T], predicate: Predicate[T]): String | Boolean = js.native
  @JSImport("ow/dist/source/utils/of-type", JSImport.Default)
  @js.native
  def default[T](source: IterableIterator[T], predicate: Predicate[T]): String | Boolean = js.native
  @JSImport("ow/dist/source/utils/of-type", JSImport.Default)
  @js.native
  def default[T](source: Set[T], predicate: Predicate[T]): String | Boolean = js.native
}
