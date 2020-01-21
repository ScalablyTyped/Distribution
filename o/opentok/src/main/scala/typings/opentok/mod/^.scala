package typings.opentok.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentok", JSImport.Namespace)
@js.native
class ^ protected () extends OpenTok {
  def this(apiKey: String, apiSecret: String) = this()
  /* CompleteClass */
  override def createSession(
    options: SessionOptions,
    callback: js.Function2[/* error */ Error | Null, /* session */ js.UndefOr[Session], Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def deleteArchive(archiveId: String, callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
  /* CompleteClass */
  override def generateToken(sessionId: String, options: TokenOptions): Token = js.native
  /* CompleteClass */
  override def getArchive(
    archiveId: String,
    callback: js.Function2[/* error */ Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def listArchives(
    options: ListArchivesOptions,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* archives */ js.UndefOr[js.Array[Archive]], 
      /* totalCount */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit = js.native
  /* CompleteClass */
  override def startArchive(
    sessionId: String,
    options: ArchiveOptions,
    callback: js.Function2[/* error */ Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit = js.native
  /* CompleteClass */
  override def stopArchive(
    archiveId: String,
    callback: js.Function2[/* error */ Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit = js.native
}

