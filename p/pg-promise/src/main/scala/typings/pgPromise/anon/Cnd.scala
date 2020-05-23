package typings.pgPromise.anon

import typings.pgPromise.mod.ITask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cnd[Ext] extends js.Object {
  var cnd: js.UndefOr[Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean])] = js.undefined
  var tag: js.UndefOr[js.Any] = js.undefined
}

object Cnd {
  @scala.inline
  def apply[Ext](cnd: Boolean | (js.Function1[/* t */ ITask[Ext] with Ext, Boolean]) = null, tag: js.Any = null): Cnd[Ext] = {
    val __obj = js.Dynamic.literal()
    if (cnd != null) __obj.updateDynamic("cnd")(cnd.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cnd[Ext]]
  }
}

