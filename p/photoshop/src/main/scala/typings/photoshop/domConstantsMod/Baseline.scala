package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Baseline extends StObject
@JSImport("photoshop/dom/Constants", "Baseline")
@js.native
object Baseline extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Baseline & String] = js.native
  
  @js.native
  sealed trait NORMAL
    extends StObject
       with Baseline
  /* "normal" */ val NORMAL: typings.photoshop.domConstantsMod.Baseline.NORMAL & String = js.native
  
  @js.native
  sealed trait SUBSCRIPT
    extends StObject
       with Baseline
  /* "subScript" */ val SUBSCRIPT: typings.photoshop.domConstantsMod.Baseline.SUBSCRIPT & String = js.native
  
  @js.native
  sealed trait SUPERSCRIPT
    extends StObject
       with Baseline
  /* "superScript" */ val SUPERSCRIPT: typings.photoshop.domConstantsMod.Baseline.SUPERSCRIPT & String = js.native
}
