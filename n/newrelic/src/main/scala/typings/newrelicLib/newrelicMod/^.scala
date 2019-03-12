package typings
package newrelicLib.newrelicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("newrelic", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val instrument: Instrument = js.native
  val instrumentDatastore: Instrument = js.native
  val instrumentMessages: Instrument = js.native
  val instrumentWebframework: Instrument = js.native
  def addCustomAttribute(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def addCustomAttribute(key: java.lang.String, value: scala.Double): scala.Unit = js.native
  def addCustomAttributes(atts: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]): scala.Unit = js.native
  def addIgnoringRule(pattern: java.lang.String): scala.Unit = js.native
  def addIgnoringRule(pattern: stdLib.RegExp): scala.Unit = js.native
  def addNamingRule(pattern: java.lang.String, name: java.lang.String): scala.Unit = js.native
  def addNamingRule(pattern: stdLib.RegExp, name: java.lang.String): scala.Unit = js.native
  def createTracer[T /* <: js.Function1[/* repeated */ js.Any, _] */](name: java.lang.String, handle: T): T = js.native
  def endTransaction(): scala.Unit = js.native
  def getBrowserTimingHeader(): java.lang.String = js.native
  def getTransaction(): TransactionHandle = js.native
  def incrementMetric(name: java.lang.String): scala.Unit = js.native
  def incrementMetric(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def noticeError(error: stdLib.Error): scala.Unit = js.native
  def noticeError(
    error: stdLib.Error,
    customAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): scala.Unit = js.native
  def recordCustomEvent(
    eventType: java.lang.String,
    attributes: org.scalablytyped.runtime.StringDictionary[scala.Boolean | scala.Double | java.lang.String]
  ): scala.Unit = js.native
  def recordMetric(name: java.lang.String, value: Metric): scala.Unit = js.native
  def recordMetric(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  def setControllerName(name: java.lang.String, action: java.lang.String): scala.Unit = js.native
  def setDispatcher(name: java.lang.String): scala.Unit = js.native
  def setDispatcher(name: java.lang.String, version: java.lang.String): scala.Unit = js.native
  def setIgnoreTransaction(ignored: scala.Boolean): scala.Unit = js.native
  def setLambdaHandler[T](handler: js.Function1[/* repeated */ js.Any, T]): T = js.native
  def setTransactionName(name: java.lang.String): scala.Unit = js.native
  def shutdown(): scala.Unit = js.native
  def shutdown(cb: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]): scala.Unit = js.native
  def shutdown(options: newrelicLib.Anon_CollectPendingData): scala.Unit = js.native
  def shutdown(
    options: newrelicLib.Anon_CollectPendingData,
    cb: js.Function1[/* error */ js.UndefOr[stdLib.Error], scala.Unit]
  ): scala.Unit = js.native
  def startBackgroundTransaction(name: java.lang.String, group: java.lang.String, handle: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def startBackgroundTransaction(name: java.lang.String, handle: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
  def startSegment[T /* <: js.Thenable[_] */](name: java.lang.String, record: scala.Boolean, handler: T): T = js.native
  def startSegment[T, C /* <: js.Function1[/* repeated */ js.Any, _] */](name: java.lang.String, record: scala.Boolean, handler: js.Function1[/* cb */ js.UndefOr[C], T]): T = js.native
  def startSegment[T, C /* <: js.Function1[/* repeated */ js.Any, _] */](
    name: java.lang.String,
    record: scala.Boolean,
    handler: js.Function1[/* cb */ js.UndefOr[C], T],
    callback: C
  ): T = js.native
  def startWebTransaction(url: java.lang.String, handle: js.Function1[/* repeated */ js.Any, _]): js.Any = js.native
}

