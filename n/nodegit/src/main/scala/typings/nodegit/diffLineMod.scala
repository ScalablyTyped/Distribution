package typings.nodegit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff-line", JSImport.Namespace)
@js.native
object diffLineMod extends js.Object {
  @js.native
  class DiffLine () extends js.Object {
    /**
      * The relevant line
      *
      *
      */
    def content(): String = js.native
    def contentLen(): Double = js.native
    def contentOffset(): Double = js.native
    def newLineno(): Double = js.native
    def numLines(): Double = js.native
    def oldLineno(): Double = js.native
    def origin(): Double = js.native
    /**
      * The non utf8 translated text
      *
      *
      */
    def rawContent(): String = js.native
  }
  
}

