package typings.mnemonist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.biMapMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "BiMap")
@js.native
open class BiMap[K, V] () extends default[K, V]
/* static members */
object BiMap {
  
  @JSImport("mnemonist", "BiMap")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]]): typings.mnemonist.biMapMod.BiMap[I, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.biMapMod.BiMap[I, J]]
  inline def from[I, J](iterable: StringDictionary[J]): typings.mnemonist.biMapMod.BiMap[I, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.biMapMod.BiMap[I, J]]
}
