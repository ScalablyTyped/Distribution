package typings.next.anon

import typings.next.nextBooleans.`false`
import typings.next.nextBooleans.`true`
import typings.next.typesMod.ResponseLimit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyParser extends StObject {
  
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    */
  var bodyParser: js.UndefOr[SizeLimit | `false`] = js.undefined
  
  /**
    * Flag to disable warning "API page resolved
    * without sending a response", due to explicitly
    * using an external API resolver, like express
    */
  var externalResolver: js.UndefOr[`true`] = js.undefined
  
  /**
    * Configures or disables body size limit warning. Can take a number or
    * any string format supported by `bytes`, for example `1000`, `'500kb'` or
    * `'3mb'`.
    */
  var responseLimit: js.UndefOr[ResponseLimit] = js.undefined
}
object BodyParser {
  
  inline def apply(): BodyParser = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyParser]
  }
  
  extension [Self <: BodyParser](x: Self) {
    
    inline def setBodyParser(value: SizeLimit | `false`): Self = StObject.set(x, "bodyParser", value.asInstanceOf[js.Any])
    
    inline def setBodyParserUndefined: Self = StObject.set(x, "bodyParser", js.undefined)
    
    inline def setExternalResolver(value: `true`): Self = StObject.set(x, "externalResolver", value.asInstanceOf[js.Any])
    
    inline def setExternalResolverUndefined: Self = StObject.set(x, "externalResolver", js.undefined)
    
    inline def setResponseLimit(value: ResponseLimit): Self = StObject.set(x, "responseLimit", value.asInstanceOf[js.Any])
    
    inline def setResponseLimitUndefined: Self = StObject.set(x, "responseLimit", js.undefined)
  }
}
