package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DialogModes extends StObject
@JSImport("photoshop/dom/Constants", "DialogModes")
@js.native
object DialogModes extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DialogModes & String] = js.native
  
  /**
    * All dialogs will be shown
    */
  @js.native
  sealed trait ALL
    extends StObject
       with DialogModes
  /* "display" */ val ALL: typings.photoshop.domConstantsMod.DialogModes.ALL & String = js.native
  
  /**
    * Dialogs will be shown only if Photoshop raises an error
    */
  @js.native
  sealed trait ERROR
    extends StObject
       with DialogModes
  /* "silent" */ val ERROR: typings.photoshop.domConstantsMod.DialogModes.ERROR & String = js.native
  
  /**
    * All dialogs will be hidden, and bad calls will silently fail
    */
  @js.native
  sealed trait NONE
    extends StObject
       with DialogModes
  /* "dontDisplay" */ val NONE: typings.photoshop.domConstantsMod.DialogModes.NONE & String = js.native
}
