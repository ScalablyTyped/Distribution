package typings
package nodeDashWindowsLib.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentPair extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object EnvironmentPair {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): EnvironmentPair = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[EnvironmentPair]
  }
}

