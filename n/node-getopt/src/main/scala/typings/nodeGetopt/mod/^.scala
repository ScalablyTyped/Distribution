package typings.nodeGetopt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-getopt", JSImport.Namespace)
@js.native
class ^ protected () extends Getopt {
  /**
    * options is a set of option. each option contains 3 fields.
    *    [short_name, long_name_with_definition, comment]
    *    Definition:
    *    * '=ARG':   has argument
    *    * '[=ARG]': has argument but optional
    *    * '+':      multiple option supported
    *
    *    ARG can be replaced by any word.
    * @param options
    */
  def this(options: js.Array[_]) = this()
}
@JSImport("node-getopt", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  var HAS_ARGUMENT: Boolean = js.native
  
  var MULTI_SUPPORTED: Boolean = js.native
  
  var NO_ARGUMENT: Boolean = js.native
  
  var SINGLE_ONLY: Boolean = js.native
  
  var VERSION: String = js.native
  
  /**
    * equals new Getopt(options)
    * @param options
    */
  def create(options: js.Array[js.Array[String]]): Getopt = js.native
  
  def getVersion(): String = js.native
}
