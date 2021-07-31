package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextAlign extends StObject
/**
  * Configuration options for text alignments.
  */
@JSGlobal("sap.ui.core.TextAlign")
@js.native
object TextAlign extends StObject {
  
  @js.native
  sealed trait Begin
    extends StObject
       with TextAlign
  
  @js.native
  sealed trait Center
    extends StObject
       with TextAlign
  
  @js.native
  sealed trait End
    extends StObject
       with TextAlign
  
  @js.native
  sealed trait Initial
    extends StObject
       with TextAlign
  
  @js.native
  sealed trait Left
    extends StObject
       with TextAlign
  
  @js.native
  sealed trait Right
    extends StObject
       with TextAlign
}
