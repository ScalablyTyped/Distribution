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

object OpenTok {
  @scala.inline
  def apply(
    createSession: js.Function2[
      opentokLib.opentokMod.OpenTokNs.SessionOptions, 
      js.Function2[
        /* err */ stdLib.Error, 
        /* session */ opentokLib.opentokMod.OpenTokNs.Session, 
        scala.Unit
      ], 
      scala.Unit
    ],
    deleteArchive: js.Function2[java.lang.String, js.Function1[/* err */ stdLib.Error, scala.Unit], scala.Unit],
    generateToken: js.Function2[
      java.lang.String, 
      opentokLib.opentokMod.OpenTokNs.TokenOptions, 
      opentokLib.opentokMod.OpenTokNs.Token
    ],
    getArchive: js.Function2[
      java.lang.String, 
      js.Function2[
        /* err */ stdLib.Error, 
        /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
        scala.Unit
      ], 
      scala.Unit
    ],
    listArchives: js.Function2[
      opentokLib.opentokMod.OpenTokNs.ListArchivesOptions, 
      js.Function3[
        /* err */ stdLib.Error, 
        /* archives */ js.Array[opentokLib.opentokMod.OpenTokNs.Archive], 
        /* totalCount */ scala.Double, 
        scala.Unit
      ], 
      scala.Unit
    ],
    startArchive: js.Function3[
      java.lang.String, 
      opentokLib.opentokMod.OpenTokNs.ArchiveOptions, 
      js.Function2[
        /* err */ stdLib.Error, 
        /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
        scala.Unit
      ], 
      scala.Unit
    ],
    stopArchive: js.Function2[
      java.lang.String, 
      js.Function2[
        /* err */ stdLib.Error, 
        /* archive */ opentokLib.opentokMod.OpenTokNs.Archive, 
        scala.Unit
      ], 
      scala.Unit
    ]
  ): OpenTok = {
    val __obj = js.Dynamic.literal(createSession = createSession, deleteArchive = deleteArchive, generateToken = generateToken, getArchive = getArchive, listArchives = listArchives, startArchive = startArchive, stopArchive = stopArchive)
  
    __obj.asInstanceOf[OpenTok]
  }
}

