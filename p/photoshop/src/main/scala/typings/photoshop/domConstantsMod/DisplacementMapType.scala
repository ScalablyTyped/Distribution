package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DisplacementMapType extends StObject
@JSImport("photoshop/dom/Constants", "DisplacementMapType")
@js.native
object DisplacementMapType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DisplacementMapType & String] = js.native
  
  @js.native
  sealed trait STRETCHTOFIT
    extends StObject
       with DisplacementMapType
  /* "stretchToFit" */ val STRETCHTOFIT: typings.photoshop.domConstantsMod.DisplacementMapType.STRETCHTOFIT & String = js.native
  
  @js.native
  sealed trait TILE
    extends StObject
       with DisplacementMapType
  /* "tile" */ val TILE: typings.photoshop.domConstantsMod.DisplacementMapType.TILE & String = js.native
}
