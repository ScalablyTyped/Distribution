package typings.next.loadComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next/dist/next-server/server/load-components", "loadComponents")
@js.native
object loadComponents extends js.Object {
  def apply(distDir: String, pathname: String, serverless: Boolean): js.Promise[LoadComponentsReturnType] = js.native
}

