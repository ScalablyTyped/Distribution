package typings.postcss.anon

import typings.postcss.mod.SourceMapOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<postcss.postcss.ProcessOptions, 'map' | 'from'> */
@js.native
trait PickProcessOptionsmapfrom extends js.Object {
  
  var from: js.UndefOr[String] = js.native
  
  var map: js.UndefOr[SourceMapOptions | Boolean] = js.native
}
object PickProcessOptionsmapfrom {
  
  @scala.inline
  def apply(): PickProcessOptionsmapfrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickProcessOptionsmapfrom]
  }
  
  @scala.inline
  implicit class PickProcessOptionsmapfromOps[Self <: PickProcessOptionsmapfrom] (val x: Self) extends AnyVal {
    
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
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    
    @scala.inline
    def setMap(value: SourceMapOptions | Boolean): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
  }
}
