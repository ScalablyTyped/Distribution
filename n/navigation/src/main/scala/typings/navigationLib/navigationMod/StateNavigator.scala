package typings
package navigationLib.navigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("navigation", "StateNavigator")
@js.native
class StateNavigator () extends js.Object {
  /**
       * Initializes a new instance of the StateNavigator class
       * @param states A collection of States
       * @param historyManager The manager of the browser Url
       */
  def this(states: js.Array[StateInfo]) = this()
  /**
       * Initializes a new instance of the StateNavigator class
       * @param states A collection of States
       * @param historyManager The manager of the browser Url
       */
  def this(states: js.Array[StateInfo], historyManager: HistoryManager) = this()
  /**
       * Gets the browser Url manager
       */
  var historyManager: HistoryManager = js.native
  /**
       * Provides access to context sensitive navigation information
       */
  var stateContext: StateContext = js.native
  /**
       * Gets a list of States
       */
  var states: org.scalablytyped.runtime.StringDictionary[State] = js.native
  /**
       * Determines if the distance specified is within the bounds of the
       * crumb trail represented by the Crumbs collection
       */
  def canNavigateBack(distance: scala.Double): scala.Boolean = js.native
  /**
       * Configures the StateNavigator
       * @param stateInfos A collection of State Infos
       * @param historyManager The manager of the browser Url
       */
  def configure(stateInfos: js.Array[StateInfo]): scala.Unit = js.native
  /**
       * Configures the StateNavigator
       * @param stateInfos A collection of State Infos
       * @param historyManager The manager of the browser Url
       */
  def configure(stateInfos: js.Array[StateInfo], historyManager: HistoryManager): scala.Unit = js.native
  /**
       * Creates a FluentNavigator
       * @param withContext a value indicating whether to inherit the current
       * context
       * @returns A FluentNavigator
       */
  def fluent(): FluentNavigator = js.native
  /**
       * Creates a FluentNavigator
       * @param withContext a value indicating whether to inherit the current
       * context
       * @returns A FluentNavigator
       */
  def fluent(withContext: scala.Boolean): FluentNavigator = js.native
  /**
       * Gets a Url to navigate back along the crumb trail
       * @param distance Starting at 1, the number of Crumb steps to go back
       * @throws canNavigateBack returns false for this distance
       */
  def getNavigationBackLink(distance: scala.Double): java.lang.String = js.native
  /**
       * Gets a Url to navigate to a State
       * @param stateKey The key of a State
       * @param navigationData The NavigationData to be passed to the next
       * State and stored in the StateContext
       * @returns Url that will navigate to State specified in the action
       * @throws state does not match the key of a State or there is
       * NavigationData that cannot be converted to a String
       */
  def getNavigationLink(stateKey: java.lang.String): java.lang.String = js.native
  /**
       * Gets a Url to navigate to a State
       * @param stateKey The key of a State
       * @param navigationData The NavigationData to be passed to the next
       * State and stored in the StateContext
       * @returns Url that will navigate to State specified in the action
       * @throws state does not match the key of a State or there is
       * NavigationData that cannot be converted to a String
       */
  def getNavigationLink(stateKey: java.lang.String, navigationData: js.Any): java.lang.String = js.native
  /**
       * Gets a Url to navigate to the current State
       * @param navigationData The NavigationData to be passed to the current
       * State and stored in the StateContext
       * @returns Url that will navigate to the current State
       * @throws There is NavigationData that cannot be converted to a String
       */
  def getRefreshLink(): java.lang.String = js.native
  /**
       * Gets a Url to navigate to the current State
       * @param navigationData The NavigationData to be passed to the current
       * State and stored in the StateContext
       * @returns Url that will navigate to the current State
       * @throws There is NavigationData that cannot be converted to a String
       */
  def getRefreshLink(navigationData: js.Any): java.lang.String = js.native
  /**
       * Navigates to a State
       * @param stateKey The key of a State
       * @param navigationData The NavigationData to be passed to the next
       * State and stored in the StateContext
       * @param A value determining the effect on browser history
       * @throws state does not match the key of a State or there is
       * NavigationData that cannot be converted to a String
       * @throws A mandatory route parameter has not been supplied a value
       */
  def navigate(stateKey: java.lang.String): scala.Unit = js.native
  /**
       * Navigates to a State
       * @param stateKey The key of a State
       * @param navigationData The NavigationData to be passed to the next
       * State and stored in the StateContext
       * @param A value determining the effect on browser history
       * @throws state does not match the key of a State or there is
       * NavigationData that cannot be converted to a String
       * @throws A mandatory route parameter has not been supplied a value
       */
  def navigate(stateKey: java.lang.String, navigationData: js.Any): scala.Unit = js.native
  /**
       * Navigates back along the crumb trail
       * @param distance Starting at 1, the number of Crumb steps to go back
       * @param A value determining the effect on browser history
       * @throws canNavigateBack returns false for this distance
       * @throws A mandatory route parameter has not been supplied a value
       */
  def navigateBack(distance: scala.Double): scala.Unit = js.native
  /**
       * Navigates back along the crumb trail
       * @param distance Starting at 1, the number of Crumb steps to go back
       * @param A value determining the effect on browser history
       * @throws canNavigateBack returns false for this distance
       * @throws A mandatory route parameter has not been supplied a value
       */
  @JSName("navigateBack")
  def navigateBack_add(distance: scala.Double, historyAction: navigationLib.navigationLibStrings.add): scala.Unit = js.native
  /**
       * Navigates back along the crumb trail
       * @param distance Starting at 1, the number of Crumb steps to go back
       * @param A value determining the effect on browser history
       * @throws canNavigateBack returns false for this distance
       * @throws A mandatory route parameter has not been supplied a value
       */
  @JSName("navigateBack")
  def navigateBack_none(distance: scala.Double, historyAction: navigationLib.navigationLibStrings.none): scala.Unit = js.native
  /**
       * Navigates back along the crumb trail
       * @param distance Starting at 1, the number of Crumb steps to go back
       * @param A value determining the effect on browser history
       * @throws canNavigateBack returns false for this distance
       * @throws A mandatory route parameter has not been supplied a value
       */
  @JSName("navigateBack")
  def navigateBack_replace(distance: scala.Double, historyAction: navigationLib.navigationLibStrings.replace): scala.Unit = js.native
  /**
       * Navigates to the url
       * @param url The target location
       * @param A value determining the effect on browser history
       * @param history A value indicating whether browser history was used
       */
  def navigateLink(url: java.lang.String): scala.Unit = js.native
  /**
       * Navigates to the url
       * @param url The target location
       * @param A value determining the effect on browser history
       * @param history A value indicating whether browser history was used
       */
  @JSName("navigateLink")
  def navigateLink_add(url: java.lang.String, historyAction: navigationLib.navigationLibStrings.add): scala.Unit = js.native
  /**
       * Navigates to the url
       * @param url The target location
       * @param A value determining the effect on browser history
       * @param history A value indicating whether browser history was used
       */
  @JSName("navigateLink")
  def navigateLink_add(
    url: java.lang.String,
    historyAction: navigationLib.navigationLibStrings.add,
    history: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Navigates to the url
       * @param url The target location
       * @param A value determining the effect on browser history
       * @param history A value indicating whether browser history was used
       */
  @JSName("navigateLink")
  def navigateLink_none(url: java.lang.String, historyAction: navigationLib.navigationLibStrings.none): scala.Unit = js.native
  /**
       * Navigates to the url
       * @param url The target location
       * @param A value determining the effect on browser history
       * @param history A value indicating whether browser history was used
       */
  @JSName("navigateLink")
  def navigateLink_none(
    url: java.lang.String,
    historyAction: navigationLib.navigationLibStrings.none,
    history: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Navigates to the url
       * @param url The target location
       * @param A value determining the effect on browser history
       * @param history A value indicating whether browser history was used
       */
  @JSName("navigateLink")
  def navigateLink_replace(url: java.lang.String, historyAction: navigationLib.navigationLibStrings.replace): scala.Unit = js.native
  /**
       * Navigates to the url
       * @param url The target location
       * @param A value determining the effect on browser history
       * @param history A value indicating whether browser history was used
       */
  @JSName("navigateLink")
  def navigateLink_replace(
    url: java.lang.String,
    historyAction: navigationLib.navigationLibStrings.replace,
    history: scala.Boolean
  ): scala.Unit = js.native
  /**
       * Navigates to a State
       * @param stateKey The key of a State
       * @param navigationData The NavigationData to be passed to the next
       * State and stored in the StateContext
       * @param A value determining the effect on browser history
       * @throws state does not match the key of a State or there is
       * NavigationData that cannot be converted to a String
       * @throws A mandatory route parameter has not been supplied a value
       */
  @JSName("navigate")
  def navigate_add(
    stateKey: java.lang.String,
    navigationData: js.Any,
    historyAction: navigationLib.navigationLibStrings.add
  ): scala.Unit = js.native
  /**
       * Navigates to a State
       * @param stateKey The key of a State
       * @param navigationData The NavigationData to be passed to the next
       * State and stored in the StateContext
       * @param A value determining the effect on browser history
       * @throws state does not match the key of a State or there is
       * NavigationData that cannot be converted to a String
       * @throws A mandatory route parameter has not been supplied a value
       */
  @JSName("navigate")
  def navigate_none(
    stateKey: java.lang.String,
    navigationData: js.Any,
    historyAction: navigationLib.navigationLibStrings.none
  ): scala.Unit = js.native
  /**
       * Navigates to a State
       * @param stateKey The key of a State
       * @param navigationData The NavigationData to be passed to the next
       * State and stored in the StateContext
       * @param A value determining the effect on browser history
       * @throws state does not match the key of a State or there is
       * NavigationData that cannot be converted to a String
       * @throws A mandatory route parameter has not been supplied a value
       */
  @JSName("navigate")
  def navigate_replace(
    stateKey: java.lang.String,
    navigationData: js.Any,
    historyAction: navigationLib.navigationLibStrings.replace
  ): scala.Unit = js.native
  /**
       * Unregisters a navigate event listener
       * @param handler The navigate event listener
       */
  def offNavigate(
    handler: js.Function4[
      /* oldState */ State, 
      /* state */ State, 
      /* data */ js.Any, 
      /* asyncData */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Registers a navigate event listener
       * @param handler The navigate event listener
       */
  def onNavigate(
    handler: js.Function4[
      /* oldState */ State, 
      /* state */ State, 
      /* data */ js.Any, 
      /* asyncData */ js.Any, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /**
       * Parses the url out into State and Navigation Data
       * @param url The url to parse
       */
  def parseLink(url: java.lang.String): navigationLib.Anon_State = js.native
  /**
       * Navigates to the current State
       * @param navigationData The NavigationData to be passed to the current
       * State and stored in the StateContext
       * @param A value determining the effect on browser history
       * @throws There is NavigationData that cannot be converted to a String
       * @throws A mandatory route parameter has not been supplied a value
       */
  def refresh(): scala.Unit = js.native
  /**
       * Navigates to the current State
       * @param navigationData The NavigationData to be passed to the current
       * State and stored in the StateContext
       * @param A value determining the effect on browser history
       * @throws There is NavigationData that cannot be converted to a String
       * @throws A mandatory route parameter has not been supplied a value
       */
  def refresh(navigationData: js.Any): scala.Unit = js.native
  /**
       * Navigates to the current State
       * @param navigationData The NavigationData to be passed to the current
       * State and stored in the StateContext
       * @param A value determining the effect on browser history
       * @throws There is NavigationData that cannot be converted to a String
       * @throws A mandatory route parameter has not been supplied a value
       */
  @JSName("refresh")
  def refresh_add(navigationData: js.Any, historyAction: navigationLib.navigationLibStrings.add): scala.Unit = js.native
  /**
       * Navigates to the current State
       * @param navigationData The NavigationData to be passed to the current
       * State and stored in the StateContext
       * @param A value determining the effect on browser history
       * @throws There is NavigationData that cannot be converted to a String
       * @throws A mandatory route parameter has not been supplied a value
       */
  @JSName("refresh")
  def refresh_none(navigationData: js.Any, historyAction: navigationLib.navigationLibStrings.none): scala.Unit = js.native
  /**
       * Navigates to the current State
       * @param navigationData The NavigationData to be passed to the current
       * State and stored in the StateContext
       * @param A value determining the effect on browser history
       * @throws There is NavigationData that cannot be converted to a String
       * @throws A mandatory route parameter has not been supplied a value
       */
  @JSName("refresh")
  def refresh_replace(navigationData: js.Any, historyAction: navigationLib.navigationLibStrings.replace): scala.Unit = js.native
  /**
       * Navigates to the passed in url
       * @param url The url to navigate to
       */
  def start(): scala.Unit = js.native
  /**
       * Navigates to the passed in url
       * @param url The url to navigate to
       */
  def start(url: java.lang.String): scala.Unit = js.native
}

