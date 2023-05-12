package typings.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Units extends StObject
@JSImport("photoshop/dom/Constants", "Units")
@js.native
object Units extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Units & String] = js.native
  
  @js.native
  sealed trait CM
    extends StObject
       with Units
  /* "cm" */ val CM: typings.photoshop.domConstantsMod.Units.CM & String = js.native
  
  @js.native
  sealed trait INCHES
    extends StObject
       with Units
  /* "in" */ val INCHES: typings.photoshop.domConstantsMod.Units.INCHES & String = js.native
  
  @js.native
  sealed trait MM
    extends StObject
       with Units
  /* "mm" */ val MM: typings.photoshop.domConstantsMod.Units.MM & String = js.native
  
  @js.native
  sealed trait PICAS
    extends StObject
       with Units
  /* "pc" */ val PICAS: typings.photoshop.domConstantsMod.Units.PICAS & String = js.native
  
  @js.native
  sealed trait PIXELS
    extends StObject
       with Units
  /* "px" */ val PIXELS: typings.photoshop.domConstantsMod.Units.PIXELS & String = js.native
  
  @js.native
  sealed trait POINTS
    extends StObject
       with Units
  /* "pt" */ val POINTS: typings.photoshop.domConstantsMod.Units.POINTS & String = js.native
}
