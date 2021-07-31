package typings.merklePatriciaTree

import typings.merklePatriciaTree.trieNodeMod.Nibbles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hexMod {
  
  @JSImport("merkle-patricia-tree/dist/util/hex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addHexPrefix(key: Nibbles, terminator: Boolean): Nibbles = (^.asInstanceOf[js.Dynamic].applyDynamic("addHexPrefix")(key.asInstanceOf[js.Any], terminator.asInstanceOf[js.Any])).asInstanceOf[Nibbles]
  
  @scala.inline
  def isTerminator(key: Nibbles): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTerminator")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def removeHexPrefix(`val`: Nibbles): Nibbles = ^.asInstanceOf[js.Dynamic].applyDynamic("removeHexPrefix")(`val`.asInstanceOf[js.Any]).asInstanceOf[Nibbles]
}
