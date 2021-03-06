package typings.optimism

import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object keyTrieMod {
  
  @JSImport("optimism/lib/key-trie", "KeyTrie")
  @js.native
  class KeyTrie[K] protected () extends StObject {
    def this(weakness: Boolean) = this()
    def this(weakness: Boolean, makeData: js.Function1[/* array */ js.Array[_], K]) = this()
    
    var data: js.Any = js.native
    
    var getChildTrie: js.Any = js.native
    
    def lookup[T /* <: js.Array[_] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param array because its type T is not an array type */ array: T
    ): K = js.native
    
    def lookupArray[T /* <: IArguments | js.Array[_] */](array: T): K = js.native
    
    var makeData: js.Any = js.native
    
    var strong: js.Any = js.native
    
    var weak: js.Any = js.native
    
    var weakness: js.Any = js.native
  }
}
