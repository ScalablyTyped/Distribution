package typings
package mzLib.mzMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz", "zlib")
@js.native
object zlibNs extends js.Object {
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
  def brotliCompress(buf: nodeLib.zlibMod.InputType, callback: nodeLib.zlibMod.CompressCallback): scala.Unit = js.native
  def brotliCompress(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.BrotliOptions,
    callback: nodeLib.zlibMod.CompressCallback
  ): scala.Unit = js.native
  def brotliCompressSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def brotliCompressSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.BrotliOptions): nodeLib.Buffer = js.native
  def brotliDecompress(buf: nodeLib.zlibMod.InputType, callback: nodeLib.zlibMod.CompressCallback): scala.Unit = js.native
  def brotliDecompress(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.BrotliOptions,
    callback: nodeLib.zlibMod.CompressCallback
  ): scala.Unit = js.native
  def brotliDecompressSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def brotliDecompressSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.BrotliOptions): nodeLib.Buffer = js.native
  def createBrotliCompress(): nodeLib.zlibMod.BrotliCompress = js.native
  def createBrotliCompress(options: nodeLib.zlibMod.BrotliOptions): nodeLib.zlibMod.BrotliCompress = js.native
  def createBrotliDecompress(): nodeLib.zlibMod.BrotliDecompress = js.native
  def createBrotliDecompress(options: nodeLib.zlibMod.BrotliOptions): nodeLib.zlibMod.BrotliDecompress = js.native
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
    callback: js.Function2[/* error */ stdLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflate(buf: nodeLib.zlibMod.InputType, callback: nodeLib.zlibMod.CompressCallback): scala.Unit = js.native
  def deflate(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: nodeLib.zlibMod.CompressCallback
  ): scala.Unit = js.native
  def deflateRaw(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def deflateRaw(
    buf: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def deflateRaw(buf: nodeLib.zlibMod.InputType, callback: nodeLib.zlibMod.CompressCallback): scala.Unit = js.native
  def deflateRaw(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: nodeLib.zlibMod.CompressCallback
  ): scala.Unit = js.native
  def deflateRawSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def deflateRawSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
  def deflateSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def deflateSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
  def gunzip(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def gunzip(
    buf: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gunzip(buf: nodeLib.zlibMod.InputType, callback: nodeLib.zlibMod.CompressCallback): scala.Unit = js.native
  def gunzip(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: nodeLib.zlibMod.CompressCallback
  ): scala.Unit = js.native
  def gunzipSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def gunzipSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
  def gzip(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def gzip(
    buf: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def gzip(buf: nodeLib.zlibMod.InputType, callback: nodeLib.zlibMod.CompressCallback): scala.Unit = js.native
  def gzip(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: nodeLib.zlibMod.CompressCallback
  ): scala.Unit = js.native
  def gzipSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def gzipSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
  def inflate(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def inflate(
    buf: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def inflate(buf: nodeLib.zlibMod.InputType, callback: nodeLib.zlibMod.CompressCallback): scala.Unit = js.native
  def inflate(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: nodeLib.zlibMod.CompressCallback
  ): scala.Unit = js.native
  def inflateRaw(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def inflateRaw(
    buf: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def inflateRaw(buf: nodeLib.zlibMod.InputType, callback: nodeLib.zlibMod.CompressCallback): scala.Unit = js.native
  def inflateRaw(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: nodeLib.zlibMod.CompressCallback
  ): scala.Unit = js.native
  def inflateRawSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def inflateRawSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
  def inflateSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def inflateSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
  def unzip(buf: nodeLib.Buffer): js.Promise[nodeLib.Buffer] = js.native
  def unzip(
    buf: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error, /* result */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def unzip(buf: nodeLib.zlibMod.InputType, callback: nodeLib.zlibMod.CompressCallback): scala.Unit = js.native
  def unzip(
    buf: nodeLib.zlibMod.InputType,
    options: nodeLib.zlibMod.ZlibOptions,
    callback: nodeLib.zlibMod.CompressCallback
  ): scala.Unit = js.native
  def unzipSync(buf: nodeLib.zlibMod.InputType): nodeLib.Buffer = js.native
  def unzipSync(buf: nodeLib.zlibMod.InputType, options: nodeLib.zlibMod.ZlibOptions): nodeLib.Buffer = js.native
  @JSName("constants")
  @js.native
  object constantsNs extends js.Object {
    val BROTLI_DECODE: scala.Double = js.native
    val BROTLI_DECODER_ERROR_ALLOC_BLOCK_TYPE_TREES: scala.Double = js.native
    val BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MAP: scala.Double = js.native
    val BROTLI_DECODER_ERROR_ALLOC_CONTEXT_MODES: scala.Double = js.native
    val BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_1: scala.Double = js.native
    val BROTLI_DECODER_ERROR_ALLOC_RING_BUFFER_2: scala.Double = js.native
    val BROTLI_DECODER_ERROR_ALLOC_TREE_GROUPS: scala.Double = js.native
    val BROTLI_DECODER_ERROR_DICTIONARY_NOT_SET: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_1: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_BLOCK_LENGTH_2: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_CL_SPACE: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_CONTEXT_MAP_REPEAT: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_DICTIONARY: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_DISTANCE: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_META_NIBBLE: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_EXUBERANT_NIBBLE: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_HUFFMAN_SPACE: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_PADDING_1: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_PADDING_2: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_RESERVED: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_ALPHABET: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_SIMPLE_HUFFMAN_SAME: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_TRANSFORM: scala.Double = js.native
    val BROTLI_DECODER_ERROR_FORMAT_WINDOW_BITS: scala.Double = js.native
    val BROTLI_DECODER_ERROR_INVALID_ARGUMENTS: scala.Double = js.native
    val BROTLI_DECODER_ERROR_UNREACHABLE: scala.Double = js.native
    val BROTLI_DECODER_NEEDS_MORE_INPUT: scala.Double = js.native
    val BROTLI_DECODER_NEEDS_MORE_OUTPUT: scala.Double = js.native
    val BROTLI_DECODER_NO_ERROR: scala.Double = js.native
    val BROTLI_DECODER_PARAM_DISABLE_RING_BUFFER_REALLOCATION: scala.Double = js.native
    val BROTLI_DECODER_PARAM_LARGE_WINDOW: scala.Double = js.native
    val BROTLI_DECODER_RESULT_ERROR: scala.Double = js.native
    val BROTLI_DECODER_RESULT_NEEDS_MORE_INPUT: scala.Double = js.native
    val BROTLI_DECODER_RESULT_NEEDS_MORE_OUTPUT: scala.Double = js.native
    val BROTLI_DECODER_RESULT_SUCCESS: scala.Double = js.native
    val BROTLI_DECODER_SUCCESS: scala.Double = js.native
    val BROTLI_DEFAULT_MODE: scala.Double = js.native
    val BROTLI_DEFAULT_QUALITY: scala.Double = js.native
    val BROTLI_DEFAULT_WINDOW: scala.Double = js.native
    val BROTLI_ENCODE: scala.Double = js.native
    val BROTLI_LARGE_MAX_WINDOW_BITS: scala.Double = js.native
    val BROTLI_MAX_INPUT_BLOCK_BITS: scala.Double = js.native
    val BROTLI_MAX_QUALITY: scala.Double = js.native
    val BROTLI_MAX_WINDOW_BITS: scala.Double = js.native
    val BROTLI_MIN_INPUT_BLOCK_BITS: scala.Double = js.native
    val BROTLI_MIN_QUALITY: scala.Double = js.native
    val BROTLI_MIN_WINDOW_BITS: scala.Double = js.native
    val BROTLI_MODE_FONT: scala.Double = js.native
    val BROTLI_MODE_GENERIC: scala.Double = js.native
    val BROTLI_MODE_TEXT: scala.Double = js.native
    val BROTLI_OPERATION_EMIT_METADATA: scala.Double = js.native
    val BROTLI_OPERATION_FINISH: scala.Double = js.native
    val BROTLI_OPERATION_FLUSH: scala.Double = js.native
    val BROTLI_OPERATION_PROCESS: scala.Double = js.native
    val BROTLI_PARAM_DISABLE_LITERAL_CONTEXT_MODELING: scala.Double = js.native
    val BROTLI_PARAM_LARGE_WINDOW: scala.Double = js.native
    val BROTLI_PARAM_LGBLOCK: scala.Double = js.native
    val BROTLI_PARAM_LGWIN: scala.Double = js.native
    val BROTLI_PARAM_MODE: scala.Double = js.native
    val BROTLI_PARAM_NDIRECT: scala.Double = js.native
    val BROTLI_PARAM_NPOSTFIX: scala.Double = js.native
    val BROTLI_PARAM_QUALITY: scala.Double = js.native
    val BROTLI_PARAM_SIZE_HINT: scala.Double = js.native
    val DEFLATE: scala.Double = js.native
    val DEFLATERAW: scala.Double = js.native
    val GUNZIP: scala.Double = js.native
    val GZIP: scala.Double = js.native
    val INFLATE: scala.Double = js.native
    val INFLATERAW: scala.Double = js.native
    val UNZIP: scala.Double = js.native
    val ZLIB_VERNUM: scala.Double = js.native
    val Z_BEST_COMPRESSION: scala.Double = js.native
    val Z_BEST_SPEED: scala.Double = js.native
    val Z_BLOCK: scala.Double = js.native
    val Z_BUF_ERROR: scala.Double = js.native
    val Z_DATA_ERROR: scala.Double = js.native
    val Z_DEFAULT_CHUNK: scala.Double = js.native
    val Z_DEFAULT_COMPRESSION: scala.Double = js.native
    val Z_DEFAULT_LEVEL: scala.Double = js.native
    val Z_DEFAULT_MEMLEVEL: scala.Double = js.native
    val Z_DEFAULT_STRATEGY: scala.Double = js.native
    val Z_DEFAULT_WINDOWBITS: scala.Double = js.native
    val Z_ERRNO: scala.Double = js.native
    val Z_FILTERED: scala.Double = js.native
    val Z_FINISH: scala.Double = js.native
    val Z_FIXED: scala.Double = js.native
    val Z_FULL_FLUSH: scala.Double = js.native
    val Z_HUFFMAN_ONLY: scala.Double = js.native
    val Z_MAX_CHUNK: scala.Double = js.native
    val Z_MAX_LEVEL: scala.Double = js.native
    val Z_MAX_MEMLEVEL: scala.Double = js.native
    val Z_MAX_WINDOWBITS: scala.Double = js.native
    val Z_MEM_ERROR: scala.Double = js.native
    val Z_MIN_CHUNK: scala.Double = js.native
    val Z_MIN_LEVEL: scala.Double = js.native
    val Z_MIN_MEMLEVEL: scala.Double = js.native
    val Z_MIN_WINDOWBITS: scala.Double = js.native
    val Z_NEED_DICT: scala.Double = js.native
    val Z_NO_COMPRESSION: scala.Double = js.native
    val Z_NO_FLUSH: scala.Double = js.native
    val Z_OK: scala.Double = js.native
    val Z_PARTIAL_FLUSH: scala.Double = js.native
    val Z_RLE: scala.Double = js.native
    val Z_STREAM_END: scala.Double = js.native
    val Z_STREAM_ERROR: scala.Double = js.native
    val Z_SYNC_FLUSH: scala.Double = js.native
    val Z_VERSION_ERROR: scala.Double = js.native
  }
  
}

