package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Autotriggerchecks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChecksSetSuitesPreferencesResponseData extends js.Object {
  var preferences: Autotriggerchecks
  var repository: Allowmergecommit
}

object ChecksSetSuitesPreferencesResponseData {
  @scala.inline
  def apply(preferences: Autotriggerchecks, repository: Allowmergecommit): ChecksSetSuitesPreferencesResponseData = {
    val __obj = js.Dynamic.literal(preferences = preferences.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesResponseData]
  }
}

