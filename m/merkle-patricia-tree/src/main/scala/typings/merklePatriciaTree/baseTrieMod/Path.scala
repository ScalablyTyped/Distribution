package typings.merklePatriciaTree.baseTrieMod

import typings.merklePatriciaTree.trieNodeMod.Nibbles
import typings.merklePatriciaTree.trieNodeMod.TrieNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path extends js.Object {
  
  var node: TrieNode | Null = js.native
  
  var remaining: Nibbles = js.native
  
  var stack: js.Array[TrieNode] = js.native
}
object Path {
  
  @scala.inline
  def apply(remaining: Nibbles, stack: js.Array[TrieNode]): Path = {
    val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRemainingVarargs(value: Double*): Self = this.set("remaining", js.Array(value :_*))
    
    @scala.inline
    def setRemaining(value: Nibbles): Self = this.set("remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackVarargs(value: TrieNode*): Self = this.set("stack", js.Array(value :_*))
    
    @scala.inline
    def setStack(value: js.Array[TrieNode]): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: TrieNode): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeNull: Self = this.set("node", null)
  }
}
