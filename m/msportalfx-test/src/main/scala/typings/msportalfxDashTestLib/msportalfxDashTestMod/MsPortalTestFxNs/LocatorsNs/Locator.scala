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
  def apply(findElements: js.Any => js.Any, seleniumLocator: js.Any, toString: () => java.lang.String): Locator = {
    val __obj = js.Dynamic.literal(findElements = js.Any.fromFunction1(findElements), seleniumLocator = seleniumLocator, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Locator]
  }
}

