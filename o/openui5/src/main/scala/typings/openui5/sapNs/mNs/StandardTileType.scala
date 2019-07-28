package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait StandardTileType extends js.Object

/**
  * Types for StandardTile
  */
@JSGlobal("sap.m.StandardTileType")
@js.native
object StandardTileType extends js.Object {
  @js.native
  sealed trait Create extends StandardTileType
  
  @js.native
  sealed trait Monitor extends StandardTileType
  
  @js.native
  sealed trait None extends StandardTileType
  
  /* 0 */ val Create: typings.openui5.sapNs.mNs.StandardTileType.Create with Double = js.native
  /* 1 */ val Monitor: typings.openui5.sapNs.mNs.StandardTileType.Monitor with Double = js.native
  /* 2 */ val None: typings.openui5.sapNs.mNs.StandardTileType.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StandardTileType with Double] = js.native
}

