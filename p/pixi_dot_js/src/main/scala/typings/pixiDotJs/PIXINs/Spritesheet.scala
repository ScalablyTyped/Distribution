package typings.pixiDotJs.PIXINs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Spritesheet")
@js.native
class Spritesheet protected () extends js.Object {
  def this(baseTexture: BaseTexture, data: js.Any) = this()
  def this(baseTexture: BaseTexture, data: js.Any, resolutionFilename: String) = this()
  var _batchIndex: Double = js.native
  var _frameKeys: String = js.native
  var _frames: js.Any = js.native
  var animations: StringDictionary[js.Array[Texture]] = js.native
  var baseTexture: BaseTexture = js.native
  var data: js.Any = js.native
  var resolution: Double = js.native
  var textures: StringDictionary[Texture] = js.native
  /* protected */ def _callback(spriteSheet: this.type, textures: StringDictionary[Texture]): Unit = js.native
  /* protected */ def _nextBatch(): Unit = js.native
  /* protected */ def _parseComplete(): Unit = js.native
  /* protected */ def _processAnimations(): Unit = js.native
  /* protected */ def _processFrames(initialFrameIndex: Double): Unit = js.native
  /* protected */ def _updateResolution(resolutionFilename: String): Double = js.native
  def destroy(): Unit = js.native
  def destroy(destroyBase: Boolean): Unit = js.native
  def parse(
    callback: js.Function2[/* spriteSheet */ this.type, /* textures */ StringDictionary[Texture], Unit]
  ): Unit = js.native
}

/* static members */
@JSGlobal("PIXI.Spritesheet")
@js.native
object Spritesheet extends js.Object {
  var BATCH_SIZE: Double = js.native
}

