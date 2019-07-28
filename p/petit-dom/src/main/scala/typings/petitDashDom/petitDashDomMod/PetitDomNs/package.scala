package typings.petitDashDom.petitDashDomMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object PetitDomNs {
  type ComponentProps = js.Object
  type Content = String | VNode
  type DOMElementProps[E /* <: Element */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof E ]:? E[P]}
    */ typings.petitDashDom.petitDashDomStrings.DOMElementProps with E
  type Key = String | Double
  type Props[E /* <: Element */] = IntrinsicProps with DOMElementProps[E]
  type ShouldUpdate[P /* <: ComponentProps */] = js.Function4[
    /* newProps */ P, 
    /* oldProps */ P, 
    /* newContent */ js.Array[VNode], 
    /* oldContent */ js.Array[VNode], 
    Boolean
  ]
}
