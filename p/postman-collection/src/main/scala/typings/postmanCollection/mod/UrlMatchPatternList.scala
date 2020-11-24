package typings.postmanCollection.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "UrlMatchPatternList")
@js.native
class UrlMatchPatternList protected () extends PropertyList[UrlMatchPattern] {
  def this(parent: Property[PropertyDefinition], list: js.Array[String]) = this()
  
  def test(urlStr: String): Boolean = js.native
}
