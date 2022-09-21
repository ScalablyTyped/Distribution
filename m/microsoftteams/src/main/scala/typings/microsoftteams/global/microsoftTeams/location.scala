package typings.microsoftteams.global.microsoftTeams

import typings.microsoftteams.microsoftTeams.SdkError
import typings.microsoftteams.microsoftTeams.location.Location
import typings.microsoftteams.microsoftTeams.location.LocationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object location {
  
  @JSGlobal("microsoftTeams.location")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Fetches current user coordinates or allows user to choose location on map
    * @param callback Callback to invoke when current user location is fetched
    */
  inline def getLocation(props: LocationProps, callback: js.Function2[/* error */ SdkError, /* location */ Location, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocation")(props.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Shows the location on map corresponding to the given coordinates
    * @param location {@link Location} which needs to be shown on map
    * @param callback Callback to invoke when the location is opened on map
    */
  inline def showLocation(location: Location, callback: js.Function2[/* error */ SdkError, /* status */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showLocation")(location.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
