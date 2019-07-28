package typings.openui5.sapNs.mNs

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
  
  /* 0 */ val ContentMode: typings.openui5.sapNs.mNs.GenericTileMode.ContentMode with Double = js.native
  /* 1 */ val HeaderMode: typings.openui5.sapNs.mNs.GenericTileMode.HeaderMode with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GenericTileMode with Double] = js.native
}

