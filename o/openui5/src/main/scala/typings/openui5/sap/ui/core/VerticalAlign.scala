package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VerticalAlign extends StObject
/**
  * Configuration options for vertical alignments, for example of a layout cell content within the
  * borders.
  */
@JSGlobal("sap.ui.core.VerticalAlign")
@js.native
object VerticalAlign extends StObject {
  
  @js.native
  sealed trait Bottom
    extends StObject
       with VerticalAlign
  
  @js.native
  sealed trait Inherit
    extends StObject
       with VerticalAlign
  
  @js.native
  sealed trait Middle
    extends StObject
       with VerticalAlign
  
  @js.native
  sealed trait Top
    extends StObject
       with VerticalAlign
}
