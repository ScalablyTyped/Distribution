package typings.nodeDownloaderHelper.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DH_STATES extends js.Object

@JSImport("node-downloader-helper", "DH_STATES")
@js.native
object DH_STATES extends js.Object {
  @js.native
  sealed trait DOWNLOADING extends DH_STATES
  
  @js.native
  sealed trait FAILED extends DH_STATES
  
  @js.native
  sealed trait FINISHED extends DH_STATES
  
  @js.native
  sealed trait IDLE extends DH_STATES
  
  @js.native
  sealed trait PAUSED extends DH_STATES
  
  @js.native
  sealed trait RESUMED extends DH_STATES
  
  @js.native
  sealed trait STARTED extends DH_STATES
  
  @js.native
  sealed trait STOPPED extends DH_STATES
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DH_STATES with String] = js.native
  /* "DOWNLOADING" */ @js.native
  object DOWNLOADING extends TopLevel[DOWNLOADING with String]
  
  /* "FAILED" */ @js.native
  object FAILED extends TopLevel[FAILED with String]
  
  /* "FINISHED" */ @js.native
  object FINISHED extends TopLevel[FINISHED with String]
  
  /* "IDLE" */ @js.native
  object IDLE extends TopLevel[IDLE with String]
  
  /* "PAUSED" */ @js.native
  object PAUSED extends TopLevel[PAUSED with String]
  
  /* "RESUMED" */ @js.native
  object RESUMED extends TopLevel[RESUMED with String]
  
  /* "STARTED" */ @js.native
  object STARTED extends TopLevel[STARTED with String]
  
  /* "STOPPED" */ @js.native
  object STOPPED extends TopLevel[STOPPED with String]
  
}

