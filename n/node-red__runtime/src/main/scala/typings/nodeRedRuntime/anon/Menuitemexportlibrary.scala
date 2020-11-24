package typings.nodeRedRuntime.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Menuitemexportlibrary extends js.Object {
  
  var `menu-item-export-library`: js.UndefOr[Boolean] = js.native
  
  var `menu-item-help`: js.UndefOr[Url] = js.native
  
  var `menu-item-import-library`: js.UndefOr[Boolean] = js.native
  
  var `menu-item-keyboard-shortcuts`: js.UndefOr[Boolean] = js.native
}
object Menuitemexportlibrary {
  
  @scala.inline
  def apply(): Menuitemexportlibrary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Menuitemexportlibrary]
  }
  
  @scala.inline
  implicit class MenuitemexportlibraryOps[Self <: Menuitemexportlibrary] (val x: Self) extends AnyVal {
    
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
    def `setMenu-item-export-library`(value: Boolean): Self = this.set("menu-item-export-library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMenu-item-export-library`: Self = this.set("menu-item-export-library", js.undefined)
    
    @scala.inline
    def `setMenu-item-help`(value: Url): Self = this.set("menu-item-help", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMenu-item-help`: Self = this.set("menu-item-help", js.undefined)
    
    @scala.inline
    def `setMenu-item-import-library`(value: Boolean): Self = this.set("menu-item-import-library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMenu-item-import-library`: Self = this.set("menu-item-import-library", js.undefined)
    
    @scala.inline
    def `setMenu-item-keyboard-shortcuts`(value: Boolean): Self = this.set("menu-item-keyboard-shortcuts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deleteMenu-item-keyboard-shortcuts`: Self = this.set("menu-item-keyboard-shortcuts", js.undefined)
  }
}
