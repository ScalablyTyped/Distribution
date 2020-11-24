package typings.nodeObjectHash.objectSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Advanced trim options
  */
@js.native
trait TrimOptions extends js.Object {
  
  /**
    * If `true` replaces multiple space with one and trims whitespaces in function body
    */
  var function: js.UndefOr[Boolean] = js.native
  
  /**
    * If `true` replaces multiple space with one and trims whitespaces in strings
    */
  var string: js.UndefOr[Boolean] = js.native
}
object TrimOptions {
  
  @scala.inline
  def apply(): TrimOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrimOptions]
  }
  
  @scala.inline
  implicit class TrimOptionsOps[Self <: TrimOptions] (val x: Self) extends AnyVal {
    
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
    def setFunction(value: Boolean): Self = this.set("function", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFunction: Self = this.set("function", js.undefined)
    
    @scala.inline
    def setString(value: Boolean): Self = this.set("string", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
  }
}
