package typings.navigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("navigation", "StateContext")
@js.native
class StateContext () extends js.Object {
  /**
    * Gets the current asynchronous data
    */
  var asyncData: js.Any = js.native
  /**
    * Gets a Crumb collection representing the crumb trail, ordered oldest
    * Crumb first
    */
  var crumbs: js.Array[Crumb] = js.native
  /**
    * Gets the NavigationData for the current State
    */
  var data: js.Any = js.native
  /**
    * Gets a value indicating whether browser history was used
    */
  var history: Boolean = js.native
  /**
    * Gets the next crumb
    */
  var nextCrumb: Crumb = js.native
  /**
    * Gets the NavigationData for the last displayed State
    */
  var oldData: js.Any = js.native
  /**
    * Gets the last State displayed before the current State
    */
  var oldState: State = js.native
  /**
    * Gets the Url for the last displayed State
    */
  var oldUrl: String = js.native
  /**
    * Gets the NavigationData of the last Crumb in the crumb trail
    */
  var previousData: js.Any = js.native
  /**
    * Gets the State of the last Crumb in the crumb trail
    */
  var previousState: State = js.native
  /**
    * Gets the Url of the last Crumb in the crumb trail
    */
  var previousUrl: String = js.native
  /**
    * Gets the current State
    */
  var state: State = js.native
  /**
    * Gets or sets the current title
    */
  var title: String = js.native
  /**
    * Gets the current Url
    */
  var url: String = js.native
  /**
    * Clears the Context Data
    */
  def clear(): Unit = js.native
  /**
    * Combines the data with a subset of the current NavigationData
    * @param The data to add to the current NavigationData
    * @returns The combined data
    */
  def includeCurrentData(data: js.Any): js.Any = js.native
  def includeCurrentData(data: js.Any, keys: js.Array[String]): js.Any = js.native
}

