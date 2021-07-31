package typings.openapiSampler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-sampler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sample(schema: OpenApiSchema): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("sample")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def sample(schema: OpenApiSchema, options: Unit, spec: OpenApiSpec): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sample")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def sample(schema: OpenApiSchema, options: Options): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sample")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  @scala.inline
  def sample(schema: OpenApiSchema, options: Options, spec: OpenApiSpec): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("sample")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], spec.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
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
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setSkipNonRequired(value: Boolean): Self = StObject.set(x, "skipNonRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipNonRequiredUndefined: Self = StObject.set(x, "skipNonRequired", js.undefined)
      
      @scala.inline
      def setSkipReadOnly(value: Boolean): Self = StObject.set(x, "skipReadOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipReadOnlyUndefined: Self = StObject.set(x, "skipReadOnly", js.undefined)
      
      @scala.inline
      def setSkipWriteOnly(value: Boolean): Self = StObject.set(x, "skipWriteOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipWriteOnlyUndefined: Self = StObject.set(x, "skipWriteOnly", js.undefined)
    }
  }
}
