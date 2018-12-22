package typings
package petitDashDomLib.petitDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PetitDomNs {
  type ComponentProps = js.Object
  type Content = java.lang.String | VNode
  type DOMElementProps[E /* <: stdLib.Element */] = petitDashDomLib.petitDashDomLibStrings.DOMElementProps with E
  type Key = java.lang.String | scala.Double
  type Props[E /* <: stdLib.Element */] = IntrinsicProps with DOMElementProps[E]
  type ShouldUpdate[P /* <: ComponentProps */] = js.Function4[
    /* newProps */ P, 
    /* oldProps */ P, 
    /* newContent */ js.Array[VNode], 
    /* oldContent */ js.Array[VNode], 
    scala.Boolean
  ]
}
