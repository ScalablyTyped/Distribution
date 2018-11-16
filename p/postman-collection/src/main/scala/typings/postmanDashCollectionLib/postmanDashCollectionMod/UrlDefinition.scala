package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UrlDefinition extends PropertyBaseDefinition {
  var auth: js.UndefOr[postmanDashCollectionLib.Anon_User] = js.undefined
  var hash: js.UndefOr[java.lang.String] = js.undefined
  var host: js.UndefOr[js.Array[java.lang.String] | java.lang.String] = js.undefined
  var path: js.Array[java.lang.String] | java.lang.String
  var port: js.UndefOr[java.lang.String] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | java.lang.String] = js.undefined
  var variable: js.UndefOr[js.Array[VariableDefinition]] = js.undefined
}

