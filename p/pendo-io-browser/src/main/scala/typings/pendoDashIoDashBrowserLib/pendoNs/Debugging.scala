package typings
package pendoDashIoDashBrowserLib.pendoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Debugging extends js.Object {
   // TODO
  def getAllGuides(): js.Array[Guide]
  def getAutoGuides(): pendoDashIoDashBrowserLib.Anon_Auto
  def getBadgeGuides(): js.Array[Guide]
  def getEventCache(): js.Array[_]
  def getLauncherGuides(): js.Array[Guide]
}

object Debugging {
  @scala.inline
  def apply(
    getAllGuides: js.Function0[js.Array[Guide]],
    getAutoGuides: js.Function0[pendoDashIoDashBrowserLib.Anon_Auto],
    getBadgeGuides: js.Function0[js.Array[Guide]],
    getEventCache: js.Function0[js.Array[_]],
    getLauncherGuides: js.Function0[js.Array[Guide]]
  ): Debugging = {
    val __obj = js.Dynamic.literal(getAllGuides = getAllGuides, getAutoGuides = getAutoGuides, getBadgeGuides = getBadgeGuides, getEventCache = getEventCache, getLauncherGuides = getLauncherGuides)
  
    __obj.asInstanceOf[Debugging]
  }
}

