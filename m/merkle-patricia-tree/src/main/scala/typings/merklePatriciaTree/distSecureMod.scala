package typings.merklePatriciaTree

import typings.merklePatriciaTree.distBaseTrieMod.Proof
import typings.merklePatriciaTree.distCheckpointTrieMod.CheckpointTrie
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSecureMod {
  
  @JSImport("merkle-patricia-tree/dist/secure", "SecureTrie")
  @js.native
  open class SecureTrie protected () extends CheckpointTrie {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any) = this()
  }
  /* static members */
  object SecureTrie {
    
    @JSImport("merkle-patricia-tree/dist/secure", "SecureTrie")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a proof that can be verified using {@link SecureTrie.verifyProof}.
      * @param trie
      * @param key
      */
    inline def createProof(trie: SecureTrie, key: Buffer): js.Promise[Proof] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProof")(trie.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Proof]]
    
    /**
      * prove has been renamed to {@link SecureTrie.createProof}.
      * @deprecated
      * @param trie
      * @param key
      */
    inline def prove(trie: SecureTrie, key: Buffer): js.Promise[Proof] = (^.asInstanceOf[js.Dynamic].applyDynamic("prove")(trie.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Proof]]
    
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
}
