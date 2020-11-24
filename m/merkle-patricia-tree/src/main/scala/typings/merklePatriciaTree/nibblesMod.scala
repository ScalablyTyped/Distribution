package typings.merklePatriciaTree

import typings.merklePatriciaTree.trieNodeMod.Nibbles
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("merkle-patricia-tree/dist/util/nibbles", JSImport.Namespace)
@js.native
object nibblesMod extends js.Object {
  
  def bufferToNibbles(key: Buffer): Nibbles = js.native
  
  def doKeysMatch(keyA: Nibbles, keyB: Nibbles): Boolean = js.native
  
  def matchingNibbleLength(nib1: Nibbles, nib2: Nibbles): Double = js.native
  
  def nibblesToBuffer(arr: Nibbles): Buffer = js.native
}
