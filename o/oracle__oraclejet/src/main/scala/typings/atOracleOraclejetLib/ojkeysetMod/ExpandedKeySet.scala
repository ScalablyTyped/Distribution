package typings
package atOracleOraclejetLib.ojkeysetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojkeyset", "ExpandedKeySet")
@js.native
class ExpandedKeySet[K] () extends KeySet[K] {
  def this(keys: js.Array[K]) = this()
  def this(keys: stdLib.Set[K]) = this()
  def values(): stdLib.Set[K] = js.native
}

