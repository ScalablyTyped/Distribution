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
  
  val Critical: Critical with java.lang.String = js.native
  val Error: Error with java.lang.String = js.native
  val Good: Good with java.lang.String = js.native
  val Neutral: Neutral with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.ValueColor with java.lang.String] = js.native
}

