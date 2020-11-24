package typings.merklePatriciaTree

import typings.merklePatriciaTree.trieNodeMod.Nibbles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("merkle-patricia-tree/dist/util/hex", JSImport.Namespace)
@js.native
object hexMod extends js.Object {
  
  def addHexPrefix(key: Nibbles, terminator: Boolean): Nibbles = js.native
  
  def isTerminator(key: Nibbles): Boolean = js.native
  
  def removeHexPrefix(`val`: Nibbles): Nibbles = js.native
}
