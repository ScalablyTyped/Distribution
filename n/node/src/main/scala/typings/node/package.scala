package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object node {
  import typings.node.NodeJS.Module
  import typings.node.NodeJS.Require

  type NodeModule = Module
  /*-----------------------------------------------*
    *                                               *
    *                   GLOBAL                      *
    *                                               *
    ------------------------------------------------*/
  // For backwards compability
  type NodeRequire = Require
  type RequireResolve = typings.node.NodeJS.RequireResolve
}
