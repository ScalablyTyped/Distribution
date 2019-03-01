package typings
package mochaLib.libInterfacesCommonMod.commonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOptions extends js.Object {
  /** Filepath where this Suite resides */
  var file: js.UndefOr[java.lang.String] = js.undefined
  /** Suite function */
  var fn: js.UndefOr[js.ThisFunction0[/* this */ mochaLib.MochaNs.Suite, scala.Unit]] = js.undefined
  /** Is suite exclusive? */
  var isOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Is suite pending? */
  var pending: js.UndefOr[scala.Boolean] = js.undefined
  /** Title of suite */
  var title: java.lang.String
}

object CreateOptions {
  @scala.inline
  def apply(
    title: java.lang.String,
    file: java.lang.String = null,
    fn: js.ThisFunction0[/* this */ mochaLib.MochaNs.Suite, scala.Unit] = null,
    isOnly: js.UndefOr[scala.Boolean] = js.undefined,
    pending: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    if (file != null) __obj.updateDynamic("file")(file)
    if (fn != null) __obj.updateDynamic("fn")(fn)
    if (!js.isUndefined(isOnly)) __obj.updateDynamic("isOnly")(isOnly)
    if (!js.isUndefined(pending)) __obj.updateDynamic("pending")(pending)
    __obj.asInstanceOf[CreateOptions]
  }
}

