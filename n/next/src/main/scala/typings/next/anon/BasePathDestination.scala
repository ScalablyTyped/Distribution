package typings.next.anon

import typings.next.nextBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasePathDestination
  extends typings.next.mod.Redirect {
  
  var basePath: js.UndefOr[`false`] = js.native
  
  var destination: String = js.native
  
  var permanent: Boolean = js.native
}
object BasePathDestination {
  
  @scala.inline
  def apply(destination: String, permanent: Boolean): BasePathDestination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], permanent = permanent.asInstanceOf[js.Any])
    __obj.asInstanceOf[BasePathDestination]
  }
  
  @scala.inline
  implicit class BasePathDestinationOps[Self <: BasePathDestination] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: String): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanent(value: Boolean): Self = this.set("permanent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasePath(value: `false`): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
  }
}
