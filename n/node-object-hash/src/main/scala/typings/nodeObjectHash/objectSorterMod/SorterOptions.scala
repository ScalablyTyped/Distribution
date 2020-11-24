package typings.nodeObjectHash.objectSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object sorter options
  */
@js.native
trait SorterOptions extends js.Object {
  
  /**
    * If `true` enables type coercion.
    * Advanced coerce options could be provided as object
    * @default true
    */
  var coerce: js.UndefOr[Boolean | CoerceOptions] = js.native
  
  /**
    * If `true` enables sorting.
    * Advanced sorting options could be provided as object
    * @default true
    */
  var sort: js.UndefOr[Boolean | SortOptions] = js.native
  
  /**
    * If `true` enables trimming and multiple whitespace replacement.
    * Advanced sorting options could be provided as object.
    * @default false
    */
  var trim: js.UndefOr[Boolean | TrimOptions] = js.native
}
object SorterOptions {
  
  @scala.inline
  def apply(): SorterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SorterOptions]
  }
  
  @scala.inline
  implicit class SorterOptionsOps[Self <: SorterOptions] (val x: Self) extends AnyVal {
    
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
    def setCoerce(value: Boolean | CoerceOptions): Self = this.set("coerce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoerce: Self = this.set("coerce", js.undefined)
    
    @scala.inline
    def setSort(value: Boolean | SortOptions): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean | TrimOptions): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
}
