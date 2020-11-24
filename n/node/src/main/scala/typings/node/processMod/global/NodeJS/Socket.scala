package typings.node.processMod.global.NodeJS

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.node.nodeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Socket
  extends ReadableStream
     with WritableStream {
  
  var isTTY: js.UndefOr[`true`] = js.native
}
