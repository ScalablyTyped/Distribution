package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locator extends js.Object {
  var seleniumLocator: js.Any
  def findElements(context: js.Any): js.Any
}

object Locator {
  @scala.inline
  def apply(
    findElements: js.Function1[js.Any, js.Any],
    seleniumLocator: js.Any,
    toString: js.Function0[java.lang.String]
  ): Locator = {
    val __obj = js.Dynamic.literal(findElements = findElements, seleniumLocator = seleniumLocator, toString = toString)
  
    __obj.asInstanceOf[Locator]
  }
}

