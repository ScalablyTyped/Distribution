package typings
package openui5Lib.sapNs.mNs

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
  sealed trait Create
    extends openui5Lib.sapNs.mNs.StandardTileType
  
  @js.native
  sealed trait Monitor
    extends openui5Lib.sapNs.mNs.StandardTileType
  
  @js.native
  sealed trait None
    extends openui5Lib.sapNs.mNs.StandardTileType
  
  /* 0 */ val Create: Create with scala.Double = js.native
  /* 1 */ val Monitor: Monitor with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[openui5Lib.sapNs.mNs.StandardTileType with scala.Double] = js.native
}

