package typings.atOnfleetNodeDashOnfleet.resourcesOrganizationMod

import typings.atOnfleetNodeDashOnfleet.Anon_Tasks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Organization extends js.Object {
  def get(): js.Promise[js.Array[OnfleetOrganization]] = js.native
  def get(id: String): js.Promise[OnfleetOrganization | Delegatee] = js.native
  def insertTask(id: String, obj: Anon_Tasks): js.Promise[_] = js.native
}

