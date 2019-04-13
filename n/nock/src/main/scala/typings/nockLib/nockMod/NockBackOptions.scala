package typings
package nockLib.nockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NockBackOptions extends js.Object {
  var after: js.UndefOr[js.Function1[/* scope */ Scope, scala.Unit]] = js.undefined
  var afterRecord: js.UndefOr[js.Function1[/* defs */ js.Array[NockDefinition], js.Array[NockDefinition]]] = js.undefined
  var before: js.UndefOr[js.Function1[/* def */ NockDefinition, scala.Unit]] = js.undefined
  var recorder: js.UndefOr[RecorderOptions] = js.undefined
}

object NockBackOptions {
  @scala.inline
  def apply(
    after: /* scope */ Scope => scala.Unit = null,
    afterRecord: /* defs */ js.Array[NockDefinition] => js.Array[NockDefinition] = null,
    before: /* def */ NockDefinition => scala.Unit = null,
    recorder: RecorderOptions = null
  ): NockBackOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1(after))
    if (afterRecord != null) __obj.updateDynamic("afterRecord")(js.Any.fromFunction1(afterRecord))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1(before))
    if (recorder != null) __obj.updateDynamic("recorder")(recorder)
    __obj.asInstanceOf[NockBackOptions]
  }
}

