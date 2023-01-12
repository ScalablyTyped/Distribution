package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GcsSource extends StObject {
  
  /** Google Cloud Storage URI for the input file. This must only be a Google Cloud Storage object. Wildcards are not currently supported. */
  var uri: js.UndefOr[String] = js.undefined
}
object GcsSource {
  
  inline def apply(): GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GcsSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GcsSource] (val x: Self) extends AnyVal {
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
