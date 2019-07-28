package typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StructureType extends js.Object

@JSImport("mendixmodelsdk/dist/sdk/internal/version-checks", "StructureType")
@js.native
object StructureType extends js.Object {
  @js.native
  sealed trait Element extends StructureType
  
  @js.native
  sealed trait ModelUnit extends StructureType
  
  @js.native
  sealed trait StructuralUnit extends StructureType
  
  /* 2 */ val Element: typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.StructureType.Element with Double = js.native
  /* 1 */ val ModelUnit: typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.StructureType.ModelUnit with Double = js.native
  /* 0 */ val StructuralUnit: typings.mendixmodelsdk.distSdkInternalVersionDashChecksMod.StructureType.StructuralUnit with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StructureType with Double] = js.native
}

