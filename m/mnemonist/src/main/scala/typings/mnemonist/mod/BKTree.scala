package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.bkTreeMod.DistanceFunction
import typings.mnemonist.bkTreeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "BKTree")
@js.native
open class BKTree[T] protected () extends default[T] {
  // Constructor
  def this(distance: DistanceFunction[T]) = this()
}
/* static members */
object BKTree {
  
  @JSImport("mnemonist", "BKTree")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I], distance: DistanceFunction[I]): typings.mnemonist.bkTreeMod.BKTree[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.bkTreeMod.BKTree[I]]
  inline def from[I](iterable: StringDictionary[I], distance: DistanceFunction[I]): typings.mnemonist.bkTreeMod.BKTree[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.bkTreeMod.BKTree[I]]
}
