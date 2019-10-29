package typings.mdnDashBrowserDashCompatDashData.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentifierMeta extends js.Object {
  /**
    * A feature is described by an identifier containing the `__compat` property.
    *
    * In other words, identifiers without `__compat` aren't necessarily features,
    * but help to nest the features properly.
    *
    * When an identifier has a `__compat` block, it represents its basic support,
    * indicating that a minimal implementation of a functionality is included.
    *
    * What it represents exactly depends of the evolution of the feature over time,
    * both in terms of specifications and of browser support.
    */
  var __compat: js.UndefOr[CompatStatement] = js.undefined
}

object IdentifierMeta {
  @scala.inline
  def apply(__compat: CompatStatement = null): IdentifierMeta = {
    val __obj = js.Dynamic.literal()
    if (__compat != null) __obj.updateDynamic("__compat")(__compat)
    __obj.asInstanceOf[IdentifierMeta]
  }
}

