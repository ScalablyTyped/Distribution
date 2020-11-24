package typings.nodeObjectHash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hasher extends js.Object {
  
  /**
    * Create hash of an object
    * @param object source object
    * @returns hash string of an object
    */
  def hash(`object`: js.Any): String = js.native
  def hash(`object`: js.Any, opts: HasherOptions): String = js.native
  
  /**
    * Create sorted string from an object
    * @param object source object
    * @returns sorted string from an object
    */
  def sort(`object`: js.Any): String = js.native
  
  /**
    * Create sorted string from an object
    * @param object source object
    * @returns sorted string from an object
    * @alias sort
    */
  def sortObject(`object`: js.Any): String = js.native
}
