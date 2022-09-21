package typings.playcanvas.anon

import typings.playcanvas.mod.BasisParser
import typings.playcanvas.mod.DdsParser
import typings.playcanvas.mod.HdrParser
import typings.playcanvas.mod.Ktx2Parser
import typings.playcanvas.mod.KtxParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Basis extends StObject {
  
  var basis: BasisParser
  
  var dds: DdsParser
  
  var hdr: HdrParser
  
  var ktx: KtxParser
  
  var ktx2: Ktx2Parser
}
object Basis {
  
  inline def apply(basis: BasisParser, dds: DdsParser, hdr: HdrParser, ktx: KtxParser, ktx2: Ktx2Parser): Basis = {
    val __obj = js.Dynamic.literal(basis = basis.asInstanceOf[js.Any], dds = dds.asInstanceOf[js.Any], hdr = hdr.asInstanceOf[js.Any], ktx = ktx.asInstanceOf[js.Any], ktx2 = ktx2.asInstanceOf[js.Any])
    __obj.asInstanceOf[Basis]
  }
  
  extension [Self <: Basis](x: Self) {
    
    inline def setBasis(value: BasisParser): Self = StObject.set(x, "basis", value.asInstanceOf[js.Any])
    
    inline def setDds(value: DdsParser): Self = StObject.set(x, "dds", value.asInstanceOf[js.Any])
    
    inline def setHdr(value: HdrParser): Self = StObject.set(x, "hdr", value.asInstanceOf[js.Any])
    
    inline def setKtx(value: KtxParser): Self = StObject.set(x, "ktx", value.asInstanceOf[js.Any])
    
    inline def setKtx2(value: Ktx2Parser): Self = StObject.set(x, "ktx2", value.asInstanceOf[js.Any])
  }
}
