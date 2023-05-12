package typings.postcssSelectorParser.mod

import typings.postcssSelectorParser.postcssSelectorParserBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Namespace[Value /* <: js.UndefOr[String] */]
  extends StObject
     with Base[Value, js.UndefOr[Container[String, Node]]] {
  
  /**
    *  namespace prefix.
    */
  var namespace: String | `true` = js.native
  
  /**
    * A string representing the namespace suitable for output.
    */
  val namespaceString: String = js.native
  
  /** alias for namespace */
  var ns: String | `true` = js.native
  
  /**
    * If a namespace exists, prefix the value provided with it, separated by |.
    */
  def qualifiedName(value: String): String = js.native
}
