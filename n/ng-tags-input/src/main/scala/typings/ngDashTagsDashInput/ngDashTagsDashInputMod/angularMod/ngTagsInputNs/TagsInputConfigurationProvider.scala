package typings.ngDashTagsDashInput.ngDashTagsDashInputMod.angularMod.ngTagsInputNs

import typings.angular.angularMod.IServiceProvider
import typings.ngDashTagsDashInput.ngDashTagsDashInputMod.IAutocompleteParams
import typings.ngDashTagsDashInput.ngDashTagsDashInputMod.ITagsInputParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagsInputConfigurationProvider extends IServiceProvider {
  def setActiveInterpolation(directive: String, options: IAutocompleteParams): js.Any = js.native
  /**
    * Sets active interpolation for a set of options.
    */
  def setActiveInterpolation(directive: String, options: ITagsInputParams): js.Any = js.native
  def setDefaults(directive: String, defaults: IAutocompleteParams): js.Any = js.native
  /**
    * Sets the default configuration option for a directive.
    */
  def setDefaults(directive: String, defaults: ITagsInputParams): js.Any = js.native
  /**
    * Sets the threshold used by the tagsInput directive to re-size the inner input field element based on its contents.
    */
  def setTextAutosizeThreshold(threshold: Double): js.Any = js.native
}

