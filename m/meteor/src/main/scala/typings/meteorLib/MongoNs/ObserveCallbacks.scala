package typings
package meteorLib.MongoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObserveCallbacks extends js.Object {
  var added: js.UndefOr[js.Function1[/* document */ js.Object, scala.Unit]] = js.undefined
  var addedAt: js.UndefOr[
    js.Function3[
      /* document */ js.Object, 
      /* atIndex */ scala.Double, 
      /* before */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var changed: js.UndefOr[
    js.Function2[/* newDocument */ js.Object, /* oldDocument */ js.Object, scala.Unit]
  ] = js.undefined
  var changedAt: js.UndefOr[
    js.Function3[
      /* newDocument */ js.Object, 
      /* oldDocument */ js.Object, 
      /* indexAt */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var movedTo: js.UndefOr[
    js.Function4[
      /* document */ js.Object, 
      /* fromIndex */ scala.Double, 
      /* toIndex */ scala.Double, 
      /* before */ js.Object, 
      scala.Unit
    ]
  ] = js.undefined
  var removed: js.UndefOr[js.Function1[/* oldDocument */ js.Object, scala.Unit]] = js.undefined
  var removedAt: js.UndefOr[
    js.Function2[/* oldDocument */ js.Object, /* atIndex */ scala.Double, scala.Unit]
  ] = js.undefined
}

object ObserveCallbacks {
  @scala.inline
  def apply(
    added: js.Function1[/* document */ js.Object, scala.Unit] = null,
    addedAt: js.Function3[
      /* document */ js.Object, 
      /* atIndex */ scala.Double, 
      /* before */ js.Object, 
      scala.Unit
    ] = null,
    changed: js.Function2[/* newDocument */ js.Object, /* oldDocument */ js.Object, scala.Unit] = null,
    changedAt: js.Function3[
      /* newDocument */ js.Object, 
      /* oldDocument */ js.Object, 
      /* indexAt */ scala.Double, 
      scala.Unit
    ] = null,
    movedTo: js.Function4[
      /* document */ js.Object, 
      /* fromIndex */ scala.Double, 
      /* toIndex */ scala.Double, 
      /* before */ js.Object, 
      scala.Unit
    ] = null,
    removed: js.Function1[/* oldDocument */ js.Object, scala.Unit] = null,
    removedAt: js.Function2[/* oldDocument */ js.Object, /* atIndex */ scala.Double, scala.Unit] = null
  ): ObserveCallbacks = {
    val __obj = js.Dynamic.literal()
    if (added != null) __obj.updateDynamic("added")(added)
    if (addedAt != null) __obj.updateDynamic("addedAt")(addedAt)
    if (changed != null) __obj.updateDynamic("changed")(changed)
    if (changedAt != null) __obj.updateDynamic("changedAt")(changedAt)
    if (movedTo != null) __obj.updateDynamic("movedTo")(movedTo)
    if (removed != null) __obj.updateDynamic("removed")(removed)
    if (removedAt != null) __obj.updateDynamic("removedAt")(removedAt)
    __obj.asInstanceOf[ObserveCallbacks]
  }
}

