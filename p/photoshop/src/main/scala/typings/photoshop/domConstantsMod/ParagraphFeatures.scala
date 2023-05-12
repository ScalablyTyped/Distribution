package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParagraphFeatures extends StObject
@JSImport("photoshop/dom/Constants", "ParagraphFeatures")
@js.native
object ParagraphFeatures extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ParagraphFeatures & String] = js.native
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with ParagraphFeatures
  /* "defaultTextInterface" */ val DEFAULT: typings.photoshop.domConstantsMod.ParagraphFeatures.DEFAULT & String = js.native
  
  @js.native
  sealed trait EASTASIAN
    extends StObject
       with ParagraphFeatures
  /* "advancedAsianInterface" */ val EASTASIAN: typings.photoshop.domConstantsMod.ParagraphFeatures.EASTASIAN & String = js.native
  
  @js.native
  sealed trait MIDDLEASTERN
    extends StObject
       with ParagraphFeatures
  /* "middleEasternInterface" */ val MIDDLEASTERN: typings.photoshop.domConstantsMod.ParagraphFeatures.MIDDLEASTERN & String = js.native
}
