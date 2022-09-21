package typings.nats.typesMod

import typings.nats.anon.PartialNextRequest
import typings.nats.headersMod.MsgHdrs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JsMsg extends StObject {
  
  def ack(): Unit = js.native
  
  def ackAck(): js.Promise[Boolean] = js.native
  
  var data: js.typedarray.Uint8Array = js.native
  
  var headers: js.UndefOr[MsgHdrs] = js.native
  
  var info: DeliveryInfo = js.native
  
  def nak(): Unit = js.native
  def nak(millis: Double): Unit = js.native
  
  /**
    * next() combines ack() and pull(), requires the subject for a
    * subscription processing to process a message is provided
    * (can be the same) however, because the ability to specify
    * how long to keep the request open can be specified, this
    * functionality doesn't work well with iterators, as an error
    * (408s) are expected and needed to re-trigger a pull in case
    * there was a timeout. In an iterator, the error will close
    * the iterator, requiring a subscription to be reset.
    */
  def next(subj: String): Unit = js.native
  def next(subj: String, ro: PartialNextRequest): Unit = js.native
  
  var redelivered: Boolean = js.native
  
  var seq: Double = js.native
  
  var sid: Double = js.native
  
  var subject: String = js.native
  
  def term(): Unit = js.native
  
  def working(): Unit = js.native
}
