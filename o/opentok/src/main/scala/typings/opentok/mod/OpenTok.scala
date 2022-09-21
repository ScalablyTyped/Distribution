package typings.opentok.mod

import typings.opentok.anon.Id
import typings.opentok.opentokStrings.custom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenTok extends StObject {
  
  def addArchiveStream(
    archiveId: String,
    streamId: String,
    options: PatchStream,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  
  def addBroadcastStream(
    broadcastId: String,
    streamId: String,
    options: PatchStream,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  
  def createSession(
    options: SessionOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* session */ js.UndefOr[Session], Unit]
  ): Unit = js.native
  
  def deleteArchive(archiveId: String, callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit = js.native
  
  def dial(
    sessionId: String,
    token: Token,
    sipUri: String,
    options: DialOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* sipInterconnect */ SipInterconnect, Unit]
  ): Unit = js.native
  
  def forceDisconnect(sessionId: String, connectionId: String, callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit = js.native
  
  def generateToken(sessionId: String): Token = js.native
  def generateToken(sessionId: String, options: TokenOptions): Token = js.native
  
  def getArchive(
    archiveId: String,
    callback: js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit = js.native
  
  def getBroadcast(
    broadcastId: String,
    callback: js.Function2[/* error */ js.Error | Null, /* broadcast */ js.UndefOr[Broadcast], Unit]
  ): Unit = js.native
  
  def getStream(
    sessionId: String,
    options: StreamId,
    callback: js.Function2[/* error */ js.Error | Null, /* stream */ js.UndefOr[Stream], Unit]
  ): Unit = js.native
  
  def listArchives(
    options: ListArchivesOptions,
    callback: js.Function3[
      /* error */ js.Error | Null, 
      /* archives */ js.UndefOr[js.Array[Archive]], 
      /* totalCount */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
  
  def listBroadcasts(
    options: ListBroadcastsOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* broadcasts */ js.UndefOr[js.Array[Broadcast]], Unit]
  ): Unit = js.native
  
  def listStreams(
    sessionId: String,
    callback: js.Function2[/* error */ js.Error | Null, /* streams */ js.UndefOr[js.Array[Stream]], Unit]
  ): Unit = js.native
  
  def playDTMF(
    sessionId: String,
    connectionId: String,
    digits: String,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  
  def removeArchiveStream(
    archiveId: String,
    streamId: String,
    options: PatchStream,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  
  def removeBroadcastStream(
    broadcastId: String,
    streamId: String,
    options: PatchStream,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  
  def setArchiveLayout(
    archiveId: String,
    `type`: BroadcastLayoutType,
    stylesheet: String,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  def setArchiveLayout(
    archiveId: String,
    `type`: BroadcastLayoutType,
    stylesheet: Null,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("setArchiveLayout")
  def setArchiveLayout_custom(
    archiveId: String,
    `type`: custom,
    stylesheet: String,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("setArchiveLayout")
  def setArchiveLayout_custom(
    archiveId: String,
    `type`: custom,
    stylesheet: Null,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  
  def setBroadcastLayout(
    broadcastId: String,
    `type`: BroadcastLayoutType,
    stylesheet: String,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  def setBroadcastLayout(
    broadcastId: String,
    `type`: BroadcastLayoutType,
    stylesheet: Null,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("setBroadcastLayout")
  def setBroadcastLayout_custom(
    broadcastId: String,
    `type`: custom,
    stylesheet: String,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  @JSName("setBroadcastLayout")
  def setBroadcastLayout_custom(
    broadcastId: String,
    `type`: custom,
    stylesheet: Null,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  
  def setStreamClassLists(
    sessionId: String,
    classListArray: js.Array[Id],
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  
  def signal(
    sessionId: String,
    connectionId: String,
    data: SignalOptions,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  def signal(
    sessionId: String,
    connectionId: Null,
    data: SignalOptions,
    callback: js.Function1[/* error */ js.Error | Null, Unit]
  ): Unit = js.native
  
  def startArchive(
    sessionId: String,
    options: ArchiveOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit = js.native
  
  def startBroadcast(
    sessionId: String,
    options: BroadcastOptions,
    callback: js.Function2[/* error */ js.Error | Null, /* broadcast */ Broadcast, Unit]
  ): Unit = js.native
  
  def stopArchive(
    archiveId: String,
    callback: js.Function2[/* error */ js.Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit = js.native
  
  def stopBroadcast(
    broadcastId: String,
    callback: js.Function2[/* error */ js.Error | Null, /* broadcast */ BroadcastStopResponse, Unit]
  ): Unit = js.native
}
