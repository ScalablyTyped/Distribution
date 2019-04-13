package typings
package atMrmlncReaddirDashEnhancedLib.atMrmlncReaddirDashEnhancedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@mrmlnc/readdir-enhanced", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(root: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(root: java.lang.String, callback: CallbackString): scala.Unit = js.native
  def apply(root: java.lang.String, options: Options): js.Promise[js.Array[java.lang.String]] = js.native
  def apply(root: java.lang.String, options: Options, callback: CallbackString): scala.Unit = js.native
  def async(root: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
  def async(root: java.lang.String, callback: CallbackString): scala.Unit = js.native
  def async(root: java.lang.String, options: Options): js.Promise[js.Array[java.lang.String]] = js.native
  def async(root: java.lang.String, options: Options, callback: CallbackString): scala.Unit = js.native
  def readdirAsyncStat(root: java.lang.String): js.Promise[js.Array[Entry]] = js.native
  def readdirAsyncStat(root: java.lang.String, callback: CallbackEntry): scala.Unit = js.native
  def readdirAsyncStat(root: java.lang.String, options: Options): js.Promise[js.Array[Entry]] = js.native
  def readdirAsyncStat(root: java.lang.String, options: Options, callback: CallbackEntry): scala.Unit = js.native
  def readdirStreamStat(root: java.lang.String): nodeLib.NodeJSNs.ReadableStream = js.native
  def readdirStreamStat(root: java.lang.String, options: Options): nodeLib.NodeJSNs.ReadableStream = js.native
  def readdirSyncStat(root: java.lang.String): js.Array[Entry] = js.native
  def readdirSyncStat(root: java.lang.String, options: Options): js.Array[Entry] = js.native
  def stat(root: java.lang.String): js.Promise[js.Array[Entry]] = js.native
  def stat(root: java.lang.String, callback: CallbackEntry): scala.Unit = js.native
  def stat(root: java.lang.String, options: Options): js.Promise[js.Array[Entry]] = js.native
  def stat(root: java.lang.String, options: Options, callback: CallbackEntry): scala.Unit = js.native
  def stream(root: java.lang.String): nodeLib.NodeJSNs.ReadableStream = js.native
  def stream(root: java.lang.String, options: Options): nodeLib.NodeJSNs.ReadableStream = js.native
  def sync(root: java.lang.String): js.Array[java.lang.String] = js.native
  def sync(root: java.lang.String, options: Options): js.Array[java.lang.String] = js.native
}

