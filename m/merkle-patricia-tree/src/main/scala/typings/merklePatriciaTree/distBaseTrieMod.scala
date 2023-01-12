package typings.merklePatriciaTree

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.levelup.mod.LevelUp
import typings.merklePatriciaTree.distDbMod.BatchDBOp
import typings.merklePatriciaTree.distDbMod.DB
import typings.merklePatriciaTree.distReadStreamMod.TrieReadStream
import typings.merklePatriciaTree.distTrieNodeMod.EmbeddedNode
import typings.merklePatriciaTree.distTrieNodeMod.Nibbles
import typings.merklePatriciaTree.distTrieNodeMod.TrieNode
import typings.merklePatriciaTree.distUtilWalkControllerMod.WalkController
import typings.node.bufferMod.global.Buffer
import typings.semaphoreAsyncAwait.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBaseTrieMod {
  
  @JSImport("merkle-patricia-tree/dist/baseTrie", "Trie")
  @js.native
  /**
    * test
    * @param db - A [levelup](https://github.com/Level/levelup) instance. By default (if the db is `null` or
    * left undefined) creates an in-memory [memdown](https://github.com/Level/memdown) instance.
    * @param root - A `Buffer` for the root of a previously stored trie
    * @param deleteFromDB - Delete nodes from DB on delete operations (disallows switching to an older state root) (default: `false`)
    */
  open class Trie () extends StObject {
    def this(db: LevelUp[AbstractLevelDOWN[Any, Any], AbstractIterator[Any, Any]]) = this()
    def this(db: Null, root: Buffer) = this()
    def this(db: Unit, root: Buffer) = this()
    def this(db: LevelUp[AbstractLevelDOWN[Any, Any], AbstractIterator[Any, Any]], root: Buffer) = this()
    def this(db: Null, root: Unit, deleteFromDB: Boolean) = this()
    def this(db: Null, root: Buffer, deleteFromDB: Boolean) = this()
    def this(db: Unit, root: Unit, deleteFromDB: Boolean) = this()
    def this(db: Unit, root: Buffer, deleteFromDB: Boolean) = this()
    def this(
      db: LevelUp[AbstractLevelDOWN[Any, Any], AbstractIterator[Any, Any]],
      root: Unit,
      deleteFromDB: Boolean
    ) = this()
    def this(
      db: LevelUp[AbstractLevelDOWN[Any, Any], AbstractIterator[Any, Any]],
      root: Buffer,
      deleteFromDB: Boolean
    ) = this()
    
    /** The root for an empty trie */
    var EMPTY_TRIE_ROOT: Buffer = js.native
    
    /**
      * Creates the initial node from an empty tree.
      * @private
      */
    def _createInitialNode(key: Buffer, value: Buffer): js.Promise[Unit] = js.native
    
    /* private */ var _deleteFromDB: Any = js.native
    
    /**
      * Deletes a node from the trie.
      * @private
      */
    def _deleteNode(k: Buffer, stack: js.Array[TrieNode]): js.Promise[Unit] = js.native
    
    /**
      * Finds all nodes that are stored directly in the db
      * (some nodes are stored raw inside other nodes)
      * called by {@link ScratchReadStream}
      * @private
      */
    def _findDbNodes(onFound: FoundNodeFunction): js.Promise[Unit] = js.native
    
    /**
      * Finds all nodes that store k,v values
      * called by {@link TrieReadStream}
      * @private
      */
    def _findValueNodes(onFound: FoundNodeFunction): js.Promise[Unit] = js.native
    
    /**
      * Formats node to be saved by `levelup.batch`.
      * @private
      * @param node - the node to format.
      * @param topLevel - if the node is at the top level.
      * @param opStack - the opStack to push the node's data.
      * @param remove - whether to remove the node (only used for CheckpointTrie).
      * @returns The node's hash used as the key or the rawNode.
      */
    def _formatNode(node: TrieNode, topLevel: Boolean, opStack: js.Array[BatchDBOp]): Buffer | (js.Array[EmbeddedNode | Null]) = js.native
    def _formatNode(node: TrieNode, topLevel: Boolean, opStack: js.Array[BatchDBOp], remove: Boolean): Buffer | (js.Array[EmbeddedNode | Null]) = js.native
    
    def _lookupNode(node: js.Array[Buffer]): js.Promise[TrieNode | Null] = js.native
    /**
      * @hidden
      * Backwards compatibility
      * @param node The node hash to lookup from the DB
      */
    def _lookupNode(node: Buffer): js.Promise[TrieNode | Null] = js.native
    
    /* private */ var _root: Any = js.native
    
    /**
      * Saves a stack of nodes to the database.
      * @private
      * @param key - the key. Should follow the stack
      * @param stack - a stack of nodes to the value given by the key
      * @param opStack - a stack of levelup operations to commit at the end of this funciton
      */
    def _saveStack(key: Nibbles, stack: js.Array[TrieNode], opStack: js.Array[BatchDBOp]): js.Promise[Unit] = js.native
    
    /**
      * Updates a node.
      * @private
      * @param key
      * @param value
      * @param keyRemainder
      * @param stack
      */
    def _updateNode(k: Buffer, value: Buffer, keyRemainder: Nibbles, stack: js.Array[TrieNode]): js.Promise[Unit] = js.native
    
    /**
      * @hidden
      * Backwards compatibility
      * @param root -
      * @param onFound -
      */
    def _walkTrie(root: Buffer, onFound: FoundNodeFunction): js.Promise[Unit] = js.native
    
    /**
      * The given hash of operations (key additions or deletions) are executed on the trie
      * (delete operations are only executed on DB with `deleteFromDB` set to `true`)
      * @example
      * const ops = [
      *    { type: 'del', key: Buffer.from('father') }
      *  , { type: 'put', key: Buffer.from('name'), value: Buffer.from('Yuri Irsenovich Kim') }
      *  , { type: 'put', key: Buffer.from('dob'), value: Buffer.from('16 February 1941') }
      *  , { type: 'put', key: Buffer.from('spouse'), value: Buffer.from('Kim Young-sook') }
      *  , { type: 'put', key: Buffer.from('occupation'), value: Buffer.from('Clown') }
      * ]
      * await trie.batch(ops)
      * @param ops
      */
    def batch(ops: js.Array[BatchDBOp]): js.Promise[Unit] = js.native
    
    /**
      * Checks if a given root exists.
      */
    def checkRoot(root: Buffer): js.Promise[Boolean] = js.native
    
    /**
      * Creates a new trie backed by the same db.
      */
    def copy(): Trie = js.native
    
    /**
      * The `data` event is given an `Object` that has two properties; the `key` and the `value`. Both should be Buffers.
      * @return Returns a [stream](https://nodejs.org/dist/latest-v12.x/docs/api/stream.html#stream_class_stream_readable) of the contents of the `trie`
      */
    def createReadStream(): TrieReadStream = js.native
    
    /** The backend DB */
    var db: DB = js.native
    
    /**
      * Deletes a value given a `key` from the trie
      * (delete operations are only executed on DB with `deleteFromDB` set to `true`)
      * @param key
      * @returns A Promise that resolves once value is deleted.
      */
    def del(key: Buffer): js.Promise[Unit] = js.native
    
    /**
      * Tries to find a path to the node for the given key.
      * It returns a `stack` of nodes to the closest node.
      * @param key - the search key
      * @param throwIfMissing - if true, throws if any nodes are missing. Used for verifying proofs. (default: false)
      */
    def findPath(key: Buffer): js.Promise[Path] = js.native
    def findPath(key: Buffer, throwIfMissing: Boolean): js.Promise[Path] = js.native
    
    /**
      * Gets a value given a `key`
      * @param key - the key to search for
      * @param throwIfMissing - if true, throws if any nodes are missing. Used for verifying proofs. (default: false)
      * @returns A Promise that resolves to `Buffer` if a value was found or `null` if no value was found.
      */
    def get(key: Buffer): js.Promise[Buffer | Null] = js.native
    def get(key: Buffer, throwIfMissing: Boolean): js.Promise[Buffer | Null] = js.native
    
    /**
      * BaseTrie has no checkpointing so return false
      */
    def isCheckpoint: Boolean = js.native
    
    /* protected */ var lock: default = js.native
    
    def lookupNode(node: js.Array[Buffer]): js.Promise[TrieNode | Null] = js.native
    /**
      * Retrieves a node from db by hash.
      */
    def lookupNode(node: Buffer): js.Promise[TrieNode | Null] = js.native
    
    /**
      * Stores a given `value` at the given `key` or do a delete if `value` is empty
      * (delete operations are only executed on DB with `deleteFromDB` set to `true`)
      * @param key
      * @param value
      * @returns A Promise that resolves once value is stored.
      */
    def put(key: Buffer, value: Buffer): js.Promise[Unit] = js.native
    
    /**
      * Gets the current root of the `trie`
      */
    def root: Buffer = js.native
    /**
      * Sets the current root of the `trie`
      */
    def root_=(value: Buffer): Unit = js.native
    
    /**
      * This method is deprecated.
      * Please use {@link Trie.root} instead.
      *
      * @param value
      * @deprecated
      */
    def setRoot(): Unit = js.native
    def setRoot(value: Buffer): Unit = js.native
    
    /**
      * Walks a trie until finished.
      * @param root
      * @param onFound - callback to call when a node is found. This schedules new tasks. If no tasks are available, the Promise resolves.
      * @returns Resolves when finished walking trie.
      */
    def walkTrie(root: Buffer, onFound: FoundNodeFunction): js.Promise[Unit] = js.native
  }
  /* static members */
  object Trie {
    
    @JSImport("merkle-patricia-tree/dist/baseTrie", "Trie")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a proof from a trie and key that can be verified using {@link Trie.verifyProof}.
      * @param trie
      * @param key
      */
    inline def createProof(trie: Trie, key: Buffer): js.Promise[Proof] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProof")(trie.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Proof]]
    
    /**
      * Saves the nodes from a proof into the trie. If no trie is provided a new one wil be instantiated.
      * @param proof
      * @param trie
      */
    inline def fromProof(proof: Proof): js.Promise[Trie] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProof")(proof.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Trie]]
    inline def fromProof(proof: Proof, trie: Trie): js.Promise[Trie] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromProof")(proof.asInstanceOf[js.Any], trie.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Trie]]
    
    /**
      * prove has been renamed to {@link Trie.createProof}.
      * @deprecated
      * @param trie
      * @param key
      */
    inline def prove(trie: Trie, key: Buffer): js.Promise[Proof] = (^.asInstanceOf[js.Dynamic].applyDynamic("prove")(trie.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Proof]]
    
    /**
      * Verifies a proof.
      * @param rootHash
      * @param key
      * @param proof
      * @throws If proof is found to be invalid.
      * @returns The value from the key, or null if valid proof of non-existence.
      */
    inline def verifyProof(rootHash: Buffer, key: Buffer, proof: Proof): js.Promise[Buffer | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyProof")(rootHash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], proof.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | Null]]
    
    inline def verifyRangeProof(rootHash: Buffer, firstKey: Null, lastKey: Null, keys: js.Array[Buffer], values: js.Array[Buffer]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def verifyRangeProof(
      rootHash: Buffer,
      firstKey: Null,
      lastKey: Null,
      keys: js.Array[Buffer],
      values: js.Array[Buffer],
      proof: js.Array[Buffer]
    ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any], proof.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def verifyRangeProof(
      rootHash: Buffer,
      firstKey: Null,
      lastKey: Buffer,
      keys: js.Array[Buffer],
      values: js.Array[Buffer]
    ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def verifyRangeProof(
      rootHash: Buffer,
      firstKey: Null,
      lastKey: Buffer,
      keys: js.Array[Buffer],
      values: js.Array[Buffer],
      proof: js.Array[Buffer]
    ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any], proof.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def verifyRangeProof(
      rootHash: Buffer,
      firstKey: Buffer,
      lastKey: Null,
      keys: js.Array[Buffer],
      values: js.Array[Buffer]
    ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def verifyRangeProof(
      rootHash: Buffer,
      firstKey: Buffer,
      lastKey: Null,
      keys: js.Array[Buffer],
      values: js.Array[Buffer],
      proof: js.Array[Buffer]
    ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any], proof.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    /**
      * {@link verifyRangeProof}
      */
    inline def verifyRangeProof(
      rootHash: Buffer,
      firstKey: Buffer,
      lastKey: Buffer,
      keys: js.Array[Buffer],
      values: js.Array[Buffer]
    ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
    inline def verifyRangeProof(
      rootHash: Buffer,
      firstKey: Buffer,
      lastKey: Buffer,
      keys: js.Array[Buffer],
      values: js.Array[Buffer],
      proof: js.Array[Buffer]
    ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any], proof.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  }
  
  type FoundNodeFunction = js.Function4[
    /* nodeRef */ Buffer, 
    /* node */ TrieNode | Null, 
    /* key */ Nibbles, 
    /* walkController */ WalkController, 
    Unit
  ]
  
  trait Path extends StObject {
    
    var node: TrieNode | Null
    
    var remaining: Nibbles
    
    var stack: js.Array[TrieNode]
  }
  object Path {
    
    inline def apply(remaining: Nibbles, stack: js.Array[TrieNode]): Path = {
      val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], node = null)
      __obj.asInstanceOf[Path]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Path] (val x: Self) extends AnyVal {
      
      inline def setNode(value: TrieNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeNull: Self = StObject.set(x, "node", null)
      
      inline def setRemaining(value: Nibbles): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      inline def setRemainingVarargs(value: Double*): Self = StObject.set(x, "remaining", js.Array(value*))
      
      inline def setStack(value: js.Array[TrieNode]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackVarargs(value: TrieNode*): Self = StObject.set(x, "stack", js.Array(value*))
    }
  }
  
  type Proof = js.Array[Buffer]
}
