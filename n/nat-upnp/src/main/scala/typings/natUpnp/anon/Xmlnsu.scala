package typings.natUpnp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Xmlnsu extends js.Object {
  
  @JSName("xmlns:u")
  var xmlnsColonu: String = js.native
}
object Xmlnsu {
  
  @scala.inline
  def apply(xmlnsColonu: String): Xmlnsu = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("xmlns:u")(xmlnsColonu.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xmlnsu]
  }
  
  @scala.inline
  implicit class XmlnsuOps[Self <: Xmlnsu] (val x: Self) extends AnyVal {
    
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
    def setXmlnsColonu(value: String): Self = this.set("xmlns:u", value.asInstanceOf[js.Any])
  }
}
