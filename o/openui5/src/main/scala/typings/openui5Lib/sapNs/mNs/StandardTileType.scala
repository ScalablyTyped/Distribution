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
  
  val Create: Create with java.lang.String = js.native
  val Monitor: Monitor with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.StandardTileType with java.lang.String] = js.native
}

