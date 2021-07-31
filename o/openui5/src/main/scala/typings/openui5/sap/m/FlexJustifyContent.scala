package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlexJustifyContent extends StObject
/**
  * Available options for the layout of elements along the main axis of the flexbox layout.
  */
@JSGlobal("sap.m.FlexJustifyContent")
@js.native
object FlexJustifyContent extends StObject {
  
  @js.native
  sealed trait Center
    extends StObject
       with FlexJustifyContent
  
  @js.native
  sealed trait End
    extends StObject
       with FlexJustifyContent
  
  @js.native
  sealed trait Inherit
    extends StObject
       with FlexJustifyContent
  
  @js.native
  sealed trait SpaceAround
    extends StObject
       with FlexJustifyContent
  
  @js.native
  sealed trait SpaceBetween
    extends StObject
       with FlexJustifyContent
  
  @js.native
  sealed trait Start
    extends StObject
       with FlexJustifyContent
}
