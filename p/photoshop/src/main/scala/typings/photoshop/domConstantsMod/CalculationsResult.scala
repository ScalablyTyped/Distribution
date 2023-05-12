package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CalculationsResult extends StObject
@JSImport("photoshop/dom/Constants", "CalculationsResult")
@js.native
object CalculationsResult extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CalculationsResult & String] = js.native
  
  @js.native
  sealed trait NEWCHANNEL
    extends StObject
       with CalculationsResult
  /* "channel" */ val NEWCHANNEL: typings.photoshop.domConstantsMod.CalculationsResult.NEWCHANNEL & String = js.native
  
  @js.native
  sealed trait NEWDOCUMENT
    extends StObject
       with CalculationsResult
  /* "document" */ val NEWDOCUMENT: typings.photoshop.domConstantsMod.CalculationsResult.NEWDOCUMENT & String = js.native
  
  @js.native
  sealed trait SELECTION
    extends StObject
       with CalculationsResult
  /* "selection" */ val SELECTION: typings.photoshop.domConstantsMod.CalculationsResult.SELECTION & String = js.native
}
