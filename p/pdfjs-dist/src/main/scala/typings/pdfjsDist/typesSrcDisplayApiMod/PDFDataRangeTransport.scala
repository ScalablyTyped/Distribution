package typings.pdfjsDist.typesSrcDisplayApiMod

import typings.pdfjsDist.typesSrcSharedUtilMod.PromiseCapability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist/types/src/display/api", "PDFDataRangeTransport")
@js.native
open class PDFDataRangeTransport protected () extends StObject {
  /**
    * @param {number} length
    * @param {Uint8Array|null} initialData
    * @param {boolean} [progressiveDone]
    * @param {string} [contentDispositionFilename]
    */
  def this(length: Double) = this()
  def this(length: Double, initialData: js.typedarray.Uint8Array) = this()
  def this(length: Double, initialData: js.typedarray.Uint8Array, progressiveDone: Boolean) = this()
  def this(length: Double, initialData: Null, progressiveDone: Boolean) = this()
  def this(
    length: Double,
    initialData: js.typedarray.Uint8Array,
    progressiveDone: Boolean,
    contentDispositionFilename: String
  ) = this()
  def this(
    length: Double,
    initialData: js.typedarray.Uint8Array,
    progressiveDone: Unit,
    contentDispositionFilename: String
  ) = this()
  def this(length: Double, initialData: Null, progressiveDone: Boolean, contentDispositionFilename: String) = this()
  def this(length: Double, initialData: Null, progressiveDone: Unit, contentDispositionFilename: String) = this()
  
  var _progressListeners: js.Array[Any] = js.native
  
  var _progressiveDoneListeners: js.Array[Any] = js.native
  
  var _progressiveReadListeners: js.Array[Any] = js.native
  
  var _rangeListeners: js.Array[Any] = js.native
  
  var _readyCapability: PromiseCapability = js.native
  
  def abort(): Unit = js.native
  
  /**
    * @param {function} listener
    */
  def addProgressListener(listener: js.Function): Unit = js.native
  
  /**
    * @param {function} listener
    */
  def addProgressiveDoneListener(listener: js.Function): Unit = js.native
  
  /**
    * @param {function} listener
    */
  def addProgressiveReadListener(listener: js.Function): Unit = js.native
  
  /**
    * @param {function} listener
    */
  def addRangeListener(listener: js.Function): Unit = js.native
  
  var contentDispositionFilename: String = js.native
  
  var initialData: js.typedarray.Uint8Array | Null = js.native
  
  var length: Double = js.native
  
  /**
    * @param {number} loaded
    * @param {number|undefined} total
    */
  def onDataProgress(loaded: Double): Unit = js.native
  def onDataProgress(loaded: Double, total: Double): Unit = js.native
  
  def onDataProgressiveDone(): Unit = js.native
  
  /**
    * @param {Uint8Array|null} chunk
    */
  def onDataProgressiveRead(): Unit = js.native
  def onDataProgressiveRead(chunk: js.typedarray.Uint8Array): Unit = js.native
  
  /**
    * @param {number} begin
    * @param {Uint8Array|null} chunk
    */
  def onDataRange(begin: Double): Unit = js.native
  def onDataRange(begin: Double, chunk: js.typedarray.Uint8Array): Unit = js.native
  
  var progressiveDone: Boolean = js.native
  
  /**
    * @param {number} begin
    * @param {number} end
    */
  def requestDataRange(begin: Double, end: Double): Unit = js.native
  
  def transportReady(): Unit = js.native
}
