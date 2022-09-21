package typings.opentelemetryCore

import typings.opentelemetryApi.traceAttributesMod.SpanAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributesMod {
  
  @JSImport("@opentelemetry/core/build/src/common/attributes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isAttributeKey(key: Any): /* is string */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAttributeKey")(key.asInstanceOf[js.Any]).asInstanceOf[/* is string */ Boolean]
  
  inline def isAttributeValue(`val`: Any): /* is @opentelemetry/api.@opentelemetry/api/build/src/trace/attributes.SpanAttributeValue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAttributeValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is @opentelemetry/api.@opentelemetry/api/build/src/trace/attributes.SpanAttributeValue */ Boolean]
  
  inline def sanitizeAttributes(attributes: Any): SpanAttributes = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeAttributes")(attributes.asInstanceOf[js.Any]).asInstanceOf[SpanAttributes]
}
