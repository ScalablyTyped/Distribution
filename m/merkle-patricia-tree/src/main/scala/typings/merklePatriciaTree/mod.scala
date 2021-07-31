package typings.merklePatriciaTree

import typings.abstractLeveldown.mod.AbstractIterator
import typings.abstractLeveldown.mod.AbstractLevelDOWN
import typings.levelup.mod.LevelUp
import typings.merklePatriciaTree.baseTrieMod.Proof
import typings.merklePatriciaTree.baseTrieMod.Trie
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("merkle-patricia-tree", "BaseTrie")
  @js.native
  class BaseTrie () extends Trie {
    def this(db: LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]]) = this()
    def this(db: Null, root: Buffer) = this()
    def this(db: Unit, root: Buffer) = this()
    def this(db: LevelUp[AbstractLevelDOWN[js.Any, js.Any], AbstractIterator[js.Any, js.Any]], root: Buffer) = this()
  }
  /* static members */
  object BaseTrie {
    
    @JSImport("merkle-patricia-tree", "BaseTrie")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a proof from a trie and key that can be verified using [[Trie.verifyProof]].
      * @param {Trie} trie
      * @param {Buffer} key
      */
    @scala.inline
    def createProof(trie: Trie, key: Buffer): js.Promise[Proof] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProof")(trie.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Proof]]
    
    /**
      * Saves the nodes from a proof into the trie. If no trie is provided a new one wil be instantiated.
      * @param {Proof} proof
      * @param {Trie} trie
      */
    @scala.inline
    def fromProof(proof: Proof): js.Promise[Trie] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProof")(proof.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Trie]]
    @scala.inline
    def fromProof(proof: Proof, trie: Trie): js.Promise[Trie] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromProof")(proof.asInstanceOf[js.Any], trie.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Trie]]
    
    /**
      * prove has been renamed to [[Trie.createProof]].
      * @deprecated
      * @param {Trie} trie
      * @param {Buffer} key
      */
    @scala.inline
    def prove(trie: Trie, key: Buffer): js.Promise[Proof] = (^.asInstanceOf[js.Dynamic].applyDynamic("prove")(trie.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Proof]]
    
    /**
      * Verifies a proof.
      * @param {Buffer} rootHash
      * @param {Buffer} key
      * @param {Proof} proof
      * @throws If proof is found to be invalid.
      * @returns The value from the key.
      */
    @scala.inline
    def verifyProof(rootHash: Buffer, key: Buffer, proof: Proof): js.Promise[Buffer | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyProof")(rootHash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], proof.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | Null]]
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
    
    @JSImport("merkle-patricia-tree", "SecureTrie")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a proof that can be verified using [[SecureTrie.verifyProof]].
      * @param {Trie} trie
      * @param {Buffer} key
      */
    @scala.inline
    def createProof(trie: typings.merklePatriciaTree.secureMod.SecureTrie, key: Buffer): js.Promise[Proof] = (^.asInstanceOf[js.Dynamic].applyDynamic("createProof")(trie.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Proof]]
    
    /**
      * prove has been renamed to [[SecureTrie.createProof]].
      * @deprecated
      * @param {Trie} trie
      * @param {Buffer} key
      */
    @scala.inline
    def prove(trie: typings.merklePatriciaTree.secureMod.SecureTrie, key: Buffer): js.Promise[Proof] = (^.asInstanceOf[js.Dynamic].applyDynamic("prove")(trie.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Proof]]
    
    /**
      * Verifies a proof.
      * @param {Buffer} rootHash
      * @param {Buffer} key
      * @param {Proof} proof
      * @throws If proof is found to be invalid.
      * @returns The value from the key.
      */
    @scala.inline
    def verifyProof(rootHash: Buffer, key: Buffer, proof: Proof): js.Promise[Buffer | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyProof")(rootHash.asInstanceOf[js.Any], key.asInstanceOf[js.Any], proof.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer | Null]]
  }
}
