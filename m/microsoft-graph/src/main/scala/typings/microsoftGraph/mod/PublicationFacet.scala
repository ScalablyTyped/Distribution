package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicationFacet extends js.Object {
  // The state of publication for this document. Either published or checkout. Read-only.
  var level: js.UndefOr[String] = js.undefined
  // The unique identifier for the version that is visible to the current caller. Read-only.
  var versionId: js.UndefOr[String] = js.undefined
}

object PublicationFacet {
  @scala.inline
  def apply(level: String = null, versionId: String = null): PublicationFacet = {
    val __obj = js.Dynamic.literal()
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicationFacet]
  }
}

