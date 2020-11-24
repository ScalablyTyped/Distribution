package typings.pathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("path-to-regexp", "tokensToFunction")
@js.native
object tokensToFunction extends js.Object {
  
  def apply[P /* <: js.Object */](tokens: js.Array[Token]): PathFunction[P] = js.native
  def apply[P /* <: js.Object */](tokens: js.Array[Token], options: TokensToFunctionOptions): PathFunction[P] = js.native
}
