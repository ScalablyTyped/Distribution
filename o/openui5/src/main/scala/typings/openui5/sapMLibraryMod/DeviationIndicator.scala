package typings.openui5.sapMLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviationIndicator extends StObject
@JSImport("sap/m/library", "DeviationIndicator")
@js.native
object DeviationIndicator extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DeviationIndicator & String] = js.native
  
  /**
    * The actual value is less than the target value.
    */
  @js.native
  sealed trait Down
    extends StObject
       with DeviationIndicator
  /* "Down" */ val Down: typings.openui5.sapMLibraryMod.DeviationIndicator.Down & String = js.native
  
  /**
    * No value.
    */
  @js.native
  sealed trait None
    extends StObject
       with DeviationIndicator
  /* "None" */ val None: typings.openui5.sapMLibraryMod.DeviationIndicator.None & String = js.native
  
  /**
    * The actual value is more than the target value.
    */
  @js.native
  sealed trait Up
    extends StObject
       with DeviationIndicator
  /* "Up" */ val Up: typings.openui5.sapMLibraryMod.DeviationIndicator.Up & String = js.native
}
