package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicationFacet extends js.Object {
  // The state of publication for this document. Either published or checkout. Read-only.
  var level: js.UndefOr[java.lang.String] = js.undefined
  // The unique identifier for the version that is visible to the current caller. Read-only.
  var versionId: js.UndefOr[java.lang.String] = js.undefined
}

object PublicationFacet {
  @scala.inline
  def apply(level: java.lang.String = null, versionId: java.lang.String = null): PublicationFacet = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[PublicationFacet]
  }
}

