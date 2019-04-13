package typings
package opentokLib.opentokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTok extends js.Object {
  def createSession(
    options: SessionOptions,
    callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* session */ js.UndefOr[Session], scala.Unit]
  ): scala.Unit
  def deleteArchive(
    archiveId: java.lang.String,
    callback: js.Function1[/* error */ stdLib.Error | scala.Null, scala.Unit]
  ): scala.Unit
  def generateToken(sessionId: java.lang.String, options: TokenOptions): Token
  def getArchive(
    archiveId: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* archive */ js.UndefOr[Archive], scala.Unit]
  ): scala.Unit
  def listArchives(
    options: ListArchivesOptions,
    callback: js.Function3[
      /* error */ stdLib.Error | scala.Null, 
      /* archives */ js.UndefOr[js.Array[Archive]], 
      /* totalCount */ js.UndefOr[scala.Double], 
      scala.Unit
    ]
  ): scala.Unit
  def startArchive(
    sessionId: java.lang.String,
    options: ArchiveOptions,
    callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* archive */ js.UndefOr[Archive], scala.Unit]
  ): scala.Unit
  def stopArchive(
    archiveId: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error | scala.Null, /* archive */ js.UndefOr[Archive], scala.Unit]
  ): scala.Unit
}

object OpenTok {
  @scala.inline
  def apply(
    createSession: (SessionOptions, js.Function2[/* error */ stdLib.Error | scala.Null, /* session */ js.UndefOr[Session], scala.Unit]) => scala.Unit,
    deleteArchive: (java.lang.String, js.Function1[/* error */ stdLib.Error | scala.Null, scala.Unit]) => scala.Unit,
    generateToken: (java.lang.String, TokenOptions) => Token,
    getArchive: (java.lang.String, js.Function2[/* error */ stdLib.Error | scala.Null, /* archive */ js.UndefOr[Archive], scala.Unit]) => scala.Unit,
    listArchives: (ListArchivesOptions, js.Function3[
      /* error */ stdLib.Error | scala.Null, 
      /* archives */ js.UndefOr[js.Array[Archive]], 
      /* totalCount */ js.UndefOr[scala.Double], 
      scala.Unit
    ]) => scala.Unit,
    startArchive: (java.lang.String, ArchiveOptions, js.Function2[/* error */ stdLib.Error | scala.Null, /* archive */ js.UndefOr[Archive], scala.Unit]) => scala.Unit,
    stopArchive: (java.lang.String, js.Function2[/* error */ stdLib.Error | scala.Null, /* archive */ js.UndefOr[Archive], scala.Unit]) => scala.Unit
  ): OpenTok = {
    val __obj = js.Dynamic.literal(createSession = js.Any.fromFunction2(createSession), deleteArchive = js.Any.fromFunction2(deleteArchive), generateToken = js.Any.fromFunction2(generateToken), getArchive = js.Any.fromFunction2(getArchive), listArchives = js.Any.fromFunction2(listArchives), startArchive = js.Any.fromFunction3(startArchive), stopArchive = js.Any.fromFunction2(stopArchive))
  
    __obj.asInstanceOf[OpenTok]
  }
}

