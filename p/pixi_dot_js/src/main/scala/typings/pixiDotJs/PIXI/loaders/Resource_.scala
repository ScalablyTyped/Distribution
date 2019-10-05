package typings.pixiDotJs.PIXI.loaders

import typings.pixiDotJs.PIXI.MiniSignal
import typings.pixiDotJs.PIXI.Spritesheet
import typings.pixiDotJs.PIXI.Texture
import typings.pixiDotJs.PIXI.loaders.Resource.LOAD_TYPE
import typings.std.Error
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.loaders.Resource")
@js.native
class Resource_ protected () extends js.Object {
  def this(name: String, url: String) = this()
  def this(name: String, url: js.Array[String]) = this()
  def this(name: String, url: String, options: LoaderOptions) = this()
  def this(name: String, url: js.Array[String], options: LoaderOptions) = this()
  val children: js.Array[Resource] = js.native
  var crossOrigin: String = js.native
  var data: js.Any = js.native
  val error: Error = js.native
  val extension: String = js.native
  val isComplete: Boolean = js.native
  val isDataUrl: Boolean = js.native
  val isLoading: Boolean = js.native
  var loadType: LOAD_TYPE = js.native
  var metadata: IMetadata = js.native
  val name: String = js.native
  var onAfterMiddleware: MiniSignal[OnCompleteSignal] = js.native
  var onComplete: MiniSignal[OnCompleteSignal] = js.native
  var onProgress: MiniSignal[OnProgressSignal] = js.native
  var onStart: MiniSignal[OnStartSignal] = js.native
  val progressChunk: Double = js.native
  var sound: js.Any = js.native
  var spineAtlas: js.Any = js.native
  var spineData: js.Any = js.native
  var spritesheet: js.UndefOr[Spritesheet] = js.native
  var texture: Texture = js.native
  var textures: js.UndefOr[TextureDictionary] = js.native
  var timeout: Double = js.native
  val `type`: LOAD_TYPE = js.native
  val url: String = js.native
  val xhr: XMLHttpRequest = js.native
  var xhrType: String = js.native
  def abort(message: String): Unit = js.native
  def complete(): Unit = js.native
  def load(): Unit = js.native
  def load(cb: OnCompleteSignal): Unit = js.native
}

