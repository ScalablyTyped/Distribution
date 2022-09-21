package typings.mnemonist.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.trieMapMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "TrieMap")
@js.native
// Constructor
open class TrieMap[K, V] () extends default[K, V] {
  def this(Token: Instantiable0[K]) = this()
}
/* static members */
object TrieMap {
  
  @JSImport("mnemonist", "TrieMap")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I, J](iterable: js.Iterable[js.Tuple2[I, J]]): typings.mnemonist.trieMapMod.TrieMap[I, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.trieMapMod.TrieMap[I, J]]
  inline def from[I, J](iterable: StringDictionary[J]): typings.mnemonist.trieMapMod.TrieMap[I, J] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.trieMapMod.TrieMap[I, J]]
}
