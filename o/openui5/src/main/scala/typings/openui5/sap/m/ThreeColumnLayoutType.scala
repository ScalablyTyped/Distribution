package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThreeColumnLayoutType extends js.Object

/**
  * Types of three-column layout for the sap.m.FlexibleColumnLayout control
  */
@JSGlobal("sap.m.ThreeColumnLayoutType")
@js.native
object ThreeColumnLayoutType extends js.Object {
  @js.native
  sealed trait EndColumnEmphasized extends ThreeColumnLayoutType
  
  @js.native
  sealed trait MidColumnEmphasized extends ThreeColumnLayoutType
  
}

