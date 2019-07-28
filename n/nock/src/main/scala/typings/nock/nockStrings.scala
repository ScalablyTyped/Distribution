package typings.nock

import typings.nock.nockMod.NockBackMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nockStrings {
  @js.native
  sealed trait dryrun extends NockBackMode
  
  @js.native
  sealed trait lockdown extends NockBackMode
  
  @js.native
  sealed trait record extends NockBackMode
  
  @js.native
  sealed trait wild extends NockBackMode
  
  @scala.inline
  def dryrun: dryrun = "dryrun".asInstanceOf[dryrun]
  @scala.inline
  def lockdown: lockdown = "lockdown".asInstanceOf[lockdown]
  @scala.inline
  def record: record = "record".asInstanceOf[record]
  @scala.inline
  def wild: wild = "wild".asInstanceOf[wild]
}

