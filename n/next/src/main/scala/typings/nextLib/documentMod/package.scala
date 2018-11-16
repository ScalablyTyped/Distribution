package typings
package nextLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object documentMod {
  type Document[P] = reactLib.reactMod.Component[
    P with DefaultDocumentIProps with DocumentProps[nextDashServerLib.routerMod.DefaultQuery], 
    js.Object, 
    js.Any
  ]
  type DocumentComponentType[P, IP, C] = nextLib.nextMod.nextNs.NextComponentType[P with DocumentProps[nextDashServerLib.routerMod.DefaultQuery], IP, C]
  type Enhancer[E /* <: PageProps */, P /* <: js.Any */] = js.Function1[
    /* page */ reactLib.reactMod.ReactNs.ComponentType[P], 
    reactLib.reactMod.ReactNs.ComponentType[E]
  ]
}
