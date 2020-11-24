package typings.megajs.mod

import typings.megajs.megajsBooleans.`true`
import typings.node.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.node.streamMod.Writable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("megajs", "MutableFile")
@js.native
class MutableFile protected () extends File {
  def this(options: String, storage: Storage) = this()
  def this(options: FileOptions, storage: Storage) = this()
  
  def delete(permanent: js.UndefOr[scala.Nothing], cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
  @JSName("delete")
  def delete_true(permanent: `true`, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
  
  def importFile(file: String, cb: js.Function2[/* err */ js.UndefOr[Error], /* file */ this.type, Unit]): Readable = js.native
  def importFile(file: File, cb: js.Function2[/* err */ js.UndefOr[Error], /* file */ this.type, Unit]): Readable = js.native
  
  def link(
    options: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* err */ js.UndefOr[Error], /* url */ String, Unit]
  ): Readable = js.native
  def link(options: LinkOptions, cb: js.Function2[/* err */ js.UndefOr[Error], /* url */ String, Unit]): Readable = js.native
  
  def mkdir(options: String): Readable = js.native
  def mkdir(options: String, cb: js.Any): Readable = js.native
  def mkdir(options: MakeDirectoryOptions): Readable = js.native
  def mkdir(options: MakeDirectoryOptions, cb: js.Any): Readable = js.native
  
  def moveTo(target: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
  def moveTo(target: MutableFile, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
  
  def rename(newFileName: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
  
  def setAttributes(attributes: js.Object, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
  
  def setFavorite(isFavorite: Boolean, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
  
  def setLabel(label: String, cb: js.Function1[/* err */ js.UndefOr[Error], Unit]): Readable = js.native
  
  def shareFolder(
    options: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* err */ js.UndefOr[Error], /* url */ String, Unit]
  ): Readable = js.native
  def shareFolder(options: LinkOptions, cb: js.Function2[/* err */ js.UndefOr[Error], /* url */ String, Unit]): Readable = js.native
  
  def upload(options: String): Writable = js.native
  def upload(options: String, buffer: js.UndefOr[scala.Nothing], cb: js.Any): Writable = js.native
  def upload(options: String, buffer: Buffer): Writable = js.native
  def upload(options: String, buffer: Buffer, cb: js.Any): Writable = js.native
  def upload(options: UploadOptions): Writable = js.native
  def upload(options: UploadOptions, buffer: js.UndefOr[scala.Nothing], cb: js.Any): Writable = js.native
  def upload(options: UploadOptions, buffer: Buffer): Writable = js.native
  def upload(options: UploadOptions, buffer: Buffer, cb: js.Any): Writable = js.native
  
  def uploadAttribute(`type`: String): Readable = js.native
  def uploadAttribute(`type`: String, opt: js.UndefOr[scala.Nothing], cb: js.Any): Readable = js.native
  def uploadAttribute(`type`: String, opt: Buffer): Readable = js.native
  def uploadAttribute(`type`: String, opt: Buffer, cb: js.Any): Readable = js.native
  def uploadAttribute(`type`: String, opt: Stream): Readable = js.native
  def uploadAttribute(`type`: String, opt: Stream, cb: js.Any): Readable = js.native
  def uploadAttribute(`type`: Double): Readable = js.native
  def uploadAttribute(`type`: Double, opt: js.UndefOr[scala.Nothing], cb: js.Any): Readable = js.native
  def uploadAttribute(`type`: Double, opt: Buffer): Readable = js.native
  def uploadAttribute(`type`: Double, opt: Buffer, cb: js.Any): Readable = js.native
  def uploadAttribute(`type`: Double, opt: Stream): Readable = js.native
  def uploadAttribute(`type`: Double, opt: Stream, cb: js.Any): Readable = js.native
}
