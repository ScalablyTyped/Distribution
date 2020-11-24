package typings.mendixmodelsdk

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk/dist/sdk/internal/properties/PrimitiveTypeEnum", JSImport.Namespace)
@js.native
object primitiveTypeEnumMod extends js.Object {
  
  @js.native
  sealed trait PrimitiveTypeEnum extends js.Object
  @js.native
  object PrimitiveTypeEnum extends js.Object {
    
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[PrimitiveTypeEnum with scala.Double] = js.native
    
    @js.native
    sealed trait Blob extends PrimitiveTypeEnum
    /* 9 */ @js.native
    object Blob
      extends TopLevel[Blob with scala.Double]
    
    @js.native
    sealed trait Boolean extends PrimitiveTypeEnum
    /* 2 */ @js.native
    object Boolean
      extends TopLevel[Boolean with scala.Double]
    
    @js.native
    sealed trait Color extends PrimitiveTypeEnum
    /* 8 */ @js.native
    object Color
      extends TopLevel[Color with scala.Double]
    
    @js.native
    sealed trait DateTime extends PrimitiveTypeEnum
    /* 4 */ @js.native
    object DateTime
      extends TopLevel[DateTime with scala.Double]
    
    @js.native
    sealed trait Double extends PrimitiveTypeEnum
    /* 3 */ @js.native
    object Double
      extends TopLevel[Double with scala.Double]
    
    @js.native
    sealed trait Guid extends PrimitiveTypeEnum
    /* 5 */ @js.native
    object Guid
      extends TopLevel[Guid with scala.Double]
    
    @js.native
    sealed trait Integer extends PrimitiveTypeEnum
    /* 0 */ @js.native
    object Integer
      extends TopLevel[Integer with scala.Double]
    
    @js.native
    sealed trait Point extends PrimitiveTypeEnum
    /* 6 */ @js.native
    object Point
      extends TopLevel[Point with scala.Double]
    
    @js.native
    sealed trait Size extends PrimitiveTypeEnum
    /* 7 */ @js.native
    object Size
      extends TopLevel[Size with scala.Double]
    
    @js.native
    sealed trait String extends PrimitiveTypeEnum
    /* 1 */ @js.native
    object String
      extends TopLevel[String with scala.Double]
  }
}
