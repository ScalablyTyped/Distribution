package typings.atOnfleetNodeDashOnfleet.resourcesWorkersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @prop filter - Optional. A comma-separated list of fields to return, if all are not desired. For example, name, location
  * @prop phones - Optional. A comma-separated list of workers' phone numbers.
  * @prop states - Optional. A comma-separated list of worker states, where 0 is off-duty,
  * 1 is idle (on-duty, no active task) and 2 is active (on-duty, active task).
  * @prop teams - Optional. A comma-separated list of the team IDs that workers must be part of.
  */
trait GetWorkerQueryProps extends js.Object {
  var filter: js.UndefOr[String] = js.undefined
  var phones: js.UndefOr[String] = js.undefined
  var states: js.UndefOr[String] = js.undefined
  var teams: js.UndefOr[String] = js.undefined
}

object GetWorkerQueryProps {
  @scala.inline
  def apply(filter: String = null, phones: String = null, states: String = null, teams: String = null): GetWorkerQueryProps = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (phones != null) __obj.updateDynamic("phones")(phones)
    if (states != null) __obj.updateDynamic("states")(states)
    if (teams != null) __obj.updateDynamic("teams")(teams)
    __obj.asInstanceOf[GetWorkerQueryProps]
  }
}

