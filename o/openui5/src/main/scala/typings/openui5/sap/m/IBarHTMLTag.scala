package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait IBarHTMLTag extends StObject
/**
  * Allowed tags for the implementation of the IBar interface.
  */
@JSGlobal("sap.m.IBarHTMLTag")
@js.native
object IBarHTMLTag extends StObject {
  
  @js.native
  sealed trait Div
    extends StObject
       with IBarHTMLTag
  
  @js.native
  sealed trait Footer
    extends StObject
       with IBarHTMLTag
  
  @js.native
  sealed trait Header
    extends StObject
       with IBarHTMLTag
}
