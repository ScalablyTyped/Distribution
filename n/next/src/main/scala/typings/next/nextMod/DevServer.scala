package typings.next.nextMod

import typings.next.Anon_BuildId
import typings.next.Anon_Dev
import typings.nextDashServer.nextDashServerMod.RenderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Next.js dev server instance API.
  */
@js.native
trait DevServer
  extends typings.nextDashServer.nextDashServerMod.Server {
  var hotReloader: js.Any = js.native
  @JSName("renderOpts")
  var renderOpts_DevServer: RenderOptions with Anon_Dev = js.native
  def addExportPathMapRoutes(): js.Promise[Unit] = js.native
  def getCompilationError(): js.Promise[_] = js.native
  def getHotReloader(dir: String, options: Anon_BuildId): js.Any = js.native
}

