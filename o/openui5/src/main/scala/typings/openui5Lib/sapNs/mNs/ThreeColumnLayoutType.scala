package typings
package openui5Lib.sapNs.mNs

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
  sealed trait EndColumnEmphasized
    extends openui5Lib.sapNs.mNs.ThreeColumnLayoutType
  
  @js.native
  sealed trait MidColumnEmphasized
    extends openui5Lib.sapNs.mNs.ThreeColumnLayoutType
  
  /* 0 */ val EndColumnEmphasized: EndColumnEmphasized with scala.Double = js.native
  /* 1 */ val MidColumnEmphasized: MidColumnEmphasized with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ThreeColumnLayoutType with scala.Double] = js.native
}

