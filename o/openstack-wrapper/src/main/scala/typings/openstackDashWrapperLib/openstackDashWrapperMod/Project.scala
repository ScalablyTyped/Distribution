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
    val __obj = js.Dynamic.literal(general_token = general_token, glance = glance, neutron = neutron, nova = nova, octavia = octavia, project_token = project_token)
  
    __obj.asInstanceOf[Project]
  }
}

