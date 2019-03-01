package typings
package nextLib.documentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentProps[Q /* <: nextDashServerLib.routerMod.DefaultQuery */] extends js.Object {
  var `__NEXT_DATA__`: nextLib.Anon_AssetPrefix[Q]
  var assetPrefix: java.lang.String
  var buildManifest: stdLib.Record[java.lang.String, _]
  var dev: scala.Boolean
  var devFiles: js.Array[java.lang.String]
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var dynamicImports: js.Array[java.lang.String]
  var files: js.Array[java.lang.String]
  var staticMarkup: scala.Boolean
}

object DocumentProps {
  @scala.inline
  def apply[Q /* <: nextDashServerLib.routerMod.DefaultQuery */](
    `__NEXT_DATA__`: nextLib.Anon_AssetPrefix[Q],
    assetPrefix: java.lang.String,
    buildManifest: stdLib.Record[java.lang.String, _],
    dev: scala.Boolean,
    devFiles: js.Array[java.lang.String],
    dynamicImports: js.Array[java.lang.String],
    files: js.Array[java.lang.String],
    staticMarkup: scala.Boolean,
    dir: java.lang.String = null
  ): DocumentProps[Q] = {
    val __obj = js.Dynamic.literal(`__NEXT_DATA__` = `__NEXT_DATA__`)
    __obj.updateDynamic("assetPrefix")(assetPrefix)
    __obj.updateDynamic("buildManifest")(buildManifest)
    __obj.updateDynamic("dev")(dev)
    __obj.updateDynamic("devFiles")(devFiles)
    __obj.updateDynamic("dynamicImports")(dynamicImports)
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("staticMarkup")(staticMarkup)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    __obj.asInstanceOf[DocumentProps[Q]]
  }
}

