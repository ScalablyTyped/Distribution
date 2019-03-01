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

object AnimationStateListener2 {
  @scala.inline
  def apply(
    complete: js.Function1[/* entry */ TrackEntry, scala.Unit] = null,
    dispose: js.Function1[/* entry */ TrackEntry, scala.Unit] = null,
    end: js.Function1[/* entry */ TrackEntry, scala.Unit] = null,
    event: js.Function2[/* entry */ TrackEntry, /* event */ Event, scala.Unit] = null,
    interrupt: js.Function1[/* entry */ TrackEntry, scala.Unit] = null,
    start: js.Function1[/* entry */ TrackEntry, scala.Unit] = null
  ): AnimationStateListener2 = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (dispose != null) __obj.updateDynamic("dispose")(dispose)
    if (end != null) __obj.updateDynamic("end")(end)
    if (event != null) __obj.updateDynamic("event")(event)
    if (interrupt != null) __obj.updateDynamic("interrupt")(interrupt)
    if (start != null) __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[AnimationStateListener2]
  }
}

