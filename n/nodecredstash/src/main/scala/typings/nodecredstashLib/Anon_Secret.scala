package typings
package nodecredstashLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Secret extends js.Object {
  var secret: java.lang.String
  var version: java.lang.String
}

object Anon_Secret {
  @scala.inline
  def apply(secret: java.lang.String, version: java.lang.String): Anon_Secret = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("secret")(secret)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Secret]
  }
}

