package typings.merklePatriciaTree

import typings.merklePatriciaTree.trieNodeMod.Nibbles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hexMod {
  
  @JSImport("merkle-patricia-tree/dist/util/hex", "addHexPrefix")
  @js.native
  def addHexPrefix(key: Nibbles, terminator: Boolean): Nibbles = js.native
  
  @JSImport("merkle-patricia-tree/dist/util/hex", "isTerminator")
  @js.native
  def isTerminator(key: Nibbles): Boolean = js.native
  
  @JSImport("merkle-patricia-tree/dist/util/hex", "removeHexPrefix")
  @js.native
  def removeHexPrefix(`val`: Nibbles): Nibbles = js.native
}
