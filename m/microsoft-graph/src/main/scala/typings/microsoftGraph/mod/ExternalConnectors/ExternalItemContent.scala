package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalItemContent extends StObject {
  
  /**
    * The type of content in the value property. Possible values are: text, html, unknownFutureValue. These are the content
    * types that the indexer supports, and not the file extension types allowed.
    */
  var `type`: js.UndefOr[ExternalItemContentType] = js.undefined
  
  // The content for the externalItem. Required.
  var value: js.UndefOr[NullableOption[String]] = js.undefined
}
object ExternalItemContent {
  
  inline def apply(): ExternalItemContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalItemContent]
  }
  
  extension [Self <: ExternalItemContent](x: Self) {
    
    inline def setType(value: ExternalItemContentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: NullableOption[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
