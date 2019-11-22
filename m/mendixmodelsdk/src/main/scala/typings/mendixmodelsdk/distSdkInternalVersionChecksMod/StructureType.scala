package typings.mendixmodelsdk.distSdkInternalVersionChecksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StructureType extends js.Object

@JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "StructureType")
@js.native
object StructureType extends js.Object {
  @js.native
  sealed trait Element extends StructureType
  
  @js.native
  sealed trait ModelUnit extends StructureType
  
  @js.native
  sealed trait StructuralUnit extends StructureType
  
  /* 2 */ val Element: typings.mendixmodelsdk.distSdkInternalVersionChecksMod.StructureType.Element with Double = js.native
  /* 1 */ val ModelUnit: typings.mendixmodelsdk.distSdkInternalVersionChecksMod.StructureType.ModelUnit with Double = js.native
  /* 0 */ val StructuralUnit: typings.mendixmodelsdk.distSdkInternalVersionChecksMod.StructureType.StructuralUnit with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StructureType with Double] = js.native
}

