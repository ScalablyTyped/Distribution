package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Method **/
/** Url **/
object absoluteUrl {
  
  @scala.inline
  def apply(): String = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[String]
  @scala.inline
  def apply(path: String): String = ^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(path: String, options: absoluteUrlOptions): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(path: Unit, options: absoluteUrlOptions): String = (^.asInstanceOf[js.Dynamic].apply(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("meteor/meteor", "Meteor.absoluteUrl")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("meteor/meteor", "Meteor.absoluteUrl.defaultOptions")
  @js.native
  def defaultOptions: absoluteUrlOptions = js.native
  @scala.inline
  def defaultOptions_=(x: absoluteUrlOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
}
