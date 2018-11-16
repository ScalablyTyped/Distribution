package typings
package pixiDotJsLib.PIXINs.prepareNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.prepare.BasePrepare")
@js.native
abstract class BasePrepare[UploadHookSource] protected () extends js.Object {
  def this(renderer: pixiDotJsLib.PIXINs.SystemRenderer) = this()
  var addHooks: js.Array[AddHook] = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  var completes: js.Array[js.Function] = js.native
  var limiter: CountLimiter | TimeLimiter = js.native
  var queue: js.Array[_] = js.native
  var renderer: pixiDotJsLib.PIXINs.SystemRenderer = js.native
  var ticking: scala.Boolean = js.native
  var uploadHookHelper: UploadHookSource = js.native
  var uploadHooks: js.Array[UploadHook[UploadHookSource]] = js.native
  def add(item: js.Any): this.type = js.native
  def add(item: pixiDotJsLib.PIXINs.BaseTexture): this.type = js.native
  def add(item: pixiDotJsLib.PIXINs.Container): this.type = js.native
  def add(item: pixiDotJsLib.PIXINs.DisplayObject): this.type = js.native
  def add(item: pixiDotJsLib.PIXINs.Graphics): this.type = js.native
  def add(item: pixiDotJsLib.PIXINs.Text): this.type = js.native
  def add(item: pixiDotJsLib.PIXINs.Texture): this.type = js.native
  /* protected */ def delayedTick(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  /* protected */ def findBaseTexture(item: pixiDotJsLib.PIXINs.DisplayObject, queue: js.Array[_]): scala.Boolean = js.native
  /* protected */ def findMultipleBaseTextures(item: pixiDotJsLib.PIXINs.DisplayObject, queue: js.Array[_]): scala.Boolean = js.native
  /* protected */ def findTexture(item: pixiDotJsLib.PIXINs.DisplayObject, queue: js.Array[_]): scala.Boolean = js.native
  /* protected */ def prepareItems(): scala.Unit = js.native
  def registerFindHook(addHook: AddHook): this.type = js.native
  def registerUploadHook(uploadHook: UploadHook[UploadHookSource]): this.type = js.native
  /* protected */ def tick(): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: js.Any): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: js.Any, done: js.Function0[scala.Unit]): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: js.Function): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: js.Function, done: js.Function0[scala.Unit]): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: pixiDotJsLib.PIXINs.BaseTexture): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: pixiDotJsLib.PIXINs.BaseTexture, done: js.Function0[scala.Unit]): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: pixiDotJsLib.PIXINs.Container): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: pixiDotJsLib.PIXINs.Container, done: js.Function0[scala.Unit]): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: pixiDotJsLib.PIXINs.DisplayObject): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: pixiDotJsLib.PIXINs.DisplayObject, done: js.Function0[scala.Unit]): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: pixiDotJsLib.PIXINs.Graphics): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: pixiDotJsLib.PIXINs.Graphics, done: js.Function0[scala.Unit]): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: pixiDotJsLib.PIXINs.Text): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: pixiDotJsLib.PIXINs.Text, done: js.Function0[scala.Unit]): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: pixiDotJsLib.PIXINs.Texture): scala.Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: pixiDotJsLib.PIXINs.Texture, done: js.Function0[scala.Unit]): scala.Unit = js.native
}

