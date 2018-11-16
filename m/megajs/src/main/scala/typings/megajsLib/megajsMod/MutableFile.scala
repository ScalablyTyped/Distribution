package typings
package megajsLib.megajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("megajs", "MutableFile")
@js.native
class MutableFile protected () extends File {
  def this(options: java.lang.String, storage: Storage) = this()
  def this(options: FileOptions, storage: Storage) = this()
  def delete(
    permanent: js.UndefOr[scala.Nothing],
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): nodeLib.streamMod.Readable = js.native
  def delete(
    permanent: megajsLib.megajsLibNumbers.`true`,
    cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): nodeLib.streamMod.Readable = js.native
  def importFile(
    file: java.lang.String,
    cb: js.Function2[/* err */ js.UndefOr[nodeLib.Error], /* file */ this.type, scala.Unit]
  ): nodeLib.streamMod.Readable = js.native
  def importFile(
    file: File,
    cb: js.Function2[/* err */ js.UndefOr[nodeLib.Error], /* file */ this.type, scala.Unit]
  ): nodeLib.streamMod.Readable = js.native
  def link(
    options: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* err */ js.UndefOr[nodeLib.Error], /* url */ java.lang.String, scala.Unit]
  ): nodeLib.streamMod.Readable = js.native
  def link(
    options: LinkOptions,
    cb: js.Function2[/* err */ js.UndefOr[nodeLib.Error], /* url */ java.lang.String, scala.Unit]
  ): nodeLib.streamMod.Readable = js.native
  def mkdir(options: java.lang.String): nodeLib.streamMod.Readable = js.native
  def mkdir(options: java.lang.String, cb: js.Any): nodeLib.streamMod.Readable = js.native
  def mkdir(options: MakeDirectoryOptions): nodeLib.streamMod.Readable = js.native
  def mkdir(options: MakeDirectoryOptions, cb: js.Any): nodeLib.streamMod.Readable = js.native
  def moveTo(target: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): nodeLib.streamMod.Readable = js.native
  def moveTo(target: MutableFile, cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): nodeLib.streamMod.Readable = js.native
  def rename(newFileName: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): nodeLib.streamMod.Readable = js.native
  def setAttributes(attributes: js.Object, cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): nodeLib.streamMod.Readable = js.native
  def setFavorite(isFavorite: scala.Boolean, cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): nodeLib.streamMod.Readable = js.native
  def setLabel(label: java.lang.String, cb: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]): nodeLib.streamMod.Readable = js.native
  def shareFolder(
    options: js.UndefOr[scala.Nothing],
    cb: js.Function2[/* err */ js.UndefOr[nodeLib.Error], /* url */ java.lang.String, scala.Unit]
  ): nodeLib.streamMod.Readable = js.native
  def shareFolder(
    options: LinkOptions,
    cb: js.Function2[/* err */ js.UndefOr[nodeLib.Error], /* url */ java.lang.String, scala.Unit]
  ): nodeLib.streamMod.Readable = js.native
  def upload(options: java.lang.String): nodeLib.streamMod.Writable = js.native
  def upload(options: java.lang.String, buffer: nodeLib.Buffer): nodeLib.streamMod.Writable = js.native
  def upload(options: java.lang.String, buffer: nodeLib.Buffer, cb: js.Any): nodeLib.streamMod.Writable = js.native
  def upload(options: UploadOptions): nodeLib.streamMod.Writable = js.native
  def upload(options: UploadOptions, buffer: nodeLib.Buffer): nodeLib.streamMod.Writable = js.native
  def upload(options: UploadOptions, buffer: nodeLib.Buffer, cb: js.Any): nodeLib.streamMod.Writable = js.native
  def uploadAttribute(`type`: java.lang.String): nodeLib.streamMod.Readable = js.native
  def uploadAttribute(`type`: java.lang.String, opt: nodeLib.Buffer): nodeLib.streamMod.Readable = js.native
  def uploadAttribute(`type`: java.lang.String, opt: nodeLib.Buffer, cb: js.Any): nodeLib.streamMod.Readable = js.native
  def uploadAttribute(`type`: java.lang.String, opt: nodeLib.streamMod.Stream): nodeLib.streamMod.Readable = js.native
  def uploadAttribute(`type`: java.lang.String, opt: nodeLib.streamMod.Stream, cb: js.Any): nodeLib.streamMod.Readable = js.native
  def uploadAttribute(`type`: scala.Double): nodeLib.streamMod.Readable = js.native
  def uploadAttribute(`type`: scala.Double, opt: nodeLib.Buffer): nodeLib.streamMod.Readable = js.native
  def uploadAttribute(`type`: scala.Double, opt: nodeLib.Buffer, cb: js.Any): nodeLib.streamMod.Readable = js.native
  def uploadAttribute(`type`: scala.Double, opt: nodeLib.streamMod.Stream): nodeLib.streamMod.Readable = js.native
  def uploadAttribute(`type`: scala.Double, opt: nodeLib.streamMod.Stream, cb: js.Any): nodeLib.streamMod.Readable = js.native
}

