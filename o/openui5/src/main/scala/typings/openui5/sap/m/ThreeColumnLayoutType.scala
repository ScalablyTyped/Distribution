package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.ThreeColumnLayoutType.EndColumnEmphasized
import typings.openui5.sap.m.ThreeColumnLayoutType.MidColumnEmphasized
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThreeColumnLayoutType with Double] = js.native
  /* 0 */ @js.native
  object EndColumnEmphasized extends TopLevel[EndColumnEmphasized with Double]
  
  /* 1 */ @js.native
  object MidColumnEmphasized extends TopLevel[MidColumnEmphasized with Double]
  
}

