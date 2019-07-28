package typings.next.documentMod

import typings.next.Anon_EnhanceApp
import typings.next.nextMod.NextContext
import typings.nextDashServer.routerMod.DefaultQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NextDocumentContext[Q /* <: DefaultQuery */, CustomReq] extends NextContext[Q, CustomReq] {
  /** A callback that executes the actual React rendering logic (synchronously) */
  def renderPage[E /* <: PageProps */, P, EA /* <: PageProps */, PA](): RenderPageResponse = js.native
  def renderPage[E /* <: PageProps */, P, EA /* <: PageProps */, PA](enhancer: Anon_EnhanceApp[EA, PA, E, P]): RenderPageResponse = js.native
  def renderPage[E /* <: PageProps */, P, EA /* <: PageProps */, PA](enhancer: Enhancer[E, P]): RenderPageResponse = js.native
}

