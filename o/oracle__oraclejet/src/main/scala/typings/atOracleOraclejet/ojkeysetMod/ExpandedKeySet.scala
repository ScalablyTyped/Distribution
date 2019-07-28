package typings.atOracleOraclejet.ojkeysetMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojkeyset", "ExpandedKeySet")
@js.native
class ExpandedKeySet[K] () extends KeySet[K] {
  def this(keys: js.Array[K]) = this()
  def this(keys: Set[K]) = this()
  def values(): Set[K] = js.native
}

