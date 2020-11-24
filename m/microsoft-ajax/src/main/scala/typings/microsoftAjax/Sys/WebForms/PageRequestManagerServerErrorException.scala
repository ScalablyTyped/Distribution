package typings.microsoftAjax.Sys.WebForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Raised when an error occurs on the server.
  * If an error occurs on the server while the request is being processed, an error response is returned to the browser and the Sys.WebForms.PageRequestManagerServerErrorException exception is raised.
  * To customize error handling and to display more information about the server error, handle the AsyncPostBackError event and use the AsyncPostBackErrorMessage and AllowCustomErrorsRedirect properties.
  * For an example of how to provide custom error handling during partial-page updates, see Customizing Error Handling for ASP.NET UpdatePanel Controls.
  * @see {@link http://msdn.microsoft.com/en-us/library/bb397466(v=vs.100).aspx}        *
  */
@js.native
trait PageRequestManagerServerErrorException extends js.Object
