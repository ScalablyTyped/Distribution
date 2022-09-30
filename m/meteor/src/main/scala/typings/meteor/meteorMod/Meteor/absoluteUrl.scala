package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Method **/
/** Url **/
/**
  * Generate an absolute URL pointing to the application. The server reads from the `ROOT_URL` environment variable to determine where it is running. This is taken care of automatically for
  * apps deployed to Galaxy, but must be provided when using `meteor build`.
  */
object absoluteUrl {
  
  /**
    * @param path A path to append to the root URL. Do not include a leading "`/`".
    */
  inline def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  inline def apply(path: String): String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(path: String, options: absoluteUrlOptions): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(path: Unit, options: absoluteUrlOptions): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("meteor/meteor", "Meteor.absoluteUrl")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("meteor/meteor", "Meteor.absoluteUrl.defaultOptions")
  @js.native
  def defaultOptions: absoluteUrlOptions = js.native
  inline def defaultOptions_=(x: absoluteUrlOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
}
