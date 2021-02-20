package typings.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for enqueuing and dequeuing Oracle Advanced Queuing messages. Each can be used for enqueuing, dequeuing, or for both.
  * 
  * @see https://oracle.github.io/node-oracledb/doc/api.html#aq
  * @since 4.0
  */
@js.native
trait AdvancedQueue[T] extends StObject {
  
  /**
    * Dequeues up to the specified number of messages
    * 
    * @param maxMessages Maximum number of messages to dequeue.
    */
  def deqMany(maxMessages: Double): js.Promise[js.Array[AdvancedQueueMessage[T]]] = js.native
  def deqMany(
    maxMessages: Double,
    callback: js.Function2[/* error */ DBError, /* messages */ js.Array[AdvancedQueueMessage[T]], Unit]
  ): Unit = js.native
  
  /**
    * Dequeues a single message. Depending on the dequeue options, the message may also be returned as undefined if no message is available.
    */
  def deqOne(): js.Promise[js.UndefOr[AdvancedQueueMessage[T]]] = js.native
  def deqOne(
    callback: js.Function2[/* error */ DBError, /* message */ js.UndefOr[AdvancedQueueMessage[T]], Unit]
  ): Unit = js.native
  
  /** Options to use when dequeuing messages. Attributes can be set before each queue.deqOne() or queue.deqMany(). */
  var deqOptions: DequeueOptions = js.native
  
  /**
    * Enqueues multiple messages.
    * 
    * Warning: calling enqMany() in parallel on different connections acquired from the same pool may fail due to Oracle bug 29928074.
    * Ensure that enqMany() is not run in parallel, use standalone connections, or make multiple calls to enqOne().
    * The deqMany() method is not affected.
    * 
    * @param messages Messages to enqueue.
    */
  def enqMany(messages: js.Array[EnqueueMessage[T]]): js.Promise[Unit] = js.native
  def enqMany(messages: js.Array[EnqueueMessage[T]], callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  
  /**
    * Enqueues a single message.
    * 
    * @param message 
    */
  def enqOne(message: EnqueueMessage[T]): js.Promise[Unit] = js.native
  def enqOne(message: EnqueueMessage[T], callback: js.Function1[/* error */ DBError, Unit]): Unit = js.native
  
  /** Options to use when enqueuing messages. Attributes can be set before each queue.enqOne() or queue.denqMany(). */
  var enqOptions: EnqueueOptions = js.native
  
  /** Contains the name of the queue specified in the connection.getQueue() call. */
  val name: String = js.native
  
  /** One of the DB_TYPE_RAW or DB_TYPE_OBJECT constants. */
  val payloadType: Double = js.native
  
  /**
    * The DBObject Class corresponding to the payload type specified when the queue was created
    * 
    * This is defined only if payloadType has the value oracledb.DB_TYPE_OBJECT.
    */
  val payloadTypeClass: js.UndefOr[DBObjectClass[T]] = js.native
  
  /** Either the string “RAW” or the name of the Oracle Database object type identified when the queue was created. */
  val payloadTypeName: String = js.native
}
