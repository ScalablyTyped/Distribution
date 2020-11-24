package typings.meteor.global.Meteor

import typings.meteor.Meteor.absoluteUrlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Method **/
/** Url **/
@JSGlobal("Meteor.absoluteUrl")
@js.native
object absoluteUrl extends js.Object {
  
  def apply(): String = js.native
  def apply(path: js.UndefOr[scala.Nothing], options: absoluteUrlOptions): String = js.native
  def apply(path: String): String = js.native
  def apply(path: String, options: absoluteUrlOptions): String = js.native
  
  var defaultOptions: absoluteUrlOptions = js.native
}
