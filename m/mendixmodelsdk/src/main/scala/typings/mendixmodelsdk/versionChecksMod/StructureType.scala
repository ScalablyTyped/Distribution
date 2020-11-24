package typings.mendixmodelsdk.versionChecksMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StructureType extends js.Object
@JSImport("mendixmodelsdk/dist/sdk/internal/versionChecks", "StructureType")
@js.native
object StructureType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StructureType with Double] = js.native
  
  @js.native
  sealed trait Element extends StructureType
  /* 2 */ @js.native
  object Element extends TopLevel[Element with Double]
  
  @js.native
  sealed trait ModelUnit extends StructureType
  /* 1 */ @js.native
  object ModelUnit extends TopLevel[ModelUnit with Double]
  
  @js.native
  sealed trait StructuralUnit extends StructureType
  /* 0 */ @js.native
  object StructuralUnit extends TopLevel[StructuralUnit with Double]
}
