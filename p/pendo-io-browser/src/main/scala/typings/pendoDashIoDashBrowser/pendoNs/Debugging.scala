package typings.pendoDashIoDashBrowser.pendoNs

import typings.pendoDashIoDashBrowser.Anon_Auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Debugging extends js.Object {
   // TODO
  def getAllGuides(): js.Array[Guide]
  def getAutoGuides(): Anon_Auto
  def getBadgeGuides(): js.Array[Guide]
  def getEventCache(): js.Array[_]
  def getLauncherGuides(): js.Array[Guide]
}

object Debugging {
  @scala.inline
  def apply(
    getAllGuides: () => js.Array[Guide],
    getAutoGuides: () => Anon_Auto,
    getBadgeGuides: () => js.Array[Guide],
    getEventCache: () => js.Array[_],
    getLauncherGuides: () => js.Array[Guide]
  ): Debugging = {
    val __obj = js.Dynamic.literal(getAllGuides = js.Any.fromFunction0(getAllGuides), getAutoGuides = js.Any.fromFunction0(getAutoGuides), getBadgeGuides = js.Any.fromFunction0(getBadgeGuides), getEventCache = js.Any.fromFunction0(getEventCache), getLauncherGuides = js.Any.fromFunction0(getLauncherGuides))
  
    __obj.asInstanceOf[Debugging]
  }
}

