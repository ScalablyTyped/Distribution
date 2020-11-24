package typings.nodeInsights.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Insights extends js.Object {
  
  /**
    * Add insights data to the queue.
    * It is sent when the queue reaches a max size or a period of time has elapsed
    */
  def add(data: js.Object): Unit = js.native
  def add(data: js.Object, eventType: String): Unit = js.native
  
  var enabled: Boolean = js.native
  
  /**
    * Stop the timer after flushing.
    */
  def finish(): Unit = js.native
  
  var insertKey: String = js.native
  
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
  def nrql(params: js.Object): String = js.native
  
  /**
    * Execute a nrql query
    */
  def query(query: String, callback: CallbackFunc): Unit = js.native
  
  var queryKey: String = js.native
  
  /**
    * Send accumulated insights data to new relic (if enabled)
    */
  def send(): Unit = js.native
  def send(done: CallbackFunc): Unit = js.native
  
  /**
    * Start the timer that will send insights after some interval of time
    * this is called implicitly when data is added via the add method
    */
  def start(): Unit = js.native
  
  /**
    * Stop the timer that will send insights after some interval of time
    * this is called implicitly when the amount of data exceeds maxPending and the queue is sent
    */
  def stop(): Unit = js.native
  
  /**
    * nrql where clause builder
    */
  def where(clause: String): String = js.native
  def where(clause: js.Array[String]): String = js.native
  def where(clause: js.Object): String = js.native
}
