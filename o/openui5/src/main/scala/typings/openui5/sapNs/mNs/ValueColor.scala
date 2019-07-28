package typings.openui5.sapNs.mNs

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
  
  /* 0 */ val Critical: typings.openui5.sapNs.mNs.ValueColor.Critical with Double = js.native
  /* 1 */ val Error: typings.openui5.sapNs.mNs.ValueColor.Error with Double = js.native
  /* 2 */ val Good: typings.openui5.sapNs.mNs.ValueColor.Good with Double = js.native
  /* 3 */ val Neutral: typings.openui5.sapNs.mNs.ValueColor.Neutral with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ValueColor with Double] = js.native
}

