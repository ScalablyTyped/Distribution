package typings.pegjs.mod

import typings.pegjs.pegjsStrings.amd
import typings.pegjs.pegjsStrings.commonjs
import typings.pegjs.pegjsStrings.source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OutputFormatAmdCommonjs extends BuildOptionsBase {
  
  /** parser dependencies, the value is an object which maps variables used to access the dependencies in the parser to module IDs used to load them; valid only when `format` is set to `"amd"`, `"commonjs"`, or `"umd"` (default: `{}`) */
  var dependencies: js.UndefOr[js.Any] = js.native
  
  /** format of the genreated parser (`"amd"`, `"bare"`, `"commonjs"`, `"globals"`, or `"umd"`); valid only when `output` is set to `"source"` (default: `"bare"`) */
  var format: amd | commonjs = js.native
  
  /** if set to `"parser"`, the method will return generated parser object; if set to `"source"`, it will return parser source code as a string (default: `"parser"`) */
  var output: source = js.native
}
object OutputFormatAmdCommonjs {
  
  @scala.inline
  def apply(format: amd | commonjs, output: source): OutputFormatAmdCommonjs = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFormatAmdCommonjs]
  }
  
  @scala.inline
  implicit class OutputFormatAmdCommonjsOps[Self <: OutputFormatAmdCommonjs] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: amd | commonjs): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: source): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDependencies(value: js.Any): Self = this.set("dependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDependencies: Self = this.set("dependencies", js.undefined)
  }
}
