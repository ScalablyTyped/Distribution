package typings.mitsobox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object mitsoboxStrings {
  @js.native
  sealed trait ABORT extends js.Object
  
  @js.native
  sealed trait CANCEL extends js.Object
  
  @js.native
  sealed trait IGNORE extends js.Object
  
  @js.native
  sealed trait OK extends js.Object
  
  @js.native
  sealed trait RETRY extends js.Object
  
  @scala.inline
  def ABORT: ABORT = "ABORT".asInstanceOf[ABORT]
  @scala.inline
  def CANCEL: CANCEL = "CANCEL".asInstanceOf[CANCEL]
  @scala.inline
  def IGNORE: IGNORE = "IGNORE".asInstanceOf[IGNORE]
  @scala.inline
  def OK: OK = "OK".asInstanceOf[OK]
  @scala.inline
  def RETRY: RETRY = "RETRY".asInstanceOf[RETRY]
}

