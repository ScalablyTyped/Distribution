package typings.nodeDownloaderHelper.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DH_STATES extends js.Object
@JSImport("node-downloader-helper", "DH_STATES")
@js.native
object DH_STATES extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DH_STATES with String] = js.native
  
  @js.native
  sealed trait DOWNLOADING extends DH_STATES
  /* "DOWNLOADING" */ @js.native
  object DOWNLOADING extends TopLevel[DOWNLOADING with String]
  
  @js.native
  sealed trait FAILED extends DH_STATES
  /* "FAILED" */ @js.native
  object FAILED extends TopLevel[FAILED with String]
  
  @js.native
  sealed trait FINISHED extends DH_STATES
  /* "FINISHED" */ @js.native
  object FINISHED extends TopLevel[FINISHED with String]
  
  @js.native
  sealed trait IDLE extends DH_STATES
  /* "IDLE" */ @js.native
  object IDLE extends TopLevel[IDLE with String]
  
  @js.native
  sealed trait PAUSED extends DH_STATES
  /* "PAUSED" */ @js.native
  object PAUSED extends TopLevel[PAUSED with String]
  
  @js.native
  sealed trait RESUMED extends DH_STATES
  /* "RESUMED" */ @js.native
  object RESUMED extends TopLevel[RESUMED with String]
  
  @js.native
  sealed trait STARTED extends DH_STATES
  /* "STARTED" */ @js.native
  object STARTED extends TopLevel[STARTED with String]
  
  @js.native
  sealed trait STOPPED extends DH_STATES
  /* "STOPPED" */ @js.native
  object STOPPED extends TopLevel[STOPPED with String]
}
