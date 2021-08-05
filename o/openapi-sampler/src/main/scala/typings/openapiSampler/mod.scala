package typings.openapiSampler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-sampler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sample(schema: OpenApiSchema): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def sample(schema: OpenApiSchema, options: Unit, spec: OpenApiSpec): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sample")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def sample(schema: OpenApiSchema, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sample")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def sample(schema: OpenApiSchema, options: Options, spec: OpenApiSpec): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sample")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  type OpenApiSchema = js.Any
  
  type OpenApiSpec = js.Any
  
  trait Options extends StObject {
    
    /**
      * Don't log console warning messages
      */
    val quiet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Don't include non-required object properties not specified in `required` property of the schema object
      */
    val skipNonRequired: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Don't include readOnly object properties
      */
    val skipReadOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Don't include writeOnly object properties
      */
    val skipWriteOnly: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setSkipNonRequired(value: Boolean): Self = StObject.set(x, "skipNonRequired", value.asInstanceOf[js.Any])
      
      inline def setSkipNonRequiredUndefined: Self = StObject.set(x, "skipNonRequired", js.undefined)
      
      inline def setSkipReadOnly(value: Boolean): Self = StObject.set(x, "skipReadOnly", value.asInstanceOf[js.Any])
      
      inline def setSkipReadOnlyUndefined: Self = StObject.set(x, "skipReadOnly", js.undefined)
      
      inline def setSkipWriteOnly(value: Boolean): Self = StObject.set(x, "skipWriteOnly", value.asInstanceOf[js.Any])
      
      inline def setSkipWriteOnlyUndefined: Self = StObject.set(x, "skipWriteOnly", js.undefined)
    }
  }
}
