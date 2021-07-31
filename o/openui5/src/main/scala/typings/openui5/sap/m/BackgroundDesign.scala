package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BackgroundDesign extends StObject
/**
  * Available Background Design.
  */
@JSGlobal("sap.m.BackgroundDesign")
@js.native
object BackgroundDesign extends StObject {
  
  @js.native
  sealed trait Solid
    extends StObject
       with BackgroundDesign
  
  @js.native
  sealed trait Translucent
    extends StObject
       with BackgroundDesign
  
  @js.native
  sealed trait Transparent
    extends StObject
       with BackgroundDesign
}
