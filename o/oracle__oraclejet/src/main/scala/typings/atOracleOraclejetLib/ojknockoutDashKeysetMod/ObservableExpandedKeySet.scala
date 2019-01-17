package typings
package atOracleOraclejetLib.ojknockoutDashKeysetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojknockout-keyset", "ObservableExpandedKeySet")
@js.native
class ObservableExpandedKeySet[K] () extends js.Object {
  def this(initialValue: atOracleOraclejetLib.ojkeysetMod.ExpandAllKeySet[K]) = this()
  def this(initialValue: atOracleOraclejetLib.ojkeysetMod.ExpandedKeySet[K]) = this()
  def add(keys: js.Array[K]): ObservableExpandedKeySet[K] = js.native
  def add(keys: stdLib.Set[K]): ObservableExpandedKeySet[K] = js.native
  def addAll(): ObservableExpandedKeySet[K] = js.native
  def clear(): ObservableExpandedKeySet[K] = js.native
  def delete(keys: js.Array[K]): ObservableExpandedKeySet[K] = js.native
  def delete(keys: stdLib.Set[K]): ObservableExpandedKeySet[K] = js.native
}

