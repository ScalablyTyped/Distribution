package typings.openui5.sapUiUnifiedLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FileUploaderHttpRequestMethod extends StObject
@JSImport("sap/ui/unified/library", "FileUploaderHttpRequestMethod")
@js.native
object FileUploaderHttpRequestMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FileUploaderHttpRequestMethod & String] = js.native
  
  /**
    * HTTP request POST method.
    */
  @js.native
  sealed trait Post
    extends StObject
       with FileUploaderHttpRequestMethod
  /* "POST" */ val Post: typings.openui5.sapUiUnifiedLibraryMod.FileUploaderHttpRequestMethod.Post & String = js.native
  
  /**
    * HTTP request PUT method.
    */
  @js.native
  sealed trait Put
    extends StObject
       with FileUploaderHttpRequestMethod
  /* "PUT" */ val Put: typings.openui5.sapUiUnifiedLibraryMod.FileUploaderHttpRequestMethod.Put & String = js.native
}
