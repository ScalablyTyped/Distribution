package typings.ngDashFileDashUpload.ngDashFileDashUploadMod.angularMod.angularFileUploadNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUploadOptions extends js.Object {
  /**
    * Standard HTML accept attr, browser specific select popup window
    * @type {string}
    */
  var ngfAccept: js.UndefOr[String] = js.undefined
  /**
    * Default true, allow dropping files only for Chrome webkit browser
    * @type {boolean}
    */
  var ngfAllowDir: js.UndefOr[Boolean] = js.undefined
  /**
    * Default false, enable firefox image paste by making element contenteditable
    * @type {boolean}
    */
  var ngfEnableFirefoxPaste: js.UndefOr[Boolean] = js.undefined
  /**
    * Default false, hides element if file drag&drop is not
    * @type {boolean}
    */
  var ngfHideOnDropNotAvailable: js.UndefOr[Boolean] = js.undefined
  /**
    * Validate error name: maxDuration
    * @type {(number|string)}
    */
  var ngfMaxDuration: js.UndefOr[Double | String] = js.undefined
  /**
    * Maximum number of files allowed to be selected or dropped, validate error name: maxFiles
    * @type {number}
    */
  var ngfMaxFiles: js.UndefOr[Double] = js.undefined
  /**
    * Validate error name: maxSize
    * @type {(number|string)}
    */
  var ngfMaxSize: js.UndefOr[Double | String] = js.undefined
  /**
    * Validate error name: maxTotalSize
    * @type {(number|string)}
    */
  var ngfMaxTotalSize: js.UndefOr[Double | String] = js.undefined
  /**
    * Validate error name: minDuration
    * @type {(number|string)}
    */
  var ngfMinDuration: js.UndefOr[Double | String] = js.undefined
  /**
    * Validate error name: minRatio
    * @type {(number|string)}
    */
  var ngfMinRatio: js.UndefOr[Double | String] = js.undefined
  /**
    * Validate error name: minSize
    * @type {(number|string)}
    */
  var ngfMinSize: js.UndefOr[Double | String] = js.undefined
  /**
    * Allows selecting multiple files
    * @type {boolean}
    */
  var ngfMultiple: js.UndefOr[Boolean] = js.undefined
  /**
    * List of comma separated valid aspect ratio of images in float or 2:3 format
    * @type {string}
    */
  var ngfRatio: js.UndefOr[String] = js.undefined
  /**
    * Default false, whether to propagate drag/drop events.
    * @type {boolean}
    */
  var ngfStopPropagation: js.UndefOr[Boolean] = js.undefined
  /**
    * Default false, if true file.$error will be set if the dimension or duration
    * values for validations cannot be calculated for example image load error or unsupported video by the browser.
    * By default it would assume the file is valid if the duration or dimension cannot be calculated by the browser.
    * @type {boolean}
    */
  var ngfValidateForce: js.UndefOr[Boolean] = js.undefined
}

object FileUploadOptions {
  @scala.inline
  def apply(
    ngfAccept: String = null,
    ngfAllowDir: js.UndefOr[Boolean] = js.undefined,
    ngfEnableFirefoxPaste: js.UndefOr[Boolean] = js.undefined,
    ngfHideOnDropNotAvailable: js.UndefOr[Boolean] = js.undefined,
    ngfMaxDuration: Double | String = null,
    ngfMaxFiles: Int | Double = null,
    ngfMaxSize: Double | String = null,
    ngfMaxTotalSize: Double | String = null,
    ngfMinDuration: Double | String = null,
    ngfMinRatio: Double | String = null,
    ngfMinSize: Double | String = null,
    ngfMultiple: js.UndefOr[Boolean] = js.undefined,
    ngfRatio: String = null,
    ngfStopPropagation: js.UndefOr[Boolean] = js.undefined,
    ngfValidateForce: js.UndefOr[Boolean] = js.undefined
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

