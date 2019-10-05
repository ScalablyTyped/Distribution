package typings.preloadjs.createjs

import typings.std.HTMLAudioElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.MediaTagRequest")
@js.native
class MediaTagRequest protected () extends js.Object {
  def this(loadItem: LoadItem, tag: HTMLAudioElement, srcAttribute: String) = this()
  def this(loadItem: LoadItem, tag: HTMLVideoElement, srcAttribute: String) = this()
}

