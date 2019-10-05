package typings.nodegit

import typings.nodegit.oidMod.Oid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/diff-file", JSImport.Namespace)
@js.native
object diffDashFileMod extends js.Object {
  @js.native
  class DiffFile () extends js.Object {
    /**
      * Returns the file's flags
      */
    def flags(): Double = js.native
    /**
      * Returns the file's Oid
      */
    def id(): Oid = js.native
    /**
      * Returns the file's mode
      */
    def mode(): Double = js.native
    /**
      * Returns the file's path
      */
    def path(): String = js.native
    /**
      * Returns the file's size
      */
    def size(): Double = js.native
  }
  
}

