package typings.pdfjsDist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFDataRangeTransport extends js.Object {
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
  implicit class PDFDataRangeTransportOps[Self <: PDFDataRangeTransport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAbort(value: () => Unit): Self = this.set("abort", js.Any.fromFunction0(value))
    @scala.inline
    def setAddProgressListener(value: PDFDataRangeTransportListener => Unit): Self = this.set("addProgressListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddProgressiveDoneListener(value: PDFDataRangeTransportListener => Unit): Self = this.set("addProgressiveDoneListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddProgressiveReadListener(value: PDFDataRangeTransportListener => Unit): Self = this.set("addProgressiveReadListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAddRangeListener(value: PDFDataRangeTransportListener => Unit): Self = this.set("addRangeListener", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDataProgress(value: (Double, Double) => Unit): Self = this.set("onDataProgress", js.Any.fromFunction2(value))
    @scala.inline
    def setOnDataProgressiveDone(value: () => Unit): Self = this.set("onDataProgressiveDone", js.Any.fromFunction0(value))
    @scala.inline
    def setOnDataProgressiveRead(value: js.Any => Unit): Self = this.set("onDataProgressiveRead", js.Any.fromFunction1(value))
    @scala.inline
    def setOnDataRange(value: (Double, js.Any) => Unit): Self = this.set("onDataRange", js.Any.fromFunction2(value))
    @scala.inline
    def setRequestDataRange(value: (Double, Double) => Unit): Self = this.set("requestDataRange", js.Any.fromFunction2(value))
    @scala.inline
    def setTransportReady(value: () => Unit): Self = this.set("transportReady", js.Any.fromFunction0(value))
  }
  
}

