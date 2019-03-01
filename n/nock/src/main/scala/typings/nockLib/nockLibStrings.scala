package typings
package nockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nockLibStrings {
  @js.native
  sealed trait dryrun
    extends nockLib.nockMod.nockNs.NockBackMode
  
  @js.native
  sealed trait lockdown
    extends nockLib.nockMod.nockNs.NockBackMode
  
  @js.native
  sealed trait record
    extends nockLib.nockMod.nockNs.NockBackMode
  
  @js.native
  sealed trait wild
    extends nockLib.nockMod.nockNs.NockBackMode
  
  @scala.inline
  def dryrun: dryrun = "dryrun".asInstanceOf[dryrun]
  @scala.inline
  def lockdown: lockdown = "lockdown".asInstanceOf[lockdown]
  @scala.inline
  def record: record = "record".asInstanceOf[record]
  @scala.inline
  def wild: wild = "wild".asInstanceOf[wild]
}

