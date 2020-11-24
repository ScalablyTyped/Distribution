package typings.next.anon

import typings.next.nextBooleans.`false`
import typings.next.nextStrings.blocking
import typings.next.nextStrings.static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FallbackMode extends js.Object {
  
  var fallbackMode: static | blocking | `false` = js.native
  
  var staticPaths: js.UndefOr[js.Array[String]] = js.native
}
object FallbackMode {
  
  @scala.inline
  def apply(fallbackMode: static | blocking | `false`): FallbackMode = {
    val __obj = js.Dynamic.literal(fallbackMode = fallbackMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FallbackMode]
  }
  
  @scala.inline
  implicit class FallbackModeOps[Self <: FallbackMode] (val x: Self) extends AnyVal {
    
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
    def setFallbackMode(value: static | blocking | `false`): Self = this.set("fallbackMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticPathsVarargs(value: String*): Self = this.set("staticPaths", js.Array(value :_*))
    
    @scala.inline
    def setStaticPaths(value: js.Array[String]): Self = this.set("staticPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStaticPaths: Self = this.set("staticPaths", js.undefined)
  }
}
