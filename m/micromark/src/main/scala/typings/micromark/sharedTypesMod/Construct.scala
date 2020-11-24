package typings.micromark.sharedTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Construct extends js.Object {
  
  var concrete: js.UndefOr[Boolean] = js.native
  
  var interruptible: js.UndefOr[Boolean] = js.native
  
  var `lazy`: js.UndefOr[Boolean] = js.native
  
  var partial: js.UndefOr[Boolean] = js.native
  
  var resolve: js.UndefOr[Resolve] = js.native
  
  var resolveAll: js.UndefOr[Resolve] = js.native
  
  var resolveTo: js.UndefOr[Resolve] = js.native
  
  def tokenize(context: Tokenizer, effects: Effects): State = js.native
  @JSName("tokenize")
  var tokenize_Original: Tokenize = js.native
}
