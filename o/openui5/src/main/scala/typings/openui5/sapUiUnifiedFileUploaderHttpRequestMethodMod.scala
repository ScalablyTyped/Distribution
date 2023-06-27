package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiUnifiedFileUploaderHttpRequestMethodMod {
  
  /**
    * @since 1.81.0
    *
    * Types of HTTP request methods.
    */
  @JSImport("sap/ui/unified/FileUploaderHttpRequestMethod", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FileUploaderHttpRequestMethod & String] = js.native
    
    /* "POST" */ val Post: typings.openui5.sapUiUnifiedFileUploaderHttpRequestMethodMod.FileUploaderHttpRequestMethod.Post & String = js.native
    
    /* "PUT" */ val Put: typings.openui5.sapUiUnifiedFileUploaderHttpRequestMethodMod.FileUploaderHttpRequestMethod.Put & String = js.native
  }
  
  @js.native
  sealed trait FileUploaderHttpRequestMethod extends StObject
  /**
    * @since 1.81.0
    *
    * Types of HTTP request methods.
    */
  @JSImport("sap/ui/unified/FileUploaderHttpRequestMethod", "FileUploaderHttpRequestMethod")
  @js.native
  object FileUploaderHttpRequestMethod extends StObject {
    
    /**
      * HTTP request POST method.
      */
    @js.native
    sealed trait Post
      extends StObject
         with FileUploaderHttpRequestMethod
    
    /**
      * HTTP request PUT method.
      */
    @js.native
    sealed trait Put
      extends StObject
         with FileUploaderHttpRequestMethod
  }
}
