package typings
package pixiDashSpineLib.PIXINs.spineNs.coreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationStateListener2 extends js.Object {
  var complete: js.UndefOr[js.Function1[/* entry */ TrackEntry, scala.Unit]] = js.undefined
  var dispose: js.UndefOr[js.Function1[/* entry */ TrackEntry, scala.Unit]] = js.undefined
  var end: js.UndefOr[js.Function1[/* entry */ TrackEntry, scala.Unit]] = js.undefined
  var event: js.UndefOr[js.Function2[/* entry */ TrackEntry, /* event */ Event, scala.Unit]] = js.undefined
  var interrupt: js.UndefOr[js.Function1[/* entry */ TrackEntry, scala.Unit]] = js.undefined
  var start: js.UndefOr[js.Function1[/* entry */ TrackEntry, scala.Unit]] = js.undefined
}

