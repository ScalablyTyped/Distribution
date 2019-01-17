package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProvider[K, D]
  extends stdLib.EventTarget {
  def containsKeys(parameters: FetchByKeysParameters[K]): js.Promise[ContainsKeysResults[K]] = js.native
  def fetchByKeys(parameters: FetchByKeysParameters[K]): js.Promise[FetchByKeysResults[K, D]] = js.native
  def fetchByOffset(parameters: FetchByOffsetParameters[D]): js.Promise[FetchByOffsetResults[K, D]] = js.native
  def fetchFirst(): stdLib.AsyncIterable[FetchListResult[K, D]] = js.native
  def fetchFirst(parameters: FetchListParameters[D]): stdLib.AsyncIterable[FetchListResult[K, D]] = js.native
  def getCapability(capabilityName: java.lang.String): js.Any = js.native
  def getTotalSize(): js.Promise[scala.Double] = js.native
  def isEmpty(): atOracleOraclejetLib.atOracleOraclejetLibStrings.yes | atOracleOraclejetLib.atOracleOraclejetLibStrings.no | atOracleOraclejetLib.atOracleOraclejetLibStrings.unknown = js.native
}

