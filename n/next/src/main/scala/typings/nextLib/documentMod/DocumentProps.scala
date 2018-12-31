package typings
package nextLib.documentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentProps[Q /* <: nextDashServerLib.routerMod.DefaultQuery */] extends js.Object {
  var `__NEXT_DATA__`: nextLib.Anon_Key[Q]
  var assetPrefix: java.lang.String
  var buildManifest: stdLib.Record[java.lang.String, _]
  var dev: scala.Boolean
  var devFiles: js.Array[java.lang.String]
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var dynamicImports: js.Array[java.lang.String]
  var files: js.Array[java.lang.String]
  var staticMarkup: scala.Boolean
}

