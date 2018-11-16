package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("postman-collection", "UrlMatchPatternList")
@js.native
class UrlMatchPatternList protected () extends PropertyList[UrlMatchPattern] {
  def this(parent: Property[PropertyDefinition], list: js.Array[java.lang.String]) = this()
  def test(urlStr: java.lang.String): scala.Boolean = js.native
}

