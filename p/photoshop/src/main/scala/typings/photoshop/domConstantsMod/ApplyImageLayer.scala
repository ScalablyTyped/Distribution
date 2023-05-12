package typings.photoshop.domConstantsMod

import typings.photoshop.domTypesApplyImageTypesMod.ApplyImageLayerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplyImageLayer extends StObject
@JSImport("photoshop/dom/Constants", "ApplyImageLayer")
@js.native
object ApplyImageLayer extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ApplyImageLayer & String] = js.native
  
  @js.native
  sealed trait MERGED
    extends StObject
       with ApplyImageLayer
       with ApplyImageLayerType
  /* "merged" */ val MERGED: typings.photoshop.domConstantsMod.ApplyImageLayer.MERGED & String = js.native
}
