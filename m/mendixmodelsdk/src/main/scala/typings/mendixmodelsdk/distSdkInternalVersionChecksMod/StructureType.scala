package typings.mendixmodelsdk.distSdkInternalVersionChecksMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StructureType with Double] = js.native
  /* 2 */ @js.native
  object Element extends TopLevel[Element with Double]
  
  /* 1 */ @js.native
  object ModelUnit extends TopLevel[ModelUnit with Double]
  
  /* 0 */ @js.native
  object StructuralUnit extends TopLevel[StructuralUnit with Double]
  
}

