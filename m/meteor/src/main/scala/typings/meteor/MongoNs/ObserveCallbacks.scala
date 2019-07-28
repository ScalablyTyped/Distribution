package typings.meteor.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveCallbacks extends js.Object {
  var added: js.UndefOr[js.Function1[/* document */ js.Object, Unit]] = js.undefined
  var addedAt: js.UndefOr[
    js.Function3[/* document */ js.Object, /* atIndex */ Double, /* before */ js.Object, Unit]
  ] = js.undefined
  var changed: js.UndefOr[js.Function2[/* newDocument */ js.Object, /* oldDocument */ js.Object, Unit]] = js.undefined
  var changedAt: js.UndefOr[
    js.Function3[/* newDocument */ js.Object, /* oldDocument */ js.Object, /* indexAt */ Double, Unit]
  ] = js.undefined
  var movedTo: js.UndefOr[
    js.Function4[
      /* document */ js.Object, 
      /* fromIndex */ Double, 
      /* toIndex */ Double, 
      /* before */ js.Object, 
      Unit
    ]
  ] = js.undefined
  var removed: js.UndefOr[js.Function1[/* oldDocument */ js.Object, Unit]] = js.undefined
  var removedAt: js.UndefOr[js.Function2[/* oldDocument */ js.Object, /* atIndex */ Double, Unit]] = js.undefined
}

object ObserveCallbacks {
  @scala.inline
  def apply(
    added: /* document */ js.Object => Unit = null,
    addedAt: (/* document */ js.Object, /* atIndex */ Double, /* before */ js.Object) => Unit = null,
    changed: (/* newDocument */ js.Object, /* oldDocument */ js.Object) => Unit = null,
    changedAt: (/* newDocument */ js.Object, /* oldDocument */ js.Object, /* indexAt */ Double) => Unit = null,
    movedTo: (/* document */ js.Object, /* fromIndex */ Double, /* toIndex */ Double, /* before */ js.Object) => Unit = null,
    removed: /* oldDocument */ js.Object => Unit = null,
    removedAt: (/* oldDocument */ js.Object, /* atIndex */ Double) => Unit = null
  ): ObserveCallbacks = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(js.Any.fromFunction1(added))
    if (addedAt != null) __obj.updateDynamic("addedAt")(js.Any.fromFunction3(addedAt))
    if (changed != null) __obj.updateDynamic("changed")(js.Any.fromFunction2(changed))
    if (changedAt != null) __obj.updateDynamic("changedAt")(js.Any.fromFunction3(changedAt))
    if (movedTo != null) __obj.updateDynamic("movedTo")(js.Any.fromFunction4(movedTo))
    if (removed != null) __obj.updateDynamic("removed")(js.Any.fromFunction1(removed))
    if (removedAt != null) __obj.updateDynamic("removedAt")(js.Any.fromFunction2(removedAt))
    __obj.asInstanceOf[ObserveCallbacks]
  }
}

