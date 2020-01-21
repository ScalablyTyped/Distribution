package typings.mendixmodelsdk

import typings.mendixmodelsdk.elementsMod.AbstractElement
import typings.mendixmodelsdk.elementsMod.Element
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/instantiateChildElement", JSImport.Namespace)
@js.native
object instantiateChildElementMod extends js.Object {
  def instantiateChildElement(parent: AbstractElement): Element | Null = js.native
  def instantiateChildElement(parent: AbstractElement, value: IAbstractElementJson): Element | Null = js.native
}

