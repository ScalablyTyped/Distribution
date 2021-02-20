package typings.merklePatriciaTree

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trieNodeMod {
  
  @JSImport("merkle-patricia-tree/dist/trieNode", "BranchNode")
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
  object BranchNode {
    
    @JSImport("merkle-patricia-tree/dist/trieNode", "BranchNode.fromArray")
    @js.native
    def fromArray(arr: js.Array[Buffer]): BranchNode = js.native
  }
  
  @JSImport("merkle-patricia-tree/dist/trieNode", "ExtensionNode")
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
  object ExtensionNode {
    
    @JSImport("merkle-patricia-tree/dist/trieNode", "ExtensionNode.decodeKey")
    @js.native
    def decodeKey(key: Nibbles): Nibbles = js.native
    
    @JSImport("merkle-patricia-tree/dist/trieNode", "ExtensionNode.encodeKey")
    @js.native
    def encodeKey(key: Nibbles): Nibbles = js.native
  }
  
  @JSImport("merkle-patricia-tree/dist/trieNode", "LeafNode")
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
  object LeafNode {
    
    @JSImport("merkle-patricia-tree/dist/trieNode", "LeafNode.decodeKey")
    @js.native
    def decodeKey(encodedKey: Nibbles): Nibbles = js.native
    
    @JSImport("merkle-patricia-tree/dist/trieNode", "LeafNode.encodeKey")
    @js.native
    def encodeKey(key: Nibbles): Nibbles = js.native
  }
  
  @JSImport("merkle-patricia-tree/dist/trieNode", "decodeNode")
  @js.native
  def decodeNode(raw: Buffer): TrieNode = js.native
  
  @JSImport("merkle-patricia-tree/dist/trieNode", "decodeRawNode")
  @js.native
  def decodeRawNode(raw: js.Array[Buffer]): TrieNode = js.native
  
  @JSImport("merkle-patricia-tree/dist/trieNode", "isRawNode")
  @js.native
  def isRawNode(n: js.Any): Boolean = js.native
  
  type EmbeddedNode = Buffer | js.Array[Buffer]
  
  type Nibbles = js.Array[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.merklePatriciaTree.trieNodeMod.BranchNode
    - typings.merklePatriciaTree.trieNodeMod.ExtensionNode
    - typings.merklePatriciaTree.trieNodeMod.LeafNode
  */
  trait TrieNode extends StObject
}
