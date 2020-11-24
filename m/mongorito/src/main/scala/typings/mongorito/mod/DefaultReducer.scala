package typings.mongorito.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultReducer extends js.Object {
  
  def fields(state: js.Object, action: Action): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongorito.mongorito.Reducer<any> */ js.Object = js.native
  @JSName("fields")
  var fields_Original: Reducer[js.Object] = js.native
  
  def unset(state: js.Array[String], action: Action): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mongorito.mongorito.Reducer<any> */ js.Object = js.native
  @JSName("unset")
  var unset_Original: Reducer[js.Array[String]] = js.native
}
