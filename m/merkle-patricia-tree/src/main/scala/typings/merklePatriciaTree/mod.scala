package typings.merklePatriciaTree

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.levelup.mod.LevelUp
import typings.merklePatriciaTree.baseTrieMod.Proof
import typings.merklePatriciaTree.baseTrieMod.Trie
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("merkle-patricia-tree", "BaseTrie")
  @js.native
  class BaseTrie () extends Trie {
    def this(db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]]) = this()
    def this(db: js.UndefOr[scala.Nothing], root: Buffer) = this()
    def this(db: Null, root: Buffer) = this()
    def this(db: LevelUp[AbstractLevelDOWN[_, _], AbstractIterator[_, _]], root: Buffer) = this()
  }
  /* static members */
  object BaseTrie {
    
    /**
      * Creates a proof from a trie and key that can be verified using [[Trie.verifyProof]].
      * @param {Trie} trie
      * @param {Buffer} key
      */
    @JSImport("merkle-patricia-tree", "BaseTrie.createProof")
    @js.native
    def createProof(trie: Trie, key: Buffer): js.Promise[Proof] = js.native
    
    /**
      * Saves the nodes from a proof into the trie. If no trie is provided a new one wil be instantiated.
      * @param {Proof} proof
      * @param {Trie} trie
      */
    @JSImport("merkle-patricia-tree", "BaseTrie.fromProof")
    @js.native
    def fromProof(proof: Proof): js.Promise[Trie] = js.native
    @JSImport("merkle-patricia-tree", "BaseTrie.fromProof")
    @js.native
    def fromProof(proof: Proof, trie: Trie): js.Promise[Trie] = js.native
    
    /**
      * prove has been renamed to [[Trie.createProof]].
      * @deprecated
      * @param {Trie} trie
      * @param {Buffer} key
      */
    @JSImport("merkle-patricia-tree", "BaseTrie.prove")
    @js.native
    def prove(trie: Trie, key: Buffer): js.Promise[Proof] = js.native
    
    /**
      * Verifies a proof.
      * @param {Buffer} rootHash
      * @param {Buffer} key
      * @param {Proof} proof
      * @throws If proof is found to be invalid.
      * @returns The value from the key.
      */
    @JSImport("merkle-patricia-tree", "BaseTrie.verifyProof")
    @js.native
    def verifyProof(rootHash: Buffer, key: Buffer, proof: Proof): js.Promise[Buffer | Null] = js.native
  }
  
  @JSImport("merkle-patricia-tree", "CheckpointTrie")
  @js.native
  class CheckpointTrie protected ()
    extends typings.merklePatriciaTree.checkpointTrieMod.CheckpointTrie {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any) = this()
  }
  
  @JSImport("merkle-patricia-tree", "SecureTrie")
  @js.native
  class SecureTrie protected ()
    extends typings.merklePatriciaTree.secureMod.SecureTrie {
    def this(/* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: js.Any) = this()
  }
  /* static members */
  object SecureTrie {
    
    /**
      * Creates a proof that can be verified using [[SecureTrie.verifyProof]].
      * @param {Trie} trie
      * @param {Buffer} key
      */
    @JSImport("merkle-patricia-tree", "SecureTrie.createProof")
    @js.native
    def createProof(trie: typings.merklePatriciaTree.secureMod.SecureTrie, key: Buffer): js.Promise[Proof] = js.native
    
    /**
      * prove has been renamed to [[SecureTrie.createProof]].
      * @deprecated
      * @param {Trie} trie
      * @param {Buffer} key
      */
    @JSImport("merkle-patricia-tree", "SecureTrie.prove")
    @js.native
    def prove(trie: typings.merklePatriciaTree.secureMod.SecureTrie, key: Buffer): js.Promise[Proof] = js.native
    
    /**
      * Verifies a proof.
      * @param {Buffer} rootHash
      * @param {Buffer} key
      * @param {Proof} proof
      * @throws If proof is found to be invalid.
      * @returns The value from the key.
      */
    @JSImport("merkle-patricia-tree", "SecureTrie.verifyProof")
    @js.native
    def verifyProof(rootHash: Buffer, key: Buffer, proof: Proof): js.Promise[Buffer | Null] = js.native
  }
}
