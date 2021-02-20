package typings.nodeForge.anon

import typings.nodeForge.mod.pki.ed25519.NativeBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Seed extends StObject {
  
  var seed: js.UndefOr[NativeBuffer | String] = js.native
}
object Seed {
  
  @scala.inline
  def apply(): Seed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Seed]
  }
  
  @scala.inline
  implicit class SeedMutableBuilder[Self <: Seed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSeed(value: NativeBuffer | String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
  }
}
