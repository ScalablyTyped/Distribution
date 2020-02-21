package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBio extends js.Object {
  var bio: AnonType
  var blog: AnonType
  var company: AnonType
  var email: AnonType
  var hireable: AnonType
  var location: AnonType
  var name: AnonType
}

object AnonBio {
  @scala.inline
  def apply(
    bio: AnonType,
    blog: AnonType,
    company: AnonType,
    email: AnonType,
    hireable: AnonType,
    location: AnonType,
    name: AnonType
  ): AnonBio = {
    val __obj = js.Dynamic.literal(bio = bio.asInstanceOf[js.Any], blog = blog.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], hireable = hireable.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBio]
  }
}

