package typings.meteorSjobs

import typings.meteorSjobs.mod.JobState
import typings.meteorSjobs.mod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object meteorSjobsStrings {
  @js.native
  sealed trait Asterisk extends State
  
  @js.native
  sealed trait failure
    extends JobState
       with State
  
  @js.native
  sealed trait pending
    extends JobState
       with State
  
  @js.native
  sealed trait success
    extends JobState
       with State
  
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}

