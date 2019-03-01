package typings
package playmusicLib.playmusicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistMeta extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var shareState: js.UndefOr[java.lang.String] = js.undefined
}

object PlaylistMeta {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    name: java.lang.String = null,
    shareState: java.lang.String = null
  ): PlaylistMeta = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (shareState != null) __obj.updateDynamic("shareState")(shareState)
    __obj.asInstanceOf[PlaylistMeta]
  }
}

