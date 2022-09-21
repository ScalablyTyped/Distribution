package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "UrlMatchPatternList")
@js.native
open class UrlMatchPatternList protected () extends PropertyList[UrlMatchPattern] {
  def this(parent: Property[PropertyDefinition], list: js.Array[String]) = this()
  
  def test(urlStr: String): Boolean = js.native
}
