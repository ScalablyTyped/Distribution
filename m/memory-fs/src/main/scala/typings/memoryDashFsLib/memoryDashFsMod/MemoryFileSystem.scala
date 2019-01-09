package typings
package memoryDashFsLib.memoryDashFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MemoryFileSystem extends js.Object {
  var data: js.Any = js.native
  def _remove(
    _path: java.lang.String,
    name: java.lang.String,
    testFn: js.Function1[/* part */ java.lang.String, scala.Boolean]
  ): scala.Unit = js.native
  def createReadStream(path: java.lang.String): js.Any = js.native
  def createReadStream(path: java.lang.String, options: memoryDashFsLib.Anon_End): js.Any = js.native
  def createWriteStream(path: java.lang.String): js.Any = js.native
  def createWriteStream(path: java.lang.String, options: js.Any): js.Any = js.native
  def exists(path: java.lang.String, callback: js.Function1[/* isExist */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def existsSync(_path: java.lang.String): scala.Boolean = js.native
  def join(path: java.lang.String, request: java.lang.String): java.lang.String = js.native
  def meta(_path: java.lang.String): js.Any = js.native
  def mkdir(path: java.lang.String, callback: js.Function1[/* err */ nodeLib.Error | scala.Null, scala.Unit]): scala.Unit = js.native
  def mkdir(
    path: java.lang.String,
    optArg: js.Object,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def mkdirSync(_path: java.lang.String): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def mkdirpSync(_path: java.lang.String): scala.Unit = js.native
  def normalize(path: java.lang.String): java.lang.String = js.native
  def pathToArray(path: java.lang.String): js.Array[java.lang.String] = js.native
  def readFile(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def readFile(
    path: java.lang.String,
    optArg: js.Object,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def readFileSync(_path: java.lang.String): js.Any = js.native
  def readFileSync(_path: java.lang.String, encoding: java.lang.String): js.Any = js.native
  def readdir(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def readdirSync(_path: java.lang.String): js.Array[java.lang.String] = js.native
  def readlink(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def readlinkSync(_path: java.lang.String): java.lang.String = js.native
  def rmdir(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def rmdirSync(_path: java.lang.String): scala.Unit = js.native
  def stat(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def statSync(_path: java.lang.String): memoryDashFsLib.Anon_IsBlockDevice = js.native
  def unlink(
    path: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* result */ js.UndefOr[js.Any], scala.Unit]
  ): scala.Unit = js.native
  def unlinkSync(_path: java.lang.String): scala.Unit = js.native
  def writeFile(
    path: java.lang.String,
    content: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    path: java.lang.String,
    content: java.lang.String,
    encoding: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    path: java.lang.String,
    content: nodeLib.Buffer,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def writeFile(
    path: java.lang.String,
    content: nodeLib.Buffer,
    encoding: java.lang.String,
    callback: js.Function1[/* err */ js.UndefOr[nodeLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def writeFileSync(_path: java.lang.String, content: java.lang.String): scala.Unit = js.native
  def writeFileSync(_path: java.lang.String, content: java.lang.String, encoding: java.lang.String): scala.Unit = js.native
  def writeFileSync(_path: java.lang.String, content: nodeLib.Buffer): scala.Unit = js.native
  def writeFileSync(_path: java.lang.String, content: nodeLib.Buffer, encoding: java.lang.String): scala.Unit = js.native
}

