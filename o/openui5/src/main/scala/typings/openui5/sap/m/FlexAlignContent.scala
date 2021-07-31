package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlexAlignContent extends StObject
/**
  * Available options for the layout of container lines along the cross axis of the flexbox layout.
  * <b>Note:</b> This property has no effect in Internet Explorer 10.
  */
@JSGlobal("sap.m.FlexAlignContent")
@js.native
object FlexAlignContent extends StObject {
  
  @js.native
  sealed trait Center
    extends StObject
       with FlexAlignContent
  
  @js.native
  sealed trait End
    extends StObject
       with FlexAlignContent
  
  @js.native
  sealed trait Inherit
    extends StObject
       with FlexAlignContent
  
  @js.native
  sealed trait SpaceAround
    extends StObject
       with FlexAlignContent
  
  @js.native
  sealed trait SpaceBetween
    extends StObject
       with FlexAlignContent
  
  @js.native
  sealed trait Start
    extends StObject
       with FlexAlignContent
  
  @js.native
  sealed trait Stretch
    extends StObject
       with FlexAlignContent
}
