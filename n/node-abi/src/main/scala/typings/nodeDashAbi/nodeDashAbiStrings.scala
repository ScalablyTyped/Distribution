package typings.nodeDashAbi

import typings.nodeDashAbi.nodeDashAbiMod.Runtime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object nodeDashAbiStrings {
  @js.native
  sealed trait electron extends Runtime
  
  @js.native
  sealed trait node extends Runtime
  
  @js.native
  sealed trait `node-webkit` extends Runtime
  
  @scala.inline
  def electron: electron = "electron".asInstanceOf[electron]
  @scala.inline
  def node: node = "node".asInstanceOf[node]
  @scala.inline
  def `node-webkit`: `node-webkit` = "node-webkit".asInstanceOf[`node-webkit`]
}

