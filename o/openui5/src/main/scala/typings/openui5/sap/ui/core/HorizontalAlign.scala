package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HorizontalAlign extends StObject
/**
  * Configuration options for horizontal alignments of controls
  */
@JSGlobal("sap.ui.core.HorizontalAlign")
@js.native
object HorizontalAlign extends StObject {
  
  @js.native
  sealed trait Begin
    extends StObject
       with HorizontalAlign
  
  @js.native
  sealed trait Center
    extends StObject
       with HorizontalAlign
  
  @js.native
  sealed trait End
    extends StObject
       with HorizontalAlign
  
  @js.native
  sealed trait Left
    extends StObject
       with HorizontalAlign
  
  @js.native
  sealed trait Right
    extends StObject
       with HorizontalAlign
}
