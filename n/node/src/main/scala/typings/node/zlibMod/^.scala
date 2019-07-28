package typings.node.zlibMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zlib", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * @deprecated
    */
  val Z_ASCII: Double = js.native
  /**
    * @deprecated
    */
  val Z_BEST_COMPRESSION: Double = js.native
  /**
    * @deprecated
    */
  val Z_BEST_SPEED: Double = js.native
  /**
    * @deprecated
    */
  val Z_BINARY: Double = js.native
  /**
    * @deprecated
    */
  val Z_BLOCK: Double = js.native
  /**
    * @deprecated
    */
  val Z_BUF_ERROR: Double = js.native
  /**
    * @deprecated
    */
  val Z_DATA_ERROR: Double = js.native
  /**
    * @deprecated
    */
  val Z_DEFAULT_COMPRESSION: Double = js.native
  /**
    * @deprecated
    */
  val Z_DEFAULT_STRATEGY: Double = js.native
  /**
    * @deprecated
    */
  val Z_DEFLATED: Double = js.native
  /**
    * @deprecated
    */
  val Z_ERRNO: Double = js.native
  /**
    * @deprecated
    */
  val Z_FILTERED: Double = js.native
  /**
    * @deprecated
    */
  val Z_FINISH: Double = js.native
  /**
    * @deprecated
    */
  val Z_FIXED: Double = js.native
  /**
    * @deprecated
    */
  val Z_FULL_FLUSH: Double = js.native
  /**
    * @deprecated
    */
  val Z_HUFFMAN_ONLY: Double = js.native
  /**
    * @deprecated
    */
  val Z_MEM_ERROR: Double = js.native
  /**
    * @deprecated
    */
  val Z_NEED_DICT: Double = js.native
  /**
    * @deprecated
    */
  val Z_NO_COMPRESSION: Double = js.native
  /**
    * @deprecated
    */
  val Z_NO_FLUSH: Double = js.native
  /**
    * @deprecated
    */
  val Z_OK: Double = js.native
  /**
    * @deprecated
    */
  val Z_PARTIAL_FLUSH: Double = js.native
  /**
    * @deprecated
    */
  val Z_RLE: Double = js.native
  /**
    * @deprecated
    */
  val Z_STREAM_END: Double = js.native
  /**
    * @deprecated
    */
  val Z_STREAM_ERROR: Double = js.native
  /**
    * @deprecated
    */
  val Z_SYNC_FLUSH: Double = js.native
  /**
    * @deprecated
    */
  val Z_TEXT: Double = js.native
  /**
    * @deprecated
    */
  val Z_TREES: Double = js.native
  /**
    * @deprecated
    */
  val Z_UNKNOWN: Double = js.native
  /**
    * @deprecated
    */
  val Z_VERSION_ERROR: Double = js.native
  def brotliCompress(buf: InputType, callback: CompressCallback): Unit = js.native
  def brotliCompress(buf: InputType, options: BrotliOptions, callback: CompressCallback): Unit = js.native
  def brotliCompressSync(buf: InputType): Buffer = js.native
  def brotliCompressSync(buf: InputType, options: BrotliOptions): Buffer = js.native
  def brotliDecompress(buf: InputType, callback: CompressCallback): Unit = js.native
  def brotliDecompress(buf: InputType, options: BrotliOptions, callback: CompressCallback): Unit = js.native
  def brotliDecompressSync(buf: InputType): Buffer = js.native
  def brotliDecompressSync(buf: InputType, options: BrotliOptions): Buffer = js.native
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
  def deflate(buf: InputType, callback: CompressCallback): Unit = js.native
  def deflate(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = js.native
  def deflateRaw(buf: InputType, callback: CompressCallback): Unit = js.native
  def deflateRaw(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = js.native
  def deflateRawSync(buf: InputType): Buffer = js.native
  def deflateRawSync(buf: InputType, options: ZlibOptions): Buffer = js.native
  def deflateSync(buf: InputType): Buffer = js.native
  def deflateSync(buf: InputType, options: ZlibOptions): Buffer = js.native
  def gunzip(buf: InputType, callback: CompressCallback): Unit = js.native
  def gunzip(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = js.native
  def gunzipSync(buf: InputType): Buffer = js.native
  def gunzipSync(buf: InputType, options: ZlibOptions): Buffer = js.native
  def gzip(buf: InputType, callback: CompressCallback): Unit = js.native
  def gzip(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = js.native
  def gzipSync(buf: InputType): Buffer = js.native
  def gzipSync(buf: InputType, options: ZlibOptions): Buffer = js.native
  def inflate(buf: InputType, callback: CompressCallback): Unit = js.native
  def inflate(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = js.native
  def inflateRaw(buf: InputType, callback: CompressCallback): Unit = js.native
  def inflateRaw(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = js.native
  def inflateRawSync(buf: InputType): Buffer = js.native
  def inflateRawSync(buf: InputType, options: ZlibOptions): Buffer = js.native
  def inflateSync(buf: InputType): Buffer = js.native
  def inflateSync(buf: InputType, options: ZlibOptions): Buffer = js.native
  def unzip(buf: InputType, callback: CompressCallback): Unit = js.native
  def unzip(buf: InputType, options: ZlibOptions, callback: CompressCallback): Unit = js.native
  def unzipSync(buf: InputType): Buffer = js.native
  def unzipSync(buf: InputType, options: ZlibOptions): Buffer = js.native
}

