package typings
package opentokLib.opentokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentok", JSImport.Namespace)
@js.native
class ^ protected () extends OpenTok {
  def this(apiKey: java.lang.String, apiSecret: java.lang.String) = this()
  /* CompleteClass */
  override def createSession(
    options: SessionOptions,
    callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* session */ js.UndefOr[Session], scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def deleteArchive(
    archiveId: java.lang.String,
    callback: js.Function1[/* error */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def generateToken(sessionId: java.lang.String, options: TokenOptions): Token = js.native
  /* CompleteClass */
  override def getArchive(
    archiveId: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* archive */ js.UndefOr[Archive], scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def listArchives(
    options: ListArchivesOptions,
    callback: js.Function3[
      /* error */ stdLib.Error | scala.Null, 
      /* archives */ js.UndefOr[js.Array[Archive]], 
      /* totalCount */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def startArchive(
    sessionId: java.lang.String,
    options: ArchiveOptions,
    callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* archive */ js.UndefOr[Archive], scala.Unit]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def stopArchive(
    archiveId: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* archive */ js.UndefOr[Archive], scala.Unit]
  ): scala.Unit = js.native
}

