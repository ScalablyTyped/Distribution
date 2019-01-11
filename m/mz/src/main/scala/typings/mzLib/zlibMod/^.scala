package typings
package mzLib.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/zlib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Z_ASCII: scala.Double = js.native
  val Z_BEST_COMPRESSION: scala.Double = js.native
  val Z_BEST_SPEED: scala.Double = js.native
  val Z_BINARY: scala.Double = js.native
  val Z_BLOCK: scala.Double = js.native
  val Z_BUF_ERROR: scala.Double = js.native
  val Z_DATA_ERROR: scala.Double = js.native
  val Z_DEFAULT_COMPRESSION: scala.Double = js.native
  val Z_DEFAULT_STRATEGY: scala.Double = js.native
  val Z_DEFLATED: scala.Double = js.native
  val Z_ERRNO: scala.Double = js.native
  val Z_FILTERED: scala.Double = js.native
  val Z_FINISH: scala.Double = js.native
  val Z_FIXED: scala.Double = js.native
  val Z_FULL_FLUSH: scala.Double = js.native
  val Z_HUFFMAN_ONLY: scala.Double = js.native
  val Z_MEM_ERROR: scala.Double = js.native
  val Z_NEED_DICT: scala.Double = js.native
  val Z_NO_COMPRESSION: scala.Double = js.native
  // Constants
  val Z_NO_FLUSH: scala.Double = js.native
  val Z_OK: scala.Double = js.native
  val Z_PARTIAL_FLUSH: scala.Double = js.native
  val Z_RLE: scala.Double = js.native
  val Z_STREAM_END: scala.Double = js.native
  val Z_STREAM_ERROR: scala.Double = js.native
  val Z_SYNC_FLUSH: scala.Double = js.native
  val Z_TEXT: scala.Double = js.native
  val Z_TREES: scala.Double = js.native
  val Z_UNKNOWN: scala.Double = js.native
  val Z_VERSION_ERROR: scala.Double = js.native
  def createDeflate(): nodeLib.zlibMod.Deflate = js.native
  def createDeflate(options: nodeLib.zlibMod.ZlibOptions): nodeLib.zlibMod.Deflate = js.native
  def createDeflateRaw(): nodeLib.zlibMod.DeflateRaw = js.native
  def createDeflateRaw(options: nodeLib.zlibMod.ZlibOptions): nodeLib.zlibMod.DeflateRaw = js.native
  def createGunzip(): nodeLib.zlibMod.Gunzip = js.native
  def createGunzip(options: nodeLib.zlibMod.ZlibOptions): nodeLib.zlibMod.Gunzip = js.native
  def createGzip(): nodeLib.zlibMod.Gzip = js.native
  def createGzip(options: nodeLib.zlibMod.ZlibOptions): nodeLib.zlibMod.Gzip = js.native
  def createInflate(): nodeLib.zlibMod.Inflate = js.native
  def createInflate(options: nodeLib.zlibMod.ZlibOptions): nodeLib.zlibMod.Inflate = js.native
  def createInflateRaw(): nodeLib.zlibMod.InflateRaw = js.native
  def createInflateRaw(options: nodeLib.zlibMod.ZlibOptions): nodeLib.zlibMod.InflateRaw = js.native
  def createUnzip(): nodeLib.zlibMod.Unzip = js.native
  def createUnzip(options: nodeLib.zlibMod.ZlibOptions): nodeLib.zlibMod.Unzip = js.native
  def deflate(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def deflate(
    buf: nodeLib.Buffer,
    callback: js.Function2[/* error */ nodeLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflate(
    buf: nodeLib.zlibMod.InputType,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflate(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflateRaw(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def deflateRaw(
    buf: nodeLib.Buffer,
    callback: js.Function2[/* error */ nodeLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflateRaw(
    buf: nodeLib.zlibMod.InputType,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflateRaw(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflateRawSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def deflateRawSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
  def deflateSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def deflateSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
  def gunzip(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def gunzip(
    buf: nodeLib.Buffer,
    callback: js.Function2[/* error */ nodeLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gunzip(
    buf: nodeLib.zlibMod.InputType,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gunzip(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gunzipSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def gunzipSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
  def gzip(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def gzip(
    buf: nodeLib.Buffer,
    callback: js.Function2[/* error */ nodeLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gzip(
    buf: nodeLib.zlibMod.InputType,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gzip(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gzipSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def gzipSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
  def inflate(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def inflate(
    buf: nodeLib.Buffer,
    callback: js.Function2[/* error */ nodeLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def inflate(
    buf: nodeLib.zlibMod.InputType,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def inflate(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def inflateRaw(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def inflateRaw(
    buf: nodeLib.Buffer,
    callback: js.Function2[/* error */ nodeLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def inflateRaw(
    buf: nodeLib.zlibMod.InputType,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def inflateRaw(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def inflateRawSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def inflateRawSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
  def inflateSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def inflateSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
  def unzip(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def unzip(
    buf: nodeLib.Buffer,
    callback: js.Function2[/* error */ nodeLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def unzip(
    buf: nodeLib.zlibMod.InputType,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def unzip(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def unzipSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def unzipSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
}

