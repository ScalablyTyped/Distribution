package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.paypalPaypalJsStrings.CONNECT
import typings.paypalPaypalJs.paypalPaypalJsStrings.DELETE
import typings.paypalPaypalJs.paypalPaypalJsStrings.GET
import typings.paypalPaypalJs.paypalPaypalJsStrings.HEAD
import typings.paypalPaypalJs.paypalPaypalJsStrings.OPTIONS
import typings.paypalPaypalJs.paypalPaypalJsStrings.PATCH
import typings.paypalPaypalJs.paypalPaypalJsStrings.POST
import typings.paypalPaypalJs.paypalPaypalJsStrings.PUT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncType extends StObject {
  
  /** The media type in which to submit the request data. */
  var encType: js.UndefOr[String] = js.undefined
  
  var href: String
  
  /** The HTTP method required to make the related call. */
  var method: js.UndefOr[GET | POST | PUT | DELETE | HEAD | CONNECT | OPTIONS | PATCH] = js.undefined
  
  var rel: String
  
  /** The request data or link target. */
  var schema: js.UndefOr[Any] = js.undefined
  
  /** The request data or link target. */
  var targetSchema: js.UndefOr[Any] = js.undefined
  
  /** The link title. */
  var title: js.UndefOr[String] = js.undefined
}
object EncType {
  
  inline def apply(href: String, rel: String): EncType = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncType]
  }
  
  extension [Self <: EncType](x: Self) {
    
    inline def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
    
    inline def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: GET | POST | PUT | DELETE | HEAD | CONNECT | OPTIONS | PATCH): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
    
    inline def setSchema(value: Any): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    inline def setTargetSchema(value: Any): Self = StObject.set(x, "targetSchema", value.asInstanceOf[js.Any])
    
    inline def setTargetSchemaUndefined: Self = StObject.set(x, "targetSchema", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
