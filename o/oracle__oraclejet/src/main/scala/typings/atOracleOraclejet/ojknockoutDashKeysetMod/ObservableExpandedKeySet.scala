package typings.atOracleOraclejet.ojknockoutDashKeysetMod

import typings.atOracleOraclejet.ojkeysetMod.ExpandAllKeySet
import typings.atOracleOraclejet.ojkeysetMod.ExpandedKeySet
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojknockout-keyset", "ObservableExpandedKeySet")
@js.native
class ObservableExpandedKeySet[K] () extends js.Object {
  def this(initialValue: ExpandAllKeySet[K]) = this()
  def this(initialValue: ExpandedKeySet[K]) = this()
  def add(keys: js.Array[K]): ObservableExpandedKeySet[K] = js.native
  def add(keys: Set[K]): ObservableExpandedKeySet[K] = js.native
  def addAll(): ObservableExpandedKeySet[K] = js.native
  def clear(): ObservableExpandedKeySet[K] = js.native
  def delete(keys: js.Array[K]): ObservableExpandedKeySet[K] = js.native
  def delete(keys: Set[K]): ObservableExpandedKeySet[K] = js.native
}

