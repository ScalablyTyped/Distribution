package typings
package meteorDashTypingsLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveChangesCallbacks extends js.Object {
  var added: js.UndefOr[js.Function2[/* id */ java.lang.String, /* fields */ js.Object, scala.Unit]] = js.undefined
  var addedBefore: js.UndefOr[
    js.Function3[/* id */ java.lang.String, /* fields */ js.Object, /* before */ js.Object, scala.Unit]
  ] = js.undefined
  var changed: js.UndefOr[js.Function2[/* id */ java.lang.String, /* fields */ js.Object, scala.Unit]] = js.undefined
  var movedBefore: js.UndefOr[js.Function2[/* id */ java.lang.String, /* before */ js.Object, scala.Unit]] = js.undefined
  var removed: js.UndefOr[js.Function1[/* id */ java.lang.String, scala.Unit]] = js.undefined
}

object ObserveChangesCallbacks {
  @scala.inline
  def apply(
    added: js.Function2[/* id */ java.lang.String, /* fields */ js.Object, scala.Unit] = null,
    addedBefore: js.Function3[/* id */ java.lang.String, /* fields */ js.Object, /* before */ js.Object, scala.Unit] = null,
    changed: js.Function2[/* id */ java.lang.String, /* fields */ js.Object, scala.Unit] = null,
    movedBefore: js.Function2[/* id */ java.lang.String, /* before */ js.Object, scala.Unit] = null,
    removed: js.Function1[/* id */ java.lang.String, scala.Unit] = null
  ): ObserveChangesCallbacks = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(added)
    if (addedBefore != null) __obj.updateDynamic("addedBefore")(addedBefore)
    if (changed != null) __obj.updateDynamic("changed")(changed)
    if (movedBefore != null) __obj.updateDynamic("movedBefore")(movedBefore)
    if (removed != null) __obj.updateDynamic("removed")(removed)
    __obj.asInstanceOf[ObserveChangesCallbacks]
  }
}

