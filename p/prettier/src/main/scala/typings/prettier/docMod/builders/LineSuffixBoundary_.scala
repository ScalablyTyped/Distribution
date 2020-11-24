package typings.prettier.docMod.builders

import typings.prettier.prettierStrings.`line-suffix-boundary`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineSuffixBoundary_ extends _Doc {
  
  var `type`: `line-suffix-boundary` = js.native
}
object LineSuffixBoundary_ {
  
  @scala.inline
  def apply(`type`: `line-suffix-boundary`): LineSuffixBoundary_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineSuffixBoundary_]
  }
  
  @scala.inline
  implicit class LineSuffixBoundary_Ops[Self <: LineSuffixBoundary_] (val x: Self) extends AnyVal {
    
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
    def setType(value: `line-suffix-boundary`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
