package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaybeDocument
  extends MaybeIdentifiedDocument
     with MaybeRevisionedDocument
object MaybeDocument {
  
  @scala.inline
  def apply(): MaybeDocument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaybeDocument]
  }
}
