package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateCommitParamsAuthor extends js.Object {
  /**
    * Indicates when this commit was authored (or committed). This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var date: js.UndefOr[String] = js.undefined
  /**
    * The email of the author (or committer) of the commit
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The name of the author (or committer) of the commit
    */
  var name: js.UndefOr[String] = js.undefined
}

object GitCreateCommitParamsAuthor {
  @scala.inline
  def apply(date: String = null, email: String = null, name: String = null): GitCreateCommitParamsAuthor = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateCommitParamsAuthor]
  }
}

