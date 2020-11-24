package typings.nodeObjectHash.objectSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Advanced sort options
  */
@js.native
trait SortOptions extends js.Object {
  
  /**
    * If `true` sort array entries before hash
    */
  var array: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true` sort map entries before hash
    */
  var map: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true` sort object entries before hash
    */
  var `object`: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true` sort set entries before hash
    */
  var set: js.UndefOr[Boolean] = js.native
}
object SortOptions {
  
  @scala.inline
  def apply(): SortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortOptions]
  }
  
  @scala.inline
  implicit class SortOptionsOps[Self <: SortOptions] (val x: Self) extends AnyVal {
    
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
    def setArray(value: Boolean): Self = this.set("array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArray: Self = this.set("array", js.undefined)
    
    @scala.inline
    def setMap(value: Boolean): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setObject(value: Boolean): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObject: Self = this.set("object", js.undefined)
    
    @scala.inline
    def setSet(value: Boolean): Self = this.set("set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSet: Self = this.set("set", js.undefined)
  }
}
