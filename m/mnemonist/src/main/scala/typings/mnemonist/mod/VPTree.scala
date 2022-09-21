package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.vpTreeMod.DistanceFunction
import typings.mnemonist.vpTreeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "VPTree")
@js.native
open class VPTree[T] protected () extends default[T] {
  // Constructor
  def this(distance: DistanceFunction[T], items: js.Iterable[T]) = this()
}
/* static members */
object VPTree {
  
  @JSImport("mnemonist", "VPTree")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I], distance: DistanceFunction[I]): typings.mnemonist.vpTreeMod.VPTree[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.vpTreeMod.VPTree[I]]
  inline def from[I](iterable: StringDictionary[I], distance: DistanceFunction[I]): typings.mnemonist.vpTreeMod.VPTree[I] = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any], distance.asInstanceOf[js.Any])).asInstanceOf[typings.mnemonist.vpTreeMod.VPTree[I]]
}
