package typings.merklePatriciaTree

import typings.merklePatriciaTree.trieNodeMod.Nibbles
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nibblesMod {
  
  @JSImport("merkle-patricia-tree/dist/util/nibbles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def bufferToNibbles(key: Buffer): Nibbles = ^.asInstanceOf[js.Dynamic].applyDynamic("bufferToNibbles")(key.asInstanceOf[js.Any]).asInstanceOf[Nibbles]
  
  @scala.inline
  def doKeysMatch(keyA: Nibbles, keyB: Nibbles): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("doKeysMatch")(keyA.asInstanceOf[js.Any], keyB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def matchingNibbleLength(nib1: Nibbles, nib2: Nibbles): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("matchingNibbleLength")(nib1.asInstanceOf[js.Any], nib2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def nibblesToBuffer(arr: Nibbles): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("nibblesToBuffer")(arr.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
