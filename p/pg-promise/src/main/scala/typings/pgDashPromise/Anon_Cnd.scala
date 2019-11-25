package typings.pgDashPromise

import typings.pgDashPromise.pgDashPromiseMod.ITask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cnd[Ext] extends js.Object {
  var cnd: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])] = js.undefined
  var tag: js.UndefOr[js.Any] = js.undefined
}

object Anon_Cnd {
  @scala.inline
  def apply[Ext](cnd: Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean]) = null, tag: js.Any = null): Anon_Cnd[Ext] = {
    val __obj = js.Dynamic.literal()
    if (cnd != null) __obj.updateDynamic("cnd")(cnd.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cnd[Ext]]
  }
}

