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

object Options {
  @scala.inline
  def apply(
    doneOnErr: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    exclude: stdLib.RegExp | js.Array[java.lang.String] = null,
    excludeDir: stdLib.RegExp | js.Array[java.lang.String] = null,
    `match`: stdLib.RegExp | js.Array[java.lang.String] = null,
    matchDir: stdLib.RegExp | js.Array[java.lang.String] = null,
    recursive: js.UndefOr[scala.Boolean] = js.undefined,
    reverse: js.UndefOr[scala.Boolean] = js.undefined,
    shortName: js.UndefOr[scala.Boolean] = js.undefined,
    sort: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doneOnErr)) __obj.updateDynamic("doneOnErr")(doneOnErr)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (excludeDir != null) __obj.updateDynamic("excludeDir")(excludeDir.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (matchDir != null) __obj.updateDynamic("matchDir")(matchDir.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse)
    if (!js.isUndefined(shortName)) __obj.updateDynamic("shortName")(shortName)
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort)
    __obj.asInstanceOf[Options]
  }
}

