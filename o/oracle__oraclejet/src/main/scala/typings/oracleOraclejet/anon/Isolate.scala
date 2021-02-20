package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.center
import typings.oracleOraclejet.oracleOraclejetStrings.end
import typings.oracleOraclejet.oracleOraclejetStrings.off
import typings.oracleOraclejet.oracleOraclejetStrings.on
import typings.oracleOraclejet.oracleOraclejetStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Isolate extends StObject {
  
  var isolate: js.UndefOr[off | on] = js.native
  
  var labelHalign: js.UndefOr[center | end | start] = js.native
  
  var labelStyle: js.UndefOr[js.Object] = js.native
  
  var useNodeColor: js.UndefOr[on | off] = js.native
}
object Isolate {
  
  @scala.inline
  def apply(): Isolate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Isolate]
  }
  
  @scala.inline
  implicit class IsolateMutableBuilder[Self <: Isolate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsolate(value: off | on): Self = StObject.set(x, "isolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsolateUndefined: Self = StObject.set(x, "isolate", js.undefined)
    
    @scala.inline
    def setLabelHalign(value: center | end | start): Self = StObject.set(x, "labelHalign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelHalignUndefined: Self = StObject.set(x, "labelHalign", js.undefined)
    
    @scala.inline
    def setLabelStyle(value: js.Object): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
    
    @scala.inline
    def setUseNodeColor(value: on | off): Self = StObject.set(x, "useNodeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNodeColorUndefined: Self = StObject.set(x, "useNodeColor", js.undefined)
  }
}
