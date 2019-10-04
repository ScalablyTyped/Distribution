package typings.pgDashPromise

import typings.pgDashPromise.pgDashPromiseMod.ITask
import typings.pgDashPromise.pgDashPromiseMod.TransactionMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CndMode[Ext] extends js.Object {
  var cnd: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])] = js.undefined
  var mode: js.UndefOr[TransactionMode | Null] = js.undefined
  var reusable: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])] = js.undefined
  var tag: js.UndefOr[js.Any] = js.undefined
}

object Anon_CndMode {
  @scala.inline
  def apply[Ext](
    cnd: Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean]) = null,
    mode: TransactionMode = null,
    reusable: Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean]) = null,
    tag: js.Any = null
  ): Anon_CndMode[Ext] = {
    val __obj = js.Dynamic.literal()
    if (cnd != null) __obj.updateDynamic("cnd")(cnd.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (reusable != null) __obj.updateDynamic("reusable")(reusable.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Anon_CndMode[Ext]]
  }
}

