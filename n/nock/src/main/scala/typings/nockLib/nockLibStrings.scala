package typings
package nockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nockLibStrings {
  @js.native
  sealed trait dryrun extends js.Object
  
  @js.native
  sealed trait lockdown extends js.Object
  
  @js.native
  sealed trait record extends js.Object
  
  @js.native
  sealed trait wild extends js.Object
  
  def dryrun: dryrun = "dryrun".asInstanceOf[dryrun]
  def lockdown: lockdown = "lockdown".asInstanceOf[lockdown]
  def record: record = "record".asInstanceOf[record]
  def wild: wild = "wild".asInstanceOf[wild]
}

