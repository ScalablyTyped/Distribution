package typings.picomatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PicomatchOptions extends js.Object {
  
  var contains: js.UndefOr[Boolean] = js.native
  
  var dot: js.UndefOr[Boolean] = js.native
  
  var format: js.UndefOr[js.Function1[/* input */ String, String]] = js.native
  
  var ignore: js.UndefOr[String] = js.native
  
  var onIgnore: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.native
  
  var onMatch: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.native
  
  var onResult: js.UndefOr[js.Function1[/* result */ Result, Unit]] = js.native
  
  var windows: js.UndefOr[Boolean] = js.native
}
object PicomatchOptions {
  
  @scala.inline
  def apply(): PicomatchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PicomatchOptions]
  }
  
  @scala.inline
  implicit class PicomatchOptionsOps[Self <: PicomatchOptions] (val x: Self) extends AnyVal {
    
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
    def setContains(value: Boolean): Self = this.set("contains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContains: Self = this.set("contains", js.undefined)
    
    @scala.inline
    def setDot(value: Boolean): Self = this.set("dot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDot: Self = this.set("dot", js.undefined)
    
    @scala.inline
    def setFormat(value: /* input */ String => String): Self = this.set("format", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setIgnore(value: String): Self = this.set("ignore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setOnIgnore(value: /* result */ Result => Unit): Self = this.set("onIgnore", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnIgnore: Self = this.set("onIgnore", js.undefined)
    
    @scala.inline
    def setOnMatch(value: /* result */ Result => Unit): Self = this.set("onMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnMatch: Self = this.set("onMatch", js.undefined)
    
    @scala.inline
    def setOnResult(value: /* result */ Result => Unit): Self = this.set("onResult", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnResult: Self = this.set("onResult", js.undefined)
    
    @scala.inline
    def setWindows(value: Boolean): Self = this.set("windows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindows: Self = this.set("windows", js.undefined)
  }
}
