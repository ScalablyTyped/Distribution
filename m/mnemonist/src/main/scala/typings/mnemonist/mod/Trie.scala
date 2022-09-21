package typings.mnemonist.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.mnemonist.trieMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mnemonist", "Trie")
@js.native
// Constructor
open class Trie[T] () extends default[T] {
  def this(Token: Instantiable0[T]) = this()
}
/* static members */
object Trie {
  
  @JSImport("mnemonist", "Trie")
  @js.native
  val ^ : js.Any = js.native
  
  // Statics
  inline def from[I](iterable: js.Iterable[I]): typings.mnemonist.trieMod.Trie[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.trieMod.Trie[I]]
  inline def from[I](iterable: StringDictionary[I]): typings.mnemonist.trieMod.Trie[I] = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(iterable.asInstanceOf[js.Any]).asInstanceOf[typings.mnemonist.trieMod.Trie[I]]
}
