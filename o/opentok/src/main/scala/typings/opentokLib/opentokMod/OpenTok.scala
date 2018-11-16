package typings
package opentokLib.opentokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OpenTok extends js.Object {
  def createSession(
    options: opentokLib.opentokMod.OpenTokNs.SessionOptions,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* session */ opentokLib.opentokMod.OpenTokNs.Session, 
      scala.Unit
    ]
  ): scala.Unit
  def deleteArchive(archiveId: java.lang.String, callback: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit
  def generateToken(sessionId: java.lang.String, options: opentokLib.opentokMod.OpenTokNs.TokenOptions): opentokLib.opentokMod.OpenTokNs.Token
  def getArchive(
    archiveId: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
      scala.Unit
    ]
  ): scala.Unit
  def listArchives(
    options: opentokLib.opentokMod.OpenTokNs.ListArchivesOptions,
    callback: js.Function3[
      /* err */ stdLib.Error, 
      /* archives */ js.Array[opentokLib.opentokMod.OpenTokNs.Archive], 
      /* totalCount */ scala.Double, 
      scala.Unit
    ]
  ): scala.Unit
  def startArchive(
    sessionId: java.lang.String,
    options: opentokLib.opentokMod.OpenTokNs.ArchiveOptions,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
      scala.Unit
    ]
  ): scala.Unit
  def stopArchive(
    archiveId: java.lang.String,
    callback: js.Function2[
      /* err */ stdLib.Error, 
      /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
      scala.Unit
    ]
  ): scala.Unit
}

