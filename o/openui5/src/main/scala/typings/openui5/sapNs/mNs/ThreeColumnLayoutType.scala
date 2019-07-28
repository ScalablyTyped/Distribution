package typings.openui5.sapNs.mNs

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
  
  /* 0 */ val EndColumnEmphasized: typings.openui5.sapNs.mNs.ThreeColumnLayoutType.EndColumnEmphasized with Double = js.native
  /* 1 */ val MidColumnEmphasized: typings.openui5.sapNs.mNs.ThreeColumnLayoutType.MidColumnEmphasized with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThreeColumnLayoutType with Double] = js.native
}

