package typings
package parcelDashBundlerLib.parcelDashBundlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParcelBundler extends js.Object {
  def addAssetType(extension: java.lang.String, path: java.lang.String): scala.Unit = js.native
  def addPackager(`type`: java.lang.String, packager: java.lang.String): scala.Unit = js.native
  def bundle(): js.Promise[parcelDashBundlerLib.parcelDashBundlerMod.ParcelBundlerNs.ParcelBundle] = js.native
  def middleware(): js.Function3[
    /* req */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Request, 
    /* res */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.Response, 
    /* next */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction, 
    _
  ] = js.native
  @JSName("off")
  def off_buildEnd(
    name: parcelDashBundlerLib.parcelDashBundlerLibStrings.buildEnd,
    cb: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_buildError(
    name: parcelDashBundlerLib.parcelDashBundlerLibStrings.buildError,
    cb: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_buildStart(
    name: parcelDashBundlerLib.parcelDashBundlerLibStrings.buildStart,
    cb: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_bundled(
    name: parcelDashBundlerLib.parcelDashBundlerLibStrings.bundled,
    cb: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_buildEnd(name: parcelDashBundlerLib.parcelDashBundlerLibStrings.buildEnd, cb: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_buildError(
    name: parcelDashBundlerLib.parcelDashBundlerLibStrings.buildError,
    cb: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_buildStart(
    name: parcelDashBundlerLib.parcelDashBundlerLibStrings.buildStart,
    cb: js.Function1[/* entryPoints */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_bundled(
    name: parcelDashBundlerLib.parcelDashBundlerLibStrings.bundled,
    cb: js.Function1[
      /* bundle */ parcelDashBundlerLib.parcelDashBundlerMod.ParcelBundlerNs.ParcelBundle, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def serve(): js.Promise[nodeLib.httpMod.Server | nodeLib.httpsMod.Server] = js.native
  def serve(port: scala.Double): js.Promise[nodeLib.httpMod.Server | nodeLib.httpsMod.Server] = js.native
  def serve(port: scala.Double, https: parcelDashBundlerLib.parcelDashBundlerLibNumbers.`false`): js.Promise[nodeLib.httpMod.Server | nodeLib.httpsMod.Server] = js.native
  def serve(
    port: scala.Double,
    https: parcelDashBundlerLib.parcelDashBundlerLibNumbers.`false`,
    host: java.lang.String
  ): js.Promise[nodeLib.httpMod.Server | nodeLib.httpsMod.Server] = js.native
  def serve(port: scala.Double, https: parcelDashBundlerLib.parcelDashBundlerLibNumbers.`true`): js.Promise[nodeLib.httpMod.Server | nodeLib.httpsMod.Server] = js.native
  def serve(
    port: scala.Double,
    https: parcelDashBundlerLib.parcelDashBundlerLibNumbers.`true`,
    host: java.lang.String
  ): js.Promise[nodeLib.httpMod.Server | nodeLib.httpsMod.Server] = js.native
  def serve(port: scala.Double, https: parcelDashBundlerLib.parcelDashBundlerMod.ParcelBundlerNs.HttpsOptions): js.Promise[nodeLib.httpMod.Server | nodeLib.httpsMod.Server] = js.native
  def serve(
    port: scala.Double,
    https: parcelDashBundlerLib.parcelDashBundlerMod.ParcelBundlerNs.HttpsOptions,
    host: java.lang.String
  ): js.Promise[nodeLib.httpMod.Server | nodeLib.httpsMod.Server] = js.native
}

