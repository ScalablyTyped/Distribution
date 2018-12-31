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
  
  val EndColumnEmphasized: EndColumnEmphasized with java.lang.String = js.native
  val MidColumnEmphasized: MidColumnEmphasized with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.ThreeColumnLayoutType with java.lang.String] = js.native
}

