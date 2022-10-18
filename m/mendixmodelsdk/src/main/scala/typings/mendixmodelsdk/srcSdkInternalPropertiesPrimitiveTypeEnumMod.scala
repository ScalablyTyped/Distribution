package typings.mendixmodelsdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSdkInternalPropertiesPrimitiveTypeEnumMod {
  
  @js.native
  sealed trait PrimitiveTypeEnum extends StObject
  @JSImport("mendixmodelsdk/src/sdk/internal/properties/PrimitiveTypeEnum", "PrimitiveTypeEnum")
  @js.native
  object PrimitiveTypeEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[PrimitiveTypeEnum & scala.Double] = js.native
    
    @js.native
    sealed trait Blob
      extends StObject
         with PrimitiveTypeEnum
    /* 9 */ val Blob: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Blob & scala.Double = js.native
    
    @js.native
    sealed trait Boolean
      extends StObject
         with PrimitiveTypeEnum
    /* 2 */ val Boolean: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Boolean & scala.Double = js.native
    
    @js.native
    sealed trait Color
      extends StObject
         with PrimitiveTypeEnum
    /* 8 */ val Color: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Color & scala.Double = js.native
    
    @js.native
    sealed trait DateTime
      extends StObject
         with PrimitiveTypeEnum
    /* 4 */ val DateTime: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.DateTime & scala.Double = js.native
    
    @js.native
    sealed trait Double
      extends StObject
         with PrimitiveTypeEnum
    /* 3 */ val Double: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Double & scala.Double = js.native
    
    @js.native
    sealed trait Guid
      extends StObject
         with PrimitiveTypeEnum
    /* 5 */ val Guid: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Guid & scala.Double = js.native
    
    @js.native
    sealed trait Integer
      extends StObject
         with PrimitiveTypeEnum
    /* 0 */ val Integer: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Integer & scala.Double = js.native
    
    @js.native
    sealed trait Point
      extends StObject
         with PrimitiveTypeEnum
    /* 6 */ val Point: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Point & scala.Double = js.native
    
    @js.native
    sealed trait Size
      extends StObject
         with PrimitiveTypeEnum
    /* 7 */ val Size: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.Size & scala.Double = js.native
    
    @js.native
    sealed trait String
      extends StObject
         with PrimitiveTypeEnum
    /* 1 */ val String: typings.mendixmodelsdk.srcSdkInternalPropertiesPrimitiveTypeEnumMod.PrimitiveTypeEnum.String & scala.Double = js.native
  }
}
