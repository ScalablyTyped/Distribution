package typings
package openstackDashWrapperLib.openstackDashWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  var general_token: java.lang.String
  var glance: Glance
  var neutron: Neutron
  var nova: Nova
  var octavia: Octavia
  var project_token: java.lang.String
}

object Project {
  @scala.inline
  def apply(
    general_token: java.lang.String,
    glance: Glance,
    neutron: Neutron,
    nova: Nova,
    octavia: Octavia,
    project_token: java.lang.String
  ): Project = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("general_token")(general_token)
    __obj.updateDynamic("glance")(glance)
    __obj.updateDynamic("neutron")(neutron)
    __obj.updateDynamic("nova")(nova)
    __obj.updateDynamic("octavia")(octavia)
    __obj.updateDynamic("project_token")(project_token)
    __obj.asInstanceOf[Project]
  }
}

