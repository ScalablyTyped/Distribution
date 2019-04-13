package typings
package nodeDashZopfliLib.nodeDashZopfliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-zopfli", JSImport.Namespace)
@js.native
class ^ () extends Zopfli {
  def this(format: Format) = this()
  def this(format: Format, options: Options) = this()
}

@JSImport("node-zopfli", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compress(input: nodeLib.Buffer, format: Format): js.Promise[nodeLib.Buffer] = js.native
  def compress(
    input: nodeLib.Buffer,
    format: Format,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def compress(input: nodeLib.Buffer, format: Format, options: Options): js.Promise[nodeLib.Buffer] = js.native
  def compress(
    input: nodeLib.Buffer,
    format: Format,
    options: Options,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def createDeflate(): Zopfli = js.native
  def createDeflate(options: Options): Zopfli = js.native
  def createGzip(): Zopfli = js.native
  def createGzip(options: Options): Zopfli = js.native
  def createZlib(): Zopfli = js.native
  def createZlib(options: Options): Zopfli = js.native
  def deflate(input: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def deflate(
    input: nodeLib.Buffer,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflate(input: nodeLib.Buffer, options: Options): js.Promise[nodeLib.Buffer] = js.native
  def deflate(
    input: nodeLib.Buffer,
    options: Options,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflateSync(): nodeLib.Buffer = js.native
  def deflateSync(options: Options): nodeLib.Buffer = js.native
  def gzip(input: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def gzip(
    input: nodeLib.Buffer,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gzip(input: nodeLib.Buffer, options: Options): js.Promise[nodeLib.Buffer] = js.native
  def gzip(
    input: nodeLib.Buffer,
    options: Options,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gzipSync(): nodeLib.Buffer = js.native
  def gzipSync(options: Options): nodeLib.Buffer = js.native
  def zlib(input: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def zlib(
    input: nodeLib.Buffer,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def zlib(input: nodeLib.Buffer, options: Options): js.Promise[nodeLib.Buffer] = js.native
  def zlib(
    input: nodeLib.Buffer,
    options: Options,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def zlibSync(): nodeLib.Buffer = js.native
  def zlibSync(options: Options): nodeLib.Buffer = js.native
}

