package typings
package nextLib.documentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextDocumentContext[Q /* <: nextDashServerLib.routerMod.DefaultQuery */]
  extends nextLib.nextMod.nextNs.NextContext[Q] {
  /** A callback that executes the actual React rendering logic (synchronously) */
  def renderPage[E /* <: PageProps */, P /* <: js.Any */](): RenderPageResponse = js.native
  /** A callback that executes the actual React rendering logic (synchronously) */
  def renderPage[E /* <: PageProps */, P /* <: js.Any */](enhancer: Enhancer[E, P]): RenderPageResponse = js.native
}

