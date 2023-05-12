package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MiddleEasternDigitsType extends StObject
@JSImport("photoshop/dom/Constants", "MiddleEasternDigitsType")
@js.native
object MiddleEasternDigitsType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[MiddleEasternDigitsType & String] = js.native
  
  @js.native
  sealed trait FARSI
    extends StObject
       with MiddleEasternDigitsType
  /* "farsiDigits" */ val FARSI: typings.photoshop.domConstantsMod.MiddleEasternDigitsType.FARSI & String = js.native
  
  @js.native
  sealed trait HINDI
    extends StObject
       with MiddleEasternDigitsType
  /* "hindiDigits" */ val HINDI: typings.photoshop.domConstantsMod.MiddleEasternDigitsType.HINDI & String = js.native
  
  @js.native
  sealed trait LTRARABIC
    extends StObject
       with MiddleEasternDigitsType
  /* "arabicDigits" */ val LTRARABIC: typings.photoshop.domConstantsMod.MiddleEasternDigitsType.LTRARABIC & String = js.native
  
  @js.native
  sealed trait RTLARABIC
    extends StObject
       with MiddleEasternDigitsType
  /* "RTLarabicDigits" */ val RTLARABIC: typings.photoshop.domConstantsMod.MiddleEasternDigitsType.RTLARABIC & String = js.native
}
