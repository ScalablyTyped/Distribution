package typings.nodeRsa.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyComponentsPublic extends _Key {
  
  var e: Buffer | Double = js.native
  
  var n: Buffer = js.native
}
object KeyComponentsPublic {
  
  @scala.inline
  def apply(e: Buffer | Double, n: Buffer): KeyComponentsPublic = {
    val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyComponentsPublic]
  }
  
  @scala.inline
  implicit class KeyComponentsPublicOps[Self <: KeyComponentsPublic] (val x: Self) extends AnyVal {
    
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
    def setE(value: Buffer | Double): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Buffer): Self = this.set("n", value.asInstanceOf[js.Any])
  }
}
