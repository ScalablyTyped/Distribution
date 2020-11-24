package typings.nextAuth.mod

import typings.nextAuth.utilsMod.NextApiRequest
import typings.nextAuth.utilsMod.NextApiResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("next-auth", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(req: NextApiRequest, res: NextApiResponse[_]): js.Promise[Unit] = js.native
  def apply(req: NextApiRequest, res: NextApiResponse[_], options: InitOptions): js.Promise[Unit] = js.native
}
