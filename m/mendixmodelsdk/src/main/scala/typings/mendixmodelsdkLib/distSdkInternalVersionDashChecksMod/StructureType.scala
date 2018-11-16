package typings
package mendixmodelsdkLib.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StructureType extends js.Object

@JSImport("mendixmodelsdk/dist/sdk/internal/version-checks", "StructureType")
@js.native
object StructureType extends js.Object {
  @js.native
  sealed trait Element
    extends mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.StructureType
  
  @js.native
  sealed trait ModelUnit
    extends mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.StructureType
  
  @js.native
  sealed trait StructuralUnit
    extends mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.StructureType
  
  /* 2 */ val Element: Element with scala.Double = js.native
  /* 1 */ val ModelUnit: ModelUnit with scala.Double = js.native
  /* 0 */ val StructuralUnit: StructuralUnit with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    mendixmodelsdkLib.distSdkInternalVersionDashChecksMod.StructureType with scala.Double
  ] = js.native
}

