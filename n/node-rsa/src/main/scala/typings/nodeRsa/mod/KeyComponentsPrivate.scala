package typings.nodeRsa.mod

import typings.node.bufferMod.global.Buffer
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: KeyComponentsPrivate] (val x: Self) extends AnyVal {
    
    inline def setCoeff(value: Buffer): Self = StObject.set(x, "coeff", value.asInstanceOf[js.Any])
    
    inline def setD(value: Buffer): Self = StObject.set(x, "d", value.asInstanceOf[js.Any])
    
    inline def setDmp1(value: Buffer): Self = StObject.set(x, "dmp1", value.asInstanceOf[js.Any])
    
    inline def setDmq1(value: Buffer): Self = StObject.set(x, "dmq1", value.asInstanceOf[js.Any])
    
    inline def setE(value: Buffer | Double): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
    
    inline def setN(value: Buffer): Self = StObject.set(x, "n", value.asInstanceOf[js.Any])
    
    inline def setP(value: Buffer): Self = StObject.set(x, "p", value.asInstanceOf[js.Any])
    
    inline def setQ(value: Buffer): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
  }
}
