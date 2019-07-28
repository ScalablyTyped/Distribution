package typings.atOracleOraclejet.ojkeysetMod

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojkeyset", "ExpandAllKeySet")
@js.native
class ExpandAllKeySet[K] () extends KeySet[K] {
  def deletedValues(): Set[K] = js.native
}

