package typings.preloadjs.global.createjs

import typings.std.HTMLAudioElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.MediaTagRequest")
@js.native
class MediaTagRequest protected ()
  extends typings.preloadjs.createjs.MediaTagRequest {
  def this(loadItem: typings.preloadjs.createjs.LoadItem, tag: HTMLAudioElement, srcAttribute: String) = this()
  def this(loadItem: typings.preloadjs.createjs.LoadItem, tag: HTMLVideoElement, srcAttribute: String) = this()
}

