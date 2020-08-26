package typings.optimism.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("optimism", "KeyTrie")
@js.native
class KeyTrie[K] protected ()
  extends typings.optimism.keyTrieMod.KeyTrie[K] {
  def this(weakness: Boolean) = this()
  def this(weakness: Boolean, makeData: js.Function1[/* array */ js.Array[_], K]) = this()
}

