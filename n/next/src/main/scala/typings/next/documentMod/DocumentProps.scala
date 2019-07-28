package typings.next.documentMod

import typings.next.Anon_AssetPrefix
import typings.nextDashServer.routerMod.DefaultQuery
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentProps[Q /* <: DefaultQuery */] extends js.Object {
  var __NEXT_DATA__ : Anon_AssetPrefix[Q]
  var assetPrefix: String
  var buildManifest: Record[String, _]
  var dev: Boolean
  var devFiles: js.Array[String]
  var dir: js.UndefOr[String] = js.undefined
  var dynamicImports: js.Array[String]
  var files: js.Array[String]
  var staticMarkup: Boolean
}

object DocumentProps {
  @scala.inline
  def apply[Q /* <: DefaultQuery */](
    __NEXT_DATA__ : Anon_AssetPrefix[Q],
    assetPrefix: String,
    buildManifest: Record[String, _],
    dev: Boolean,
    devFiles: js.Array[String],
    dynamicImports: js.Array[String],
    files: js.Array[String],
    staticMarkup: Boolean,
    dir: String = null
  ): DocumentProps[Q] = {
    val __obj = js.Dynamic.literal(__NEXT_DATA__ = __NEXT_DATA__, assetPrefix = assetPrefix, buildManifest = buildManifest, dev = dev, devFiles = devFiles, dynamicImports = dynamicImports, files = files, staticMarkup = staticMarkup)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    __obj.asInstanceOf[DocumentProps[Q]]
  }
}

