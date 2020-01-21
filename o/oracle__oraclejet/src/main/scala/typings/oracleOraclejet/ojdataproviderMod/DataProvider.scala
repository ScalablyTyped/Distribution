package typings.oracleOraclejet.ojdataproviderMod

import typings.oracleOraclejet.oracleOraclejetStrings.no
import typings.oracleOraclejet.oracleOraclejetStrings.unknown
import typings.oracleOraclejet.oracleOraclejetStrings.yes
import typings.std.AsyncIterable
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataProvider[K, D] extends EventTarget {
  def containsKeys(parameters: FetchByKeysParameters[K]): js.Promise[ContainsKeysResults[K]] = js.native
  def fetchByKeys(parameters: FetchByKeysParameters[K]): js.Promise[FetchByKeysResults[K, D]] = js.native
  def fetchByOffset(parameters: FetchByOffsetParameters[D]): js.Promise[FetchByOffsetResults[K, D]] = js.native
  def fetchFirst(): AsyncIterable[FetchListResult[K, D]] = js.native
  def fetchFirst(parameters: FetchListParameters[D]): AsyncIterable[FetchListResult[K, D]] = js.native
  def getCapability(capabilityName: String): js.Any = js.native
  def getTotalSize(): js.Promise[Double] = js.native
  def isEmpty(): yes | no | unknown = js.native
}

