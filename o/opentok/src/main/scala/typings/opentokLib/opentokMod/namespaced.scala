package typings
package opentokLib.opentokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentok", JSImport.Namespace)
@js.native
class namespaced protected () extends OpenTok {
  def this(apiKey: java.lang.String, apiSecret: java.lang.String) = this()
  /* CompleteClass */
  override def createSession(
    options: opentokLib.opentokMod.OpenTokNs.SessionOptions,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* session */ opentokLib.opentokMod.OpenTokNs.Session, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def deleteArchive(archiveId: java.lang.String, callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  /* CompleteClass */
  override def generateToken(sessionId: java.lang.String, options: opentokLib.opentokMod.OpenTokNs.TokenOptions): opentokLib.opentokMod.OpenTokNs.Token = js.native
  /* CompleteClass */
  override def getArchive(
    archiveId: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def listArchives(
    options: opentokLib.opentokMod.OpenTokNs.ListArchivesOptions,
    callback: js.Function3[
      /* err */ stdLib.Error, 
      /* archives */ js.Array[opentokLib.opentokMod.OpenTokNs.Archive], 
      /* totalCount */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def startArchive(
    sessionId: java.lang.String,
    options: opentokLib.opentokMod.OpenTokNs.ArchiveOptions,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /* CompleteClass */
  override def stopArchive(
    archiveId: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

