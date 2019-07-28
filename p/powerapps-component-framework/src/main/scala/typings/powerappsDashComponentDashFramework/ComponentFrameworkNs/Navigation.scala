package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs

import org.scalablytyped.runtime.StringDictionary
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.NavigationApiNs.AlertDialogOptions
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.NavigationApiNs.AlertDialogStrings
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.NavigationApiNs.ConfirmDialogOptions
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.NavigationApiNs.ConfirmDialogResponse
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.NavigationApiNs.ConfirmDialogStrings
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.NavigationApiNs.EntityFormOptions
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.NavigationApiNs.ErrorDialogOptions
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.NavigationApiNs.OpenFileOptions
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.NavigationApiNs.OpenFormSuccessResponse
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.NavigationApiNs.OpenUrlOptions
import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.NavigationApiNs.OpenWebResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The navigation interface of context.navigation
	 */
@js.native
trait Navigation extends js.Object {
  /**
  		 * Opens Alert Dialog
  		 * @param alertStrings Strings to be used in alert dialog
  		 * @param options Dialog options
  		 * @returns promise defining success or failure of operation
  		 */
  def openAlertDialog(alertStrings: AlertDialogStrings): js.Promise[Unit] = js.native
  def openAlertDialog(alertStrings: AlertDialogStrings, options: AlertDialogOptions): js.Promise[Unit] = js.native
  /**
  		 * Opens Confirm Dialog
  		 * @param confirmStrings String which will be used in the dialog
  		 * @param options Options for the dialog
  		 * @returns promise defining success or failure of operation. the success case returns a boolean specifying whether yes or no button was pressed
  		 */
  def openConfirmDialog(confirmStrings: ConfirmDialogStrings): js.Promise[ConfirmDialogResponse] = js.native
  def openConfirmDialog(confirmStrings: ConfirmDialogStrings, options: ConfirmDialogOptions): js.Promise[ConfirmDialogResponse] = js.native
  /**
  		 * Opens an Error Dialog.
  		 * @param options Error Dialog options.
  		 * @returns promise defining success or failure of operation.
  		 */
  def openErrorDialog(options: ErrorDialogOptions): js.Promise[Unit] = js.native
  /**
  		 * Open a file
  		 * @param file An object describing the file to open
  		 * @param options Options for openFile. OpenMode field in the options allows to save file instead opening.
  		 * @returns promise defining success or failure of operation.
  		 */
  def openFile(file: FileObject): js.Promise[Unit] = js.native
  def openFile(file: FileObject, options: OpenFileOptions): js.Promise[Unit] = js.native
  /**
  		 * Opens an entity form or quick create form.
  		 * @param options entity form options.
  		 * @param parameters entity form parameters.
  		 * @returns promise defining success or failure of operation
  		 */
  def openForm(options: EntityFormOptions): js.Promise[OpenFormSuccessResponse] = js.native
  def openForm(options: EntityFormOptions, parameters: StringDictionary[String]): js.Promise[OpenFormSuccessResponse] = js.native
  /**
  		 * Open url, including file urls.
  		 * @param url url to be opened.
  		 * @param options window options for the url.
  		 */
  def openUrl(url: String): Unit = js.native
  def openUrl(url: String, options: OpenUrlOptions): Unit = js.native
  /**
  		 * Opens an HTML web resource.
  		 * @param name The name of the HTML web resource to open.
  		 * @param options Window options for the web resource.
  		 * @param data Data to be passed into the data parameter.
  		 */
  def openWebResource(name: String): Unit = js.native
  def openWebResource(name: String, options: OpenWebResourceOptions): Unit = js.native
  def openWebResource(name: String, options: OpenWebResourceOptions, data: String): Unit = js.native
}

