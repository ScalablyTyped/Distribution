package typings
package atNodelibFsDotWalkLib.outReadersReaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reader extends js.Object {
  val _root: java.lang.String
  val _settings: atNodelibFsDotWalkLib.outSettingsMod.default
}

object Reader {
  @scala.inline
  def apply(_root: java.lang.String, _settings: atNodelibFsDotWalkLib.outSettingsMod.default): Reader = {
    val __obj = js.Dynamic.literal(_root = _root, _settings = _settings)
  
    __obj.asInstanceOf[Reader]
  }
}

