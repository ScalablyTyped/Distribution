package typings
package nextLib.documentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextDocumentContext[Q /* <: nextDashServerLib.routerMod.DefaultQuery */]
  extends nextLib.nextMod.NextContext[Q] {
  /** A callback that executes the actual React rendering logic (synchronously) */
  def renderPage[E /* <: PageProps */, P, EA /* <: PageProps */, PA](): RenderPageResponse = js.native
  def renderPage[E /* <: PageProps */, P, EA /* <: PageProps */, PA](enhancer: nextLib.Anon_EnhanceApp[EA, PA, E, P]): RenderPageResponse = js.native
  def renderPage[E /* <: PageProps */, P, EA /* <: PageProps */, PA](enhancer: Enhancer[E, P]): RenderPageResponse = js.native
}

