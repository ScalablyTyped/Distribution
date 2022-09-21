package typings.oidcProvider.anon

import typings.oidcProvider.mod.DeviceCode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofDeviceCode extends StObject {
  
  /* static member */
  def findByUserCode(userCode: String): js.Promise[js.UndefOr[DeviceCode]] = js.native
  def findByUserCode(userCode: String, options: IgnoreExpiration): js.Promise[js.UndefOr[DeviceCode]] = js.native
  
  /* static member */
  def revokeByGrantId(grantId: String): js.Promise[Unit] = js.native
}
