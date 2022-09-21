package typings.openapiTypes.mod.OpenAPIV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HttpMethods extends StObject
@JSImport("openapi-types", "OpenAPIV3.HttpMethods")
@js.native
object HttpMethods extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HttpMethods & String] = js.native
  
  @js.native
  sealed trait DELETE
    extends StObject
       with HttpMethods
  /* "delete" */ val DELETE: typings.openapiTypes.mod.OpenAPIV3.HttpMethods.DELETE & String = js.native
  
  @js.native
  sealed trait GET
    extends StObject
       with HttpMethods
  /* "get" */ val GET: typings.openapiTypes.mod.OpenAPIV3.HttpMethods.GET & String = js.native
  
  @js.native
  sealed trait HEAD
    extends StObject
       with HttpMethods
  /* "head" */ val HEAD: typings.openapiTypes.mod.OpenAPIV3.HttpMethods.HEAD & String = js.native
  
  @js.native
  sealed trait OPTIONS
    extends StObject
       with HttpMethods
  /* "options" */ val OPTIONS: typings.openapiTypes.mod.OpenAPIV3.HttpMethods.OPTIONS & String = js.native
  
  @js.native
  sealed trait PATCH
    extends StObject
       with HttpMethods
  /* "patch" */ val PATCH: typings.openapiTypes.mod.OpenAPIV3.HttpMethods.PATCH & String = js.native
  
  @js.native
  sealed trait POST
    extends StObject
       with HttpMethods
  /* "post" */ val POST: typings.openapiTypes.mod.OpenAPIV3.HttpMethods.POST & String = js.native
  
  @js.native
  sealed trait PUT
    extends StObject
       with HttpMethods
  /* "put" */ val PUT: typings.openapiTypes.mod.OpenAPIV3.HttpMethods.PUT & String = js.native
  
  @js.native
  sealed trait TRACE
    extends StObject
       with HttpMethods
  /* "trace" */ val TRACE: typings.openapiTypes.mod.OpenAPIV3.HttpMethods.TRACE & String = js.native
}
