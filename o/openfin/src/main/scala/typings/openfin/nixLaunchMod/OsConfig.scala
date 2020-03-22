package typings.openfin.nixLaunchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OsConfig extends js.Object {
  var executablePath: String
  var manifestLocation: String
  var namedPipeName: String
  var urlPath: String
}

object OsConfig {
  @scala.inline
  def apply(executablePath: String, manifestLocation: String, namedPipeName: String, urlPath: String): OsConfig = {
    val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], manifestLocation = manifestLocation.asInstanceOf[js.Any], namedPipeName = namedPipeName.asInstanceOf[js.Any], urlPath = urlPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OsConfig]
  }
}

