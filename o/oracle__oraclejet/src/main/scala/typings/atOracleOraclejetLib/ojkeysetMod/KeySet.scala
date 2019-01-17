package typings
package atOracleOraclejetLib.ojkeysetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojkeyset", "KeySet")
@js.native
abstract class KeySet[K] () extends js.Object {
  def add(keys: js.Array[K]): KeySet[K] = js.native
  def add(keys: stdLib.Set[K]): KeySet[K] = js.native
  def addAll(): KeySet[K] = js.native
  def clear(): KeySet[K] = js.native
  def delete(keys: js.Array[K]): KeySet[K] = js.native
  def delete(keys: stdLib.Set[K]): KeySet[K] = js.native
  def has(key: K): scala.Boolean = js.native
  def isAddAll(): scala.Boolean = js.native
}

