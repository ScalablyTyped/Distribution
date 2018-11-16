package typings
package pixiDotJsLib.PIXINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.Spritesheet")
@js.native
class Spritesheet protected () extends js.Object {
  def this(baseTexture: BaseTexture, data: js.Any) = this()
  def this(baseTexture: BaseTexture, data: js.Any, resolutionFilename: java.lang.String) = this()
  var _batchIndex: scala.Double = js.native
  var _frameKeys: java.lang.String = js.native
  var _frames: js.Any = js.native
  var animations: ScalablyTyped.runtime.StringDictionary[Texture] = js.native
  var baseTexture: BaseTexture = js.native
  var data: js.Any = js.native
  var resolution: scala.Double = js.native
  var textures: ScalablyTyped.runtime.StringDictionary[Texture] = js.native
  /* protected */ def _callback(spriteSheet: this.type, textures: ScalablyTyped.runtime.StringDictionary[Texture]): scala.Unit = js.native
  /* protected */ def _nextBatch(): scala.Unit = js.native
  /* protected */ def _parseComplete(): scala.Unit = js.native
  /* protected */ def _processAnimations(): scala.Unit = js.native
  /* protected */ def _processFrames(initialFrameIndex: scala.Double): scala.Unit = js.native
  /* protected */ def _updateResolution(resolutionFilename: java.lang.String): scala.Double = js.native
  def destroy(): scala.Unit = js.native
  def destroy(destroyBase: scala.Boolean): scala.Unit = js.native
  def parse(
    callback: js.Function2[
      /* spriteSheet */ this.type, 
      /* textures */ ScalablyTyped.runtime.StringDictionary[Texture], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

@JSGlobal("PIXI.Spritesheet")
@js.native
object Spritesheet extends js.Object {
  var BATCH_SIZE: scala.Double = js.native
}

