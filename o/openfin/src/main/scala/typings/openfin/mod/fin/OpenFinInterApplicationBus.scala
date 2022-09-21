package typings.openfin.mod.fin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InterApplicationBus
  * A messaging bus that allows for pub/sub messaging between different applications.
  */
@js.native
trait OpenFinInterApplicationBus extends StObject {
  
  /**
    * Adds a listener that gets called when applications subscribe to the current application's messages.
    */
  def addSubscribeListener(listener: js.Function3[/* uuid */ String, /* topic */ String, /* name */ String, Unit]): Unit = js.native
  
  /**
    * Adds a listener that gets called when applications unsubscribe to the current application's messages.
    */
  def addUnsubscribeListener(listener: js.Function3[/* uuid */ String, /* topic */ String, /* name */ String, Unit]): Unit = js.native
  
  /**
    * Publishes a message to all applications running on OpenFin Runtime that are subscribed to the specified topic.
    */
  def publish(topic: String, message: Any): Unit = js.native
  def publish(topic: String, message: Any, callback: js.Function0[Unit]): Unit = js.native
  def publish(
    topic: String,
    message: Any,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def publish(
    topic: String,
    message: Any,
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Removes a previously registered subscribe listener.
    */
  def removeSubscribeListener(listener: js.Function3[/* uuid */ String, /* topic */ String, /* name */ String, Unit]): Unit = js.native
  
  /**
    * Removes a previously registered unsubscribe listener.
    */
  def removeUnsubscribeListener(listener: js.Function3[/* uuid */ String, /* topic */ String, /* name */ String, Unit]): Unit = js.native
  
  /**
    * Sends a message to a specific application on a specific topic.
    */
  def send(destinationUuid: String, name: String, topic: String, message: Any): Unit = js.native
  def send(destinationUuid: String, name: String, topic: String, message: Any, callback: js.Function0[Unit]): Unit = js.native
  def send(
    destinationUuid: String,
    name: String,
    topic: String,
    message: Any,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def send(
    destinationUuid: String,
    name: String,
    topic: String,
    message: Any,
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def send(destinationUuid: String, topic: String, message: Any): Unit = js.native
  def send(destinationUuid: String, topic: String, message: Any, callback: js.Function0[Unit]): Unit = js.native
  def send(
    destinationUuid: String,
    topic: String,
    message: Any,
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def send(
    destinationUuid: String,
    topic: String,
    message: Any,
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Subscribes to messages from the specified application on the specified topic. If the subscription is for a uuid, [name],
    * topic combination that has already been published to upon subscription you will receive the last 20 missed messages in the order they were published.
    */
  def subscribe(
    senderUuid: String,
    name: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit]
  ): Unit = js.native
  def subscribe(
    senderUuid: String,
    name: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def subscribe(
    senderUuid: String,
    name: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def subscribe(
    senderUuid: String,
    name: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit],
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def subscribe(
    senderUuid: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit]
  ): Unit = js.native
  def subscribe(
    senderUuid: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def subscribe(
    senderUuid: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def subscribe(
    senderUuid: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit],
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  
  /**
    * Unsubscribes to messages from the specified application on the specified topic.
    */
  def unsubscribe(
    senderUuid: String,
    name: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit]
  ): Unit = js.native
  def unsubscribe(
    senderUuid: String,
    name: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def unsubscribe(
    senderUuid: String,
    name: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def unsubscribe(
    senderUuid: String,
    name: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit],
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def unsubscribe(
    senderUuid: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit]
  ): Unit = js.native
  def unsubscribe(
    senderUuid: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def unsubscribe(
    senderUuid: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit],
    callback: js.Function0[Unit],
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
  def unsubscribe(
    senderUuid: String,
    topic: String,
    listener: js.Function3[/* message */ Any, /* uuid */ String, /* name */ String, Unit],
    callback: Unit,
    errorCallback: js.Function1[/* reason */ String, Unit]
  ): Unit = js.native
}
