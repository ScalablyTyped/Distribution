package typings.nodeDashIpc.nodeDashIpcMod.NodeIPC

import typings.nodeDashIpc.Anon_Family
import typings.nodeDashIpc.Anon_Private
import typings.nodeDashIpc.nodeDashIpcStrings.ascii
import typings.nodeDashIpc.nodeDashIpcStrings.base64
import typings.nodeDashIpc.nodeDashIpcStrings.hex
import typings.nodeDashIpc.nodeDashIpcStrings.ucs2
import typings.nodeDashIpc.nodeDashIpcStrings.utf16le
import typings.nodeDashIpc.nodeDashIpcStrings.utf8
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Default: 'app.'
    * Used for Unix Socket (Unix Domain Socket) namespacing.
    * If not set specifically, the Unix Domain Socket will combine the socketRoot, appspace,
    * and id to form the Unix Socket Path for creation or binding.
    * This is available incase you have many apps running on your system, you may have several sockets with the same id,
    * but if you change the appspace, you will still have app specic unique sockets
    */
  var appspace: String
  /**
    * Default: 'utf8'
    * the default encoding for data sent on sockets. Mostly used if rawBuffer is set to true.
    * Valid values are : ascii utf8 utf16le ucs2 base64 hex
    */
  var encoding: ascii | utf8 | utf16le | ucs2 | base64 | hex
  /**
    * Default: os.hostname()
    * The id of this socket or service
    */
  var id: String
  /**
    * Primarily used when specifying which interface a client should connect through.
    * see the socket.connect documentation in the node.js api https://nodejs.org/api/net.html#net_socket_connect_options_connectlistener
    */
  var interfaces: Anon_Family
  /**
    * Default: 5
    * Set the depth for util.inspect during ipc.log
    */
  var logDepth: Double
  /**
    * Default: true
    * Turn on/off util.inspect colors for ipc.log
    */
  var logInColor: Boolean
  /**
    * Default: 100
    * This is the max number of connections allowed to a socket. It is currently only being set on Unix Sockets.
    * Other Socket types are using the system defaults
    */
  var maxConnections: Double
  /*  */
  /**
    * Default: false
    * if set, it represents the maximum number of retries after each disconnect before giving up
    * and completely killing a specific connection
    */
  var maxRetries: Boolean | Double
  /**
    * Default: 'localhost'
    * The local or remote host on which TCP, TLS or UDP Sockets should connect
    * Should resolve to 127.0.0.1 or ::1 see the table below related to this
    */
  var networkHost: String
  /**
    * Default: 8000
    * The default port on which TCP, TLS, or UDP sockets should connect
    */
  var networkPort: Double
  /**
    * Default: false
    * If true, data will be sent and received as a raw node Buffer NOT an Object as JSON.
    * This is great for Binary or hex IPC, and communicating with other processes in languages like C and C++
    */
  var rawBuffer: Boolean
  /**
    * Default: 500
    * This is the time in milliseconds a client will wait before trying to reconnect to a server if the connection is lost.
    * This does not effect UDP sockets since they do not have a client server relationship like Unix Sockets and TCP Sockets
    */
  var retry: Double
  /**
    * Default: false
    * Turn on/off logging default is false which means logging is on
    */
  var silent: Boolean
  /**
    * Default: '/tmp/'
    * The directory in which to create or bind to a Unix Socket
    */
  var socketRoot: String
  /**
    * Default: false
    * Defaults to false meaning clients will continue to retry to connect to servers indefinitely at the retry interval.
    * If set to any number the client will stop retrying when that number is exceeded after each disconnect.
    * If set to true in real time it will immediately stop trying to connect regardless of maxRetries.
    * If set to 0, the client will NOT try to reconnect
    */
  var stopRetrying: Boolean
  /**
    * Default: false
    * Synchronous requests. Clients will not send new requests until the server answers
    */
  var sync: Boolean
  var tls: Anon_Private
  /**
    * Default: true
    * Defaults to true meaning that the module will take care of deleting the IPC socket prior to startup.
    * If you use node-ipc in a clustered environment where there will be multiple listeners on the same socket,
    * you must set this to false and then take care of deleting the socket in your own code.
    */
  var unlink: Boolean
  /**
    * Default: console.log
    * The function which receives the output from ipc.log; should take a single string argument
    */
  def logger(msg: String): Unit
}

object Config {
  @scala.inline
  def apply(
    appspace: String,
    encoding: ascii | utf8 | utf16le | ucs2 | base64 | hex,
    id: String,
    interfaces: Anon_Family,
    logDepth: Double,
    logInColor: Boolean,
    logger: String => Unit,
    maxConnections: Double,
    maxRetries: Boolean | Double,
    networkHost: String,
    networkPort: Double,
    rawBuffer: Boolean,
    retry: Double,
    silent: Boolean,
    socketRoot: String,
    stopRetrying: Boolean,
    sync: Boolean,
    tls: Anon_Private,
    unlink: Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(appspace = appspace.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], interfaces = interfaces.asInstanceOf[js.Any], logDepth = logDepth.asInstanceOf[js.Any], logInColor = logInColor.asInstanceOf[js.Any], logger = js.Any.fromFunction1(logger), maxConnections = maxConnections.asInstanceOf[js.Any], maxRetries = maxRetries.asInstanceOf[js.Any], networkHost = networkHost.asInstanceOf[js.Any], networkPort = networkPort.asInstanceOf[js.Any], rawBuffer = rawBuffer.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], socketRoot = socketRoot.asInstanceOf[js.Any], stopRetrying = stopRetrying.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any], tls = tls.asInstanceOf[js.Any], unlink = unlink.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Config]
  }
}

