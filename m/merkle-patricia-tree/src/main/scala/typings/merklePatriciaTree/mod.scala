package typings.merklePatriciaTree

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.levelup.mod.LevelUp
import typings.merklePatriciaTree.distBaseTrieMod.FoundNodeFunction
import typings.merklePatriciaTree.distBaseTrieMod.Proof
import typings.merklePatriciaTree.distBaseTrieMod.Trie
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("merkle-patricia-tree", "BaseTrie")
  @js.native
  /**
    * test
    * @param db - A [levelup](https://github.com/Level/levelup) instance. By default (if the db is `null` or
    * left undefined) creates an in-memory [memdown](https://github.com/Level/memdown) instance.
    * @param root - A `Buffer` for the root of a previously stored trie
    * @param deleteFromDB - Delete nodes from DB on delete operations (disallows switching to an older state root) (default: `false`)
    */
  open class BaseTrie () extends Trie {
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
  }
  /* static members */
  object BaseTrie {
    
    @JSImport("merkle-patricia-tree", "BaseTrie")
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
  
  @JSImport("merkle-patricia-tree", "CheckpointTrie")
  @js.native
  open class CheckpointTrie protected ()
    extends typings.merklePatriciaTree.distCheckpointTrieMod.CheckpointTrie {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any) = this()
  }
  
  @JSImport("merkle-patricia-tree", "SecureTrie")
  @js.native
  open class SecureTrie protected ()
    extends typings.merklePatriciaTree.distSecureMod.SecureTrie {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any) = this()
  }
  /* static members */
  object SecureTrie {
    
    @JSImport("merkle-patricia-tree", "SecureTrie")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a proof that can be verified using {@link SecureTrie.verifyProof}.
      * @param trie
      * @param key
      */
    inline def createProof(trie: typings.merklePatriciaTree.distSecureMod.SecureTrie, key: Buffer): js.Promise[Proof] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProof")(trie.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Proof]]
    
    /**
      * prove has been renamed to {@link SecureTrie.createProof}.
      * @deprecated
      * @param trie
      * @param key
      */
    inline def prove(trie: typings.merklePatriciaTree.distSecureMod.SecureTrie, key: Buffer): js.Promise[Proof] = (^.asInstanceOf[js.Dynamic].applyDynamic("prove")(trie.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Proof]]
    
    /**
      * Verifies a proof.
      * @param rootHash
      * @param key
      * @param proof
      * @throws If proof is found to be invalid.
      * @returns The value from the key.
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
      * Verifies a range proof.
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
  
  @JSImport("merkle-patricia-tree", "WalkController")
  @js.native
  /**
    * Creates a new WalkController
    * @param onNode - The `FoundNodeFunction` to call if a node is found.
    * @param trie - The `Trie` to walk on.
    * @param poolSize - The size of the task queue.
    */
  /* private */ open class WalkController ()
    extends typings.merklePatriciaTree.distUtilWalkControllerMod.WalkController
  /* static members */
  object WalkController {
    
    @JSImport("merkle-patricia-tree", "WalkController")
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
