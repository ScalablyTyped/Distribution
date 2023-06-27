package typings.openui5.anon

import typings.openui5.sapUiBaseObjectMod.MetadataOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  /**
    * The metadata object describing the class
    */
  var metadata: js.UndefOr[MetadataOptions] = js.undefined
}
object `2` {
  
  inline def apply(): `2` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: MetadataOptions): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
