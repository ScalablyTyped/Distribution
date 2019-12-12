package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
import typings.openui5.sap.m.GenericTileMode.ContentMode
import typings.openui5.sap.m.GenericTileMode.HeaderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GenericTileMode extends js.Object

/**
  * Defines the mode of GenericTile.
  */
@JSGlobal("sap.m.GenericTileMode")
@js.native
object GenericTileMode extends js.Object {
  @js.native
  sealed trait ContentMode extends GenericTileMode
  
  @js.native
  sealed trait HeaderMode extends GenericTileMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GenericTileMode with Double] = js.native
  /* 0 */ @js.native
  object ContentMode extends TopLevel[ContentMode with Double]
  
  /* 1 */ @js.native
  object HeaderMode extends TopLevel[HeaderMode with Double]
  
}

