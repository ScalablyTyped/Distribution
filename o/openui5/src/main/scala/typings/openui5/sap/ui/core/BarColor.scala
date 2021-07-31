package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BarColor extends StObject
/**
  * Configuration options for the colors of a progress bar
  */
@JSGlobal("sap.ui.core.BarColor")
@js.native
object BarColor extends StObject {
  
  @js.native
  sealed trait CRITICAL
    extends StObject
       with BarColor
  
  @js.native
  sealed trait NEGATIVE
    extends StObject
       with BarColor
  
  @js.native
  sealed trait NEUTRAL
    extends StObject
       with BarColor
  
  @js.native
  sealed trait POSITIVE
    extends StObject
       with BarColor
}
