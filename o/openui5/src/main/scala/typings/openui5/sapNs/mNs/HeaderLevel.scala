package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeaderLevel extends js.Object

/**
  * Different levels for headers
  */
@JSGlobal("sap.m.HeaderLevel")
@js.native
object HeaderLevel extends js.Object {
  @js.native
  sealed trait H1 extends HeaderLevel
  
  @js.native
  sealed trait H2 extends HeaderLevel
  
  @js.native
  sealed trait H3 extends HeaderLevel
  
  @js.native
  sealed trait H4 extends HeaderLevel
  
  @js.native
  sealed trait H5 extends HeaderLevel
  
  @js.native
  sealed trait H6 extends HeaderLevel
  
  /* 0 */ val H1: typings.openui5.sapNs.mNs.HeaderLevel.H1 with Double = js.native
  /* 1 */ val H2: typings.openui5.sapNs.mNs.HeaderLevel.H2 with Double = js.native
  /* 2 */ val H3: typings.openui5.sapNs.mNs.HeaderLevel.H3 with Double = js.native
  /* 3 */ val H4: typings.openui5.sapNs.mNs.HeaderLevel.H4 with Double = js.native
  /* 4 */ val H5: typings.openui5.sapNs.mNs.HeaderLevel.H5 with Double = js.native
  /* 5 */ val H6: typings.openui5.sapNs.mNs.HeaderLevel.H6 with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeaderLevel with Double] = js.native
}

