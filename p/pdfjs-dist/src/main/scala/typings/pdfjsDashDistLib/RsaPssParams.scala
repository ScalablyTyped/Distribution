package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaPssParams extends Algorithm {
  var saltLength: scala.Double
}

object RsaPssParams {
  @scala.inline
  def apply(name: java.lang.String, saltLength: scala.Double): RsaPssParams = {
    val __obj = js.Dynamic.literal(name = name, saltLength = saltLength)
  
    __obj.asInstanceOf[RsaPssParams]
  }
}

