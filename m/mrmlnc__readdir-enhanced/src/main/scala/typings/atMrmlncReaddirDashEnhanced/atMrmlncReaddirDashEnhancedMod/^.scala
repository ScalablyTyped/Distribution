package typings.atMrmlncReaddirDashEnhanced.atMrmlncReaddirDashEnhancedMod

import typings.node.NodeJSNs.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mrmlnc/readdir-enhanced", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(root: String): js.Promise[js.Array[String]] = js.native
  def apply(root: String, callback: CallbackString): Unit = js.native
  def apply(root: String, options: Options): js.Promise[js.Array[String]] = js.native
  def apply(root: String, options: Options, callback: CallbackString): Unit = js.native
  def async(root: String): js.Promise[js.Array[String]] = js.native
  def async(root: String, callback: CallbackString): Unit = js.native
  def async(root: String, options: Options): js.Promise[js.Array[String]] = js.native
  def async(root: String, options: Options, callback: CallbackString): Unit = js.native
  def readdirAsyncStat(root: String): js.Promise[js.Array[Entry]] = js.native
  def readdirAsyncStat(root: String, callback: CallbackEntry): Unit = js.native
  def readdirAsyncStat(root: String, options: Options): js.Promise[js.Array[Entry]] = js.native
  def readdirAsyncStat(root: String, options: Options, callback: CallbackEntry): Unit = js.native
  def readdirStreamStat(root: String): ReadableStream = js.native
  def readdirStreamStat(root: String, options: Options): ReadableStream = js.native
  def readdirSyncStat(root: String): js.Array[Entry] = js.native
  def readdirSyncStat(root: String, options: Options): js.Array[Entry] = js.native
  def stat(root: String): js.Promise[js.Array[Entry]] = js.native
  def stat(root: String, callback: CallbackEntry): Unit = js.native
  def stat(root: String, options: Options): js.Promise[js.Array[Entry]] = js.native
  def stat(root: String, options: Options, callback: CallbackEntry): Unit = js.native
  def stream(root: String): ReadableStream = js.native
  def stream(root: String, options: Options): ReadableStream = js.native
  def sync(root: String): js.Array[String] = js.native
  def sync(root: String, options: Options): js.Array[String] = js.native
}

