package typings.mraid.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// See VPAID 2.0 spec for further method definitions, but only the declared methods are required by MRAID Video Addendum
@js.native
trait MRAIDVPAIDObject
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  def getAdDuration(): Double = js.native
  
  def getAdRemainingTime(): Double = js.native
  
  def startAd(): Unit = js.native
  
  def subscribe(fn: MRAIDVPAIDEventHandlers, event: String): Unit = js.native
  def subscribe(fn: MRAIDVPAIDEventHandlers, event: String, listenerScope: Any): Unit = js.native
  
  def unsubscribe(fn: MRAIDVPAIDEventHandlers, event: String): Unit = js.native
}
