package typings
package postmanDashCollectionLib.postmanDashCollectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequestBodyDefinition extends PropertyBaseDefinition {
  var file: js.UndefOr[java.lang.String | postmanDashCollectionLib.Anon_Src] = js.undefined
  var formdata: js.UndefOr[js.Array[FormParamDefinition] | PropertyList[FormParam]] = js.undefined
  var mode: java.lang.String
  var raw: js.UndefOr[java.lang.String] = js.undefined
  var urlencoded: js.UndefOr[js.Array[QueryParamDefinition] | PropertyList[QueryParam] | java.lang.String] = js.undefined
}

