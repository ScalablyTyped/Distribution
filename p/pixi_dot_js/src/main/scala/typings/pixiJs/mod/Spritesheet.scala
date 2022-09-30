package typings.pixiJs.mod

import typings.pixiCore.mod.IAutoDetectOptions
import typings.pixiSpritesheet.mod.ISpritesheetData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pixi.js", "Spritesheet")
@js.native
open class Spritesheet protected ()
  extends typings.pixiSpritesheet.mod.Spritesheet {
  /**
    * @param texture - Reference to the source BaseTexture object.
    * @param {object} data - Spritesheet image data.
    * @param resolutionFilename - The filename to consider when determining
    *        the resolution of the spritesheet. If not provided, the imageUrl will
    *        be used on the BaseTexture.
    */
  def this(
    texture: typings.pixiCore.mod.BaseTexture[typings.pixiCore.mod.Resource, IAutoDetectOptions],
    data: ISpritesheetData
  ) = this()
  def this(texture: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource], data: ISpritesheetData) = this()
  def this(
    texture: typings.pixiCore.mod.BaseTexture[typings.pixiCore.mod.Resource, IAutoDetectOptions],
    data: ISpritesheetData,
    resolutionFilename: String
  ) = this()
  def this(
    texture: typings.pixiCore.mod.Texture[typings.pixiCore.mod.Resource],
    data: ISpritesheetData,
    resolutionFilename: String
  ) = this()
}
/* static members */
object Spritesheet {
  
  /** The maximum number of Textures to build per process. */
  @JSImport("pixi.js", "Spritesheet.BATCH_SIZE")
  @js.native
  val BATCH_SIZE: /* 1000 */ Double = js.native
}
