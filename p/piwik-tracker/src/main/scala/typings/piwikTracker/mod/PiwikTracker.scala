package typings.piwikTracker.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PiwikTracker extends EventEmitter {
  
  def track(options: PiwikTrackOptions): Unit = js.native
}
