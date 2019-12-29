package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[HeaderLevel with Double] = js.native
  /* 0 */ @js.native
  object H1 extends TopLevel[H1 with Double]
  
  /* 1 */ @js.native
  object H2 extends TopLevel[H2 with Double]
  
  /* 2 */ @js.native
  object H3 extends TopLevel[H3 with Double]
  
  /* 3 */ @js.native
  object H4 extends TopLevel[H4 with Double]
  
  /* 4 */ @js.native
  object H5 extends TopLevel[H5 with Double]
  
  /* 5 */ @js.native
  object H6 extends TopLevel[H6 with Double]
  
}

