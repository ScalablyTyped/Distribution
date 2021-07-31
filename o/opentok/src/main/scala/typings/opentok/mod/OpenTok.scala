package typings.opentok.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenTok extends StObject {
  
  def createSession(
    options: SessionOptions,
    callback: js.Function2[/* error */ Error | Null, /* session */ js.UndefOr[Session], Unit]
  ): Unit = js.native
  
  def deleteArchive(archiveId: String, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
  
  def generateToken(sessionId: String, options: TokenOptions): Token = js.native
  
  def getArchive(
    archiveId: String,
    callback: js.Function2[/* error */ Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit = js.native
  
  def listArchives(
    options: ListArchivesOptions,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* archives */ js.UndefOr[js.Array[Archive]], 
      /* totalCount */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
  
  def signal(
    sessionId: String,
    connectionId: String,
    data: SignalOptions,
    callback: js.Function1[/* error */ Error | Null, Unit]
  ): Unit = js.native
  def signal(
    sessionId: String,
    connectionId: Null,
    data: SignalOptions,
    callback: js.Function1[/* error */ Error | Null, Unit]
  ): Unit = js.native
  
  def startArchive(
    sessionId: String,
    options: ArchiveOptions,
    callback: js.Function2[/* error */ Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit = js.native
  
  def startBroadcast(
    sessionId: String,
    options: BroadcastOptions,
    callback: js.Function2[/* error */ Error | Null, /* broadcast */ Broadcast, Unit]
  ): Unit = js.native
  
  def stopArchive(
    archiveId: String,
    callback: js.Function2[/* error */ Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit = js.native
  
  def stopBroadcast(
    broadcastId: String,
    callback: js.Function2[/* error */ Error | Null, /* broadcast */ BroadcastStopResponse, Unit]
  ): Unit = js.native
}
