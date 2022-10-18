package typings.merklePatriciaTree

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTrieNodeMod {
  
  @JSImport("merkle-patricia-tree/dist/trieNode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("merkle-patricia-tree/dist/trieNode", "BranchNode")
  @js.native
  open class BranchNode ()
    extends StObject
       with TrieNode {
    
    var _branches: js.Array[EmbeddedNode | Null] = js.native
    
    var _value: Buffer | Null = js.native
    
    def getBranch(i: Double): EmbeddedNode | Null = js.native
    
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
    
    @JSImport("merkle-patricia-tree/dist/trieNode", "BranchNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromArray(arr: js.Array[Buffer]): BranchNode = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArray")(arr.asInstanceOf[js.Any]).asInstanceOf[BranchNode]
  }
  
  @JSImport("merkle-patricia-tree/dist/trieNode", "ExtensionNode")
  @js.native
  open class ExtensionNode protected ()
    extends StObject
       with TrieNode {
    def this(nibbles: Nibbles, value: Buffer) = this()
    
    var _nibbles: Nibbles = js.native
    
    var _value: Buffer = js.native
    
    def encodedKey(): Nibbles = js.native
    
    def hash(): Buffer = js.native
    
    def key: Nibbles = js.native
    
    def keyLength: Double = js.native
    
    def key_=(k: Nibbles): Unit = js.native
    
    def raw(): js.Tuple2[Buffer, Buffer] = js.native
    
    def serialize(): Buffer = js.native
    
    def value: Buffer = js.native
    def value_=(v: Buffer): Unit = js.native
  }
  /* static members */
  object ExtensionNode {
    
    @JSImport("merkle-patricia-tree/dist/trieNode", "ExtensionNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decodeKey(key: Nibbles): Nibbles = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeKey")(key.asInstanceOf[js.Any]).asInstanceOf[Nibbles]
    
    inline def encodeKey(key: Nibbles): Nibbles = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeKey")(key.asInstanceOf[js.Any]).asInstanceOf[Nibbles]
  }
  
  @JSImport("merkle-patricia-tree/dist/trieNode", "LeafNode")
  @js.native
  open class LeafNode protected ()
    extends StObject
       with TrieNode {
    def this(nibbles: Nibbles, value: Buffer) = this()
    
    var _nibbles: Nibbles = js.native
    
    var _value: Buffer = js.native
    
    def encodedKey(): Nibbles = js.native
    
    def hash(): Buffer = js.native
    
    def key: Nibbles = js.native
    
    def keyLength: Double = js.native
    
    def key_=(k: Nibbles): Unit = js.native
    
    def raw(): js.Tuple2[Buffer, Buffer] = js.native
    
    def serialize(): Buffer = js.native
    
    def value: Buffer = js.native
    def value_=(v: Buffer): Unit = js.native
  }
  /* static members */
  object LeafNode {
    
    @JSImport("merkle-patricia-tree/dist/trieNode", "LeafNode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decodeKey(encodedKey: Nibbles): Nibbles = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeKey")(encodedKey.asInstanceOf[js.Any]).asInstanceOf[Nibbles]
    
    inline def encodeKey(key: Nibbles): Nibbles = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeKey")(key.asInstanceOf[js.Any]).asInstanceOf[Nibbles]
  }
  
  inline def decodeNode(raw: Buffer): TrieNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeNode")(raw.asInstanceOf[js.Any]).asInstanceOf[TrieNode]
  
  inline def decodeRawNode(raw: js.Array[Buffer]): TrieNode = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRawNode")(raw.asInstanceOf[js.Any]).asInstanceOf[TrieNode]
  
  inline def isRawNode(n: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRawNode")(n.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  type EmbeddedNode = Buffer | js.Array[Buffer]
  
  type Nibbles = js.Array[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.merklePatriciaTree.distTrieNodeMod.BranchNode
    - typings.merklePatriciaTree.distTrieNodeMod.ExtensionNode
    - typings.merklePatriciaTree.distTrieNodeMod.LeafNode
  */
  trait TrieNode extends StObject
}
