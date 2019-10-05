package typings.meteorDashTypings.Meteor

import typings.meteorDashTypings.Mongo.Collection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Meteor")
@js.native
object ^ extends js.Object {
  /** User **/
  /** Error **/
  var Error: ErrorStatic = js.native
  /** Local storage **/
  var _localStorage: LocalStorage = js.native
  /** Global props **/
  var isClient: Boolean = js.native
  var isCordova: Boolean = js.native
  /** Global props **/
  var isDevelopment: Boolean = js.native
  var isProduction: Boolean = js.native
  var isServer: Boolean = js.native
  var isTest: Boolean = js.native
  var release: String = js.native
  var settings: Settings = js.native
  var users: Collection[User] = js.native
}

