package typings.pixiDotJs.PIXINs.prepareNs

import typings.pixiDotJs.PIXINs.BaseTexture
import typings.pixiDotJs.PIXINs.Container
import typings.pixiDotJs.PIXINs.DisplayObject
import typings.pixiDotJs.PIXINs.Graphics
import typings.pixiDotJs.PIXINs.SystemRenderer
import typings.pixiDotJs.PIXINs.Text
import typings.pixiDotJs.PIXINs.Texture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PIXI.prepare.BasePrepare")
@js.native
abstract class BasePrepare[UploadHookSource] protected () extends js.Object {
  def this(renderer: SystemRenderer) = this()
  var addHooks: js.Array[AddHook] = js.native
  var limiter: CountLimiter | TimeLimiter = js.native
  var queue: js.Array[_] = js.native
  var renderer: SystemRenderer = js.native
  var ticking: Boolean = js.native
  var uploadHookHelper: UploadHookSource = js.native
  var uploadHooks: js.Array[UploadHook[UploadHookSource]] = js.native
  def add(item: js.Any): this.type = js.native
  def add(item: BaseTexture): this.type = js.native
  def add(item: Container): this.type = js.native
  def add(item: DisplayObject): this.type = js.native
  def add(item: Graphics): this.type = js.native
  def add(item: Text): this.type = js.native
  def add(item: Texture): this.type = js.native
  /* protected */ def completes(args: js.Any*): js.Array[_] = js.native
  /* protected */ def delayedTick(): Unit = js.native
  def destroy(): Unit = js.native
  /* protected */ def findBaseTexture(item: DisplayObject, queue: js.Array[_]): Boolean = js.native
  /* protected */ def findMultipleBaseTextures(item: DisplayObject, queue: js.Array[_]): Boolean = js.native
  /* protected */ def findTexture(item: DisplayObject, queue: js.Array[_]): Boolean = js.native
  /* protected */ def prepareItems(): Unit = js.native
  def registerFindHook(addHook: AddHook): this.type = js.native
  def registerUploadHook(uploadHook: UploadHook[UploadHookSource]): this.type = js.native
  /* protected */ def tick(): Unit = js.native
  def upload(item: js.Any): Unit = js.native
  def upload(item: js.Any, done: js.Function0[Unit]): Unit = js.native
  //tslint:disable-next-line:ban-types forbidden-types
  def upload(item: js.Function): Unit = js.native
  def upload(item: js.Function, done: js.Function0[Unit]): Unit = js.native
  def upload(item: BaseTexture): Unit = js.native
  def upload(item: BaseTexture, done: js.Function0[Unit]): Unit = js.native
  def upload(item: Container): Unit = js.native
  def upload(item: Container, done: js.Function0[Unit]): Unit = js.native
  def upload(item: DisplayObject): Unit = js.native
  def upload(item: DisplayObject, done: js.Function0[Unit]): Unit = js.native
  def upload(item: Graphics): Unit = js.native
  def upload(item: Graphics, done: js.Function0[Unit]): Unit = js.native
  def upload(item: Text): Unit = js.native
  def upload(item: Text, done: js.Function0[Unit]): Unit = js.native
  def upload(item: Texture): Unit = js.native
  def upload(item: Texture, done: js.Function0[Unit]): Unit = js.native
}

