package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFDataRangeTransport extends StObject {
  
  def abort(): Unit = js.native
  
  def addProgressListener(listener: PDFDataRangeTransportListener): Unit = js.native
  
  def addProgressiveDoneListener(listener: PDFDataRangeTransportListener): Unit = js.native
  
  def addProgressiveReadListener(listener: PDFDataRangeTransportListener): Unit = js.native
  
  def addRangeListener(listener: PDFDataRangeTransportListener): Unit = js.native
  
  def onDataProgress(loaded: Double, total: Double): Unit = js.native
  
  def onDataProgressiveDone(): Unit = js.native
  
  def onDataProgressiveRead(chunk: js.Any): Unit = js.native
  
  def onDataRange(begin: Double, chunk: js.Any): Unit = js.native
  
  def requestDataRange(begin: Double, end: Double): Unit = js.native
  
  def transportReady(): Unit = js.native
}
object PDFDataRangeTransport {
  
  @scala.inline
  def apply(
    abort: () => Unit,
    addProgressListener: PDFDataRangeTransportListener => Unit,
    addProgressiveDoneListener: PDFDataRangeTransportListener => Unit,
    addProgressiveReadListener: PDFDataRangeTransportListener => Unit,
    addRangeListener: PDFDataRangeTransportListener => Unit,
    onDataProgress: (Double, Double) => Unit,
    onDataProgressiveDone: () => Unit,
    onDataProgressiveRead: js.Any => Unit,
    onDataRange: (Double, js.Any) => Unit,
    requestDataRange: (Double, Double) => Unit,
    transportReady: () => Unit
  ): PDFDataRangeTransport = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), addProgressListener = js.Any.fromFunction1(addProgressListener), addProgressiveDoneListener = js.Any.fromFunction1(addProgressiveDoneListener), addProgressiveReadListener = js.Any.fromFunction1(addProgressiveReadListener), addRangeListener = js.Any.fromFunction1(addRangeListener), onDataProgress = js.Any.fromFunction2(onDataProgress), onDataProgressiveDone = js.Any.fromFunction0(onDataProgressiveDone), onDataProgressiveRead = js.Any.fromFunction1(onDataProgressiveRead), onDataRange = js.Any.fromFunction2(onDataRange), requestDataRange = js.Any.fromFunction2(requestDataRange), transportReady = js.Any.fromFunction0(transportReady))
    __obj.asInstanceOf[PDFDataRangeTransport]
  }
  
  @scala.inline
  implicit class PDFDataRangeTransportMutableBuilder[Self <: PDFDataRangeTransport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAddProgressListener(value: PDFDataRangeTransportListener => Unit): Self = StObject.set(x, "addProgressListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddProgressiveDoneListener(value: PDFDataRangeTransportListener => Unit): Self = StObject.set(x, "addProgressiveDoneListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddProgressiveReadListener(value: PDFDataRangeTransportListener => Unit): Self = StObject.set(x, "addProgressiveReadListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddRangeListener(value: PDFDataRangeTransportListener => Unit): Self = StObject.set(x, "addRangeListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDataProgress(value: (Double, Double) => Unit): Self = StObject.set(x, "onDataProgress", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDataProgressiveDone(value: () => Unit): Self = StObject.set(x, "onDataProgressiveDone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDataProgressiveRead(value: js.Any => Unit): Self = StObject.set(x, "onDataProgressiveRead", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDataRange(value: (Double, js.Any) => Unit): Self = StObject.set(x, "onDataRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRequestDataRange(value: (Double, Double) => Unit): Self = StObject.set(x, "requestDataRange", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTransportReady(value: () => Unit): Self = StObject.set(x, "transportReady", js.Any.fromFunction0(value))
  }
}
