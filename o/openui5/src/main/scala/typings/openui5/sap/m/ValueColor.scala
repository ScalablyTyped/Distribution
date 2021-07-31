package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ValueColor extends StObject
/**
  * Enumeration of possible value color settings.
  */
@JSGlobal("sap.m.ValueColor")
@js.native
object ValueColor extends StObject {
  
  @js.native
  sealed trait Critical
    extends StObject
       with ValueColor
  
  @js.native
  sealed trait Error
    extends StObject
       with ValueColor
  
  @js.native
  sealed trait Good
    extends StObject
       with ValueColor
  
  @js.native
  sealed trait Neutral
    extends StObject
       with ValueColor
}
