package typings.npmProfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("npm-profile", "createToken")
@js.native
object createToken extends js.Object {
  
  def apply(password: String, readonly: Boolean, cidr_whitelist: js.Array[String]): js.Promise[Token] = js.native
  def apply(password: String, readonly: Boolean, cidr_whitelist: js.Array[String], options: Options): js.Promise[Token] = js.native
}
