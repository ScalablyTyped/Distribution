package typings.nodeRedEditorClient.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Validators extends js.Object {
  
  def number(): js.Function1[/* v */ js.Any, Boolean] = js.native
  def number(blankAllowed: Boolean): js.Function1[/* v */ js.Any, Boolean] = js.native
  
  def regex(re: RegExp): js.Function1[/* v */ js.Any, Boolean] = js.native
  
  def typedInput(ptypeName: String): js.Function1[/* v */ js.Any, Boolean] = js.native
  def typedInput(ptypeName: String, isConfig: Boolean): js.Function1[/* v */ js.Any, Boolean] = js.native
}
