package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Autotriggerchecks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChecksSetSuitesPreferencesResponseData extends js.Object {
  var preferences: Autotriggerchecks = js.native
  var repository: Allowmergecommit = js.native
}

object ChecksSetSuitesPreferencesResponseData {
  @scala.inline
  def apply(preferences: Autotriggerchecks, repository: Allowmergecommit): ChecksSetSuitesPreferencesResponseData = {
    val __obj = js.Dynamic.literal(preferences = preferences.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksSetSuitesPreferencesResponseData]
  }
  @scala.inline
  implicit class ChecksSetSuitesPreferencesResponseDataOps[Self <: ChecksSetSuitesPreferencesResponseData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPreferences(value: Autotriggerchecks): Self = this.set("preferences", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepository(value: Allowmergecommit): Self = this.set("repository", value.asInstanceOf[js.Any])
  }
  
}

