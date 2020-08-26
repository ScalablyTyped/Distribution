package typings.picomatch.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Result extends js.Object {
  var glob: String = js.native
  var input: String = js.native
  var isMatch: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['isMatch'] */ js.Any = js.native
  var `match`: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['match'] */ js.Any = js.native
  var output: String = js.native
  var posix: Boolean = js.native
  var regex: RegExp = js.native
  var state: js.Any = js.native
}

object Result {
  @scala.inline
  def apply(
    glob: String,
    input: String,
    isMatch: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['isMatch'] */ js.Any,
    `match`: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['match'] */ js.Any,
    output: String,
    posix: Boolean,
    regex: RegExp,
    state: js.Any
  ): Result = {
    val __obj = js.Dynamic.literal(glob = glob.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], isMatch = isMatch.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], posix = posix.asInstanceOf[js.Any], regex = regex.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
  @scala.inline
  implicit class ResultOps[Self <: Result] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGlob(value: String): Self = this.set("glob", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMatch(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['isMatch'] */ js.Any
    ): Self = this.set("isMatch", value.asInstanceOf[js.Any])
    @scala.inline
    def setMatch(
      value: /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<(input : string, regex : std.RegExp, options : picomatch.picomatch.PicomatchOptions | undefined, test : {} | undefined): picomatch.anon.IsMatch>['match'] */ js.Any
    ): Self = this.set("match", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosix(value: Boolean): Self = this.set("posix", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegex(value: RegExp): Self = this.set("regex", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: js.Any): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

