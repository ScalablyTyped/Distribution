package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PDFDataRangeTransport extends js.Object {
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
}

