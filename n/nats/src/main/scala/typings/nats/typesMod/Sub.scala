package typings.nats.typesMod

import typings.nats.errorMod.NatsError
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sub[T]
  extends StObject
     with AsyncIterable[T] {
  
  def callback(err: Null, msg: Msg): Unit = js.native
  def callback(err: NatsError, msg: Msg): Unit = js.native
  
  var closed: js.Promise[Unit] = js.native
  
  def drain(): js.Promise[Unit] = js.native
  
  def getID(): Double = js.native
  
  def getMax(): js.UndefOr[Double] = js.native
  
  def getPending(): Double = js.native
  
  def getProcessed(): Double = js.native
  
  def getReceived(): Double = js.native
  
  def getSubject(): String = js.native
  
  def isClosed(): Boolean = js.native
  
  def isDraining(): Boolean = js.native
  
  def unsubscribe(): Unit = js.native
  def unsubscribe(max: Double): Unit = js.native
}
