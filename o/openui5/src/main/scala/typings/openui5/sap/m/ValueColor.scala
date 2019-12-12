package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.ValueColor.Critical
import typings.openui5.sap.m.ValueColor.Error
import typings.openui5.sap.m.ValueColor.Good
import typings.openui5.sap.m.ValueColor.Neutral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ValueColor extends js.Object

/**
  * Enumeration of possible value color settings.
  */
@JSGlobal("sap.m.ValueColor")
@js.native
object ValueColor extends js.Object {
  @js.native
  sealed trait Critical extends ValueColor
  
  @js.native
  sealed trait Error extends ValueColor
  
  @js.native
  sealed trait Good extends ValueColor
  
  @js.native
  sealed trait Neutral extends ValueColor
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueColor with Double] = js.native
  /* 0 */ @js.native
  object Critical extends TopLevel[Critical with Double]
  
  /* 1 */ @js.native
  object Error extends TopLevel[Error with Double]
  
  /* 2 */ @js.native
  object Good extends TopLevel[Good with Double]
  
  /* 3 */ @js.native
  object Neutral extends TopLevel[Neutral with Double]
  
}

