package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Kinsoku extends StObject
@JSImport("photoshop/dom/Constants", "Kinsoku")
@js.native
object Kinsoku extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Kinsoku & String] = js.native
  
  @js.native
  sealed trait JISMAXIMUM
    extends StObject
       with Kinsoku
  /* "Hard" */ val JISMAXIMUM: typings.photoshop.domConstantsMod.Kinsoku.JISMAXIMUM & String = js.native
  
  @js.native
  sealed trait JISWEAK
    extends StObject
       with Kinsoku
  /* "Soft" */ val JISWEAK: typings.photoshop.domConstantsMod.Kinsoku.JISWEAK & String = js.native
  
  @js.native
  sealed trait NONE
    extends StObject
       with Kinsoku
  /* "None" */ val NONE: typings.photoshop.domConstantsMod.Kinsoku.NONE & String = js.native
}
