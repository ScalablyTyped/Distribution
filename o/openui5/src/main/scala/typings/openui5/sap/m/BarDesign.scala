package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BarDesign extends StObject
/**
  * Types of the Bar design
  */
@JSGlobal("sap.m.BarDesign")
@js.native
object BarDesign extends StObject {
  
  @js.native
  sealed trait Auto
    extends StObject
       with BarDesign
  
  @js.native
  sealed trait Footer
    extends StObject
       with BarDesign
  
  @js.native
  sealed trait Header
    extends StObject
       with BarDesign
  
  @js.native
  sealed trait SubHeader
    extends StObject
       with BarDesign
}
