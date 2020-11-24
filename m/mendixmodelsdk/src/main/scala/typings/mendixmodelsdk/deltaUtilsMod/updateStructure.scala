package typings.mendixmodelsdk.deltaUtilsMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.structuresMod.Structure
import typings.mendixmodelsdk.structuresMod.aliases.IContainer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "updateStructure")
@js.native
object updateStructure extends js.Object {
  
  def apply(
    structure: Structure[IAbstractModel, IContainer | Null],
    isReverting: Boolean,
    updateAction: js.Function0[Unit]
  ): Unit = js.native
}
