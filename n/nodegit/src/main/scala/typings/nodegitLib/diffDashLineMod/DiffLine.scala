package typings
package nodegitLib.diffDashLineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff-line", "DiffLine")
@js.native
class DiffLine () extends js.Object {
  /**
       * The relevant line
       *
       *
       */
  def content(): java.lang.String = js.native
  def contentLen(): scala.Double = js.native
  def contentOffset(): scala.Double = js.native
  def newLineno(): scala.Double = js.native
  def numLines(): scala.Double = js.native
  def oldLineno(): scala.Double = js.native
  def origin(): scala.Double = js.native
  /**
       * The non utf8 translated text
       *
       *
       */
  def rawContent(): java.lang.String = js.native
}

