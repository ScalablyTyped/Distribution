package typings.pahoMqtt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The JavaScript application communicates to the server using a {@link Paho.MQTT.Client} object.
  *
  * Most applications will create just one Client object and then call its connect() method,
  * however applications can create more than one Client object if they wish.
  * In this case the combination of host, port and clientId attributes must be different for each Client object.
  *
  * The send, subscribe and unsubscribe methods are implemented as asynchronous JavaScript methods
  * (even though the underlying protocol exchange might be synchronous in nature).
  * This means they signal their completion by calling back to the application,
  * via Success or Failure callback functions provided by the application on the method in question.
  * Such callbacks are called at most once per method invocation and do not persist beyond the lifetime
  * of the script that made the invocation.
  *
  * In contrast there are some callback functions, most notably {@link onMessageArrived},
  * that are defined on the {@link Paho.MQTT.Client} object.
  * These may get called multiple times, and aren't directly related to specific method invocations made by the
  * client.
  *
  */
@JSImport("paho-mqtt", "Client")
@js.native
class Client protected ()
  extends typings.pahoMqtt.mod.global.Paho.MQTT.Client {
  /**
    * @param hostUri - the address of the messaging server as a fully qualified WebSocket URI
    * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
    */
  def this(hostUri: String, clientId: String) = this()
   // tslint:disable-line unified-signatures (these cannot actually be neatly unified)
  /**
    * @param host - the address of the messaging server as a DNS name or dotted decimal IP address.
    * @param port - the port number to connect to
    * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
    */
  def this(host: String, port: Double, clientId: String) = this()
  /**
    * @param host - the address of the messaging server as a DNS name or dotted decimal IP address.
    * @param port - the port number to connect to
    * @param path - the path on the host to connect to - only used if host is not a URI. Default: '/mqtt'.
    * @param clientId - the Messaging client identifier, between 1 and 23 characters in length.
    */
  def this(host: String, port: Double, path: String, clientId: String) = this()
}
