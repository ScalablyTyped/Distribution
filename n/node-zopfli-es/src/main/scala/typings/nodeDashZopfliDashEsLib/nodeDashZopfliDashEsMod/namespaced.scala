package typings
package nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-zopfli-es", JSImport.Namespace)
@js.native
class namespaced () extends Zopfli {
  def this(format: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Format) = this()
  def this(format: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Format, options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options) = this()
}

/* static members */
@JSImport("node-zopfli-es", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def compress(input: nodeLib.Buffer, format: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Format): js.Promise[nodeLib.Buffer] = js.native
  def compress(
    input: nodeLib.Buffer,
    format: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Format,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def compress(
    input: nodeLib.Buffer,
    format: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Format,
    options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options
  ): js.Promise[nodeLib.Buffer] = js.native
  def compress(
    input: nodeLib.Buffer,
    format: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Format,
    options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def createDeflate(): nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.Zopfli = js.native
  def createDeflate(options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options): nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.Zopfli = js.native
  def createGzip(): nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.Zopfli = js.native
  def createGzip(options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options): nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.Zopfli = js.native
  def createZlib(): nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.Zopfli = js.native
  def createZlib(options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options): nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.Zopfli = js.native
  def deflate(input: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def deflate(
    input: nodeLib.Buffer,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflate(input: nodeLib.Buffer, options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options): js.Promise[nodeLib.Buffer] = js.native
  def deflate(
    input: nodeLib.Buffer,
    options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflateSync(): nodeLib.Buffer = js.native
  def deflateSync(options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options): nodeLib.Buffer = js.native
  def gzip(input: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def gzip(
    input: nodeLib.Buffer,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gzip(input: nodeLib.Buffer, options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options): js.Promise[nodeLib.Buffer] = js.native
  def gzip(
    input: nodeLib.Buffer,
    options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gzipSync(): nodeLib.Buffer = js.native
  def gzipSync(options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options): nodeLib.Buffer = js.native
  def zlib(input: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def zlib(
    input: nodeLib.Buffer,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def zlib(input: nodeLib.Buffer, options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options): js.Promise[nodeLib.Buffer] = js.native
  def zlib(
    input: nodeLib.Buffer,
    options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options,
    cb: js.Function2[/* err */ stdLib.Error, /* out */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def zlibSync(): nodeLib.Buffer = js.native
  def zlibSync(options: nodeDashZopfliDashEsLib.nodeDashZopfliDashEsMod.ZopfliNs.Options): nodeLib.Buffer = js.native
}

