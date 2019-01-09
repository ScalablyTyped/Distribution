package typings
package nextLib.nextMod.nextNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Next.js dev server instance API.
  */
@js.native
trait DevServer
  extends nextDashServerLib.nextDashServerMod.nextNs.Server {
  var hotReloader: js.Any = js.native
  @JSName("renderOpts")
  var renderOpts_DevServer: nextDashServerLib.nextDashServerMod.nextNs.RenderOptions with nextLib.Anon_DevHotReloader = js.native
  def addExportPathMapRoutes(): js.Promise[scala.Unit] = js.native
  def getCompilationError(): js.Promise[_] = js.native
  def getHotReloader(dir: java.lang.String, options: nextLib.Anon_BuildId): js.Any = js.native
}

