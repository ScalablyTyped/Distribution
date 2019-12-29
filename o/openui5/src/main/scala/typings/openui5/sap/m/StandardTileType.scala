package typings.openui5.sap.m

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[StandardTileType with Double] = js.native
  /* 0 */ @js.native
  object Create extends TopLevel[Create with Double]
  
  /* 1 */ @js.native
  object Monitor extends TopLevel[Monitor with Double]
  
  /* 2 */ @js.native
  object None extends TopLevel[None with Double]
  
}

