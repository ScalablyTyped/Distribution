package typings
package megajsLib.megajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("megajs", "Storage")
@js.native
class Storage protected () extends js.Object {
  def this(options: StorageOptions) = this()
  def this(options: StorageOptions, callback: js.Any) = this()
  var files: megajsLib.megajsLibStrings.Storage with js.Any = js.native
  var inbox: MutableFile = js.native
  var key: nodeLib.Buffer = js.native
  var mounts: js.Array[File] = js.native
  var name: java.lang.String = js.native
  var root: MutableFile = js.native
  var sid: java.lang.String = js.native
  var trash: MutableFile = js.native
  def getAccountInfo(cb: js.Any): AccountInfo = js.native
  def login(cb: js.Any): nodeLib.streamMod.Readable = js.native
  def mkdir(
    options: java.lang.String,
    cb: js.Function2[/* err */ js.UndefOr[nodeLib.Error], /* file */ MutableFile, scala.Unit]
  ): nodeLib.streamMod.Readable = js.native
  def mkdir(
    options: MakeDirectoryOptions,
    cb: js.Function2[/* err */ js.UndefOr[nodeLib.Error], /* file */ MutableFile, scala.Unit]
  ): nodeLib.streamMod.Readable = js.native
  def reload(cb: js.Any): nodeLib.streamMod.Readable = js.native
  def toJSON(): stdLib.JSON = js.native
  def upload(options: java.lang.String): nodeLib.streamMod.Writable = js.native
  def upload(options: java.lang.String, buffer: nodeLib.Buffer): nodeLib.streamMod.Writable = js.native
  def upload(options: java.lang.String, buffer: nodeLib.Buffer, cb: js.Any): nodeLib.streamMod.Writable = js.native
  def upload(options: UploadOptions): nodeLib.streamMod.Writable = js.native
  def upload(options: UploadOptions, buffer: nodeLib.Buffer): nodeLib.streamMod.Writable = js.native
  def upload(options: UploadOptions, buffer: nodeLib.Buffer, cb: js.Any): nodeLib.streamMod.Writable = js.native
}

@JSImport("megajs", "Storage")
@js.native
object Storage extends js.Object {
  def fromJSON(json: stdLib.JSON): megajsLib.megajsMod.Storage = js.native
}

