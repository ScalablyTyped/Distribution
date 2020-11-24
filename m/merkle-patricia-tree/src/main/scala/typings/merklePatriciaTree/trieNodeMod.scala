package typings.merklePatriciaTree

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("merkle-patricia-tree/dist/trieNode", JSImport.Namespace)
@js.native
object trieNodeMod extends js.Object {
  
  def decodeNode(raw: Buffer): TrieNode = js.native
  
  def decodeRawNode(raw: js.Array[Buffer]): TrieNode = js.native
  
  def isRawNode(n: js.Any): Boolean = js.native
  
  @js.native
  class BranchNode () extends TrieNode {
    
    var _branches: js.Array[EmbeddedNode | Null] = js.native
    
    var _value: Buffer | Null = js.native
    
    def getBranch(i: Double): Buffer | js.Array[Buffer] | Null = js.native
    
    def getChildren(): js.Array[js.Tuple2[Double, EmbeddedNode]] = js.native
    
    def hash(): Buffer = js.native
    
    def raw(): js.Array[EmbeddedNode | Null] = js.native
    
    def serialize(): Buffer = js.native
    
    def setBranch(i: Double): Unit = js.native
    def setBranch(i: Double, v: EmbeddedNode): Unit = js.native
    
    def value: Buffer | Null = js.native
    def value_=(v: Buffer | Null): Unit = js.native
  }
  /* static members */
  @js.native
  object BranchNode extends js.Object {
    
    def fromArray(arr: js.Array[Buffer]): BranchNode = js.native
  }
  
  @js.native
  class ExtensionNode protected () extends TrieNode {
    def this(nibbles: Nibbles, value: Buffer) = this()
    
    var _nibbles: Nibbles = js.native
    
    var _value: Buffer = js.native
    
    def encodedKey(): Nibbles = js.native
    
    def hash(): Buffer = js.native
    
    def key: Nibbles = js.native
    def key_=(k: Nibbles): Unit = js.native
    
    def raw(): js.Tuple2[Buffer, Buffer] = js.native
    
    def serialize(): Buffer = js.native
    
    def value: Buffer = js.native
    def value_=(v: Buffer): Unit = js.native
  }
  /* static members */
  @js.native
  object ExtensionNode extends js.Object {
    
    def decodeKey(key: Nibbles): Nibbles = js.native
    
    def encodeKey(key: Nibbles): Nibbles = js.native
  }
  
  @js.native
  class LeafNode protected () extends TrieNode {
    def this(nibbles: Nibbles, value: Buffer) = this()
    
    var _nibbles: Nibbles = js.native
    
    var _value: Buffer = js.native
    
    def encodedKey(): Nibbles = js.native
    
    def hash(): Buffer = js.native
    
    def key: Nibbles = js.native
    def key_=(k: Nibbles): Unit = js.native
    
    def raw(): js.Tuple2[Buffer, Buffer] = js.native
    
    def serialize(): Buffer = js.native
    
    def value: Buffer = js.native
    def value_=(v: Buffer): Unit = js.native
  }
  /* static members */
  @js.native
  object LeafNode extends js.Object {
    
    def decodeKey(encodedKey: Nibbles): Nibbles = js.native
    
    def encodeKey(key: Nibbles): Nibbles = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.merklePatriciaTree.trieNodeMod.BranchNode
    - typings.merklePatriciaTree.trieNodeMod.ExtensionNode
    - typings.merklePatriciaTree.trieNodeMod.LeafNode
  */
  trait TrieNode extends js.Object
  
  type EmbeddedNode = Buffer | js.Array[Buffer]
  
  type Nibbles = js.Array[Double]
}
