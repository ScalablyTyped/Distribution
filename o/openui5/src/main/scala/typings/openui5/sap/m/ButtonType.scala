package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonType extends StObject
/**
  * Different types for a button (predefined types)
  */
@JSGlobal("sap.m.ButtonType")
@js.native
object ButtonType extends StObject {
  
  @js.native
  sealed trait Accept
    extends StObject
       with ButtonType
  
  @js.native
  sealed trait Back
    extends StObject
       with ButtonType
  
  @js.native
  sealed trait Default
    extends StObject
       with ButtonType
  
  @js.native
  sealed trait Emphasized
    extends StObject
       with ButtonType
  
  @js.native
  sealed trait Reject
    extends StObject
       with ButtonType
  
  @js.native
  sealed trait Transparent
    extends StObject
       with ButtonType
  
  @js.native
  sealed trait Unstyled
    extends StObject
       with ButtonType
  
  @js.native
  sealed trait Up
    extends StObject
       with ButtonType
}
