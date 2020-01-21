package typings.nodeVagrant

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeVagrantStrings {
  @js.native
  sealed trait progress extends js.Object
  
  @js.native
  sealed trait stderr extends js.Object
  
  @js.native
  sealed trait stdout extends js.Object
  
  @js.native
  sealed trait `up-progress` extends js.Object
  
  @scala.inline
  def progress: progress = "progress".asInstanceOf[progress]
  @scala.inline
  def stderr: stderr = "stderr".asInstanceOf[stderr]
  @scala.inline
  def stdout: stdout = "stdout".asInstanceOf[stdout]
  @scala.inline
  def `up-progress`: `up-progress` = "up-progress".asInstanceOf[`up-progress`]
}

