package typings
package nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DH_STATES extends js.Object

@JSImport("node-downloader-helper", "DH_STATES")
@js.native
object DH_STATES extends js.Object {
  @js.native
  sealed trait DOWNLOADING
    extends nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperMod.DH_STATES
  
  @js.native
  sealed trait FAILED
    extends nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperMod.DH_STATES
  
  @js.native
  sealed trait FINISHED
    extends nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperMod.DH_STATES
  
  @js.native
  sealed trait IDLE
    extends nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperMod.DH_STATES
  
  @js.native
  sealed trait PAUSED
    extends nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperMod.DH_STATES
  
  @js.native
  sealed trait RESUMED
    extends nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperMod.DH_STATES
  
  @js.native
  sealed trait STARTED
    extends nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperMod.DH_STATES
  
  @js.native
  sealed trait STOPPED
    extends nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperMod.DH_STATES
  
  /* "DOWNLOADING" */ val DOWNLOADING: DOWNLOADING with java.lang.String = js.native
  /* "FAILED" */ val FAILED: FAILED with java.lang.String = js.native
  /* "FINISHED" */ val FINISHED: FINISHED with java.lang.String = js.native
  /* "IDLE" */ val IDLE: IDLE with java.lang.String = js.native
  /* "PAUSED" */ val PAUSED: PAUSED with java.lang.String = js.native
  /* "RESUMED" */ val RESUMED: RESUMED with java.lang.String = js.native
  /* "STARTED" */ val STARTED: STARTED with java.lang.String = js.native
  /* "STOPPED" */ val STOPPED: STOPPED with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    nodeDashDownloaderDashHelperLib.nodeDashDownloaderDashHelperMod.DH_STATES with java.lang.String
  ] = js.native
}

