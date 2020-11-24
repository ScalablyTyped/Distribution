package typings.next.anon

import typings.next.mod.GetStaticPropsResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props[P] extends GetStaticPropsResult[P] {
  
  var props: P = js.native
  
  var revalidate: js.UndefOr[Double | Boolean] = js.native
}
object Props {
  
  @scala.inline
  def apply[P](props: P): Props[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[P]]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props[_], P] (val x: Self with Props[P]) extends AnyVal {
    
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
    def setProps(value: P): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevalidate(value: Double | Boolean): Self = this.set("revalidate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevalidate: Self = this.set("revalidate", js.undefined)
  }
}
