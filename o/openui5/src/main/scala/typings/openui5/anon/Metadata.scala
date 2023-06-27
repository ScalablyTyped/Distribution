package typings.openui5.anon

import typings.openui5.sapUiBaseManagedObjectMod.MetadataOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  /**
    * The metadata object describing the class
    */
  var metadata: js.UndefOr[MetadataOptions] = js.undefined
}
object Metadata {
  
  inline def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    inline def setMetadata(value: MetadataOptions): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
