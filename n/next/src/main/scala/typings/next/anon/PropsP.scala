package typings.next.anon

import typings.next.mod.GetServerSidePropsResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropsP[P] extends GetServerSidePropsResult[P] {
  
  var props: P = js.native
}
object PropsP {
  
  @scala.inline
  def apply[P](props: P): PropsP[P] = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsP[P]]
  }
  
  @scala.inline
  implicit class PropsPOps[Self <: PropsP[_], P] (val x: Self with PropsP[P]) extends AnyVal {
    
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
  }
}
