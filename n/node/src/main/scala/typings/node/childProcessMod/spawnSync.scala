package typings.node.childProcessMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("child_process", "spawnSync")
@js.native
object spawnSync extends js.Object {
  def apply(command: String): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.UndefOr[scala.Nothing], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.UndefOr[scala.Nothing], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.UndefOr[scala.Nothing], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def apply(command: String, args: js.Array[String]): SpawnSyncReturns[String] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def apply(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
}

