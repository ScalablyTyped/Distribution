package typings
package atNodelibFsDotScandirLib.outAdaptersFsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSystemAdapter extends js.Object {
  @JSName("lstatSync")
  var lstatSync_Original: js.Function1[/* path */ nodeLib.fsMod.PathLike, nodeLib.fsMod.Stats] = js.native
  @JSName("lstat")
  var lstat_Original: (js.Function2[
    /* path */ nodeLib.fsMod.PathLike, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* stats */ nodeLib.fsMod.Stats, 
      scala.Unit
    ], 
    scala.Unit
  ]) with atNodelibFsDotScandirLib.Typeoflstat = js.native
  @JSName("readdirSync")
  var readdirSync_Original: atNodelibFsDotScandirLib.Fn_Buffer = js.native
  @JSName("readdir")
  var readdir_Original: atNodelibFsDotScandirLib.Anon_Buffer = js.native
  @JSName("statSync")
  var statSync_Original: js.Function1[/* path */ nodeLib.fsMod.PathLike, nodeLib.fsMod.Stats] = js.native
  @JSName("stat")
  var stat_Original: (js.Function2[
    /* path */ nodeLib.fsMod.PathLike, 
    /* callback */ js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* stats */ nodeLib.fsMod.Stats, 
      scala.Unit
    ], 
    scala.Unit
  ]) with atNodelibFsDotScandirLib.Typeofstat = js.native
  def lstat(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* stats */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def lstatSync(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.Stats = js.native
  def readdir(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* files */ js.Array[nodeLib.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: java.lang.String,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* files */ js.Array[nodeLib.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_BufferEncodingFalse,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* files */ js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingFalseWithFileTypes,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* files */ js.Array[nodeLib.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingFalse,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.Anon_EncodingTrue,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* files */ js.Array[nodeLib.fsMod.Dirent], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: nodeLib.BufferEncoding,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* files */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdir(
    path: nodeLib.fsMod.PathLike,
    options: scala.Null,
    callback: js.Function2[
      nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* files */ js.Array[nodeLib.Buffer | java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def readdirSync(path: nodeLib.fsMod.PathLike): js.Array[nodeLib.Buffer | java.lang.String] = js.native
  def readdirSync(path: nodeLib.fsMod.PathLike, options: java.lang.String): js.Array[nodeLib.Buffer | java.lang.String] = js.native
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_BufferEncodingFalse): js.Array[nodeLib.Buffer] = js.native
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFalse): js.Array[java.lang.String] = js.native
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingFalseWithFileTypes): js.Array[nodeLib.Buffer | java.lang.String] = js.native
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.Anon_EncodingTrue): js.Array[nodeLib.fsMod.Dirent] = js.native
  def readdirSync(path: nodeLib.fsMod.PathLike, options: nodeLib.BufferEncoding): js.Array[java.lang.String] = js.native
  @JSName("readdirSync")
  def readdirSync_buffer(
    path: nodeLib.fsMod.PathLike,
    options: atNodelibFsDotScandirLib.atNodelibFsDotScandirLibStrings.buffer
  ): js.Array[nodeLib.Buffer] = js.native
  @JSName("readdir")
  def readdir_buffer(
    path: nodeLib.fsMod.PathLike,
    options: atNodelibFsDotScandirLib.atNodelibFsDotScandirLibStrings.buffer,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* files */ js.Array[nodeLib.Buffer], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def stat(
    path: nodeLib.fsMod.PathLike,
    callback: js.Function2[
      /* err */ nodeLib.NodeJSNs.ErrnoException | scala.Null, 
      /* stats */ nodeLib.fsMod.Stats, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def statSync(path: nodeLib.fsMod.PathLike): nodeLib.fsMod.Stats = js.native
}

