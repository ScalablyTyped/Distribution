package typings
package msportalfxDashTestLib.msportalfxDashTestMod.MsPortalTestFxNs.LocatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainedLocator extends Locator {
  var locators: js.Array[Locator]
}

object ChainedLocator {
  @scala.inline
  def apply(
    findElements: js.Any => js.Any,
    locators: js.Array[Locator],
    seleniumLocator: js.Any,
    toString: () => java.lang.String
  ): ChainedLocator = {
    val __obj = js.Dynamic.literal(findElements = js.Any.fromFunction1(findElements), locators = locators, seleniumLocator = seleniumLocator, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[ChainedLocator]
  }
}

