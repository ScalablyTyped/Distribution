package typings.nodeRsa.mod

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyComponentsPrivate
  extends StObject
     with _Key {
  
  var coeff: Buffer
  
  var d: Buffer
  
  var dmp1: Buffer
  
  var dmq1: Buffer
  
  var e: Buffer | Double
  
  var n: Buffer
  
  var p: Buffer
  
  var q: Buffer
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
  implicit class KeyComponentsPrivateMutableBuilder[Self <: KeyComponentsPrivate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoeff(value: Buffer): Self = StObject.set(x, "coeff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setD(value: Buffer): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDmp1(value: Buffer): Self = StObject.set(x, "dmp1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDmq1(value: Buffer): Self = StObject.set(x, "dmq1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: Buffer | Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Buffer): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Buffer): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ(value: Buffer): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
  }
}
