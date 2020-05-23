package typings.parcelBundler.mod

import typings.expressServeStaticCore.mod.NextFunction
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Request
import typings.expressServeStaticCore.mod.Response
import typings.node.httpMod.Server
import typings.parcelBundler.parcelBundlerBooleans.`false`
import typings.parcelBundler.parcelBundlerBooleans.`true`
import typings.parcelBundler.parcelBundlerStrings.buildEnd
import typings.parcelBundler.parcelBundlerStrings.buildError
import typings.parcelBundler.parcelBundlerStrings.buildStart
import typings.parcelBundler.parcelBundlerStrings.bundled
import typings.qs.mod.ParsedQs
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParcelBundler extends js.Object {
  def addAssetType(extension: String, path: String): Unit = js.native
  def addPackager(`type`: String, packager: String): Unit = js.native
  def bundle(): js.Promise[ParcelBundle] = js.native
  def middleware(): js.Function3[
    /* req */ Request[ParamsDictionary, _, _, ParsedQs], 
    /* res */ Response[_], 
    /* next */ NextFunction, 
    _
  ] = js.native
  @JSName("off")
  def off_buildEnd(name: buildEnd, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_buildError(name: buildError, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_buildStart(name: buildStart, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("off")
  def off_bundled(name: bundled, cb: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_buildEnd(name: buildEnd, cb: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_buildError(name: buildError, cb: js.Function1[/* error */ Error, Unit]): Unit = js.native
  @JSName("on")
  def on_buildStart(name: buildStart, cb: js.Function1[/* entryPoints */ js.Array[String], Unit]): Unit = js.native
  @JSName("on")
  def on_bundled(name: bundled, cb: js.Function1[/* bundle */ ParcelBundle, Unit]): Unit = js.native
  def serve(): js.Promise[Server | typings.node.httpsMod.Server] = js.native
  def serve(port: Double): js.Promise[Server | typings.node.httpsMod.Server] = js.native
  def serve(port: Double, https: HttpsOptions): js.Promise[Server | typings.node.httpsMod.Server] = js.native
  def serve(port: Double, https: HttpsOptions, host: String): js.Promise[Server | typings.node.httpsMod.Server] = js.native
  @JSName("serve")
  def serve_false(port: Double, https: `false`): js.Promise[Server | typings.node.httpsMod.Server] = js.native
  @JSName("serve")
  def serve_false(port: Double, https: `false`, host: String): js.Promise[Server | typings.node.httpsMod.Server] = js.native
  @JSName("serve")
  def serve_true(port: Double, https: `true`): js.Promise[Server | typings.node.httpsMod.Server] = js.native
  @JSName("serve")
  def serve_true(port: Double, https: `true`, host: String): js.Promise[Server | typings.node.httpsMod.Server] = js.native
}

