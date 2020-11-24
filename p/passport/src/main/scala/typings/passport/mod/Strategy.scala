package typings.passport.mod

import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Strategy extends js.Object {
  
  def authenticate(req: Request_[ParamsDictionary, _, _, Query]): js.Any = js.native
  def authenticate(req: Request_[ParamsDictionary, _, _, Query], options: js.Any): js.Any = js.native
  
  var name: js.UndefOr[String] = js.native
}
