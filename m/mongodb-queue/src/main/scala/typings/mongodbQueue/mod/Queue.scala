package typings.mongodbQueue.mod

import typings.mongodb.mod.Db
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb-queue", "Queue")
@js.native
class Queue protected () extends js.Object {
  def this(db: Db, name: String) = this()
  def this(db: Db, name: String, opts: QueueOptions) = this()
  
  def ack(ack: String, callback: QueueCallback[String]): Unit = js.native
  
  def add(payload: ArrayPayload, callback: QueueCallback[js.Array[String]]): Unit = js.native
  def add(payload: ArrayPayload, opts: QueueOptions, callback: QueueCallback[js.Array[String]]): Unit = js.native
  def add(payload: Payload, callback: QueueCallback[String]): Unit = js.native
  def add(payload: Payload, opts: QueueOptions, callback: QueueCallback[String]): Unit = js.native
  
  def clean(callback: QueueCallback[_]): Unit = js.native
  
  def createIndexes(callback: QueueCallback[String]): Unit = js.native
  
  def done(callback: QueueCallback[Double]): Unit = js.native
  
  def get(callback: QueueCallback[js.UndefOr[QueueMessage]]): Unit = js.native
  def get(opts: QueueOptions, callback: QueueCallback[js.UndefOr[QueueMessage]]): Unit = js.native
  
  def inflight(callback: QueueCallback[Double]): Unit = js.native
  
  def ping(ack: String, callback: QueueCallback[String]): Unit = js.native
  def ping(ack: String, opts: QueueOptions, callback: QueueCallback[String]): Unit = js.native
  
  def size(callback: QueueCallback[Double]): Unit = js.native
  
  def total(callback: QueueCallback[Double]): Unit = js.native
}
