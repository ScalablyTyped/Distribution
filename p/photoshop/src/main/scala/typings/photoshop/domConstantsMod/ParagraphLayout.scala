package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ParagraphLayout extends StObject
@JSImport("photoshop/dom/Constants", "ParagraphLayout")
@js.native
object ParagraphLayout extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ParagraphLayout & String] = js.native
  
  @js.native
  sealed trait LATINEASTASIAN
    extends StObject
       with ParagraphLayout
  /* "textLatinCJKComposer" */ val LATINEASTASIAN: typings.photoshop.domConstantsMod.ParagraphLayout.LATINEASTASIAN & String = js.native
  
  @js.native
  sealed trait WORLDREADY
    extends StObject
       with ParagraphLayout
  /* "textOptycaComposer" */ val WORLDREADY: typings.photoshop.domConstantsMod.ParagraphLayout.WORLDREADY & String = js.native
}
