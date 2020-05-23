package typings.openui5.sap.ui.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TitleLevel extends js.Object

/**
  * Level of a title.
  */
@JSGlobal("sap.ui.core.TitleLevel")
@js.native
object TitleLevel extends js.Object {
  @js.native
  sealed trait Auto extends TitleLevel
  
  @js.native
  sealed trait H1 extends TitleLevel
  
  @js.native
  sealed trait H2 extends TitleLevel
  
  @js.native
  sealed trait H3 extends TitleLevel
  
  @js.native
  sealed trait H4 extends TitleLevel
  
  @js.native
  sealed trait H5 extends TitleLevel
  
  @js.native
  sealed trait H6 extends TitleLevel
  
}

