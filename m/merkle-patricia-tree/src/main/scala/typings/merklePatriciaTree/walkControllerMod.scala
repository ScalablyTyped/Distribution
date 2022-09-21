package typings.merklePatriciaTree

import typings.merklePatriciaTree.baseTrieMod.FoundNodeFunction
import typings.merklePatriciaTree.mod.BaseTrie
import typings.merklePatriciaTree.prioritizedTaskExecutorMod.PrioritizedTaskExecutor
import typings.merklePatriciaTree.trieNodeMod.BranchNode
import typings.merklePatriciaTree.trieNodeMod.Nibbles
import typings.merklePatriciaTree.trieNodeMod.TrieNode
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object walkControllerMod {
  
  @JSImport("merkle-patricia-tree/dist/util/walkController", "WalkController")
  @js.native
  /**
    * Creates a new WalkController
    * @param onNode - The `FoundNodeFunction` to call if a node is found.
    * @param trie - The `Trie` to walk on.
    * @param poolSize - The size of the task queue.
    */
  /* private */ open class WalkController () extends StObject {
    
    /**
      * Run all children of a node. Priority of these nodes are the key length of the children.
      * @param node - Node to get all children of and call onNode on.
      * @param key - The current `key` which would yield the `node` when trying to get this node with a `get` operation.
      */
    def allChildren(node: TrieNode): Unit = js.native
    def allChildren(node: TrieNode, key: Nibbles): Unit = js.native
    
    def onNode(nodeRef: Buffer, node: Null, key: Nibbles, walkController: WalkController): Unit = js.native
    def onNode(nodeRef: Buffer, node: TrieNode, key: Nibbles, walkController: WalkController): Unit = js.native
    
    def onlyBranchIndex(node: BranchNode, key: Unit, childIndex: Double): Unit = js.native
    def onlyBranchIndex(node: BranchNode, key: Unit, childIndex: Double, priority: Double): Unit = js.native
    /**
      * Push a branch of a certain BranchNode to the event queue.
      * @param node - The node to select a branch on. Should be a BranchNode.
      * @param key - The current key which leads to the corresponding node.
      * @param childIndex - The child index to add to the event queue.
      * @param priority - Optional priority of the event, defaults to the total key length.
      */
    def onlyBranchIndex(node: BranchNode, key: Nibbles, childIndex: Double): Unit = js.native
    def onlyBranchIndex(node: BranchNode, key: Nibbles, childIndex: Double, priority: Double): Unit = js.native
    
    /* private */ var processNode: Any = js.native
    
    /**
      * Push a node to the queue. If the queue has places left for tasks, the node is executed immediately, otherwise it is queued.
      * @param nodeRef - Push a node reference to the event queue. This reference is a 32-byte keccak hash of the value corresponding to the `key`.
      * @param key - The current key.
      * @param priority - Optional priority, defaults to key length
      */
    def pushNodeToQueue(nodeRef: Buffer): Unit = js.native
    def pushNodeToQueue(nodeRef: Buffer, key: Unit, priority: Double): Unit = js.native
    def pushNodeToQueue(nodeRef: Buffer, key: Nibbles): Unit = js.native
    def pushNodeToQueue(nodeRef: Buffer, key: Nibbles, priority: Double): Unit = js.native
    
    /* private */ var reject: Any = js.native
    
    /* private */ var resolve: Any = js.native
    
    /* private */ var startWalk: Any = js.native
    
    val taskExecutor: PrioritizedTaskExecutor = js.native
    
    val trie: BaseTrie = js.native
  }
  /* static members */
  object WalkController {
    
    @JSImport("merkle-patricia-tree/dist/util/walkController", "WalkController")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Async function to create and start a new walk over a trie.
      * @param onNode - The `FoundNodeFunction to call if a node is found.
      * @param trie - The trie to walk on.
      * @param root - The root key to walk on.
      * @param poolSize - Task execution pool size to prevent OOM errors. Defaults to 500.
      */
    inline def newWalk(onNode: FoundNodeFunction, trie: BaseTrie, root: Buffer): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("newWalk")(onNode.asInstanceOf[js.Any], trie.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def newWalk(onNode: FoundNodeFunction, trie: BaseTrie, root: Buffer, poolSize: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("newWalk")(onNode.asInstanceOf[js.Any], trie.asInstanceOf[js.Any], root.asInstanceOf[js.Any], poolSize.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  }
}
