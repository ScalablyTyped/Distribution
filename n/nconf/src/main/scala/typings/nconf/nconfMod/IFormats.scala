package typings.nconf.nconfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFormats extends js.Object {
  var ini: IFormat
  var json: IFormat
}

object IFormats {
  @scala.inline
  def apply(ini: IFormat, json: IFormat): IFormats = {
    val __obj = js.Dynamic.literal(ini = ini.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFormats]
  }
}

