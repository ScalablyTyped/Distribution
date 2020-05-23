package typings.openui5.sap.m

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
  
}

