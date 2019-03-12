package typings
package nodeLib.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zlib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * @deprecated
    */
  val Z_ASCII: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_BEST_COMPRESSION: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_BEST_SPEED: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_BINARY: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_BLOCK: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_BUF_ERROR: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_DATA_ERROR: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_DEFAULT_COMPRESSION: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_DEFAULT_STRATEGY: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_DEFLATED: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_ERRNO: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_FILTERED: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_FINISH: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_FIXED: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_FULL_FLUSH: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_HUFFMAN_ONLY: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_MEM_ERROR: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_NEED_DICT: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_NO_COMPRESSION: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_NO_FLUSH: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_OK: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_PARTIAL_FLUSH: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_RLE: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_STREAM_END: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_STREAM_ERROR: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_SYNC_FLUSH: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_TEXT: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_TREES: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_UNKNOWN: scala.Double = js.native
  /**
    * @deprecated
    */
  val Z_VERSION_ERROR: scala.Double = js.native
  def brotliCompress(buf: InputType, callback: CompressCallback): scala.Unit = js.native
  def brotliCompress(buf: InputType, options: BrotliOptions, callback: CompressCallback): scala.Unit = js.native
  def brotliCompressSync(buf: InputType): nodeLib.Buffer = js.native
  def brotliCompressSync(buf: InputType, options: BrotliOptions): nodeLib.Buffer = js.native
  def brotliDecompress(buf: InputType, callback: CompressCallback): scala.Unit = js.native
  def brotliDecompress(buf: InputType, options: BrotliOptions, callback: CompressCallback): scala.Unit = js.native
  def brotliDecompressSync(buf: InputType): nodeLib.Buffer = js.native
  def brotliDecompressSync(buf: InputType, options: BrotliOptions): nodeLib.Buffer = js.native
  def createBrotliCompress(): BrotliCompress = js.native
  def createBrotliCompress(options: BrotliOptions): BrotliCompress = js.native
  def createBrotliDecompress(): BrotliDecompress = js.native
  def createBrotliDecompress(options: BrotliOptions): BrotliDecompress = js.native
  def createDeflate(): Deflate = js.native
  def createDeflate(options: ZlibOptions): Deflate = js.native
  def createDeflateRaw(): DeflateRaw = js.native
  def createDeflateRaw(options: ZlibOptions): DeflateRaw = js.native
  def createGunzip(): Gunzip = js.native
  def createGunzip(options: ZlibOptions): Gunzip = js.native
  def createGzip(): Gzip = js.native
  def createGzip(options: ZlibOptions): Gzip = js.native
  def createInflate(): Inflate = js.native
  def createInflate(options: ZlibOptions): Inflate = js.native
  def createInflateRaw(): InflateRaw = js.native
  def createInflateRaw(options: ZlibOptions): InflateRaw = js.native
  def createUnzip(): Unzip = js.native
  def createUnzip(options: ZlibOptions): Unzip = js.native
  def deflate(buf: InputType, callback: CompressCallback): scala.Unit = js.native
  def deflate(buf: InputType, options: ZlibOptions, callback: CompressCallback): scala.Unit = js.native
  def deflateRaw(buf: InputType, callback: CompressCallback): scala.Unit = js.native
  def deflateRaw(buf: InputType, options: ZlibOptions, callback: CompressCallback): scala.Unit = js.native
  def deflateRawSync(buf: InputType): nodeLib.Buffer = js.native
  def deflateRawSync(buf: InputType, options: ZlibOptions): nodeLib.Buffer = js.native
  def deflateSync(buf: InputType): nodeLib.Buffer = js.native
  def deflateSync(buf: InputType, options: ZlibOptions): nodeLib.Buffer = js.native
  def gunzip(buf: InputType, callback: CompressCallback): scala.Unit = js.native
  def gunzip(buf: InputType, options: ZlibOptions, callback: CompressCallback): scala.Unit = js.native
  def gunzipSync(buf: InputType): nodeLib.Buffer = js.native
  def gunzipSync(buf: InputType, options: ZlibOptions): nodeLib.Buffer = js.native
  def gzip(buf: InputType, callback: CompressCallback): scala.Unit = js.native
  def gzip(buf: InputType, options: ZlibOptions, callback: CompressCallback): scala.Unit = js.native
  def gzipSync(buf: InputType): nodeLib.Buffer = js.native
  def gzipSync(buf: InputType, options: ZlibOptions): nodeLib.Buffer = js.native
  def inflate(buf: InputType, callback: CompressCallback): scala.Unit = js.native
  def inflate(buf: InputType, options: ZlibOptions, callback: CompressCallback): scala.Unit = js.native
  def inflateRaw(buf: InputType, callback: CompressCallback): scala.Unit = js.native
  def inflateRaw(buf: InputType, options: ZlibOptions, callback: CompressCallback): scala.Unit = js.native
  def inflateRawSync(buf: InputType): nodeLib.Buffer = js.native
  def inflateRawSync(buf: InputType, options: ZlibOptions): nodeLib.Buffer = js.native
  def inflateSync(buf: InputType): nodeLib.Buffer = js.native
  def inflateSync(buf: InputType, options: ZlibOptions): nodeLib.Buffer = js.native
  def unzip(buf: InputType, callback: CompressCallback): scala.Unit = js.native
  def unzip(buf: InputType, options: ZlibOptions, callback: CompressCallback): scala.Unit = js.native
  def unzipSync(buf: InputType): nodeLib.Buffer = js.native
  def unzipSync(buf: InputType, options: ZlibOptions): nodeLib.Buffer = js.native
}

