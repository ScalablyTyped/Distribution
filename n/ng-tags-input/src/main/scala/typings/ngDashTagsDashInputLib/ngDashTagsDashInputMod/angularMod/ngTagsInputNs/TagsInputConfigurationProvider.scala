package typings
package ngDashTagsDashInputLib.ngDashTagsDashInputMod.angularMod.ngTagsInputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagsInputConfigurationProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  /**
               * Sets active interpolation for a set of options.
               */
  def setActiveInterpolation(
    directive: java.lang.String,
    options: ngDashTagsDashInputLib.ngDashTagsDashInputMod.IAutocompleteParams
  ): js.Any = js.native
  /**
               * Sets active interpolation for a set of options.
               */
  def setActiveInterpolation(
    directive: java.lang.String,
    options: ngDashTagsDashInputLib.ngDashTagsDashInputMod.ITagsInputParams
  ): js.Any = js.native
  /**
               * Sets the default configuration option for a directive.
               */
  def setDefaults(
    directive: java.lang.String,
    defaults: ngDashTagsDashInputLib.ngDashTagsDashInputMod.IAutocompleteParams
  ): js.Any = js.native
  /**
               * Sets the default configuration option for a directive.
               */
  def setDefaults(
    directive: java.lang.String,
    defaults: ngDashTagsDashInputLib.ngDashTagsDashInputMod.ITagsInputParams
  ): js.Any = js.native
  /**
               * Sets the threshold used by the tagsInput directive to re-size the inner input field element based on its contents.
               */
  def setTextAutosizeThreshold(threshold: scala.Double): js.Any = js.native
}

