package typings.next

import typings.next.nextMod.NextComponentType
import typings.nextDashServer.routerMod.DefaultQuery
import typings.react.reactMod.Component
import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object documentMod {
  type Document[P] = Component[P with DefaultDocumentIProps with DocumentProps[DefaultQuery], js.Object, js.Any]
  type DocumentComponentType[P, IP, C] = NextComponentType[P with DocumentProps[DefaultQuery], IP, C]
  type Enhancer[E /* <: PageProps */, P /* <: js.Any */] = js.Function1[/* page */ ComponentType[P], ComponentType[E]]
}
