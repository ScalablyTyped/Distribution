package typings.openlayers.mod.olx.format

import typings.openlayers.mod.Feature
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GPXOptions extends js.Object {
  
  var readExtensions: js.UndefOr[js.Function2[/* feature */ Feature, /* node */ Node, _]] = js.native
}
object GPXOptions {
  
  @scala.inline
  def apply(): GPXOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GPXOptions]
  }
  
  @scala.inline
  implicit class GPXOptionsOps[Self <: GPXOptions] (val x: Self) extends AnyVal {
    
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
    def setReadExtensions(value: (/* feature */ Feature, /* node */ Node) => _): Self = this.set("readExtensions", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReadExtensions: Self = this.set("readExtensions", js.undefined)
  }
}
