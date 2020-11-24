package typings.nextAuth.adaptersMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-auth/adapters", "TypeORMVerificationRequestModel")
@js.native
class TypeORMVerificationRequestModel protected () extends VerificationRequest {
  def this(identifier: String, token: String, expires: Date) = this()
}
