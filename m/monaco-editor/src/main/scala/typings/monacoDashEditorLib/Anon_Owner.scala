package typings
package monacoDashEditorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Owner extends js.Object {
  var owner: js.UndefOr[java.lang.String] = js.undefined
  var resource: js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.Uri] = js.undefined
  var take: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Owner {
  @scala.inline
  def apply(
    owner: java.lang.String = null,
    resource: monacoDashEditorLib.monacoDashEditorMod.Uri = null,
    take: scala.Int | scala.Double = null
  ): Anon_Owner = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (take != null) __obj.updateDynamic("take")(take.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Owner]
  }
}

