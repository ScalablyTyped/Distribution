package typings.phantomjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Architecture extends js.Object {
  var architecture: String
  var name: String
  var version: String
}

object Anon_Architecture {
  @scala.inline
  def apply(architecture: String, name: String, version: String): Anon_Architecture = {
    val __obj = js.Dynamic.literal(architecture = architecture, name = name, version = version)
  
    __obj.asInstanceOf[Anon_Architecture]
  }
}

