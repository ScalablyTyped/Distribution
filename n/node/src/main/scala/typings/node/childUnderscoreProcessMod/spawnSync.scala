package typings.node.childUnderscoreProcessMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("child_process", "spawnSync")
@js.native
object spawnSync extends js.Object {
  def apply(command: java.lang.String): SpawnSyncReturns[Buffer] = js.native
  def apply(command: java.lang.String, args: js.Array[java.lang.String]): SpawnSyncReturns[java.lang.String] = js.native
  def apply(command: java.lang.String, args: js.Array[java.lang.String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def apply(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnSyncOptionsWithBufferEncoding
  ): SpawnSyncReturns[Buffer] = js.native
  def apply(
    command: java.lang.String,
    args: js.Array[java.lang.String],
    options: SpawnSyncOptionsWithStringEncoding
  ): SpawnSyncReturns[java.lang.String] = js.native
  def apply(command: java.lang.String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def apply(command: java.lang.String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def apply(command: java.lang.String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[java.lang.String] = js.native
}

