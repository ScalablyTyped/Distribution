package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "MediaElement")
@js.native
class MediaElement protected ()
  extends p5Lib.p5Mod.p5Ns.MediaElement {
  /**
       *   Extends p5.Element to handle audio and video. In
       *   addition to the methods of p5.Element, it also
       *   contains methods for controlling media. It is not
       *   called directly, but p5.MediaElements are created
       *   by calling createVideo, createAudio, and
       *   createCapture.
       *
       *   @param elt DOM node that is wrapped
       */
  def this(elt: java.lang.String) = this()
}

