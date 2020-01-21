package typings.opentok.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenTok extends js.Object {
  def createSession(
    options: SessionOptions,
    callback: js.Function2[/* error */ Error | Null, /* session */ js.UndefOr[Session], Unit]
  ): Unit
  def deleteArchive(archiveId: String, callback: js.Function1[/* error */ Error | Null, Unit]): Unit
  def generateToken(sessionId: String, options: TokenOptions): Token
  def getArchive(
    archiveId: String,
    callback: js.Function2[/* error */ Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit
  def listArchives(
    options: ListArchivesOptions,
    callback: js.Function3[
      /* error */ Error | Null, 
      /* archives */ js.UndefOr[js.Array[Archive]], 
      /* totalCount */ js.UndefOr[Double], 
      Unit
    ]
  ): Unit
  def startArchive(
    sessionId: String,
    options: ArchiveOptions,
    callback: js.Function2[/* error */ Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit
  def stopArchive(
    archiveId: String,
    callback: js.Function2[/* error */ Error | Null, /* archive */ js.UndefOr[Archive], Unit]
  ): Unit
}

object OpenTok {
  @scala.inline
  def apply(
    createSession: (SessionOptions, js.Function2[/* error */ Error | Null, /* session */ js.UndefOr[Session], Unit]) => Unit,
    deleteArchive: (String, js.Function1[/* error */ Error | Null, Unit]) => Unit,
    generateToken: (String, TokenOptions) => Token,
    getArchive: (String, js.Function2[/* error */ Error | Null, /* archive */ js.UndefOr[Archive], Unit]) => Unit,
    listArchives: (ListArchivesOptions, js.Function3[
      /* error */ Error | Null, 
      /* archives */ js.UndefOr[js.Array[Archive]], 
      /* totalCount */ js.UndefOr[Double], 
      Unit
    ]) => Unit,
    startArchive: (String, ArchiveOptions, js.Function2[/* error */ Error | Null, /* archive */ js.UndefOr[Archive], Unit]) => Unit,
    stopArchive: (String, js.Function2[/* error */ Error | Null, /* archive */ js.UndefOr[Archive], Unit]) => Unit
  ): OpenTok = {
    val __obj = js.Dynamic.literal(createSession = js.Any.fromFunction2(createSession), deleteArchive = js.Any.fromFunction2(deleteArchive), generateToken = js.Any.fromFunction2(generateToken), getArchive = js.Any.fromFunction2(getArchive), listArchives = js.Any.fromFunction2(listArchives), startArchive = js.Any.fromFunction3(startArchive), stopArchive = js.Any.fromFunction2(stopArchive))
  
    __obj.asInstanceOf[OpenTok]
  }
}

