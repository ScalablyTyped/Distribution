package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapMUploadUploaderHttpRequestMethodMod {
  
  /**
    * @SINCE 1.90
    *
    * Types of HTTP request methods.
    */
  @JSImport("sap/m/upload/UploaderHttpRequestMethod", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[UploaderHttpRequestMethod & String] = js.native
    
    /* "POST" */ val Post: typings.openui5.sapMUploadUploaderHttpRequestMethodMod.UploaderHttpRequestMethod.Post & String = js.native
    
    /* "PUT" */ val Put: typings.openui5.sapMUploadUploaderHttpRequestMethodMod.UploaderHttpRequestMethod.Put & String = js.native
  }
  
  @js.native
  sealed trait UploaderHttpRequestMethod extends StObject
  /**
    * @SINCE 1.90
    *
    * Types of HTTP request methods.
    */
  @JSImport("sap/m/upload/UploaderHttpRequestMethod", "UploaderHttpRequestMethod")
  @js.native
  object UploaderHttpRequestMethod extends StObject {
    
    /**
      * HTTP request POST method.
      */
    @js.native
    sealed trait Post
      extends StObject
         with UploaderHttpRequestMethod
    
    /**
      * HTTP request PUT method.
      */
    @js.native
    sealed trait Put
      extends StObject
         with UploaderHttpRequestMethod
  }
}
