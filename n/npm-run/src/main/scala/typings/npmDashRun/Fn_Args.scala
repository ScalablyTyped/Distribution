package typings.npmDashRun

import typings.node.Buffer
import typings.node.childUnderscoreProcessMod.SpawnSyncOptions
import typings.node.childUnderscoreProcessMod.SpawnSyncOptionsWithBufferEncoding
import typings.node.childUnderscoreProcessMod.SpawnSyncOptionsWithStringEncoding
import typings.node.childUnderscoreProcessMod.SpawnSyncReturns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Args extends js.Object {
  def apply(command: String): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String]): SpawnSyncReturns[String] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, args: js.Array[String], options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
  def apply(command: String, options: SpawnSyncOptions): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, options: SpawnSyncOptionsWithBufferEncoding): SpawnSyncReturns[Buffer] = js.native
  def apply(command: String, options: SpawnSyncOptionsWithStringEncoding): SpawnSyncReturns[String] = js.native
}

