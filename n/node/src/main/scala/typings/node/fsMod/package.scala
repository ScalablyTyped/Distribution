package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsMod {
  type NoParamCallback = js.Function1[/* err */ typings.node.NodeJS.ErrnoException | scala.Null, scala.Unit]
  /**
    * Valid types for path values in "fs".
    */
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.node.urlMod.URL_
  */
  type PathLike = typings.node.fsMod._PathLike | java.lang.String
  type WriteFileOptions = typings.node.AnonEncodingFlagMode | java.lang.String | scala.Null
}
