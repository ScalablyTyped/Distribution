package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Priority extends StObject
/**
  * Priorities for general use.
  */
@JSGlobal("sap.ui.core.Priority")
@js.native
object Priority extends StObject {
  
  @js.native
  sealed trait High
    extends StObject
       with Priority
  
  @js.native
  sealed trait Low
    extends StObject
       with Priority
  
  @js.native
  sealed trait Medium
    extends StObject
       with Priority
  
  @js.native
  sealed trait None
    extends StObject
       with Priority
}
