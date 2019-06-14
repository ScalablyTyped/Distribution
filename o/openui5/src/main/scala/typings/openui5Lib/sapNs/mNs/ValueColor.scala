package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Critical
    extends openui5Lib.sapNs.mNs.ValueColor
  
  @js.native
  sealed trait Error
    extends openui5Lib.sapNs.mNs.ValueColor
  
  @js.native
  sealed trait Good
    extends openui5Lib.sapNs.mNs.ValueColor
  
  @js.native
  sealed trait Neutral
    extends openui5Lib.sapNs.mNs.ValueColor
  
  /* 0 */ val Critical: Critical with scala.Double = js.native
  /* 1 */ val Error: Error with scala.Double = js.native
  /* 2 */ val Good: Good with scala.Double = js.native
  /* 3 */ val Neutral: Neutral with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.ValueColor with scala.Double] = js.native
}

