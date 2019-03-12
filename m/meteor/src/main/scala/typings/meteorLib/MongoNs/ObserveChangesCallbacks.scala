package typings
package meteorLib.MongoNs

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
    added: (/* id */ java.lang.String, /* fields */ js.Object) => scala.Unit = null,
    addedBefore: (/* id */ java.lang.String, /* fields */ js.Object, /* before */ js.Object) => scala.Unit = null,
    changed: (/* id */ java.lang.String, /* fields */ js.Object) => scala.Unit = null,
    movedBefore: (/* id */ java.lang.String, /* before */ js.Object) => scala.Unit = null,
    removed: /* id */ java.lang.String => scala.Unit = null
  ): ObserveChangesCallbacks = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(js.Any.fromFunction2(added))
    if (addedBefore != null) __obj.updateDynamic("addedBefore")(js.Any.fromFunction3(addedBefore))
    if (changed != null) __obj.updateDynamic("changed")(js.Any.fromFunction2(changed))
    if (movedBefore != null) __obj.updateDynamic("movedBefore")(js.Any.fromFunction2(movedBefore))
    if (removed != null) __obj.updateDynamic("removed")(js.Any.fromFunction1(removed))
    __obj.asInstanceOf[ObserveChangesCallbacks]
  }
}

