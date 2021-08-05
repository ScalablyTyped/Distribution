package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFDataRangeTransport extends StObject {
  
  def abort(): Unit
  
  def addProgressListener(listener: PDFDataRangeTransportListener): Unit
  
  def addProgressiveDoneListener(listener: PDFDataRangeTransportListener): Unit
  
  def addProgressiveReadListener(listener: PDFDataRangeTransportListener): Unit
  
  def addRangeListener(listener: PDFDataRangeTransportListener): Unit
  
  def onDataProgress(loaded: Double, total: Double): Unit
  
  def onDataProgressiveDone(): Unit
  
  def onDataProgressiveRead(chunk: js.Any): Unit
  
  def onDataRange(begin: Double, chunk: js.Any): Unit
  
  def requestDataRange(begin: Double, end: Double): Unit
  
  def transportReady(): Unit
}
object PDFDataRangeTransport {
  
  inline def apply(
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
  
  extension [Self <: PDFDataRangeTransport](x: Self) {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setAddProgressListener(value: PDFDataRangeTransportListener => Unit): Self = StObject.set(x, "addProgressListener", js.Any.fromFunction1(value))
    
    inline def setAddProgressiveDoneListener(value: PDFDataRangeTransportListener => Unit): Self = StObject.set(x, "addProgressiveDoneListener", js.Any.fromFunction1(value))
    
    inline def setAddProgressiveReadListener(value: PDFDataRangeTransportListener => Unit): Self = StObject.set(x, "addProgressiveReadListener", js.Any.fromFunction1(value))
    
    inline def setAddRangeListener(value: PDFDataRangeTransportListener => Unit): Self = StObject.set(x, "addRangeListener", js.Any.fromFunction1(value))
    
    inline def setOnDataProgress(value: (Double, Double) => Unit): Self = StObject.set(x, "onDataProgress", js.Any.fromFunction2(value))
    
    inline def setOnDataProgressiveDone(value: () => Unit): Self = StObject.set(x, "onDataProgressiveDone", js.Any.fromFunction0(value))
    
    inline def setOnDataProgressiveRead(value: js.Any => Unit): Self = StObject.set(x, "onDataProgressiveRead", js.Any.fromFunction1(value))
    
    inline def setOnDataRange(value: (Double, js.Any) => Unit): Self = StObject.set(x, "onDataRange", js.Any.fromFunction2(value))
    
    inline def setRequestDataRange(value: (Double, Double) => Unit): Self = StObject.set(x, "requestDataRange", js.Any.fromFunction2(value))
    
    inline def setTransportReady(value: () => Unit): Self = StObject.set(x, "transportReady", js.Any.fromFunction0(value))
  }
}
