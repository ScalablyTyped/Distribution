package typings.minecraftDashScriptingDashTypesDashShared

import typings.minecraftDashScriptingDashTypesDashShared.minecraftDashScriptingDashTypesDashSharedStrings.block
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBlock extends _IMinecraftObject {
  /**
    * The identifier of the block
    */
  val __identifier__ : String
  /**
    * The type of the object
    */
  val __type__ : block
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
  def apply(__identifier__ : String, __type__ : block, block_position: VectorXYZ, ticking_area: ITickingArea): IBlock = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], block_position = block_position.asInstanceOf[js.Any], ticking_area = ticking_area.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBlock]
  }
}

