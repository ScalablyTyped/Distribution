package typings.mongodb.mod

import typings.bson.mod.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "Code")
@js.native
open class Code protected ()
  extends typings.bson.mod.Code {
  /**
    * @param code - a string or function.
    * @param scope - an optional scope for the function.
    */
  def this(code: String) = this()
  def this(code: js.Function) = this()
  def this(code: String, scope: Document) = this()
  def this(code: js.Function, scope: Document) = this()
}
