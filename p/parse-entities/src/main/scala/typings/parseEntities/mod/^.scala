package typings.parseEntities.mod

import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("parse-entities", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Decode special characters in `value`.
    */
  def apply[WC, TC, RC](value: String): String = js.native
  def apply[WC, TC, RC](value: String, options: Partial[ParseEntitiesOptions[WC, TC, RC]]): String = js.native
}
