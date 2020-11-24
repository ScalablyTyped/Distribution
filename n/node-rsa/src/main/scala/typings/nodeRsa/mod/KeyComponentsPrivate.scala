package typings.nodeRsa.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyComponentsPrivate extends _Key {
  
  var coeff: Buffer = js.native
  
  var d: Buffer = js.native
  
  var dmp1: Buffer = js.native
  
  var dmq1: Buffer = js.native
  
  var e: Buffer | Double = js.native
  
  var n: Buffer = js.native
  
  var p: Buffer = js.native
  
  var q: Buffer = js.native
}
object KeyComponentsPrivate {
  
  @scala.inline
  def apply(
    coeff: Buffer,
    d: Buffer,
    dmp1: Buffer,
    dmq1: Buffer,
    e: Buffer | Double,
    n: Buffer,
    p: Buffer,
    q: Buffer
  ): KeyComponentsPrivate = {
    val __obj = js.Dynamic.literal(coeff = coeff.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], dmp1 = dmp1.asInstanceOf[js.Any], dmq1 = dmq1.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyComponentsPrivate]
  }
  
  @scala.inline
  implicit class KeyComponentsPrivateOps[Self <: KeyComponentsPrivate] (val x: Self) extends AnyVal {
    
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
    def setCoeff(value: Buffer): Self = this.set("coeff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: Buffer): Self = this.set("d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDmp1(value: Buffer): Self = this.set("dmp1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDmq1(value: Buffer): Self = this.set("dmq1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: Buffer | Double): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Buffer): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Buffer): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ(value: Buffer): Self = this.set("q", value.asInstanceOf[js.Any])
  }
}
