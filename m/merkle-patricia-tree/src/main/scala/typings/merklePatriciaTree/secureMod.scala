package typings.merklePatriciaTree

import typings.merklePatriciaTree.baseTrieMod.Proof
import typings.merklePatriciaTree.checkpointTrieMod.CheckpointTrie
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object secureMod {
  
  @JSImport("merkle-patricia-tree/dist/secure", "SecureTrie")
  @js.native
  class SecureTrie protected () extends CheckpointTrie {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any) = this()
  }
  /* static members */
  object SecureTrie {
    
    /**
      * Creates a proof that can be verified using [[SecureTrie.verifyProof]].
      * @param {Trie} trie
      * @param {Buffer} key
      */
    @JSImport("merkle-patricia-tree/dist/secure", "SecureTrie.createProof")
    @js.native
    def createProof(trie: SecureTrie, key: Buffer): js.Promise[Proof] = js.native
    
    /**
      * prove has been renamed to [[SecureTrie.createProof]].
      * @deprecated
      * @param {Trie} trie
      * @param {Buffer} key
      */
    @JSImport("merkle-patricia-tree/dist/secure", "SecureTrie.prove")
    @js.native
    def prove(trie: SecureTrie, key: Buffer): js.Promise[Proof] = js.native
    
    /**
      * Verifies a proof.
      * @param {Buffer} rootHash
      * @param {Buffer} key
      * @param {Proof} proof
      * @throws If proof is found to be invalid.
      * @returns The value from the key.
      */
    @JSImport("merkle-patricia-tree/dist/secure", "SecureTrie.verifyProof")
    @js.native
    def verifyProof(rootHash: Buffer, key: Buffer, proof: Proof): js.Promise[Buffer | Null] = js.native
  }
}
