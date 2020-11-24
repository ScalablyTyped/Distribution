package typings.mendixmodelsdk.deltaUtilsMod

import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.deltasDeltasMod.Delta
import typings.mendixmodelsdk.unitsMod.IAbstractUnit
import typings.mendixmodelsdk.unitsMod.ModelUnit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/deltas/deltaUtils", "asModelUnit")
@js.native
object asModelUnit extends js.Object {
  
  def apply(unit: IAbstractUnit, delta: Delta): ModelUnit[IAbstractModel] = js.native
}
