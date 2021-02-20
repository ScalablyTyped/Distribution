package typings.meteorSjobs

import typings.meteorSjobs.mod.JobState
import typings.meteorSjobs.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorSjobsStrings {
  
  @js.native
  sealed trait Asterisk extends State
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait failure
    extends JobState
       with State
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait pending
    extends JobState
       with State
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait success
    extends JobState
       with State
  @scala.inline
  def success: success = "success".asInstanceOf[success]
}
