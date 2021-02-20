package typings.nodeZookeeperClient

import typings.node.Buffer
import typings.node.eventsMod.EventEmitter
import typings.nodeZookeeperClient.anon.PartialOption
import typings.nodeZookeeperClient.nodeZookeeperClientStrings.authenticationFailed
import typings.nodeZookeeperClient.nodeZookeeperClientStrings.connected
import typings.nodeZookeeperClient.nodeZookeeperClientStrings.connectedReadOnly
import typings.nodeZookeeperClient.nodeZookeeperClientStrings.disconnected
import typings.nodeZookeeperClient.nodeZookeeperClientStrings.expired
import typings.nodeZookeeperClient.nodeZookeeperClientStrings.state
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-zookeeper-client", "ACL")
  @js.native
  class ACL protected () extends StObject {
    def this(perms: Double, id: Id) = this()
    
    var id: Id = js.native
    
    var perms: Double = js.native
  }
  
  object CreateMode {
    
    @JSImport("node-zookeeper-client", "CreateMode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-zookeeper-client", "CreateMode.EPHEMERAL")
    @js.native
    def EPHEMERAL: Double = js.native
    @scala.inline
    def EPHEMERAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPHEMERAL")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "CreateMode.EPHEMERAL_SEQUENTIAL")
    @js.native
    def EPHEMERAL_SEQUENTIAL: Double = js.native
    @scala.inline
    def EPHEMERAL_SEQUENTIAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPHEMERAL_SEQUENTIAL")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "CreateMode.PERSISTENT")
    @js.native
    def PERSISTENT: Double = js.native
    @scala.inline
    def PERSISTENT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERSISTENT")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "CreateMode.PERSISTENT_SEQUENTIAL")
    @js.native
    def PERSISTENT_SEQUENTIAL: Double = js.native
    @scala.inline
    def PERSISTENT_SEQUENTIAL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PERSISTENT_SEQUENTIAL")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-zookeeper-client", "Event")
  @js.native
  class Event protected () extends StObject {
    def this(`type`: Double, name: String, path: String) = this()
    
    def getName(): String = js.native
    
    def getPath(): String = js.native
    
    def getType(): Double = js.native
    
    var name: String = js.native
    
    var path: String = js.native
    
    var `type`: Double = js.native
  }
  /* static members */
  object Event {
    
    @JSImport("node-zookeeper-client", "Event")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-zookeeper-client", "Event.NODE_CHILDREN_CHANGED")
    @js.native
    def NODE_CHILDREN_CHANGED: Double = js.native
    @scala.inline
    def NODE_CHILDREN_CHANGED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_CHILDREN_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Event.NODE_CREATED")
    @js.native
    def NODE_CREATED: Double = js.native
    @scala.inline
    def NODE_CREATED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_CREATED")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Event.NODE_DATA_CHANGED")
    @js.native
    def NODE_DATA_CHANGED: Double = js.native
    @scala.inline
    def NODE_DATA_CHANGED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_DATA_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Event.NODE_DELETED")
    @js.native
    def NODE_DELETED: Double = js.native
    @scala.inline
    def NODE_DELETED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_DELETED")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-zookeeper-client", "Exception")
  @js.native
  class Exception protected () extends StObject {
    // tslint:disable-next-line ban-types
    def this(code: Double, name: String, ctor: js.Function) = this()
    // tslint:disable-next-line ban-types
    def this(code: Double, name: String, path: String, ctor: js.Function) = this()
    
    var code: Double = js.native
    
    def getCode(): Double = js.native
    
    def getName(): String = js.native
    
    def getPath(): String = js.native
    
    var name: String = js.native
    
    var path: js.UndefOr[String] = js.native
  }
  /* static members */
  object Exception {
    
    @JSImport("node-zookeeper-client", "Exception")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-zookeeper-client", "Exception.API_ERROR")
    @js.native
    def API_ERROR: Double = js.native
    @scala.inline
    def API_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("API_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.AUTH_FAILED")
    @js.native
    def AUTH_FAILED: Double = js.native
    @scala.inline
    def AUTH_FAILED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTH_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.BAD_ARGUMENTS")
    @js.native
    def BAD_ARGUMENTS: Double = js.native
    @scala.inline
    def BAD_ARGUMENTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BAD_ARGUMENTS")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.BAD_VERSION")
    @js.native
    def BAD_VERSION: Double = js.native
    @scala.inline
    def BAD_VERSION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BAD_VERSION")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.CONNECTION_LOSS")
    @js.native
    def CONNECTION_LOSS: Double = js.native
    @scala.inline
    def CONNECTION_LOSS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTION_LOSS")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.DATA_INCONSISTENCY")
    @js.native
    def DATA_INCONSISTENCY: Double = js.native
    @scala.inline
    def DATA_INCONSISTENCY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_INCONSISTENCY")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.INVALID_ACL")
    @js.native
    def INVALID_ACL: Double = js.native
    @scala.inline
    def INVALID_ACL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_ACL")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.INVALID_CALLBACK")
    @js.native
    def INVALID_CALLBACK: Double = js.native
    @scala.inline
    def INVALID_CALLBACK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INVALID_CALLBACK")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.MARSHALLING_ERROR")
    @js.native
    def MARSHALLING_ERROR: Double = js.native
    @scala.inline
    def MARSHALLING_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MARSHALLING_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.NODE_EXISTS")
    @js.native
    def NODE_EXISTS: Double = js.native
    @scala.inline
    def NODE_EXISTS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NODE_EXISTS")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.NOT_EMPTY")
    @js.native
    def NOT_EMPTY: Double = js.native
    @scala.inline
    def NOT_EMPTY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_EMPTY")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.NO_AUTH")
    @js.native
    def NO_AUTH: Double = js.native
    @scala.inline
    def NO_AUTH_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_AUTH")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.NO_CHILDREN_FOR_EPHEMERALS")
    @js.native
    def NO_CHILDREN_FOR_EPHEMERALS: Double = js.native
    @scala.inline
    def NO_CHILDREN_FOR_EPHEMERALS_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_CHILDREN_FOR_EPHEMERALS")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.NO_NODE")
    @js.native
    def NO_NODE: Double = js.native
    @scala.inline
    def NO_NODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NO_NODE")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.OK")
    @js.native
    def OK: Double = js.native
    @scala.inline
    def OK_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OK")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.OPERATION_TIMEOUT")
    @js.native
    def OPERATION_TIMEOUT: Double = js.native
    @scala.inline
    def OPERATION_TIMEOUT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPERATION_TIMEOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.RUNTIME_INCONSISTENCY")
    @js.native
    def RUNTIME_INCONSISTENCY: Double = js.native
    @scala.inline
    def RUNTIME_INCONSISTENCY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RUNTIME_INCONSISTENCY")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.SESSION_EXPIRED")
    @js.native
    def SESSION_EXPIRED: Double = js.native
    @scala.inline
    def SESSION_EXPIRED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SESSION_EXPIRED")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.SYSTEM_ERROR")
    @js.native
    def SYSTEM_ERROR: Double = js.native
    @scala.inline
    def SYSTEM_ERROR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYSTEM_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Exception.UNIMPLEMENTED")
    @js.native
    def UNIMPLEMENTED: Double = js.native
    @scala.inline
    def UNIMPLEMENTED_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UNIMPLEMENTED")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-zookeeper-client", "Id")
  @js.native
  class Id protected () extends StObject {
    def this(scheme: String, id: String) = this()
    
    var id: String = js.native
    
    var scheme: String = js.native
  }
  
  object Permission {
    
    @JSImport("node-zookeeper-client", "Permission")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-zookeeper-client", "Permission.ADMIN")
    @js.native
    def ADMIN: Double = js.native
    @scala.inline
    def ADMIN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADMIN")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Permission.ALL")
    @js.native
    def ALL: Double = js.native
    @scala.inline
    def ALL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Permission.CREATE")
    @js.native
    def CREATE: Double = js.native
    @scala.inline
    def CREATE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CREATE")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Permission.DELETE")
    @js.native
    def DELETE: Double = js.native
    @scala.inline
    def DELETE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DELETE")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Permission.READ")
    @js.native
    def READ: Double = js.native
    @scala.inline
    def READ_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("READ")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "Permission.WRITE")
    @js.native
    def WRITE: Double = js.native
    @scala.inline
    def WRITE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WRITE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-zookeeper-client", "State")
  @js.native
  class State protected () extends StObject {
    def this(name: String, code: Double) = this()
    
    var code: Double = js.native
    
    var name: String = js.native
  }
  /* static members */
  object State {
    
    @JSImport("node-zookeeper-client", "State")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("node-zookeeper-client", "State.AUTH_FAILED")
    @js.native
    def AUTH_FAILED: State = js.native
    @scala.inline
    def AUTH_FAILED_=(x: State): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTH_FAILED")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "State.CONNECTED_READ_ONLY")
    @js.native
    def CONNECTED_READ_ONLY: State = js.native
    @scala.inline
    def CONNECTED_READ_ONLY_=(x: State): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTED_READ_ONLY")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "State.DISCONNECTED")
    @js.native
    def DISCONNECTED: State = js.native
    @scala.inline
    def DISCONNECTED_=(x: State): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCONNECTED")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "State.EXPIRED")
    @js.native
    def EXPIRED: State = js.native
    @scala.inline
    def EXPIRED_=(x: State): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EXPIRED")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "State.SASL_AUTHENTICATED")
    @js.native
    def SASL_AUTHENTICATED: State = js.native
    @scala.inline
    def SASL_AUTHENTICATED_=(x: State): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SASL_AUTHENTICATED")(x.asInstanceOf[js.Any])
    
    @JSImport("node-zookeeper-client", "State.SYNC_CONNECTED")
    @js.native
    def SYNC_CONNECTED: State = js.native
    @scala.inline
    def SYNC_CONNECTED_=(x: State): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SYNC_CONNECTED")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("node-zookeeper-client", "createClient")
  @js.native
  def createClient(connectionString: String): Client = js.native
  @JSImport("node-zookeeper-client", "createClient")
  @js.native
  def createClient(connectionString: String, options: PartialOption): Client = js.native
  
  @js.native
  trait Client extends EventEmitter {
    
    def addAuthInfo(scheme: String, auth: Buffer): Unit = js.native
    
    def addListener(event: String, cb: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_authenticationFailed(event: authenticationFailed, cb: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_connected(event: connected, cb: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_connectedReadOnly(event: connectedReadOnly, cb: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_disconnected(event: disconnected, cb: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_expired(event: expired, cb: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_state(event: state, cb: js.Function1[/* state */ State, Unit]): this.type = js.native
    
    def close(): Unit = js.native
    
    def connect(): Unit = js.native
    
    def create(path: String, callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def create(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    
    def exists(path: String, callback: js.Function2[/* error */ Error | Exception, /* stat */ Stat, Unit]): Unit = js.native
    def exists(
      path: String,
      watcher: js.Function1[/* event */ Event, Unit],
      callback: js.Function2[/* error */ Error | Exception, /* stat */ Stat, Unit]
    ): Unit = js.native
    
    def getACL(
      path: String,
      callback: js.Function3[/* error */ Error | Exception, /* acls */ js.Array[ACL], /* stat */ Stat, Unit]
    ): Unit = js.native
    
    def getChildren(
      path: String,
      callback: js.Function3[/* error */ Error | Exception, /* children */ js.Array[String], /* stat */ Stat, Unit]
    ): Unit = js.native
    def getChildren(
      path: String,
      watcher: js.Function1[/* event */ Event, Unit],
      callback: js.Function3[/* error */ Error | Exception, /* children */ js.Array[String], /* stat */ Stat, Unit]
    ): Unit = js.native
    
    def getData(
      path: String,
      callback: js.Function3[/* error */ Error | Exception, /* data */ Buffer, /* stat */ Stat, Unit]
    ): Unit = js.native
    def getData(
      path: String,
      watcher: js.Function1[/* event */ Event, Unit],
      callback: js.Function3[/* error */ Error | Exception, /* data */ Buffer, /* stat */ Stat, Unit]
    ): Unit = js.native
    
    def getSessionId(): Buffer = js.native
    
    def getSessionPassword(): Buffer = js.native
    
    def getSessionTimeout(): Double = js.native
    
    def getState(): State = js.native
    
    def mkdirp(path: String, callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: js.Array[ACL],
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Double,
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: js.Array[ACL],
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Double,
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: Double,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    def mkdirp(
      path: String,
      dataOrAclsOrmode1: Buffer,
      dataOrAclsOrmode2: Buffer,
      dataOrAclsOrmode3: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* path */ String, Unit]
    ): Unit = js.native
    
    def on(event: String, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_authenticationFailed(event: authenticationFailed, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_connected(event: connected, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_connectedReadOnly(event: connectedReadOnly, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_disconnected(event: disconnected, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_expired(event: expired, cb: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_state(event: state, cb: js.Function1[/* state */ State, Unit]): this.type = js.native
    
    def once(event: String, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_authenticationFailed(event: authenticationFailed, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_connected(event: connected, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_connectedReadOnly(event: connectedReadOnly, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_disconnected(event: disconnected, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_expired(event: expired, cb: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_state(event: state, cb: js.Function1[/* state */ State, Unit]): this.type = js.native
    
    def remove(path: String, callback: js.Function1[/* error */ Error | Exception, Unit]): Unit = js.native
    def remove(path: String, version: Double, callback: js.Function1[/* error */ Error | Exception, Unit]): Unit = js.native
    
    def setACL(
      path: String,
      acls: js.Array[ACL],
      callback: js.Function2[/* error */ Error | Exception, /* stat */ Stat, Unit]
    ): Unit = js.native
    def setACL(
      path: String,
      acls: js.Array[ACL],
      version: Double,
      callback: js.Function2[/* error */ Error | Exception, /* stat */ Stat, Unit]
    ): Unit = js.native
    
    def setData(
      path: String,
      data: Null,
      callback: js.Function2[/* error */ Error | Exception, /* stat */ Stat, Unit]
    ): Unit = js.native
    def setData(
      path: String,
      data: Null,
      version: Double,
      callback: js.Function2[/* error */ Error | Exception, /* stat */ Stat, Unit]
    ): Unit = js.native
    def setData(
      path: String,
      data: Buffer,
      callback: js.Function2[/* error */ Error | Exception, /* stat */ Stat, Unit]
    ): Unit = js.native
    def setData(
      path: String,
      data: Buffer,
      version: Double,
      callback: js.Function2[/* error */ Error | Exception, /* stat */ Stat, Unit]
    ): Unit = js.native
    
    def transaction(): Transaction = js.native
  }
  
  @js.native
  trait Option extends StObject {
    
    var retries: Double = js.native
    
    var sessionTimeout: Double = js.native
    
    var spinDelay: Double = js.native
  }
  object Option {
    
    @scala.inline
    def apply(retries: Double, sessionTimeout: Double, spinDelay: Double): Option = {
      val __obj = js.Dynamic.literal(retries = retries.asInstanceOf[js.Any], sessionTimeout = sessionTimeout.asInstanceOf[js.Any], spinDelay = spinDelay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpinDelay(value: Double): Self = StObject.set(x, "spinDelay", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stat extends StObject {
    
    var aversion: Double = js.native
    
    var ctime: Double = js.native
    
    var cversion: Double = js.native
    
    var czxid: Double = js.native
    
    var dataLength: Double = js.native
    
    var ephemeralOwner: Double = js.native
    
    var mtime: Double = js.native
    
    var mzxid: Double = js.native
    
    var numChildren: Double = js.native
    
    var pzxid: Double = js.native
    
    var version: Double = js.native
  }
  object Stat {
    
    @scala.inline
    def apply(
      aversion: Double,
      ctime: Double,
      cversion: Double,
      czxid: Double,
      dataLength: Double,
      ephemeralOwner: Double,
      mtime: Double,
      mzxid: Double,
      numChildren: Double,
      pzxid: Double,
      version: Double
    ): Stat = {
      val __obj = js.Dynamic.literal(aversion = aversion.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], cversion = cversion.asInstanceOf[js.Any], czxid = czxid.asInstanceOf[js.Any], dataLength = dataLength.asInstanceOf[js.Any], ephemeralOwner = ephemeralOwner.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mzxid = mzxid.asInstanceOf[js.Any], numChildren = numChildren.asInstanceOf[js.Any], pzxid = pzxid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stat]
    }
    
    @scala.inline
    implicit class StatMutableBuilder[Self <: Stat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAversion(value: Double): Self = StObject.set(x, "aversion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtime(value: Double): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCversion(value: Double): Self = StObject.set(x, "cversion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCzxid(value: Double): Self = StObject.set(x, "czxid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLength(value: Double): Self = StObject.set(x, "dataLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEphemeralOwner(value: Double): Self = StObject.set(x, "ephemeralOwner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMzxid(value: Double): Self = StObject.set(x, "mzxid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumChildren(value: Double): Self = StObject.set(x, "numChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPzxid(value: Double): Self = StObject.set(x, "pzxid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Transaction extends StObject {
    
    def check(path: String): this.type = js.native
    def check(path: String, version: Double): this.type = js.native
    
    def commit(callback: js.Function2[/* error */ Error | Exception, /* results */ js.Any, Unit]): Unit = js.native
    
    def create(
      path: String,
      dataOrAclsOrmode1: js.UndefOr[Buffer | js.Array[ACL] | Double],
      dataOrAclsOrmode2: js.UndefOr[Buffer | js.Array[ACL] | Double],
      dataOrAclsOrmode3: js.UndefOr[Buffer | js.Array[ACL] | Double]
    ): this.type = js.native
    
    def remove(path: String): this.type = js.native
    def remove(path: String, version: Double): this.type = js.native
    
    def setData(path: String): this.type = js.native
    def setData(path: String, data: Null, version: Double): this.type = js.native
    def setData(path: String, data: Buffer): this.type = js.native
    def setData(path: String, data: Buffer, version: Double): this.type = js.native
  }
}
