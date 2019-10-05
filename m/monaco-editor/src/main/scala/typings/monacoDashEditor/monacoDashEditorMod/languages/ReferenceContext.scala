package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceContext extends js.Object {
  /**
    * Include the declaration of the current symbol.
    */
  var includeDeclaration: Boolean
}

object ReferenceContext {
  @scala.inline
  def apply(includeDeclaration: Boolean): ReferenceContext = {
    val __obj = js.Dynamic.literal(includeDeclaration = includeDeclaration)
  
    __obj.asInstanceOf[ReferenceContext]
  }
}

