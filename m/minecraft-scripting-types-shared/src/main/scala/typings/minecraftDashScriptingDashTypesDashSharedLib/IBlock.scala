package typings
package minecraftDashScriptingDashTypesDashSharedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBlock extends _IMinecraftObject {
  /**
    * The identifier of the block
    */
  val __identifier__ : java.lang.String
  /**
    * The type of the object
    */
  val __type__ : minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.block
  /**
    * This is the position of the block. It also functions as part of its unique identifier
    */
  val block_position: VectorXYZ
  /**
    * This is the ticking area object that was used to get this block
    */
  val ticking_area: ITickingArea
}

object IBlock {
  @scala.inline
  def apply(
    __identifier__ : java.lang.String,
    __type__ : minecraftDashScriptingDashTypesDashSharedLib.minecraftDashScriptingDashTypesDashSharedLibStrings.block,
    block_position: VectorXYZ,
    ticking_area: ITickingArea
  ): IBlock = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__, __type__ = __type__, block_position = block_position, ticking_area = ticking_area)
  
    __obj.asInstanceOf[IBlock]
  }
}

