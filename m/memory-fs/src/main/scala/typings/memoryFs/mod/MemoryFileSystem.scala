package typings.memoryFs.mod

import typings.memoryFs.AnonEnd
import typings.memoryFs.AnonIsBlockDevice
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryFileSystem extends js.Object {
  var data: js.Any = js.native
  def _remove(_path: String, name: String, testFn: js.Function1[/* part */ String, Boolean]): Unit = js.native
  def createReadStream(path: String): js.Any = js.native
  def createReadStream(path: String, options: AnonEnd): js.Any = js.native
  def createWriteStream(path: String): js.Any = js.native
  def createWriteStream(path: String, options: js.Any): js.Any = js.native
  def exists(path: String, callback: js.Function1[/* isExist */ Boolean, Unit]): Unit = js.native
  def existsSync(_path: String): Boolean = js.native
  def join(path: String, request: String): String = js.native
  def meta(_path: String): js.Any = js.native
  def mkdir(path: String, callback: js.Function1[/* err */ Error | Null, Unit]): Unit = js.native
  def mkdir(
    path: String,
    optArg: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def mkdirSync(_path: String): Unit = js.native
  def mkdirp(
    path: String,
    callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def mkdirpSync(_path: String): Unit = js.native
  def normalize(path: String): String = js.native
  def pathToArray(path: String): js.Array[String] = js.native
  def readFile(
    path: String,
    callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def readFile(
    path: String,
    optArg: js.Object,
    callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def readFileSync(_path: String): js.Any = js.native
  def readFileSync(_path: String, encoding: String): js.Any = js.native
  def readdir(
    path: String,
    callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def readdirSync(_path: String): js.Array[String] = js.native
  def readlink(
    path: String,
    callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def readlinkSync(_path: String): String = js.native
  def rmdir(
    path: String,
    callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def rmdirSync(_path: String): Unit = js.native
  def stat(
    path: String,
    callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def statSync(_path: String): AnonIsBlockDevice = js.native
  def unlink(
    path: String,
    callback: js.Function2[/* err */ Error | Null, /* result */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def unlinkSync(_path: String): Unit = js.native
  def writeFile(path: String, content: String, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def writeFile(
    path: String,
    content: String,
    encoding: String,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def writeFile(path: String, content: Buffer, callback: js.Function1[/* err */ js.UndefOr[Error], Unit]): Unit = js.native
  def writeFile(
    path: String,
    content: Buffer,
    encoding: String,
    callback: js.Function1[/* err */ js.UndefOr[Error], Unit]
  ): Unit = js.native
  def writeFileSync(_path: String, content: String): Unit = js.native
  def writeFileSync(_path: String, content: String, encoding: String): Unit = js.native
  def writeFileSync(_path: String, content: Buffer): Unit = js.native
  def writeFileSync(_path: String, content: Buffer, encoding: String): Unit = js.native
}

