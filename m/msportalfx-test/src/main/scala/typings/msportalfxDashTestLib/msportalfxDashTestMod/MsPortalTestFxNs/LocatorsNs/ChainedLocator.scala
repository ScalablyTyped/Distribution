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
    findElements: js.Function1[js.Any, js.Any],
    locators: js.Array[Locator],
    seleniumLocator: js.Any,
    toString: js.Function0[java.lang.String]
  ): ChainedLocator = {
    val __obj = js.Dynamic.literal(findElements = findElements, locators = locators, seleniumLocator = seleniumLocator, toString = toString)
  
    __obj.asInstanceOf[ChainedLocator]
  }
}

