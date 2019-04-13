package typings
package nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client
  extends nodeLib.eventsMod.^ {
  def addAuthInfo(scheme: java.lang.String, auth: nodeLib.Buffer): scala.Unit = js.native
  def addListener(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_authenticationFailed(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.authenticationFailed,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_connected(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.connected,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_connectedReadOnly(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.connectedReadOnly,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_disconnected(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.disconnected,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_expired(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.expired,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_state(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.state,
    cb: js.Function1[/* state */ State, scala.Unit]
  ): this.type = js.native
  def close(): scala.Unit = js.native
  def connect(): scala.Unit = js.native
  def create(
    path: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: nodeLib.Buffer | js.Array[ACL] | scala.Double,
    dataOrAclsOrmode2: nodeLib.Buffer | js.Array[ACL] | scala.Double,
    dataOrAclsOrmode3: nodeLib.Buffer | js.Array[ACL] | scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: js.Array[ACL],
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: nodeLib.Buffer,
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: nodeLib.Buffer,
    dataOrAclsOrmode2: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: nodeLib.Buffer,
    dataOrAclsOrmode2: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: scala.Double,
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: scala.Double,
    dataOrAclsOrmode2: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def create(
    path: java.lang.String,
    dataOrAclsOrmode1: scala.Double,
    dataOrAclsOrmode2: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def exists(
    path: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* stat */ Stat, scala.Unit]
  ): scala.Unit = js.native
  def exists(
    path: java.lang.String,
    watcher: js.Function1[/* event */ Event, scala.Unit],
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* stat */ Stat, scala.Unit]
  ): scala.Unit = js.native
  def getACL(
    path: java.lang.String,
    callback: js.Function3[
      /* error */ stdLib.Error | Exception, 
      /* acls */ js.Array[ACL], 
      /* stat */ Stat, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getChildren(
    path: java.lang.String,
    callback: js.Function3[
      /* error */ stdLib.Error | Exception, 
      /* children */ js.Array[java.lang.String], 
      /* stat */ Stat, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getChildren(
    path: java.lang.String,
    watcher: js.Function1[/* event */ Event, scala.Unit],
    callback: js.Function3[
      /* error */ stdLib.Error | Exception, 
      /* children */ js.Array[java.lang.String], 
      /* stat */ Stat, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getData(
    path: java.lang.String,
    callback: js.Function3[
      /* error */ stdLib.Error | Exception, 
      /* data */ nodeLib.Buffer, 
      /* stat */ Stat, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getData(
    path: java.lang.String,
    watcher: js.Function1[/* event */ Event, scala.Unit],
    callback: js.Function3[
      /* error */ stdLib.Error | Exception, 
      /* data */ nodeLib.Buffer, 
      /* stat */ Stat, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def getSessionId(): nodeLib.Buffer = js.native
  def getSessionPassword(): nodeLib.Buffer = js.native
  def getSessionTimeout(): scala.Double = js.native
  def getState(): State = js.native
  def mkdirp(
    path: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    dataOrAclsOrmode1: nodeLib.Buffer | js.Array[ACL] | scala.Double,
    dataOrAclsOrmode2: nodeLib.Buffer | js.Array[ACL] | scala.Double,
    dataOrAclsOrmode3: nodeLib.Buffer | js.Array[ACL] | scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    dataOrAclsOrmode1: js.Array[ACL],
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    dataOrAclsOrmode1: js.Array[ACL],
    dataOrAclsOrmode2: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    dataOrAclsOrmode1: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    dataOrAclsOrmode1: nodeLib.Buffer,
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    dataOrAclsOrmode1: nodeLib.Buffer,
    dataOrAclsOrmode2: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    dataOrAclsOrmode1: nodeLib.Buffer,
    dataOrAclsOrmode2: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    dataOrAclsOrmode1: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    dataOrAclsOrmode1: scala.Double,
    dataOrAclsOrmode2: js.Array[ACL],
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    dataOrAclsOrmode1: scala.Double,
    dataOrAclsOrmode2: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def mkdirp(
    path: java.lang.String,
    dataOrAclsOrmode1: scala.Double,
    dataOrAclsOrmode2: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* path */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def on(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_authenticationFailed(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.authenticationFailed,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connected(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.connected,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_connectedReadOnly(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.connectedReadOnly,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_disconnected(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.disconnected,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_expired(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.expired,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_state(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.state,
    cb: js.Function1[/* state */ State, scala.Unit]
  ): this.type = js.native
  def once(event: java.lang.String, cb: js.Function0[scala.Unit]): this.type = js.native
  @JSName("once")
  def once_authenticationFailed(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.authenticationFailed,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connected(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.connected,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_connectedReadOnly(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.connectedReadOnly,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_disconnected(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.disconnected,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_expired(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.expired,
    cb: js.Function0[scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_state(
    event: nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientLibStrings.state,
    cb: js.Function1[/* state */ State, scala.Unit]
  ): this.type = js.native
  def remove(path: java.lang.String, callback: js.Function1[/* error */ stdLib.Error | Exception, scala.Unit]): scala.Unit = js.native
  def remove(
    path: java.lang.String,
    version: scala.Double,
    callback: js.Function1[/* error */ stdLib.Error | Exception, scala.Unit]
  ): scala.Unit = js.native
  def setACL(
    path: java.lang.String,
    acls: js.Array[ACL],
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* stat */ Stat, scala.Unit]
  ): scala.Unit = js.native
  def setACL(
    path: java.lang.String,
    acls: js.Array[ACL],
    version: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* stat */ Stat, scala.Unit]
  ): scala.Unit = js.native
  def setData(
    path: java.lang.String,
    data: nodeLib.Buffer,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* stat */ Stat, scala.Unit]
  ): scala.Unit = js.native
  def setData(
    path: java.lang.String,
    data: nodeLib.Buffer,
    version: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* stat */ Stat, scala.Unit]
  ): scala.Unit = js.native
  def setData(
    path: java.lang.String,
    data: scala.Null,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* stat */ Stat, scala.Unit]
  ): scala.Unit = js.native
  def setData(
    path: java.lang.String,
    data: scala.Null,
    version: scala.Double,
    callback: js.Function2[/* error */ stdLib.Error | Exception, /* stat */ Stat, scala.Unit]
  ): scala.Unit = js.native
  def transaction(): Transaction = js.native
}

