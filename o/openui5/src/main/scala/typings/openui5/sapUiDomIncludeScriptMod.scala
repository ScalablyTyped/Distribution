package typings.openui5

import typings.openui5.anon.Attributes
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiDomIncludeScriptMod {
  
  @JSImport("sap/ui/dom/includeScript", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(/**
    * the URL of the script to load or a configuration object
    */
  vUrl: String): Unit | js.Promise[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any]).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: String,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: String
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: String,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: String,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: String,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: String,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: js.Function1[/* p1 */ Event, Unit],
    /**
    * callback function to get notified once the script loading failed
    */
  fnErrorCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any], fnErrorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: String,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: String,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: Unit,
    /**
    * callback function to get notified once the script loading failed
    */
  fnErrorCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any], fnErrorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: String,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: js.Object
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: String,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: js.Object,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: String,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: js.Object,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: js.Function1[/* p1 */ Event, Unit],
    /**
    * callback function to get notified once the script loading failed
    */
  fnErrorCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any], fnErrorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: String,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: js.Object,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: Unit,
    /**
    * callback function to get notified once the script loading failed
    */
  fnErrorCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any], fnErrorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: String,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: Unit,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: String,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: Unit,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: js.Function1[/* p1 */ Event, Unit],
    /**
    * callback function to get notified once the script loading failed
    */
  fnErrorCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any], fnErrorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: String,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: Unit,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: Unit,
    /**
    * callback function to get notified once the script loading failed
    */
  fnErrorCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any], fnErrorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(/**
    * the URL of the script to load or a configuration object
    */
  vUrl: Attributes): Unit | js.Promise[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any]).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: Attributes,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: String
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: Attributes,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: String,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: Attributes,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: String,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: js.Function1[/* p1 */ Event, Unit],
    /**
    * callback function to get notified once the script loading failed
    */
  fnErrorCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any], fnErrorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: Attributes,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: String,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: Unit,
    /**
    * callback function to get notified once the script loading failed
    */
  fnErrorCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any], fnErrorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: Attributes,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: js.Object
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: Attributes,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: js.Object,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: Attributes,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: js.Object,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: js.Function1[/* p1 */ Event, Unit],
    /**
    * callback function to get notified once the script loading failed
    */
  fnErrorCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any], fnErrorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: Attributes,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: js.Object,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: Unit,
    /**
    * callback function to get notified once the script loading failed
    */
  fnErrorCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any], fnErrorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: Attributes,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: Unit,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: Attributes,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: Unit,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: js.Function1[/* p1 */ Event, Unit],
    /**
    * callback function to get notified once the script loading failed
    */
  fnErrorCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any], fnErrorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
  inline def default(
    /**
    * the URL of the script to load or a configuration object
    */
  vUrl: Attributes,
    /**
    * id that should be used for the script tag or map of attributes
    */
  vId: Unit,
    /**
    * callback function to get notified once the script has been loaded
    */
  fnLoadCallback: Unit,
    /**
    * callback function to get notified once the script loading failed
    */
  fnErrorCallback: js.Function1[/* p1 */ Event, Unit]
  ): Unit | js.Promise[Event] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(vUrl.asInstanceOf[js.Any], vId.asInstanceOf[js.Any], fnLoadCallback.asInstanceOf[js.Any], fnErrorCallback.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Event]]
}
