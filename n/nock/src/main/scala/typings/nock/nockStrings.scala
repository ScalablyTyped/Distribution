package typings.nock

import typings.nock.mod.BackMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nockStrings {
  @js.native
  sealed trait dryrun extends BackMode
  
  @js.native
  sealed trait lockdown extends BackMode
  
  @js.native
  sealed trait record extends BackMode
  
  @js.native
  sealed trait wild extends BackMode
  
  @scala.inline
  def dryrun: dryrun = "dryrun".asInstanceOf[dryrun]
  @scala.inline
  def lockdown: lockdown = "lockdown".asInstanceOf[lockdown]
  @scala.inline
  def record: record = "record".asInstanceOf[record]
  @scala.inline
  def wild: wild = "wild".asInstanceOf[wild]
}

