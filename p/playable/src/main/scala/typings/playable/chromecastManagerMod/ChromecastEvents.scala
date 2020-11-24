package typings.playable.chromecastManagerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChromecastEvents extends js.Object
@JSImport("playable/dist/src/modules/chromecast-manager/chromecast-manager", "ChromecastEvents")
@js.native
object ChromecastEvents extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChromecastEvents with String] = js.native
  
  @js.native
  sealed trait CHROMECAST_CASTS_RESUMED extends ChromecastEvents
  /* "ui-events/chromecast-resumed" */ @js.native
  object CHROMECAST_CASTS_RESUMED extends TopLevel[CHROMECAST_CASTS_RESUMED with String]
  
  @js.native
  sealed trait CHROMECAST_CASTS_STARTED extends ChromecastEvents
  /* "ui-events/chromecast-started" */ @js.native
  object CHROMECAST_CASTS_STARTED extends TopLevel[CHROMECAST_CASTS_STARTED with String]
  
  @js.native
  sealed trait CHROMECAST_CASTS_STOPED extends ChromecastEvents
  /* "ui-events/chromecast-stoped" */ @js.native
  object CHROMECAST_CASTS_STOPED extends TopLevel[CHROMECAST_CASTS_STOPED with String]
  
  @js.native
  sealed trait CHROMECAST_CONNECTED extends ChromecastEvents
  /* "ui-events/chromecast-connected" */ @js.native
  object CHROMECAST_CONNECTED extends TopLevel[CHROMECAST_CONNECTED with String]
  
  @js.native
  sealed trait CHROMECAST_CONNECTING extends ChromecastEvents
  /* "ui-events/chromecast-connecting" */ @js.native
  object CHROMECAST_CONNECTING extends TopLevel[CHROMECAST_CONNECTING with String]
  
  @js.native
  sealed trait CHROMECAST_INITED extends ChromecastEvents
  /* "ui-events/chromecast-inited" */ @js.native
  object CHROMECAST_INITED extends TopLevel[CHROMECAST_INITED with String]
  
  @js.native
  sealed trait CHROMECAST_NOT_CONNECTED extends ChromecastEvents
  /* "ui-events/chromecast-not-connected" */ @js.native
  object CHROMECAST_NOT_CONNECTED extends TopLevel[CHROMECAST_NOT_CONNECTED with String]
  
  @js.native
  sealed trait CHROMECAST_NO_DEVICES_AVAILABLE extends ChromecastEvents
  /* "ui-events/chromecast-not-available" */ @js.native
  object CHROMECAST_NO_DEVICES_AVAILABLE extends TopLevel[CHROMECAST_NO_DEVICES_AVAILABLE with String]
}
