package typings.minilog.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("minilog", "Filter")
@js.native
class Filter () extends Transform {
  
  /**
    * Adds an entry to the whitelist
    * Returns this filter
    */
  def allow(name: js.Any): Filter = js.native
  def allow(name: js.Any, level: js.Any): Filter = js.native
  
  /**
    * Empties the whitelist and blacklist
    * Returns this filter
    */
  def clear(): Filter = js.native
  
  /**
    * specifies the behavior when a log line doesn't match either the whitelist or the blacklist.
    The default is true (= "allow by default") - lines that do not match the whitelist or the blacklist are not filtered (e.g. ).
    If you want to flip the default so that lines are filtered unless they are on the whitelist, set this to false (= "deny by default").
    */
  var defaultResult: Boolean = js.native
  
  /**
    * Adds an entry to the blacklist
    * Returns this filter
    */
  def deny(name: js.Any): Filter = js.native
  def deny(name: js.Any, level: js.Any): Filter = js.native
  
  /**
    * controls whether the filter is enabled. Default: true
    */
  var enabled: Boolean = js.native
  
  def test(name: js.Any, level: js.Any): Boolean = js.native
}
