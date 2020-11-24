package typings.postcss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fast extends js.Object {
  
  /**
    * Used to narrow down values and speed up the regexp search. Searching
    * every single value with a regexp can be slow. If you pass a fast
    * string, PostCSS will first check whether the value contains the fast
    * string; and only if it does will PostCSS check that value against
    * regexp. For example, instead of just checking for /\d+rem/ on all
    * values, set fast: 'rem' to first check whether a value has the rem
    * unit, and only if it does perform the regexp check.
    */
  var fast: js.UndefOr[String] = js.native
  
  /**
    * Property names. The method will only search for values that match
    * regexp  within declarations of listed properties.
    */
  var props: js.UndefOr[js.Array[String]] = js.native
}
object Fast {
  
  @scala.inline
  def apply(): Fast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fast]
  }
  
  @scala.inline
  implicit class FastOps[Self <: Fast] (val x: Self) extends AnyVal {
    
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
    def setFast(value: String): Self = this.set("fast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFast: Self = this.set("fast", js.undefined)
    
    @scala.inline
    def setPropsVarargs(value: String*): Self = this.set("props", js.Array(value :_*))
    
    @scala.inline
    def setProps(value: js.Array[String]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}
