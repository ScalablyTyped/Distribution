package typings.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deblock extends StObject {
  
  /** Enable deblocker. The default is `false`. */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** Set strength of the deblocker. Enter a value between 0 and 1. The higher the value, the stronger the block removal. 0 is no deblocking. The default is 0. */
  var strength: js.UndefOr[Double] = js.undefined
}
object Deblock {
  
  @scala.inline
  def apply(): Deblock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deblock]
  }
  
  @scala.inline
  implicit class DeblockMutableBuilder[Self <: Deblock] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
  }
}
