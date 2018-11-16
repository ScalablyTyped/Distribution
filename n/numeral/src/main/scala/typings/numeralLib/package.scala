package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object numeralLib {
  type RegisterType = numeralLib.numeralLibStrings.format | numeralLib.numeralLibStrings.locale
  type RoundingFunction = js.Function1[/* value */ scala.Double, scala.Double]
}
