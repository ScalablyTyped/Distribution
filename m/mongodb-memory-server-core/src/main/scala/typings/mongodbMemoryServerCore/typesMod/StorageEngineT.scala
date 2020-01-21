package typings.mongodbMemoryServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull
  - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest
  - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1
  - typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger
*/
trait StorageEngineT extends js.Object

object StorageEngineT {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def devnull: typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.devnull = this.cast("devnull")
  @scala.inline
  def ephemeralForTest: typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.ephemeralForTest = this.cast("ephemeralForTest")
  @scala.inline
  def mmapv1: typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.mmapv1 = this.cast("mmapv1")
  @scala.inline
  def wiredTiger: typings.mongodbMemoryServerCore.mongodbMemoryServerCoreStrings.wiredTiger = this.cast("wiredTiger")
}

