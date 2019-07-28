package typings.atNodelibFsDotScandir.outAdaptersFsMod

import typings.atNodelibFsDotScandir.Anon_Buffer
import typings.atNodelibFsDotScandir.Fn_Buffer
import typings.atNodelibFsDotScandir.Typeoflstat
import typings.atNodelibFsDotScandir.Typeofstat
import typings.atNodelibFsDotScandir.atNodelibFsDotScandirStrings.buffer
import typings.node.Anon_BufferEncodingFalse
import typings.node.Anon_EncodingFalse
import typings.node.Anon_EncodingFalseWithFileTypes
import typings.node.Anon_EncodingTrue
import typings.node.Buffer
import typings.node.BufferEncoding
import typings.node.NodeJSNs.ErrnoException
import typings.node.fsMod.Dirent
import typings.node.fsMod.PathLike
import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemAdapter extends js.Object {
  @JSName("lstatSync")
  var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
  @JSName("lstat")
  var lstat_Original: (js.Function2[
    /* path */ PathLike, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit], 
    Unit
  ]) with Typeoflstat = js.native
  @JSName("readdirSync")
  var readdirSync_Original: Fn_Buffer = js.native
  @JSName("readdir")
  var readdir_Original: Anon_Buffer = js.native
  @JSName("statSync")
  var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
  @JSName("stat")
  var stat_Original: (js.Function2[
    /* path */ PathLike, 
    /* callback */ js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit], 
    Unit
  ]) with Typeofstat = js.native
  def lstat(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  def lstatSync(path: PathLike): Stats = js.native
  def readdir(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
  ): Unit = js.native
  def readdir(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    path: PathLike,
    options: Anon_BufferEncodingFalse,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
  ): Unit = js.native
  def readdir(
    path: PathLike,
    options: Anon_EncodingFalseWithFileTypes,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer | String], Unit]
  ): Unit = js.native
  def readdir(
    path: PathLike,
    options: Anon_EncodingFalse,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
  ): Unit = js.native
  def readdir(
    path: PathLike,
    options: Anon_EncodingTrue,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Dirent], Unit]
  ): Unit = js.native
  def readdir(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[String], Unit]
  ): Unit = js.native
  def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: String): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: Anon_BufferEncodingFalse): js.Array[Buffer] = js.native
  def readdirSync(path: PathLike, options: Anon_EncodingFalse): js.Array[String] = js.native
  def readdirSync(path: PathLike, options: Anon_EncodingFalseWithFileTypes): js.Array[Buffer | String] = js.native
  def readdirSync(path: PathLike, options: Anon_EncodingTrue): js.Array[Dirent] = js.native
  def readdirSync(path: PathLike, options: BufferEncoding): js.Array[String] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
  @JSName("readdir")
  def readdir_buffer(
    path: PathLike,
    options: buffer,
    callback: js.Function2[/* err */ ErrnoException | Null, /* files */ js.Array[Buffer], Unit]
  ): Unit = js.native
  def stat(path: PathLike, callback: js.Function2[/* err */ ErrnoException | Null, /* stats */ Stats, Unit]): Unit = js.native
  def statSync(path: PathLike): Stats = js.native
}

