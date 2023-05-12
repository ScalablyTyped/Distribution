package typings.photoshop.domImagingModuleMod.imaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @optionobject
  * @targetfolder objects/options
  * @minVersion 24.4
  */
trait GetDataOptions extends StObject {
  
  /**
    * If true then the data is returned as chunky data. If false, then data is returned in the planar format.
    * The default value is true.
    * @minVersion 24.4
    */
  var chunky: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This value is only used for 16 bit data. If true then the returned 16 bit pixel data use the full
    * 16 bit range [0..65535]. If false, then the returned pixel data use the reduced Photoshop range: [0..32768].
    * The default value is false.
    * @minVersion 24.4
    */
  var fullRange: js.UndefOr[Boolean] = js.undefined
}
object GetDataOptions {
  
  inline def apply(): GetDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataOptions] (val x: Self) extends AnyVal {
    
    inline def setChunky(value: Boolean): Self = StObject.set(x, "chunky", value.asInstanceOf[js.Any])
    
    inline def setChunkyUndefined: Self = StObject.set(x, "chunky", js.undefined)
    
    inline def setFullRange(value: Boolean): Self = StObject.set(x, "fullRange", value.asInstanceOf[js.Any])
    
    inline def setFullRangeUndefined: Self = StObject.set(x, "fullRange", js.undefined)
  }
}
