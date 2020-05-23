package typings.picomatch.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var glob: String
  var input: String
  var isMatch: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options ? : picomatch.picomatch.PicomatchOptions, test ? : {}): picomatch.anon.IsMatch>['isMatch'] */ js.Any
  var `match`: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options ? : picomatch.picomatch.PicomatchOptions, test ? : {}): picomatch.anon.IsMatch>['match'] */ js.Any
  var output: String
  var posix: Boolean
  var regex: RegExp
  var state: js.Any
}

object Result {
  @scala.inline
  def apply(
    glob: String,
    input: String,
    isMatch: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options ? : picomatch.picomatch.PicomatchOptions, test ? : {}): picomatch.anon.IsMatch>['isMatch'] */ js.Any,
    `match`: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options ? : picomatch.picomatch.PicomatchOptions, test ? : {}): picomatch.anon.IsMatch>['match'] */ js.Any,
    output: String,
    posix: Boolean,
    regex: RegExp,
    state: js.Any
  ): Result = {
    val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], posix = posix.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

