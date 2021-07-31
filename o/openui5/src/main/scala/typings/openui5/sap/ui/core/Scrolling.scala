package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Scrolling extends StObject
/**
  * Defines the possible values for horizontal and vertical scrolling behavior.
  */
@JSGlobal("sap.ui.core.Scrolling")
@js.native
object Scrolling extends StObject {
  
  @js.native
  sealed trait Auto
    extends StObject
       with Scrolling
  
  @js.native
  sealed trait Hidden
    extends StObject
       with Scrolling
  
  @js.native
  sealed trait None
    extends StObject
       with Scrolling
  
  @js.native
  sealed trait Scroll
    extends StObject
       with Scrolling
}
