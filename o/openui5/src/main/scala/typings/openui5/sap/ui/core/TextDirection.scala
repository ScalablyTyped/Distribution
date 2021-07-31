package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextDirection extends StObject
/**
  * Configuration options for the direction of texts.
  */
@JSGlobal("sap.ui.core.TextDirection")
@js.native
object TextDirection extends StObject {
  
  @js.native
  sealed trait Inherit
    extends StObject
       with TextDirection
  
  @js.native
  sealed trait LTR
    extends StObject
       with TextDirection
  
  @js.native
  sealed trait RTL
    extends StObject
       with TextDirection
}
