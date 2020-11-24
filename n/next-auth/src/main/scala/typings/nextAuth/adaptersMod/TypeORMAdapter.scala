package typings.nextAuth.adaptersMod

import typings.nextAuth.anon.User
import typings.nextAuth.anon.`0`
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * TODO: fix auto-type schema
  */
@js.native
trait TypeORMAdapter[A /* <: TypeORMAccountModel */, U /* <: TypeORMUserModel */, S /* <: TypeORMSessionModel */, VR /* <: TypeORMVerificationRequestModel */] extends js.Object {
  
  def Adapter(typeOrmConfig: ConnectionOptions): typings.nextAuth.adaptersMod.Adapter[U, Profile, S, VR] = js.native
  def Adapter(typeOrmConfig: ConnectionOptions, options: `0`[A, U, S, VR]): typings.nextAuth.adaptersMod.Adapter[U, Profile, S, VR] = js.native
  
  var Models: User = js.native
}
