package typings
package nodeDashDirLib.nodeDashDirMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // control if done function called on error (defaults to true)
  var doneOnErr: js.UndefOr[scala.Boolean] = js.undefined
  // file encoding (defaults to 'utf8')
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  // a regex pattern or array to specify filenames to ignore
  var exclude: js.UndefOr[stdLib.RegExp | js.Array[java.lang.String]] = js.undefined
  // a regex pattern or array to specify directories to ignore
  var excludeDir: js.UndefOr[stdLib.RegExp | js.Array[java.lang.String]] = js.undefined
  // a regex pattern or array to specify filenames to operate on
  var `match`: js.UndefOr[stdLib.RegExp | js.Array[java.lang.String]] = js.undefined
  // a regex pattern or array to specify directories to recurse
  var matchDir: js.UndefOr[stdLib.RegExp | js.Array[java.lang.String]] = js.undefined
  // whether to recurse subdirectories when reading files (defaults to true)
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
  // sort files in each directory in descending order
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  // whether to aggregate only the base filename rather than the full filepath
  var shortName: js.UndefOr[scala.Boolean] = js.undefined
  // sort files in each directory in ascending order (defaults to true)
  var sort: js.UndefOr[scala.Boolean] = js.undefined
}

