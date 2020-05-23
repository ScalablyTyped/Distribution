package typings.openfin.mod.fin

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.openfin.anon.HttpResponseCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenFinApplicationStatic
  extends /**
  * Creates a new Application.
  * An object representing an application. Allows the developer to create, execute, show/close an application as well as listen to application events.
  */
Instantiable1[/* options */ ApplicationOption, OpenFinApplication]
     with Instantiable2[
      /* options */ ApplicationOption, 
      /* callback */ js.Function1[/* successObj */ HttpResponseCode, Unit], 
      OpenFinApplication
    ]
     with Instantiable3[
      /* options */ ApplicationOption, 
      /* callback */ js.Function1[/* successObj */ HttpResponseCode, Unit], 
      /* errorCallback */ js.Function2[/* reason */ String, /* errorObj */ NetworkErrorInfo, Unit], 
      OpenFinApplication
    ] {
  /**
    * Launches the given Application manifest.
    */
  def createFromManifest(manifestUrl: String): Unit = js.native
  def createFromManifest(manifestUrl: String, callback: js.Function1[/* app */ OpenFinApplication, Unit]): Unit = js.native
  def createFromManifest(
    manifestUrl: String,
    callback: js.Function1[/* app */ OpenFinApplication, Unit],
    errorCallback: js.Function2[/* reason */ String, /* error */ ErrorInfo, Unit]
  ): Unit = js.native
  /**
    * Returns an Application object that represents an existing application.
    */
  def getCurrent(): OpenFinApplication = js.native
  /**
    * Returns an Application object that represents an existing application.
    */
  def wrap(uuid: String): OpenFinApplication = js.native
}

