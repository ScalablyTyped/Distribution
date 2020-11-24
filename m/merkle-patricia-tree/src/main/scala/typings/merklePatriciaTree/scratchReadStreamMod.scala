package typings.merklePatriciaTree

import typings.merklePatriciaTree.baseTrieMod.Trie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("merkle-patricia-tree/dist/scratchReadStream", JSImport.Namespace)
@js.native
object scratchReadStreamMod extends js.Object {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ @js.native
  class ScratchReadStream protected () extends js.Object {
    def this(trie: Trie) = this()
    
    def _read(): js.Promise[Unit] = js.native
    
    var _started: js.Any = js.native
    
    var trie: js.Any = js.native
  }
}
