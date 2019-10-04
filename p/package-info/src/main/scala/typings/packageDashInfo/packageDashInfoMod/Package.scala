package typings.packageDashInfo.packageDashInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Package extends js.Object {
  var author: String
  var description: String
  var homepage: String
  var license: String
  var name: String
  var version: String
}

object Package {
  @scala.inline
  def apply(
    author: String,
    description: String,
    homepage: String,
    license: String,
    name: String,
    version: String
  ): Package = {
    val __obj = js.Dynamic.literal(author = author, description = description, homepage = homepage, license = license, name = name, version = version)
  
    __obj.asInstanceOf[Package]
  }
}

