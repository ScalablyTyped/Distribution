package typings.meteorSjobs

import typings.meteorSjobs.mod.JobState
import typings.meteorSjobs.mod.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorSjobsStrings {
  
  @js.native
  sealed trait Asterisk
    extends StObject
       with State
  inline def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait failure
    extends StObject
       with JobState
       with State
  inline def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait pending
    extends StObject
       with JobState
       with State
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait success
    extends StObject
       with JobState
       with State
  inline def success: success = "success".asInstanceOf[success]
}
