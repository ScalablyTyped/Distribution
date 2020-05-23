package typings.next

import typings.next.anon.Fallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/server/static-paths-worker", JSImport.Namespace)
@js.native
object staticPathsWorkerMod extends js.Object {
  def loadStaticPaths(distDir: String, buildId: String, pathname: String, serverless: Boolean): js.Promise[Fallback] = js.native
}

