package typings.nodeStreamZip.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.nodeStreamZip.nodeStreamZipStrings.entry
import typings.nodeStreamZip.nodeStreamZipStrings.error
import typings.nodeStreamZip.nodeStreamZipStrings.extract
import typings.nodeStreamZip.nodeStreamZipStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamZip extends js.Object {
  
  def close(): Unit = js.native
  def close(callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  /**
    * archive comment
    */
  var comment: String = js.native
  
  def entries(): StringDictionary[ZipEntry] = js.native
  
  /**
    * number of entries in the archive
    */
  var entriesCount: Double = js.native
  
  def entry(name: String): js.UndefOr[ZipEntry] = js.native
  
  def entryDataSync(entry: String): Buffer = js.native
  def entryDataSync(entry: ZipEntry): Buffer = js.native
  
  def extract(entry: String, outPath: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def extract(entry: Null, outPath: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def extract(entry: ZipEntry, outPath: String, callback: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  @JSName("on")
  def on_entry(event: entry, handler: js.Function1[/* entry */ ZipEntry, Unit]): Unit = js.native
  @JSName("on")
  def on_error(event: error, handler: js.Function1[/* error */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_extract(event: extract, handler: js.Function2[/* entry */ ZipEntry, /* outPath */ String, Unit]): Unit = js.native
  @JSName("on")
  def on_ready(event: ready, handler: js.Function0[Unit]): Unit = js.native
  
  def openEntry(
    entry: String,
    callback: js.Function2[/* err */ js.Any | Null, /* entry */ js.UndefOr[ZipEntry], Unit],
    sync: Boolean
  ): Unit = js.native
  def openEntry(
    entry: ZipEntry,
    callback: js.Function2[/* err */ js.Any | Null, /* entry */ js.UndefOr[ZipEntry], Unit],
    sync: Boolean
  ): Unit = js.native
  
  def stream(
    entry: String,
    callback: js.Function2[/* err */ js.Any | Null, /* stream */ js.UndefOr[ReadableStream], Unit]
  ): Unit = js.native
  def stream(
    entry: ZipEntry,
    callback: js.Function2[/* err */ js.Any | Null, /* stream */ js.UndefOr[ReadableStream], Unit]
  ): Unit = js.native
}
