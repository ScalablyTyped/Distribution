package typings.merklePatriciaTree

import typings.merklePatriciaTree.trieNodeMod.Nibbles
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object verifyRangeProofMod {
  
  @JSImport("merkle-patricia-tree/dist/verifyRangeProof", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifyRangeProof(rootHash: Buffer, firstKey: Null, lastKey: Null, keys: js.Array[Nibbles], values: js.Array[Buffer]): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def verifyRangeProof(
    rootHash: Buffer,
    firstKey: Null,
    lastKey: Null,
    keys: js.Array[Nibbles],
    values: js.Array[Buffer],
    proof: js.Array[Buffer]
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any], proof.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def verifyRangeProof(
    rootHash: Buffer,
    firstKey: Null,
    lastKey: Nibbles,
    keys: js.Array[Nibbles],
    values: js.Array[Buffer]
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def verifyRangeProof(
    rootHash: Buffer,
    firstKey: Null,
    lastKey: Nibbles,
    keys: js.Array[Nibbles],
    values: js.Array[Buffer],
    proof: js.Array[Buffer]
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any], proof.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def verifyRangeProof(
    rootHash: Buffer,
    firstKey: Nibbles,
    lastKey: Null,
    keys: js.Array[Nibbles],
    values: js.Array[Buffer]
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def verifyRangeProof(
    rootHash: Buffer,
    firstKey: Nibbles,
    lastKey: Null,
    keys: js.Array[Nibbles],
    values: js.Array[Buffer],
    proof: js.Array[Buffer]
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any], proof.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def verifyRangeProof(
    rootHash: Buffer,
    firstKey: Nibbles,
    lastKey: Nibbles,
    keys: js.Array[Nibbles],
    values: js.Array[Buffer]
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def verifyRangeProof(
    rootHash: Buffer,
    firstKey: Nibbles,
    lastKey: Nibbles,
    keys: js.Array[Nibbles],
    values: js.Array[Buffer],
    proof: js.Array[Buffer]
  ): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyRangeProof")(rootHash.asInstanceOf[js.Any], firstKey.asInstanceOf[js.Any], lastKey.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], values.asInstanceOf[js.Any], proof.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
}
