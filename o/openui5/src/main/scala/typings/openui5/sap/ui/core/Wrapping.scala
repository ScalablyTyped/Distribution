package typings.openui5.sap.ui.core

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.ui.core.Wrapping.Hard
import typings.openui5.sap.ui.core.Wrapping.None
import typings.openui5.sap.ui.core.Wrapping.Off
import typings.openui5.sap.ui.core.Wrapping.Soft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Wrapping extends js.Object

/**
  * Configuration options for text wrapping.
  */
@JSGlobal("sap.ui.core.Wrapping")
@js.native
object Wrapping extends js.Object {
  @js.native
  sealed trait Hard extends Wrapping
  
  @js.native
  sealed trait None extends Wrapping
  
  @js.native
  sealed trait Off extends Wrapping
  
  @js.native
  sealed trait Soft extends Wrapping
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Wrapping with Double] = js.native
  /* 0 */ @js.native
  object Hard extends TopLevel[Hard with Double]
  
  /* 1 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object Off extends TopLevel[Off with Double]
  
  /* 3 */ @js.native
  object Soft extends TopLevel[Soft with Double]
  
}

