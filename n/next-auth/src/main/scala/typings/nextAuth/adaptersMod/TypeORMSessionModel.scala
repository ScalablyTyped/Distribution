package typings.nextAuth.adaptersMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-auth/adapters", "TypeORMSessionModel")
@js.native
class TypeORMSessionModel protected () extends Session {
  def this(userId: Double, expires: Date) = this()
  def this(userId: Double, expires: Date, sessionToken: String) = this()
  def this(userId: Double, expires: Date, sessionToken: js.UndefOr[scala.Nothing], accessToken: String) = this()
  def this(userId: Double, expires: Date, sessionToken: String, accessToken: String) = this()
  
  @JSName("userId")
  var userId_TypeORMSessionModel: Double = js.native
}
