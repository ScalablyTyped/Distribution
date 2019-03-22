package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs

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
  def openAlertDialog(
    alertStrings: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.AlertDialogStrings
  ): js.Promise[scala.Unit] = js.native
  def openAlertDialog(
    alertStrings: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.AlertDialogStrings,
    options: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.AlertDialogOptions
  ): js.Promise[scala.Unit] = js.native
  /**
  		 * Opens Confirm Dialog
  		 * @param confirmStrings String which will be used in the dialog
  		 * @param options Options for the dialog
  		 * @returns promise defining success or failure of operation. the success case returns a boolean specifying whether yes or no button was pressed
  		 */
  def openConfirmDialog(
    confirmStrings: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.ConfirmDialogStrings
  ): js.Promise[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.ConfirmDialogResponse
  ] = js.native
  def openConfirmDialog(
    confirmStrings: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.ConfirmDialogStrings,
    options: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.ConfirmDialogOptions
  ): js.Promise[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.ConfirmDialogResponse
  ] = js.native
  /**
  		 * Opens an Error Dialog.
  		 * @param options Error Dialog options.
  		 * @returns promise defining success or failure of operation.
  		 */
  def openErrorDialog(
    options: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.ErrorDialogOptions
  ): js.Promise[scala.Unit] = js.native
  /**
  		 * Open a file
  		 * @param file An object describing the file to open
  		 * @param options Options for openFile. OpenMode field in the options allows to save file instead opening.
  		 * @returns promise defining success or failure of operation.
  		 */
  def openFile(file: FileObject): js.Promise[scala.Unit] = js.native
  def openFile(
    file: FileObject,
    options: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.OpenFileOptions
  ): js.Promise[scala.Unit] = js.native
  /**
  		 * Opens an entity form or quick create form.
  		 * @param options entity form options.
  		 * @param parameters entity form parameters.
  		 * @returns promise defining success or failure of operation
  		 */
  def openForm(
    options: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.EntityFormOptions
  ): js.Promise[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.OpenFormSuccessResponse
  ] = js.native
  def openForm(
    options: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.EntityFormOptions,
    parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): js.Promise[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.OpenFormSuccessResponse
  ] = js.native
  /**
  		 * Open url, including file urls.
  		 * @param url url to be opened.
  		 * @param options window options for the url.
  		 */
  def openUrl(url: java.lang.String): scala.Unit = js.native
  def openUrl(
    url: java.lang.String,
    options: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.OpenUrlOptions
  ): scala.Unit = js.native
  /**
  		 * Opens an HTML web resource.
  		 * @param name The name of the HTML web resource to open.
  		 * @param options Window options for the web resource.
  		 * @param data Data to be passed into the data parameter.
  		 */
  def openWebResource(name: java.lang.String): scala.Unit = js.native
  def openWebResource(
    name: java.lang.String,
    options: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.OpenWebResourceOptions
  ): scala.Unit = js.native
  def openWebResource(
    name: java.lang.String,
    options: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.NavigationApiNs.OpenWebResourceOptions,
    data: java.lang.String
  ): scala.Unit = js.native
}

