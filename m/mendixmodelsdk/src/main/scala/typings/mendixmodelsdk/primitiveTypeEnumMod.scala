package typings.mendixmodelsdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitiveTypeEnumMod {
  
  @js.native
  sealed trait PrimitiveTypeEnum extends StObject
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/PrimitiveTypeEnum", "PrimitiveTypeEnum")
  @js.native
  object PrimitiveTypeEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[PrimitiveTypeEnum with scala.Double] = js.native
    
    @js.native
    sealed trait Blob extends PrimitiveTypeEnum
    /* 9 */ val Blob: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Blob with scala.Double = js.native
    
    @js.native
    sealed trait Boolean extends PrimitiveTypeEnum
    /* 2 */ val Boolean: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Boolean with scala.Double = js.native
    
    @js.native
    sealed trait Color extends PrimitiveTypeEnum
    /* 8 */ val Color: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Color with scala.Double = js.native
    
    @js.native
    sealed trait DateTime extends PrimitiveTypeEnum
    /* 4 */ val DateTime: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.DateTime with scala.Double = js.native
    
    @js.native
    sealed trait Double extends PrimitiveTypeEnum
    /* 3 */ val Double: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Double with scala.Double = js.native
    
    @js.native
    sealed trait Guid extends PrimitiveTypeEnum
    /* 5 */ val Guid: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Guid with scala.Double = js.native
    
    @js.native
    sealed trait Integer extends PrimitiveTypeEnum
    /* 0 */ val Integer: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Integer with scala.Double = js.native
    
    @js.native
    sealed trait Point extends PrimitiveTypeEnum
    /* 6 */ val Point: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Point with scala.Double = js.native
    
    @js.native
    sealed trait Size extends PrimitiveTypeEnum
    /* 7 */ val Size: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Size with scala.Double = js.native
    
    @js.native
    sealed trait String extends PrimitiveTypeEnum
    /* 1 */ val String: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.String with scala.Double = js.native
  }
}
