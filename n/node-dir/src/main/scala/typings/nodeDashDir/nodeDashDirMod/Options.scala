package typings.nodeDashDir.nodeDashDirMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  // control if done function called on error (defaults to true)
  var doneOnErr: js.UndefOr[Boolean] = js.undefined
  // file encoding (defaults to 'utf8')
  var encoding: js.UndefOr[String] = js.undefined
  // a regex pattern or array to specify filenames to ignore
  var exclude: js.UndefOr[RegExp | js.Array[String]] = js.undefined
  // a regex pattern or array to specify directories to ignore
  var excludeDir: js.UndefOr[RegExp | js.Array[String]] = js.undefined
  // a regex pattern or array to specify filenames to operate on
  var `match`: js.UndefOr[RegExp | js.Array[String]] = js.undefined
  // a regex pattern or array to specify directories to recurse
  var matchDir: js.UndefOr[RegExp | js.Array[String]] = js.undefined
  // whether to recurse subdirectories when reading files (defaults to true)
  var recursive: js.UndefOr[Boolean] = js.undefined
  // sort files in each directory in descending order
  var reverse: js.UndefOr[Boolean] = js.undefined
  // whether to aggregate only the base filename rather than the full filepath
  var shortName: js.UndefOr[Boolean] = js.undefined
  // sort files in each directory in ascending order (defaults to true)
  var sort: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    doneOnErr: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    exclude: RegExp | js.Array[String] = null,
    excludeDir: RegExp | js.Array[String] = null,
    `match`: RegExp | js.Array[String] = null,
    matchDir: RegExp | js.Array[String] = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    reverse: js.UndefOr[Boolean] = js.undefined,
    shortName: js.UndefOr[Boolean] = js.undefined,
    sort: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(doneOnErr)) __obj.updateDynamic("doneOnErr")(doneOnErr.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (excludeDir != null) __obj.updateDynamic("excludeDir")(excludeDir.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (matchDir != null) __obj.updateDynamic("matchDir")(matchDir.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (!js.isUndefined(shortName)) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    if (!js.isUndefined(sort)) __obj.updateDynamic("sort")(sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

