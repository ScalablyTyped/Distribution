package typings.mendixmodelsdk.mod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.utilsMod.utils.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mendixmodelsdk", "createElementFromJSON")
@js.native
object createElementFromJSON extends js.Object {
  def apply(model: IAbstractModel, json: IAbstractElementJson): typings.mendixmodelsdk.elementsMod.Element = js.native
  def apply(
    model: IAbstractModel,
    json: IAbstractElementJson,
    idToStructureMap: IMap[typings.mendixmodelsdk.structuresMod.Structure]
  ): typings.mendixmodelsdk.elementsMod.Element = js.native
}

