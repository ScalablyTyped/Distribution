package typings.openui5.sap.m

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ThreeColumnLayoutType extends StObject
/**
  * Types of three-column layout for the sap.m.FlexibleColumnLayout control
  */
@JSGlobal("sap.m.ThreeColumnLayoutType")
@js.native
object ThreeColumnLayoutType extends StObject {
  
  @js.native
  sealed trait EndColumnEmphasized
    extends StObject
       with ThreeColumnLayoutType
  
  @js.native
  sealed trait MidColumnEmphasized
    extends StObject
       with ThreeColumnLayoutType
}
