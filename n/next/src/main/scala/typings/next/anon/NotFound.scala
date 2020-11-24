package typings.next.anon

import typings.next.mod.GetServerSidePropsResult
import typings.next.mod.GetStaticPropsResult
import typings.next.nextBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotFound
  extends GetServerSidePropsResult[js.Any]
     with GetStaticPropsResult[js.Any] {
  
  var notFound: `true` = js.native
}
object NotFound {
  
  @scala.inline
  def apply(notFound: `true`): NotFound = {
    val __obj = js.Dynamic.literal(notFound = notFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotFound]
  }
  
  @scala.inline
  implicit class NotFoundOps[Self <: NotFound] (val x: Self) extends AnyVal {
    
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
    def setNotFound(value: `true`): Self = this.set("notFound", value.asInstanceOf[js.Any])
  }
}
