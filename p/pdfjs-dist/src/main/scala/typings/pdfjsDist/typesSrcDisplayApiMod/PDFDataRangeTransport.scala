package typings.pdfjsDist.typesSrcDisplayApiMod

import typings.pdfjsDist.typesSrcSharedUtilMod.PromiseCapability
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pdfjs-dist/types/src/display/api", "PDFDataRangeTransport")
@js.native
open class PDFDataRangeTransport protected ()
  extends StObject
     with _GetDocumentParameters {
  /**
    * @param {number} length
    * @param {Uint8Array} initialData
    * @param {boolean} [progressiveDone]
    * @param {string} [contentDispositionFilename]
    */
  def this(length: Double, initialData: js.typedarray.Uint8Array) = this()
  def this(length: Double, initialData: js.typedarray.Uint8Array, progressiveDone: Boolean) = this()
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
  
  var _progressListeners: js.Array[Any] = js.native
  
  var _progressiveDoneListeners: js.Array[Any] = js.native
  
  var _progressiveReadListeners: js.Array[Any] = js.native
  
  var _rangeListeners: js.Array[Any] = js.native
  
  var _readyCapability: PromiseCapability = js.native
  
  def abort(): Unit = js.native
  
  def addProgressListener(listener: Any): Unit = js.native
  
  def addProgressiveDoneListener(listener: Any): Unit = js.native
  
  def addProgressiveReadListener(listener: Any): Unit = js.native
  
  def addRangeListener(listener: Any): Unit = js.native
  
  var contentDispositionFilename: String = js.native
  
  var initialData: js.typedarray.Uint8Array = js.native
  
  var length: Double = js.native
  
  def onDataProgress(loaded: Any, total: Any): Unit = js.native
  
  def onDataProgressiveDone(): Unit = js.native
  
  def onDataProgressiveRead(chunk: Any): Unit = js.native
  
  def onDataRange(begin: Any, chunk: Any): Unit = js.native
  
  var progressiveDone: Boolean = js.native
  
  def requestDataRange(begin: Any, end: Any): Unit = js.native
  
  def transportReady(): Unit = js.native
}
