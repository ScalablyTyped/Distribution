package typings.meteor.meteorMod.Meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Method **/
/** Url **/
@JSImport("meteor/meteor", "Meteor.absoluteUrl")
@js.native
object absoluteUrl extends js.Object {
  
  def apply(): String = js.native
  def apply(path: js.UndefOr[scala.Nothing], options: absoluteUrlOptions): String = js.native
  def apply(path: String): String = js.native
  def apply(path: String, options: absoluteUrlOptions): String = js.native
  
  var defaultOptions: absoluteUrlOptions = js.native
}
