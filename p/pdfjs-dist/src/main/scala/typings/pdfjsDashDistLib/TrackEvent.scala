package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrackEvent extends Event {
  val track: VideoTrack | AudioTrack | TextTrack | scala.Null = js.native
}

@JSGlobal("TrackEvent")
@js.native
object TrackEvent
  extends org.scalablytyped.runtime.Instantiable1[/* typeArg */ java.lang.String, TrackEvent]
     with org.scalablytyped.runtime.Instantiable2[/* typeArg */ java.lang.String, /* eventInitDict */ TrackEventInit, TrackEvent]

