package typings.petitDom.mod._Global_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object JSX {
  // tslint:disable-next-line:no-empty-interface
  type Element = typings.petitDom.mod.PetitDom.VNode
  // tslint:disable-next-line:no-empty-interface
  type ElementClass = typings.petitDom.mod.PetitDom.Component[typings.petitDom.mod.PetitDom.ComponentProps]
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicAttributes = typings.petitDom.mod.PetitDom.IntrinsicProps
  // tslint:disable-next-line:no-empty-interface
  type IntrinsicClassAttributes[T] = typings.petitDom.mod.PetitDom.Props[typings.std.Element]
  type IntrinsicElements = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in 'main' ]: petit-dom.petit-dom.PetitDom.Props<petit-dom.petit-dom.PetitDom.DomElements[P]> & {  content? :petit-dom.petit-dom.PetitDom.Content | std.ReadonlyArray<petit-dom.petit-dom.PetitDom.Content>}}
    */ typings.petitDom.petitDomStrings.IntrinsicElements with typings.petitDom.mod.PetitDom.DomElements
}
