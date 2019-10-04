package typings.node.processMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeJSNs {
  // this namespace merge is here because these are specifically used
  // as the type for process.stdin, process.stdout, and process.stderr.
  // they can't live in tty.d.ts because we need to disambiguate the imported name.
  type ReadStream = typings.node.ttyMod.ReadStream
  type WriteStream = typings.node.ttyMod.WriteStream
}
