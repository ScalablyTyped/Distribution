package typings
package mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PrimitiveTypeEnum extends js.Object

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/primitives", "PrimitiveTypeEnum")
@js.native
object PrimitiveTypeEnum extends js.Object {
  @js.native
  sealed trait Blob
    extends mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum
  
  @js.native
  sealed trait Boolean
    extends mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum
  
  @js.native
  sealed trait Color
    extends mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum
  
  @js.native
  sealed trait DateTime
    extends mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum
  
  @js.native
  sealed trait Double
    extends mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum
  
  @js.native
  sealed trait Guid
    extends mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum
  
  @js.native
  sealed trait Integer
    extends mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum
  
  @js.native
  sealed trait Point
    extends mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum
  
  @js.native
  sealed trait Size
    extends mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum
  
  @js.native
  sealed trait String
    extends mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum
  
  /* 9 */ val Blob: Blob with scala.Double = js.native
  /* 2 */ val Boolean: Boolean with scala.Double = js.native
  /* 8 */ val Color: Color with scala.Double = js.native
  /* 4 */ val DateTime: DateTime with scala.Double = js.native
  /* 3 */ val Double: Double with scala.Double = js.native
  /* 5 */ val Guid: Guid with scala.Double = js.native
  /* 0 */ val Integer: Integer with scala.Double = js.native
  /* 6 */ val Point: Point with scala.Double = js.native
  /* 7 */ val Size: Size with scala.Double = js.native
  /* 1 */ val String: String with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    mendixmodelsdkLib.distSdkInternalPropertiesPrimitivesMod.PrimitiveTypeEnum with scala.Double
  ] = js.native
}

