package typings.mendixmodelsdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object primitiveTypeEnumMod {
  
  @js.native
  sealed trait PrimitiveTypeEnum extends StObject
  @JSImport("mendixmodelsdk/dist/sdk/internal/properties/PrimitiveTypeEnum", "PrimitiveTypeEnum")
  @js.native
  object PrimitiveTypeEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[PrimitiveTypeEnum & scala.Double] = js.native
    
    @js.native
    sealed trait Blob
      extends StObject
         with PrimitiveTypeEnum
    /* 9 */ val Blob: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Blob & scala.Double = js.native
    
    @js.native
    sealed trait Boolean
      extends StObject
         with PrimitiveTypeEnum
    /* 2 */ val Boolean: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Boolean & scala.Double = js.native
    
    @js.native
    sealed trait Color
      extends StObject
         with PrimitiveTypeEnum
    /* 8 */ val Color: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Color & scala.Double = js.native
    
    @js.native
    sealed trait DateTime
      extends StObject
         with PrimitiveTypeEnum
    /* 4 */ val DateTime: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.DateTime & scala.Double = js.native
    
    @js.native
    sealed trait Double
      extends StObject
         with PrimitiveTypeEnum
    /* 3 */ val Double: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Double & scala.Double = js.native
    
    @js.native
    sealed trait Guid
      extends StObject
         with PrimitiveTypeEnum
    /* 5 */ val Guid: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Guid & scala.Double = js.native
    
    @js.native
    sealed trait Integer
      extends StObject
         with PrimitiveTypeEnum
    /* 0 */ val Integer: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Integer & scala.Double = js.native
    
    @js.native
    sealed trait Point
      extends StObject
         with PrimitiveTypeEnum
    /* 6 */ val Point: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Point & scala.Double = js.native
    
    @js.native
    sealed trait Size
      extends StObject
         with PrimitiveTypeEnum
    /* 7 */ val Size: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.Size & scala.Double = js.native
    
    @js.native
    sealed trait String
      extends StObject
         with PrimitiveTypeEnum
    /* 1 */ val String: typings.mendixmodelsdk.primitiveTypeEnumMod.PrimitiveTypeEnum.String & scala.Double = js.native
  }
}
