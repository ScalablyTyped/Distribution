package typings.nodeDownloaderHelper.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DH_STATES extends StObject
@JSImport("node-downloader-helper", "DH_STATES")
@js.native
object DH_STATES extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DH_STATES & String] = js.native
  
  @js.native
  sealed trait DOWNLOADING
    extends StObject
       with DH_STATES
  /* "DOWNLOADING" */ val DOWNLOADING: typings.nodeDownloaderHelper.mod.DH_STATES.DOWNLOADING & String = js.native
  
  @js.native
  sealed trait FAILED
    extends StObject
       with DH_STATES
  /* "FAILED" */ val FAILED: typings.nodeDownloaderHelper.mod.DH_STATES.FAILED & String = js.native
  
  @js.native
  sealed trait FINISHED
    extends StObject
       with DH_STATES
  /* "FINISHED" */ val FINISHED: typings.nodeDownloaderHelper.mod.DH_STATES.FINISHED & String = js.native
  
  @js.native
  sealed trait IDLE
    extends StObject
       with DH_STATES
  /* "IDLE" */ val IDLE: typings.nodeDownloaderHelper.mod.DH_STATES.IDLE & String = js.native
  
  @js.native
  sealed trait PAUSED
    extends StObject
       with DH_STATES
  /* "PAUSED" */ val PAUSED: typings.nodeDownloaderHelper.mod.DH_STATES.PAUSED & String = js.native
  
  @js.native
  sealed trait RESUMED
    extends StObject
       with DH_STATES
  /* "RESUMED" */ val RESUMED: typings.nodeDownloaderHelper.mod.DH_STATES.RESUMED & String = js.native
  
  @js.native
  sealed trait RETRY
    extends StObject
       with DH_STATES
  /* "RETRY" */ val RETRY: typings.nodeDownloaderHelper.mod.DH_STATES.RETRY & String = js.native
  
  @js.native
  sealed trait SKIPPED
    extends StObject
       with DH_STATES
  /* "SKIPPED" */ val SKIPPED: typings.nodeDownloaderHelper.mod.DH_STATES.SKIPPED & String = js.native
  
  @js.native
  sealed trait STARTED
    extends StObject
       with DH_STATES
  /* "STARTED" */ val STARTED: typings.nodeDownloaderHelper.mod.DH_STATES.STARTED & String = js.native
  
  @js.native
  sealed trait STOPPED
    extends StObject
       with DH_STATES
  /* "STOPPED" */ val STOPPED: typings.nodeDownloaderHelper.mod.DH_STATES.STOPPED & String = js.native
}
