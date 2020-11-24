package typings.noCase.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var delimiter: js.UndefOr[String] = js.native
  
  var splitRegexp: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
  
  var stripRegexp: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
  
  var transform: js.UndefOr[
    js.Function3[/* part */ String, /* index */ Double, /* parts */ js.Array[String], String]
  ] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setSplitRegexpVarargs(value: RegExp*): Self = this.set("splitRegexp", js.Array(value :_*))
    
    @scala.inline
    def setSplitRegexp(value: RegExp | js.Array[RegExp]): Self = this.set("splitRegexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplitRegexp: Self = this.set("splitRegexp", js.undefined)
    
    @scala.inline
    def setStripRegexpVarargs(value: RegExp*): Self = this.set("stripRegexp", js.Array(value :_*))
    
    @scala.inline
    def setStripRegexp(value: RegExp | js.Array[RegExp]): Self = this.set("stripRegexp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripRegexp: Self = this.set("stripRegexp", js.undefined)
    
    @scala.inline
    def setTransform(value: (/* part */ String, /* index */ Double, /* parts */ js.Array[String]) => String): Self = this.set("transform", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
