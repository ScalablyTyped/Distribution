package typings.merklePatriciaTree

import typings.merklePatriciaTree.trieNodeMod.Nibbles
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nibblesMod {
  
  @JSImport("merkle-patricia-tree/dist/util/nibbles", "bufferToNibbles")
  @js.native
  def bufferToNibbles(key: Buffer): Nibbles = js.native
  
  @JSImport("merkle-patricia-tree/dist/util/nibbles", "doKeysMatch")
  @js.native
  def doKeysMatch(keyA: Nibbles, keyB: Nibbles): Boolean = js.native
  
  @JSImport("merkle-patricia-tree/dist/util/nibbles", "matchingNibbleLength")
  @js.native
  def matchingNibbleLength(nib1: Nibbles, nib2: Nibbles): Double = js.native
  
  @JSImport("merkle-patricia-tree/dist/util/nibbles", "nibblesToBuffer")
  @js.native
  def nibblesToBuffer(arr: Nibbles): Buffer = js.native
}
