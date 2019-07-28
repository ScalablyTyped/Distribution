package typings.nodeDashWindows.nodeDashWindowsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentPair extends js.Object {
  var name: String
  var value: String
}

object EnvironmentPair {
  @scala.inline
  def apply(name: String, value: String): EnvironmentPair = {
    val __obj = js.Dynamic.literal(name = name, value = value)
  
    __obj.asInstanceOf[EnvironmentPair]
  }
}

