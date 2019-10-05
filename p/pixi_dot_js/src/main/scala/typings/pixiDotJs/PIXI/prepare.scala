package typings.pixiDotJs.PIXI

import typings.pixiDotJs.PIXI.prepare.AddHook
import typings.pixiDotJs.PIXI.prepare.BasePrepare
import typings.pixiDotJs.PIXI.prepare.CanvasPrepare
import typings.pixiDotJs.PIXI.prepare.CountLimiter
import typings.pixiDotJs.PIXI.prepare.TimeLimiter
import typings.pixiDotJs.PIXI.prepare.UploadHook
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//////////////////////////////////////////////////////////////////////////////
////////////////////////////PREPARE///////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
@JSGlobal("PIXI.prepare")
@js.native
object prepare extends js.Object {
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
  
  @js.native
  class CanvasPrepare protected () extends BasePrepare[CanvasPrepare] {
    def this(renderer: CanvasRenderer) = this()
    var canvas: HTMLCanvasElement = js.native
    var ctx: CanvasRenderingContext2D = js.native
  }
  
  @js.native
  class CountLimiter protected () extends js.Object {
    def this(maxItemsPerFrame: Double) = this()
    var itemsLeft: Double = js.native
    var maxItemsPerFrame: Double = js.native
    def allowedToUpload(): Boolean = js.native
    def beginFrame(): Unit = js.native
  }
  
  @js.native
  class TimeLimiter protected () extends js.Object {
    def this(maxMilliseconds: Double) = this()
    var frameStart: Double = js.native
    var maxMilliseconds: Double = js.native
    def allowedToUpload(): Boolean = js.native
    def beginFrame(): Unit = js.native
  }
  
  @js.native
  class WebGLPrepare protected () extends BasePrepare[WebGLRenderer] {
    def this(renderer: WebGLRenderer) = this()
  }
  
  type AddHook = js.Function2[/* item */ js.Any, /* queue */ js.Array[js.Any], Boolean]
  type UploadHook[UploadHookSource] = js.Function2[/* prepare */ UploadHookSource, /* item */ js.Any, Boolean]
}

