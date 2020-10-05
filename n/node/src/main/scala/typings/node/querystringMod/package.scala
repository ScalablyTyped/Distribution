package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object querystringMod {
  type ParsedUrlQuery = typings.node.NodeJS.Dict[java.lang.String | js.Array[java.lang.String]]
  type ParsedUrlQueryInput = typings.node.NodeJS.Dict[
    java.lang.String | scala.Double | scala.Boolean | (js.Array[scala.Boolean | scala.Double | java.lang.String]) | scala.Null
  ]
}
