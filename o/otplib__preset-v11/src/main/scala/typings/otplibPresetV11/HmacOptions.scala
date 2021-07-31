package typings.otplibPresetV11

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HmacOptions extends StObject {
  
  var algorithm: js.UndefOr[String] = js.undefined
  
  var encoding: js.UndefOr[String] = js.undefined
}
object HmacOptions {
  
  @scala.inline
  def apply(): HmacOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HmacOptions]
  }
  
  @scala.inline
  implicit class HmacOptionsMutableBuilder[Self <: HmacOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
    
    @scala.inline
    def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
  }
}
