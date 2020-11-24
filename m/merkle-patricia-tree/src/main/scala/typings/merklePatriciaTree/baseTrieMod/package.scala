package typings.merklePatriciaTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object baseTrieMod {
  
  type FoundNode = js.Function4[
    /* nodeRef */ typings.node.Buffer, 
    /* node */ typings.merklePatriciaTree.trieNodeMod.TrieNode, 
    /* key */ typings.merklePatriciaTree.trieNodeMod.Nibbles, 
    /* walkController */ js.Any, 
    scala.Unit
  ]
  
  type Proof = js.Array[typings.node.Buffer]
}
