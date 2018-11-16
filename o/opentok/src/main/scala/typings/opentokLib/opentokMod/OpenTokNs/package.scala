package typings
package opentokLib.opentokMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object OpenTokNs {
  type ArchiveLayoutOptions = PredefinedArchiveLayoutOptions | CustomArchiveLayoutOptions
  type ArchiveMode = opentokLib.opentokLibStrings.manual | opentokLib.opentokLibStrings.always
  type ArchiveStatus = opentokLib.opentokLibStrings.available | opentokLib.opentokLibStrings.expired | opentokLib.opentokLibStrings.failed | opentokLib.opentokLibStrings.paused | opentokLib.opentokLibStrings.started | opentokLib.opentokLibStrings.stopped | opentokLib.opentokLibStrings.uploaded
  type MediaMode = opentokLib.opentokLibStrings.relayed | opentokLib.opentokLibStrings.routed
  type OutputMode = opentokLib.opentokLibStrings.composed | opentokLib.opentokLibStrings.individual
  type Role = opentokLib.opentokLibStrings.subscriber | opentokLib.opentokLibStrings.publisher | opentokLib.opentokLibStrings.moderator
  type Token = java.lang.String
}
