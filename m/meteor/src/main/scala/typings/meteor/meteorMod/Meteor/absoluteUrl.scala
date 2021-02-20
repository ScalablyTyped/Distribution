package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Method **/
/** Url **/
object absoluteUrl {
  
  @JSImport("meteor/meteor", "Meteor.absoluteUrl")
  @js.native
  def apply(): String = js.native
  @JSImport("meteor/meteor", "Meteor.absoluteUrl")
  @js.native
  def apply(path: js.UndefOr[scala.Nothing], options: absoluteUrlOptions): String = js.native
  @JSImport("meteor/meteor", "Meteor.absoluteUrl")
  @js.native
  def apply(path: String): String = js.native
  @JSImport("meteor/meteor", "Meteor.absoluteUrl")
  @js.native
  def apply(path: String, options: absoluteUrlOptions): String = js.native
  @JSImport("meteor/meteor", "Meteor.absoluteUrl")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("meteor/meteor", "Meteor.absoluteUrl.defaultOptions")
  @js.native
  def defaultOptions: absoluteUrlOptions = js.native
  @scala.inline
  def defaultOptions_=(x: absoluteUrlOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
}
