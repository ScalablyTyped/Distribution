package typings.mendixmodelsdk.internalMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import typings.mendixmodelsdk.transportInterfacesMod.IAbstractElementJson
import typings.mendixmodelsdk.utilsMod.utils.IMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal", "createElementFromJSON")
@js.native
object createElementFromJSON extends js.Object {
  
  def apply(model: IAbstractModel, json: IAbstractElementJson): typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] = js.native
  def apply(
    model: IAbstractModel,
    json: IAbstractElementJson,
    idToStructureMap: IMap[
      typings.mendixmodelsdk.structuresMod.Structure[IAbstractModel, IContainer | Null]
    ]
  ): typings.mendixmodelsdk.elementsMod.Element[IAbstractModel] = js.native
}
