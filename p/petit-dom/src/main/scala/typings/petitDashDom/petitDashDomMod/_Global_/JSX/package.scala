package typings.petitDashDom.petitDashDomMod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSX {
  import typings.petitDashDom.petitDashDomMod.PetitDom.Component
  import typings.petitDashDom.petitDashDomMod.PetitDom.ComponentProps
  import typings.petitDashDom.petitDashDomMod.PetitDom.DomElements
  import typings.petitDashDom.petitDashDomMod.PetitDom.IntrinsicProps
  import typings.petitDashDom.petitDashDomMod.PetitDom.Props
  import typings.petitDashDom.petitDashDomMod.PetitDom.VNode

  // tslint:disable-next-line:no-empty-interface
  type Element = VNode
  // tslint:disable-next-line:no-empty-interface
  type ElementClass = Component[ComponentProps]
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicAttributes = IntrinsicProps
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicClassAttributes[T] = Props[typings.std.Element]
  type IntrinsicElements = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in 'main' ]: petit-dom.petit-dom.PetitDom.Props<petit-dom.petit-dom.PetitDom.DomElements[P]> & {  content? :petit-dom.petit-dom.PetitDom.Content | std.ReadonlyArray<petit-dom.petit-dom.PetitDom.Content>}}
    */ typings.petitDashDom.petitDashDomStrings.IntrinsicElements with DomElements
}
