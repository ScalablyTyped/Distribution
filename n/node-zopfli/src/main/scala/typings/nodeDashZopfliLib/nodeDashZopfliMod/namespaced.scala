package typings
package nodeDashZopfliLib.nodeDashZopfliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-zopfli", JSImport.Namespace)
@js.native
class namespaced () extends Zopfli {
  def this(format: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Format) = this()
  def this(format: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Format, options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options) = this()
}

/* static members */
@JSImport("node-zopfli", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def compress(input: nodeLib.Buffer, format: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Format): js.Promise[nodeLib.Buffer] = js.native
  def compress(
    input: nodeLib.Buffer,
    format: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Format,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def compress(
    input: nodeLib.Buffer,
    format: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Format,
    options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options
  ): js.Promise[nodeLib.Buffer] = js.native
  def compress(
    input: nodeLib.Buffer,
    format: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Format,
    options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def createDeflate(): nodeDashZopfliLib.nodeDashZopfliMod.Zopfli = js.native
  def createDeflate(options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options): nodeDashZopfliLib.nodeDashZopfliMod.Zopfli = js.native
  def createGzip(): nodeDashZopfliLib.nodeDashZopfliMod.Zopfli = js.native
  def createGzip(options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options): nodeDashZopfliLib.nodeDashZopfliMod.Zopfli = js.native
  def createZlib(): nodeDashZopfliLib.nodeDashZopfliMod.Zopfli = js.native
  def createZlib(options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options): nodeDashZopfliLib.nodeDashZopfliMod.Zopfli = js.native
  def deflate(input: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def deflate(
    input: nodeLib.Buffer,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflate(input: nodeLib.Buffer, options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options): js.Promise[nodeLib.Buffer] = js.native
  def deflate(
    input: nodeLib.Buffer,
    options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflateSync(): nodeLib.Buffer = js.native
  def deflateSync(options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options): nodeLib.Buffer = js.native
  def gzip(input: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def gzip(
    input: nodeLib.Buffer,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gzip(input: nodeLib.Buffer, options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options): js.Promise[nodeLib.Buffer] = js.native
  def gzip(
    input: nodeLib.Buffer,
    options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gzipSync(): nodeLib.Buffer = js.native
  def gzipSync(options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options): nodeLib.Buffer = js.native
  def zlib(input: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def zlib(
    input: nodeLib.Buffer,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def zlib(input: nodeLib.Buffer, options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options): js.Promise[nodeLib.Buffer] = js.native
  def zlib(
    input: nodeLib.Buffer,
    options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def zlibSync(): nodeLib.Buffer = js.native
  def zlibSync(options: nodeDashZopfliLib.nodeDashZopfliMod.ZopfliNs.Options): nodeLib.Buffer = js.native
}

