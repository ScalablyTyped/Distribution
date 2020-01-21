package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object node {
  type NodeModule = typings.node.NodeJS.Module
  /*-----------------------------------------------*
    *                                               *
    *                   GLOBAL                      *
    *                                               *
    ------------------------------------------------*/
  // For backwards compability
  type NodeRequire = typings.node.NodeJS.Require
  type RequireResolve = typings.node.NodeJS.RequireResolve
}
