package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextCase extends StObject
@JSImport("photoshop/dom/Constants", "TextCase")
@js.native
object TextCase extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[TextCase & String] = js.native
  
  @js.native
  sealed trait ALLCAPS
    extends StObject
       with TextCase
  /* "allCaps" */ val ALLCAPS: typings.photoshop.domConstantsMod.TextCase.ALLCAPS & String = js.native
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with TextCase
  /* "normal" */ val NORMAL: typings.photoshop.domConstantsMod.TextCase.NORMAL & String = js.native
  
  @js.native
  sealed trait SMALLCAPS
    extends StObject
       with TextCase
  /* "smallCaps" */ val SMALLCAPS: typings.photoshop.domConstantsMod.TextCase.SMALLCAPS & String = js.native
}
