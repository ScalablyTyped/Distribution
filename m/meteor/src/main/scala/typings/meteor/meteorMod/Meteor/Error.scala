package typings.meteor.meteorMod.Meteor

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Error
  extends typings.std.Error {
  
  var details: js.UndefOr[String] = js.native
  
  var error: String | Double = js.native
  
  var reason: js.UndefOr[String] = js.native
}
/** User **/
/** Error **/
@JSImport("meteor/meteor", "Meteor.Error")
@js.native
object Error extends TopLevel[ErrorStatic]
