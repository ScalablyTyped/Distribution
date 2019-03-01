package typings
package ngDashFileDashUploadLib.ngDashFileDashUploadMod.angularMod.angularFileUploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadOptions extends js.Object {
  /**
    * Standard HTML accept attr, browser specific select popup window
    * @type {string}
    */
  var ngfAccept: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default true, allow dropping files only for Chrome webkit browser
    * @type {boolean}
    */
  var ngfAllowDir: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default false, enable firefox image paste by making element contenteditable
    * @type {boolean}
    */
  var ngfEnableFirefoxPaste: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default false, hides element if file drag&drop is not
    * @type {boolean}
    */
  var ngfHideOnDropNotAvailable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Validate error name: maxDuration
    * @type {(number|string)}
    */
  var ngfMaxDuration: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Maximum number of files allowed to be selected or dropped, validate error name: maxFiles
    * @type {number}
    */
  var ngfMaxFiles: js.UndefOr[scala.Double] = js.undefined
  /**
    * Validate error name: maxSize
    * @type {(number|string)}
    */
  var ngfMaxSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Validate error name: maxTotalSize
    * @type {(number|string)}
    */
  var ngfMaxTotalSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Validate error name: minDuration
    * @type {(number|string)}
    */
  var ngfMinDuration: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Validate error name: minRatio
    * @type {(number|string)}
    */
  var ngfMinRatio: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Validate error name: minSize
    * @type {(number|string)}
    */
  var ngfMinSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Allows selecting multiple files
    * @type {boolean}
    */
  var ngfMultiple: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * List of comma separated valid aspect ratio of images in float or 2:3 format
    * @type {string}
    */
  var ngfRatio: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default false, whether to propagate drag/drop events.
    * @type {boolean}
    */
  var ngfStopPropagation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default false, if true file.$error will be set if the dimension or duration
    * values for validations cannot be calculated for example image load error or unsupported video by the browser.
    * By default it would assume the file is valid if the duration or dimension cannot be calculated by the browser.
    * @type {boolean}
    */
  var ngfValidateForce: js.UndefOr[scala.Boolean] = js.undefined
}

object FileUploadOptions {
  @scala.inline
  def apply(
    ngfAccept: java.lang.String = null,
    ngfAllowDir: js.UndefOr[scala.Boolean] = js.undefined,
    ngfEnableFirefoxPaste: js.UndefOr[scala.Boolean] = js.undefined,
    ngfHideOnDropNotAvailable: js.UndefOr[scala.Boolean] = js.undefined,
    ngfMaxDuration: scala.Double | java.lang.String = null,
    ngfMaxFiles: scala.Int | scala.Double = null,
    ngfMaxSize: scala.Double | java.lang.String = null,
    ngfMaxTotalSize: scala.Double | java.lang.String = null,
    ngfMinDuration: scala.Double | java.lang.String = null,
    ngfMinRatio: scala.Double | java.lang.String = null,
    ngfMinSize: scala.Double | java.lang.String = null,
    ngfMultiple: js.UndefOr[scala.Boolean] = js.undefined,
    ngfRatio: java.lang.String = null,
    ngfStopPropagation: js.UndefOr[scala.Boolean] = js.undefined,
    ngfValidateForce: js.UndefOr[scala.Boolean] = js.undefined
  ): FileUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (ngfAccept != null) __obj.updateDynamic("ngfAccept")(ngfAccept)
    if (!js.isUndefined(ngfAllowDir)) __obj.updateDynamic("ngfAllowDir")(ngfAllowDir)
    if (!js.isUndefined(ngfEnableFirefoxPaste)) __obj.updateDynamic("ngfEnableFirefoxPaste")(ngfEnableFirefoxPaste)
    if (!js.isUndefined(ngfHideOnDropNotAvailable)) __obj.updateDynamic("ngfHideOnDropNotAvailable")(ngfHideOnDropNotAvailable)
    if (ngfMaxDuration != null) __obj.updateDynamic("ngfMaxDuration")(ngfMaxDuration.asInstanceOf[js.Any])
    if (ngfMaxFiles != null) __obj.updateDynamic("ngfMaxFiles")(ngfMaxFiles.asInstanceOf[js.Any])
    if (ngfMaxSize != null) __obj.updateDynamic("ngfMaxSize")(ngfMaxSize.asInstanceOf[js.Any])
    if (ngfMaxTotalSize != null) __obj.updateDynamic("ngfMaxTotalSize")(ngfMaxTotalSize.asInstanceOf[js.Any])
    if (ngfMinDuration != null) __obj.updateDynamic("ngfMinDuration")(ngfMinDuration.asInstanceOf[js.Any])
    if (ngfMinRatio != null) __obj.updateDynamic("ngfMinRatio")(ngfMinRatio.asInstanceOf[js.Any])
    if (ngfMinSize != null) __obj.updateDynamic("ngfMinSize")(ngfMinSize.asInstanceOf[js.Any])
    if (!js.isUndefined(ngfMultiple)) __obj.updateDynamic("ngfMultiple")(ngfMultiple)
    if (ngfRatio != null) __obj.updateDynamic("ngfRatio")(ngfRatio)
    if (!js.isUndefined(ngfStopPropagation)) __obj.updateDynamic("ngfStopPropagation")(ngfStopPropagation)
    if (!js.isUndefined(ngfValidateForce)) __obj.updateDynamic("ngfValidateForce")(ngfValidateForce)
    __obj.asInstanceOf[FileUploadOptions]
  }
}

