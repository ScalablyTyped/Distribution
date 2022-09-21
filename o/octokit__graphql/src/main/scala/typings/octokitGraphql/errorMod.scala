package typings.octokitGraphql

import typings.octokitGraphql.anon.Extensions
import typings.octokitGraphql.typesMod.GraphQlEndpointOptions
import typings.octokitTypes.responseHeadersMod.ResponseHeaders
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorMod {
  
  @JSImport("@octokit/graphql/dist-types/error", "GraphqlResponseError")
  @js.native
  open class GraphqlResponseError[ResponseData] protected ()
    extends StObject
       with Error {
    def this(
      request: GraphQlEndpointOptions,
      headers: ResponseHeaders,
      response: ServerResponseData[ResponseData]
    ) = this()
    
    val data: ResponseData = js.native
    
    val errors: js.UndefOr[js.Array[Extensions]] = js.native
    
    val headers: ResponseHeaders = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    val request: GraphQlEndpointOptions = js.native
    
    val response: ServerResponseData[ResponseData] = js.native
  }
  
  /* Inlined std.Required<@octokit/graphql.@octokit/graphql/dist-types/types.GraphQlQueryResponse<T>> */
  trait ServerResponseData[T] extends StObject {
    
    var data: T
    
    var errors: js.Array[Extensions]
  }
  object ServerResponseData {
    
    inline def apply[T](data: T, errors: js.Array[Extensions]): ServerResponseData[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerResponseData[T]]
    }
    
    extension [Self <: ServerResponseData[?], T](x: Self & ServerResponseData[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[Extensions]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: Extensions*): Self = StObject.set(x, "errors", js.Array(value*))
    }
  }
}
