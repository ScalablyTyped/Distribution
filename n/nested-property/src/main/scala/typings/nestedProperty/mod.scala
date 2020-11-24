package typings.nestedProperty

import typings.nestedProperty.anon.Own
import typings.nestedProperty.anon.ValidPath
import typings.std.Error
import typings.std.ErrorConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nested-property", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def ObjectPrototypeMutationError(): Error = js.native
  def ObjectPrototypeMutationError(message: String): Error = js.native
  @JSName("ObjectPrototypeMutationError")
  var ObjectPrototypeMutationError_Original: ErrorConstructor = js.native
  
  def get(`object`: js.Any, property: String): js.Any = js.native
  
  def has(`object`: js.Any, property: String): Boolean = js.native
  def has(`object`: js.Any, property: String, options: Own): Boolean = js.native
  
  def isInNestedProperty(`object`: js.Any, property: String, objectInPath: js.Any): Boolean = js.native
  def isInNestedProperty(`object`: js.Any, property: String, objectInPath: js.Any, options: ValidPath): Boolean = js.native
  
  def set(`object`: js.Any, property: String, value: js.Any): js.Any = js.native
}
