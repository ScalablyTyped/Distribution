package typings.merklePatriciaTree

import typings.merklePatriciaTree.baseTrieMod.Trie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object readStreamMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @JSImport("merkle-patricia-tree/dist/readStream", "TrieReadStream")
  @js.native
  open class TrieReadStream protected () extends StObject {
    def this(trie: Trie) = this()
    
    def _read(): js.Promise[Unit] = js.native
    
    /* private */ var _started: Any = js.native
    
    /* private */ var trie: Any = js.native
  }
}
