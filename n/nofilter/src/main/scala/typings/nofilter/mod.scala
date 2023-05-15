package typings.nofilter

import typings.buffer.mod.Buffer
import typings.node.bufferMod.global.BufferEncoding
import typings.node.streamMod.Transform
import typings.nofilter.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nofilter", "NoFilter")
  @js.native
  /**
    * Create an instance of NoFilter.
    *
    * @param {string|Buffer|BufferEncoding|NoFilterOptions} [input] Source data.
    * @param {BufferEncoding|NoFilterOptions} [inputEncoding] Encoding
    *   name for input, ignored if input is not a String.
    * @param {NoFilterOptions} [options] Other options.
    */
  open class NoFilter () extends Transform {
    def this(input: String) = this()
    def this(input: Buffer) = this()
    def this(input: BufferEncoding) = this()
    def this(input: NoFilterOptions) = this()
    def this(input: String, inputEncoding: BufferEncoding) = this()
    def this(input: String, inputEncoding: NoFilterOptions) = this()
    def this(input: Unit, inputEncoding: BufferEncoding) = this()
    def this(input: Unit, inputEncoding: NoFilterOptions) = this()
    def this(input: Buffer, inputEncoding: BufferEncoding) = this()
    def this(input: Buffer, inputEncoding: NoFilterOptions) = this()
    def this(input: BufferEncoding, inputEncoding: BufferEncoding) = this()
    def this(input: BufferEncoding, inputEncoding: NoFilterOptions) = this()
    def this(input: NoFilterOptions, inputEncoding: BufferEncoding) = this()
    def this(input: NoFilterOptions, inputEncoding: NoFilterOptions) = this()
    def this(input: String, inputEncoding: Unit, options: NoFilterOptions) = this()
    def this(input: String, inputEncoding: BufferEncoding, options: NoFilterOptions) = this()
    def this(input: String, inputEncoding: NoFilterOptions, options: NoFilterOptions) = this()
    def this(input: Unit, inputEncoding: Unit, options: NoFilterOptions) = this()
    def this(input: Unit, inputEncoding: BufferEncoding, options: NoFilterOptions) = this()
    def this(input: Unit, inputEncoding: NoFilterOptions, options: NoFilterOptions) = this()
    def this(input: Buffer, inputEncoding: Unit, options: NoFilterOptions) = this()
    def this(input: Buffer, inputEncoding: BufferEncoding, options: NoFilterOptions) = this()
    def this(input: Buffer, inputEncoding: NoFilterOptions, options: NoFilterOptions) = this()
    def this(input: BufferEncoding, inputEncoding: Unit, options: NoFilterOptions) = this()
    def this(input: BufferEncoding, inputEncoding: BufferEncoding, options: NoFilterOptions) = this()
    def this(input: BufferEncoding, inputEncoding: NoFilterOptions, options: NoFilterOptions) = this()
    def this(input: NoFilterOptions, inputEncoding: Unit, options: NoFilterOptions) = this()
    def this(input: NoFilterOptions, inputEncoding: BufferEncoding, options: NoFilterOptions) = this()
    def this(input: NoFilterOptions, inputEncoding: NoFilterOptions, options: NoFilterOptions) = this()
    
    /**
      * @returns {Buffer[]} The current internal buffers.  They are layed out
      *   end to end.
      * @ignore
      */
    def _bufArray(): js.Array[Buffer] = js.native
    
    /**
      * @ignore
      */
    def _transform(chunk: Any, encoding: Any, callback: Any): Unit = js.native
    
    /**
      * Returns a number indicating whether this comes before or after or is the
      * same as the other NoFilter in sort order.
      *
      * @param {NoFilter} other The other object to compare.
      * @returns {number} - -1, 0, 1 for less, equal, greater.
      * @throws {TypeError} Arguments must be NoFilters.
      */
    def compare(other: NoFilter): Double = js.native
    
    /**
      * Do these NoFilter's contain the same bytes?  Doesn't work if either is
      * in object mode.
      *
      * @param {NoFilter} other Other NoFilter to compare against.
      * @returns {boolean} Equal?
      */
    def equals(other: NoFilter): Boolean = js.native
    
    /**
      * Get a byte by offset.  I didn't want to get into metaprogramming
      * to give you the `NoFilter[0]` syntax.
      *
      * @param {number} index The byte to retrieve.
      * @returns {number} 0-255.
      */
    def get(index: Double): Double = js.native
    
    /**
      * Current readable length, in bytes.
      *
      * @returns {number} Length of the contents.
      */
    def length: Double = js.native
    
    /**
      * Return a promise fulfilled with the full contents, after the 'finish'
      * event fires.  Errors on the stream cause the promise to be rejected.
      *
      * @param {Function} [cb=null] Finished/error callback used in *addition*
      *   to the promise.
      * @returns {Promise<Buffer|string>} Fulfilled when complete.
      */
    def promise(): js.Promise[Buffer | String] = js.native
    def promise(cb: js.Function): js.Promise[Buffer | String] = js.native
    
    /**
      * Pulls some data out of the internal buffer and returns it.
      * If there is no data available, then it will return null.
      *
      * If you pass in a size argument, then it will return that many bytes. If
      * size bytes are not available, then it will return null, unless we've
      * ended, in which case it will return the data remaining in the buffer.
      *
      * If you do not specify a size argument, then it will return all the data in
      * the internal buffer.
      *
      * @param {number} [size=null] Number of bytes to read.
      * @returns {string|Buffer|null} If no data or not enough data, null.  If
      *   decoding output a string, otherwise a Buffer.
      * @throws Error If readError is true and there was underflow.
      * @fires NoFilter#read When read from.
      */
    def read(): String | Buffer | Null = js.native
    def read(size: Double): String | Buffer | Null = js.native
    
    /**
      * Read a variable-sized JavaScript signed BigInt from the stream in 2's
      * complement format.
      *
      * @param {number} [len=null] Number of bytes to read or all remaining
      *   if null.
      * @returns {bigint} A BigInt.
      */
    def readBigInt(): js.BigInt = js.native
    def readBigInt(len: Double): js.BigInt = js.native
    
    /**
      * Read a signed 64-bit big-endian BigInt from the stream.
      * Consumes 8 bytes.
      *
      * @returns {bigint} Value read.
      */
    def readBigInt64BE(): js.BigInt = js.native
    
    /**
      * Read a signed 64-bit little-endian BigInt from the stream.
      * Consumes 8 bytes.
      *
      * @returns {bigint} Value read.
      */
    def readBigInt64LE(): js.BigInt = js.native
    
    /**
      * Read an unsigned 64-bit big-endian BigInt from the stream.
      * Consumes 8 bytes.
      *
      * @returns {bigint} Value read.
      */
    def readBigUInt64BE(): js.BigInt = js.native
    
    /**
      * Read an unsigned 64-bit little-endian BigInt from the stream.
      * Consumes 8 bytes.
      *
      * @returns {bigint} Value read.
      */
    def readBigUInt64LE(): js.BigInt = js.native
    
    /**
      * Read a 64-bit big-endian float from the stream.
      * Consumes 8 bytes.
      *
      * @returns {number} Value read.
      */
    def readDoubleBE(): Double = js.native
    
    /**
      * Read a 64-bit little-endian float from the stream.
      * Consumes 8 bytes.
      *
      * @returns {number} Value read.
      */
    def readDoubleLE(): Double = js.native
    
    var readError: Boolean = js.native
    
    /**
      * Read a 32-bit big-endian float from the stream.
      * Consumes 4 bytes.
      *
      * @returns {number} Value read.
      */
    def readFloatBE(): Double = js.native
    
    /**
      * Read a 32-bit little-endian float from the stream.
      * Consumes 4 bytes.
      *
      * @returns {number} Value read.
      */
    def readFloatLE(): Double = js.native
    
    /**
      * Read the full number of bytes asked for, no matter how long it takes.
      * Fail if an error occurs in the meantime, or if the stream finishes before
      * enough data is available.
      *
      * Note: This function won't work fully correctly if you are using
      * stream-browserify (for example, on the Web).
      *
      * @param {number} size The number of bytes to read.
      * @returns {Promise<string|Buffer>} A promise for the data read.
      */
    def readFull(size: Double): js.Promise[String | Buffer] = js.native
    
    /**
      * Read a little-endian signed 16-bit integer from the stream.
      * Consumes 2 bytes.
      *
      * @returns {number} Value read.
      */
    def readInt16BE(): Double = js.native
    
    /**
      * Read a little-endian signed 16-bit integer from the stream.
      * Consumes 2 bytes.
      *
      * @returns {number} Value read.
      */
    def readInt16LE(): Double = js.native
    
    /**
      * Read a little-endian signed 16-bit integer from the stream.
      * Consumes 4 bytes.
      *
      * @returns {number} Value read.
      */
    def readInt32BE(): Double = js.native
    
    /**
      * Read a little-endian signed 32-bit integer from the stream.
      * Consumes 4 bytes.
      *
      * @returns {number} Value read.
      */
    def readInt32LE(): Double = js.native
    
    /**
      * Read a signed 8-bit integer from the stream.  Consumes 1 byte.
      *
      * @returns {number} Value read.
      */
    def readInt8(): Double = js.native
    
    /**
      * Read a variable-sized JavaScript unsigned BigInt from the stream.
      *
      * @param {number} [len=null] Number of bytes to read or all remaining
      *   if null.
      * @returns {bigint} A BigInt.
      */
    def readUBigInt(): js.BigInt = js.native
    def readUBigInt(len: Double): js.BigInt = js.native
    
    /**
      * Read a little-endian unsigned 16-bit integer from the stream.
      * Consumes 2 bytes.
      *
      * @returns {number} Value read.
      */
    def readUInt16BE(): Double = js.native
    
    /**
      * Read a little-endian unsigned 16-bit integer from the stream.
      * Consumes 2 bytes.
      *
      * @returns {number} Value read.
      */
    def readUInt16LE(): Double = js.native
    
    /**
      * Read a little-endian unsigned 16-bit integer from the stream.
      * Consumes 4 bytes.
      *
      * @returns {number} Value read.
      */
    def readUInt32BE(): Double = js.native
    
    /**
      * Read a little-endian unsigned 32-bit integer from the stream.
      * Consumes 4 bytes.
      *
      * @returns {number} Value read.
      */
    def readUInt32LE(): Double = js.native
    
    /**
      * Read an unsigned 8-bit integer from the stream.  Consumes 1 byte.
      *
      * @returns {number} Value read.
      */
    def readUInt8(): Double = js.native
    
    /**
      * Read bytes or objects without consuming them.  Useful for diagnostics.
      * Note: as a side-effect, concatenates multiple writes together into what
      * looks like a single write, so that this concat doesn't have to happen
      * multiple times when you're futzing with the same NoFilter.
      *
      * @param {number} [start=0] Beginning offset.
      * @param {number} [end=length] Ending offset.
      * @returns {Buffer|Array} If in object mode, an array of objects.  Otherwise,
      *   concatenated array of contents.
      */
    def slice(): Buffer | js.Array[Any] = js.native
    def slice(start: Double): Buffer | js.Array[Any] = js.native
    def slice(start: Double, end: Double): Buffer | js.Array[Any] = js.native
    def slice(start: Unit, end: Double): Buffer | js.Array[Any] = js.native
    
    /**
      * Return an object compatible with Buffer's toJSON implementation, so that
      * round-tripping will produce a Buffer.
      *
      * @returns {string|Array|{type: 'Buffer',data: number[]}} If in object mode,
      *   the objects.  Otherwise, JSON text.
      * @example <caption>output for 'foo', not in object mode</caption>
      * ({
      *   type: 'Buffer',
      *   data: [102, 111, 111],
      * })
      */
    def toJSON(): String | js.Array[Any] | Data = js.native
    
    def toString(encoding: Unit, start: Double): String = js.native
    def toString(encoding: Unit, start: Double, end: Double): String = js.native
    def toString(encoding: Unit, start: Unit, end: Double): String = js.native
    def toString(encoding: BufferEncoding): String = js.native
    def toString(encoding: BufferEncoding, start: Double): String = js.native
    def toString(encoding: BufferEncoding, start: Double, end: Double): String = js.native
    def toString(encoding: BufferEncoding, start: Unit, end: Double): String = js.native
    
    /**
      * Write a JavaScript BigInt to the stream.  Negative numbers will be
      * written as their 2's complement version.
      *
      * @param {bigint} val The value to write.
      * @returns {boolean} True on success.
      */
    def writeBigInt(`val`: js.BigInt): Boolean = js.native
    
    /**
      * Write a signed big-endian 64-bit BigInt to the stream.  Adds 8 bytes.
      *
      * @param {bigint} value BigInt.
      * @returns {boolean} True on success.
      */
    def writeBigInt64BE(value: js.BigInt): Boolean = js.native
    
    /**
      * Write a signed little-endian 64-bit BigInt to the stream.  Adds 8 bytes.
      *
      * @param {bigint} value BigInt.
      * @returns {boolean} True on success.
      */
    def writeBigInt64LE(value: js.BigInt): Boolean = js.native
    
    /**
      * Write an unsigned big-endian 64-bit BigInt to the stream.  Adds 8 bytes.
      *
      * @param {bigint} value Non-negative BigInt.
      * @returns {boolean} True on success.
      */
    def writeBigUInt64BE(value: js.BigInt): Boolean = js.native
    
    /**
      * Write an unsigned little-endian 64-bit BigInt to the stream.  Adds 8 bytes.
      *
      * @param {bigint} value Non-negative BigInt.
      * @returns {boolean} True on success.
      */
    def writeBigUInt64LE(value: js.BigInt): Boolean = js.native
    
    /**
      * Write a big-endian 64-bit float to the stream.  Adds 8 bytes.
      *
      * @param {number} value 64-bit float.
      * @returns {boolean} True on success.
      */
    def writeDoubleBE(value: Double): Boolean = js.native
    
    /**
      * Write a little-endian 64-bit double to the stream.  Adds 8 bytes.
      *
      * @param {number} value 64-bit float.
      * @returns {boolean} True on success.
      */
    def writeDoubleLE(value: Double): Boolean = js.native
    
    /**
      * Write a big-endian 32-bit float to the stream.  Adds 4 bytes.
      *
      * @param {number} value 32-bit float.
      * @returns {boolean} True on success.
      */
    def writeFloatBE(value: Double): Boolean = js.native
    
    /**
      * Write a little-endian 32-bit float to the stream.  Adds 4 bytes.
      *
      * @param {number} value 32-bit float.
      * @returns {boolean} True on success.
      */
    def writeFloatLE(value: Double): Boolean = js.native
    
    /**
      * Write a signed big-endian 16-bit integer to the stream.  Adds 2 bytes.
      *
      * @param {number} value (-32768)..32767.
      * @returns {boolean} True on success.
      */
    def writeInt16BE(value: Double): Boolean = js.native
    
    /**
      * Write a signed little-endian 16-bit integer to the stream.  Adds 2 bytes.
      *
      * @param {number} value (-32768)..32767.
      * @returns {boolean} True on success.
      */
    def writeInt16LE(value: Double): Boolean = js.native
    
    /**
      * Write a signed big-endian 32-bit integer to the stream.  Adds 4 bytes.
      *
      * @param {number} value (-2**31)..(2**31-1).
      * @returns {boolean} True on success.
      */
    def writeInt32BE(value: Double): Boolean = js.native
    
    /**
      * Write a signed little-endian 32-bit integer to the stream.  Adds 4 bytes.
      *
      * @param {number} value (-2**31)..(2**31-1).
      * @returns {boolean} True on success.
      */
    def writeInt32LE(value: Double): Boolean = js.native
    
    /**
      * Write a signed 8-bit integer to the stream.  Adds 1 byte.
      *
      * @param {number} value (-128)..127.
      * @returns {boolean} True on success.
      */
    def writeInt8(value: Double): Boolean = js.native
    
    /**
      * Write a big-endian 16-bit unsigned integer to the stream.  Adds
      * 2 bytes.
      *
      * @param {number} value 0..65535.
      * @returns {boolean} True on success.
      */
    def writeUInt16BE(value: Double): Boolean = js.native
    
    /**
      * Write a little-endian 16-bit unsigned integer to the stream.  Adds
      * 2 bytes.
      *
      * @param {number} value 0..65535.
      * @returns {boolean} True on success.
      */
    def writeUInt16LE(value: Double): Boolean = js.native
    
    /**
      * Write a big-endian 32-bit unsigned integer to the stream.  Adds
      * 4 bytes.
      *
      * @param {number} value 0..2**32-1.
      * @returns {boolean} True on success.
      */
    def writeUInt32BE(value: Double): Boolean = js.native
    
    /**
      * Write a little-endian 32-bit unsigned integer to the stream.  Adds
      * 4 bytes.
      *
      * @param {number} value 0..2**32-1.
      * @returns {boolean} True on success.
      */
    def writeUInt32LE(value: Double): Boolean = js.native
    
    /**
      * Write an 8-bit unsigned integer to the stream.  Adds 1 byte.
      *
      * @param {number} value 0..255.
      * @returns {boolean} True on success.
      */
    def writeUInt8(value: Double): Boolean = js.native
  }
  /* static members */
  object NoFilter {
    
    @JSImport("nofilter", "NoFilter")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The same as nf1.compare(nf2). Useful for sorting an Array of NoFilters.
      *
      * @param {NoFilter} nf1 The first object to compare.
      * @param {NoFilter} nf2 The second object to compare.
      * @returns {number} - -1, 0, 1 for less, equal, greater.
      * @throws {TypeError} Arguments not NoFilter instances.
      * @example
      * const arr = [new NoFilter('1234'), new NoFilter('0123')]
      * arr.sort(NoFilter.compare)
      */
    inline def compare(nf1: NoFilter, nf2: NoFilter): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(nf1.asInstanceOf[js.Any], nf2.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Returns a buffer which is the result of concatenating all the
      * NoFilters in the list together. If the list has no items, or if
      * the totalLength is 0, then it returns a zero-length buffer.
      *
      * If length is not provided, it is read from the buffers in the
      * list. However, this adds an additional loop to the function, so
      * it is faster to provide the length explicitly if you already know it.
      *
      * @param {Array<NoFilter>} list Inputs.  Must not be all either in object
      *   mode, or all not in object mode.
      * @param {number} [length=null] Number of bytes or objects to read.
      * @returns {Buffer|Array} The concatenated values as an array if in object
      *   mode, otherwise a Buffer.
      * @throws {TypeError} List not array of NoFilters.
      */
    inline def concat(list: js.Array[NoFilter]): Buffer | js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any]).asInstanceOf[Buffer | js.Array[Any]]
    inline def concat(list: js.Array[NoFilter], length: Double): Buffer | js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("concat")(list.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Buffer | js.Array[Any]]
    
    /**
      * Is the given object a {NoFilter}?
      *
      * @param {object} obj The object to test.
      * @returns {boolean} True if obj is a NoFilter.
      */
    inline def isNoFilter(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNoFilter")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  trait NoFilterOptions extends StObject {
    
    /**
      * If set to false, then the
      * stream will automatically end the writable side when the readable side
      * ends.
      */
    var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether this stream should
      * automatically call .destroy() on itself after ending.
      */
    var autoDestroy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether or not to decode
      * strings into Buffers before passing them to _write().
      */
    var decodeStrings: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The default encoding
      * that is used when no encoding is specified as an argument to
      * stream.write().
      */
    var defaultEncoding: js.UndefOr[BufferEncoding] = js.undefined
    
    /**
      * Whether or not the stream should
      * emit 'close' after it has been destroyed.
      */
    var emitClose: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If specified, then buffers
      * will be decoded to strings using the specified encoding.
      */
    var encoding: js.UndefOr[BufferEncoding] = js.undefined
    
    /**
      * The maximum number of bytes to
      * store in the internal buffer before ceasing to read from the underlying
      * resource. Default=16kb, or 16 for objectMode streams.
      */
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    /**
      * Input source data.
      */
    var input: js.UndefOr[String | Buffer] = js.undefined
    
    /**
      * Encoding name for input,
      * ignored if input is not a String.
      */
    var inputEncoding: js.UndefOr[BufferEncoding] = js.undefined
    
    /**
      * Whether this stream should behave
      * as a stream of objects. Meaning that stream.read(n) returns a single
      * value instead of a Buffer of size n.
      */
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true, when a read() underflows,
      * throw an error.
      */
    var readError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets highWaterMark for the
      * readable side of the stream. Has no effect if highWaterMark is provided.
      */
    var readableHighWaterMark: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets objectMode for
      * readable side of the stream. Has no effect if objectMode is true.
      */
    var readableObjectMode: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to watch for 'pipe' events,
      * setting this stream's objectMode based on the objectMode of the input
      * stream.
      */
    var watchPipe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets highWaterMark for the
      * writable side of the stream. Has no effect if highWaterMark is provided.
      */
    var writableHighWaterMark: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets objectMode for
      * writable side of the stream. Has no effect if objectMode is true.
      */
    var writableObjectMode: js.UndefOr[Boolean] = js.undefined
  }
  object NoFilterOptions {
    
    inline def apply(): NoFilterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoFilterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NoFilterOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowHalfOpen(value: Boolean): Self = StObject.set(x, "allowHalfOpen", value.asInstanceOf[js.Any])
      
      inline def setAllowHalfOpenUndefined: Self = StObject.set(x, "allowHalfOpen", js.undefined)
      
      inline def setAutoDestroy(value: Boolean): Self = StObject.set(x, "autoDestroy", value.asInstanceOf[js.Any])
      
      inline def setAutoDestroyUndefined: Self = StObject.set(x, "autoDestroy", js.undefined)
      
      inline def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
      
      inline def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
      
      inline def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      inline def setEmitClose(value: Boolean): Self = StObject.set(x, "emitClose", value.asInstanceOf[js.Any])
      
      inline def setEmitCloseUndefined: Self = StObject.set(x, "emitClose", js.undefined)
      
      inline def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setInput(value: String | Buffer): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputEncoding(value: BufferEncoding): Self = StObject.set(x, "inputEncoding", value.asInstanceOf[js.Any])
      
      inline def setInputEncodingUndefined: Self = StObject.set(x, "inputEncoding", js.undefined)
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setReadError(value: Boolean): Self = StObject.set(x, "readError", value.asInstanceOf[js.Any])
      
      inline def setReadErrorUndefined: Self = StObject.set(x, "readError", js.undefined)
      
      inline def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
      
      inline def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
      
      inline def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
      
      inline def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
      
      inline def setWatchPipe(value: Boolean): Self = StObject.set(x, "watchPipe", value.asInstanceOf[js.Any])
      
      inline def setWatchPipeUndefined: Self = StObject.set(x, "watchPipe", js.undefined)
      
      inline def setWritableHighWaterMark(value: Double): Self = StObject.set(x, "writableHighWaterMark", value.asInstanceOf[js.Any])
      
      inline def setWritableHighWaterMarkUndefined: Self = StObject.set(x, "writableHighWaterMark", js.undefined)
      
      inline def setWritableObjectMode(value: Boolean): Self = StObject.set(x, "writableObjectMode", value.asInstanceOf[js.Any])
      
      inline def setWritableObjectModeUndefined: Self = StObject.set(x, "writableObjectMode", js.undefined)
    }
  }
}
