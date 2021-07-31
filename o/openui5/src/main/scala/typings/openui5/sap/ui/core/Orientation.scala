package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Orientation extends StObject
/**
  * Orientation of an UI element
  */
@JSGlobal("sap.ui.core.Orientation")
@js.native
object Orientation extends StObject {
  
  @js.native
  sealed trait Horizontal
    extends StObject
       with Orientation
  
  @js.native
  sealed trait Vertical
    extends StObject
       with Orientation
}
