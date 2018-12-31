package typings
package openui5Lib.sapNs.mNs

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
  sealed trait ContentMode
    extends openui5Lib.sapNs.mNs.GenericTileMode
  
  @js.native
  sealed trait HeaderMode
    extends openui5Lib.sapNs.mNs.GenericTileMode
  
  val ContentMode: ContentMode with java.lang.String = js.native
  val HeaderMode: HeaderMode with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[openui5Lib.sapNs.mNs.GenericTileMode with java.lang.String] = js.native
}

