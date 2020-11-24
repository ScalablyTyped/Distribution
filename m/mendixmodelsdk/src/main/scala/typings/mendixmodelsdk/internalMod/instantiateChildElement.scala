package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.structuresMod.aliases.Container
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal", "instantiateChildElement")
@js.native
object instantiateChildElement extends js.Object {
  
  def apply(parent: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container]): typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null = js.native
  def apply(
    parent: typings.mendixmodelsdk.elementsMod.AbstractElement[IAbstractModel, Container],
    value: IAbstractElementJson
  ): typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] | Null = js.native
}
