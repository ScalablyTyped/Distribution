package typings
package mobileDashDetectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FullPattern extends js.Object {
  var fullPattern: stdLib.RegExp
  var shortPattern: stdLib.RegExp
  var tabletPattern: stdLib.RegExp
}

object Anon_FullPattern {
  @scala.inline
  def apply(fullPattern: stdLib.RegExp, shortPattern: stdLib.RegExp, tabletPattern: stdLib.RegExp): Anon_FullPattern = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fullPattern")(fullPattern)
    __obj.updateDynamic("shortPattern")(shortPattern)
    __obj.updateDynamic("tabletPattern")(tabletPattern)
    __obj.asInstanceOf[Anon_FullPattern]
  }
}

