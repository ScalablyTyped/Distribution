package typings.officeRuntime

import typings.officeRuntime.OfficeRuntime.ApiInformation
import typings.officeRuntime.OfficeRuntime.Auth
import typings.officeRuntime.OfficeRuntime.Dialog
import typings.officeRuntime.OfficeRuntime.DisplayWebDialogOptions
import typings.officeRuntime.OfficeRuntime.Storage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object OfficeRuntime {
    
    @JSGlobal("OfficeRuntime")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Provides information about what Requirement Sets are supported in current environment.
      */
    @JSGlobal("OfficeRuntime.apiInformation")
    @js.native
    val apiInformation: ApiInformation = js.native
    
    /**
      * Contains authorization related APIs.
      */
    @JSGlobal("OfficeRuntime.auth")
    @js.native
    val auth: Auth = js.native
    
    /**
      * Function that enables a pop up web dialog box.
      *
      * @remarks
      * [Api set: CustomFunctionsRuntime 1.1]
      *
      * @param url Must be a string.
      * @param options Optional parameter. Must be of type DisplayWebDialogOptions.
      */
    inline def displayWebDialog(url: String): js.Promise[Dialog] = ^.asInstanceOf[js.Dynamic].applyDynamic("displayWebDialog")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Dialog]]
    inline def displayWebDialog(url: String, options: DisplayWebDialogOptions): js.Promise[Dialog] = (^.asInstanceOf[js.Dynamic].applyDynamic("displayWebDialog")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Dialog]]
    
    /**
      * Asynchronous, global, and persistent key-value storage.
      */
    @JSGlobal("OfficeRuntime.storage")
    @js.native
    val storage: Storage = js.native
  }
}
