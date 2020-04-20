package typings.openstackWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Project extends js.Object {
  var general_token: String
  var glance: Glance
  var neutron: Neutron
  var nova: Nova
  var octavia: Octavia
  var project_token: String
}

object Project {
  @scala.inline
  def apply(
    general_token: String,
    glance: Glance,
    neutron: Neutron,
    nova: Nova,
    octavia: Octavia,
    project_token: String
  ): Project = {
    val __obj = js.Dynamic.literal(general_token = general_token.asInstanceOf[js.Any], glance = glance.asInstanceOf[js.Any], neutron = neutron.asInstanceOf[js.Any], nova = nova.asInstanceOf[js.Any], octavia = octavia.asInstanceOf[js.Any], project_token = project_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
}

