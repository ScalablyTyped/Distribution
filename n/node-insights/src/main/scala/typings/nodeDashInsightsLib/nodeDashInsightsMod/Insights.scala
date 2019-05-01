package typings
package nodeDashInsightsLib.nodeDashInsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Insights extends js.Object {
  var enabled: scala.Boolean = js.native
  var insertKey: java.lang.String = js.native
  var queryKey: java.lang.String = js.native
  /**
    * Add insights data to the queue.
    * It is sent when the queue reaches a max size or a period of time has elapsed
    */
  def add(data: js.Object): scala.Unit = js.native
  def add(data: js.Object, eventType: java.lang.String): scala.Unit = js.native
  /**
    * Stop the timer after flushing.
    */
  def finish(): scala.Unit = js.native
  /**
    * Build a nrql query string
    * @example
    *    nrql = insights.nrql({
    *      select: 'uniqueCount(session)',
    *      from: 'PageView',
    *      since: '1 week ago',
    *      until: '1 day ago',
    *      timeseries: '1 hour'
    *   });
    *   insights.query(nrql);
    */
  def nrql(params: js.Object): java.lang.String = js.native
  /**
    * Execute a nrql query
    */
  def query(query: java.lang.String, callback: CallbackFunc): scala.Unit = js.native
  /**
    * Send accumulated insights data to new relic (if enabled)
    */
  def send(): scala.Unit = js.native
  def send(done: CallbackFunc): scala.Unit = js.native
  /**
    * Start the timer that will send insights after some interval of time
    * this is called implicitly when data is added via the add method
    */
  def start(): scala.Unit = js.native
  /**
    * Stop the timer that will send insights after some interval of time
    * this is called implicitly when the amount of data exceeds maxPending and the queue is sent
    */
  def stop(): scala.Unit = js.native
  /**
    * nrql where clause builder
    */
  def where(clause: java.lang.String): java.lang.String = js.native
  def where(clause: js.Array[java.lang.String]): java.lang.String = js.native
  def where(clause: js.Object): java.lang.String = js.native
}

