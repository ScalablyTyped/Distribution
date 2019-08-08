package typings.newrelic.newrelicMod

import org.scalablytyped.runtime.StringDictionary
import typings.newrelic.Anon_CollectPendingData
import typings.std.Error
import typings.std.RegExp
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
  def addCustomAttribute(key: String, value: String): Unit = js.native
  def addCustomAttribute(key: String, value: Double): Unit = js.native
  def addCustomAttributes(atts: StringDictionary[String | Double]): Unit = js.native
  def addIgnoringRule(pattern: String): Unit = js.native
  def addIgnoringRule(pattern: RegExp): Unit = js.native
  def addNamingRule(pattern: String, name: String): Unit = js.native
  def addNamingRule(pattern: RegExp, name: String): Unit = js.native
  def createTracer[T /* <: js.Function1[/* repeated */ js.Any, _] */](name: String, handle: T): T = js.native
  def endTransaction(): Unit = js.native
  def getBrowserTimingHeader(): String = js.native
  def getTransaction(): TransactionHandle = js.native
  def incrementMetric(name: String): Unit = js.native
  def incrementMetric(name: String, value: Double): Unit = js.native
  def noticeError(error: Error): Unit = js.native
  def noticeError(error: Error, customAttributes: StringDictionary[String]): Unit = js.native
  def recordCustomEvent(eventType: String, attributes: StringDictionary[Boolean | Double | String]): Unit = js.native
  def recordMetric(name: String, value: Double): Unit = js.native
  def recordMetric(name: String, value: Metric): Unit = js.native
  def setControllerName(name: String, action: String): Unit = js.native
  def setDispatcher(name: String): Unit = js.native
  def setDispatcher(name: String, version: String): Unit = js.native
  def setIgnoreTransaction(ignored: Boolean): Unit = js.native
  def setLambdaHandler[T](handler: js.Function1[/* repeated */ js.Any, T]): T = js.native
  def setTransactionName(name: String): Unit = js.native
  def shutdown(): Unit = js.native
  def shutdown(cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def shutdown(options: Anon_CollectPendingData): Unit = js.native
  def shutdown(options: Anon_CollectPendingData, cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): Unit = js.native
  def startBackgroundTransaction[T](name: String, group: String, handle: js.Function1[/* repeated */ js.Any, T]): T = js.native
  def startBackgroundTransaction[T](name: String, group: String, handle: js.Promise[T]): js.Promise[T] = js.native
  def startBackgroundTransaction[T](name: String, handle: js.Function1[/* repeated */ js.Any, T]): T = js.native
  def startBackgroundTransaction[T](name: String, handle: js.Promise[T]): js.Promise[T] = js.native
  def startSegment[T /* <: js.Thenable[_] */](name: String, record: Boolean, handler: T): T = js.native
  def startSegment[T, C /* <: js.Function1[/* repeated */ js.Any, _] */](name: String, record: Boolean, handler: js.Function1[/* cb */ js.UndefOr[C], T]): T = js.native
  def startSegment[T, C /* <: js.Function1[/* repeated */ js.Any, _] */](name: String, record: Boolean, handler: js.Function1[/* cb */ js.UndefOr[C], T], callback: C): T = js.native
  def startWebTransaction[T](url: String, handle: js.Function1[/* repeated */ js.Any, T]): T = js.native
  def startWebTransaction[T](url: String, handle: js.Promise[T]): js.Promise[T] = js.native
}

