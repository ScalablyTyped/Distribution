package typings
package openui5Lib.sapNs.uiNs.coreNs.mvcNs.ViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
           * Interface for Preprocessor implementations that can be hooked in the view life cycle.There are two
           * possibilities to use the preprocessor. It can be either passed to the view via the
           * mSettings.preprocessors objectwhere it is the executed only for this instance, or by the
           * registerPreprocessor method of the view type. Currently this isavailable only for XMLViews (as of
           * version 1.30).
           * @resource sap/ui/core/mvc/View.js
          */
@js.native
trait Preprocessor extends js.Object {
  /**
               * Processing method that must be implemented by a Preprocessor.
               * @param vSource the source to be processed
               * @param oViewInfo identification information about the calling instance
               * @param mSettings settings object containing the settings provided with the preprocessor
               * @returns the processed resource or a promise which resolves with the processed resource or an error
               * according to the		declared preprocessor sync capability
              */
  def process(vSource: js.Any, oViewInfo: js.Any): js.Any | jqueryLib.JQueryPromise[_] = js.native
  /**
               * Processing method that must be implemented by a Preprocessor.
               * @param vSource the source to be processed
               * @param oViewInfo identification information about the calling instance
               * @param mSettings settings object containing the settings provided with the preprocessor
               * @returns the processed resource or a promise which resolves with the processed resource or an error
               * according to the		declared preprocessor sync capability
              */
  def process(vSource: js.Any, oViewInfo: js.Any, mSettings: js.Any): js.Any | jqueryLib.JQueryPromise[_] = js.native
}

