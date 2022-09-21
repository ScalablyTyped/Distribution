package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.multiSetMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "MultiSet")
@js.native
open class MultiSet[K] () extends default[K]
/* static members */
object MultiSet {
  
  @JSImport("mnemonist", "MultiSet")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I]): typings.mnemonist.multiSetMod.MultiSet[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.multiSetMod.MultiSet[I]]
  inline def from[I](iterable: StringDictionary[I]): typings.mnemonist.multiSetMod.MultiSet[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.multiSetMod.MultiSet[I]]
  
  inline def isSubset[T](a: typings.mnemonist.multiSetMod.MultiSet[T], b: typings.mnemonist.multiSetMod.MultiSet[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSubset")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSuperset[T](a: typings.mnemonist.multiSetMod.MultiSet[T], b: typings.mnemonist.multiSetMod.MultiSet[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isSuperset")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
