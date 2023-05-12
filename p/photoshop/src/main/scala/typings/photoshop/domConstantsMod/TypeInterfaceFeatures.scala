package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TypeInterfaceFeatures extends StObject
@JSImport("photoshop/dom/Constants", "TypeInterfaceFeatures")
@js.native
object TypeInterfaceFeatures extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TypeInterfaceFeatures & String] = js.native
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with TypeInterfaceFeatures
  /* "defaultTextInterface" */ val DEFAULT: typings.photoshop.domConstantsMod.TypeInterfaceFeatures.DEFAULT & String = js.native
  
  @js.native
  sealed trait EASTASIAN
    extends StObject
       with TypeInterfaceFeatures
  /* "advancedAsianInterface" */ val EASTASIAN: typings.photoshop.domConstantsMod.TypeInterfaceFeatures.EASTASIAN & String = js.native
  
  @js.native
  sealed trait MIDDLEEASTERN
    extends StObject
       with TypeInterfaceFeatures
  /* "middleEasternInterface" */ val MIDDLEEASTERN: typings.photoshop.domConstantsMod.TypeInterfaceFeatures.MIDDLEEASTERN & String = js.native
}
