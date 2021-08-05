package typings.nodeForge.anon

import typings.nodeForge.mod.pki.ed25519.NativeBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Seed extends StObject {
  
  var seed: js.UndefOr[NativeBuffer | String] = js.undefined
}
object Seed {
  
  inline def apply(): Seed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seed]
  }
  
  extension [Self <: Seed](x: Self) {
    
    inline def setSeed(value: NativeBuffer | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
