package typings
package minilogLib.minilogMod.MinilogNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends Transform {
  /**
          * specifies the behavior when a log line doesn't match either the whitelist or the blacklist.
          The default is true (= "allow by default") - lines that do not match the whitelist or the blacklist are not filtered (e.g. ).
          If you want to flip the default so that lines are filtered unless they are on the whitelist, set this to false (= "deny by default").
          */
  var defaultResult: scala.Boolean = js.native
  /**
          * controls whether the filter is enabled. Default: true
          */
  var enabled: scala.Boolean = js.native
  /**
          * Adds an entry to the whitelist
          * Returns this filter
          */
  def allow(name: js.Any): Filter = js.native
  /**
          * Adds an entry to the whitelist
          * Returns this filter
          */
  def allow(name: js.Any, level: js.Any): Filter = js.native
  /**
          * Empties the whitelist and blacklist
          * Returns this filter
          */
  def clear(): Filter = js.native
  /**
          * Adds an entry to the blacklist
          * Returns this filter
          */
  def deny(name: js.Any): Filter = js.native
  /**
          * Adds an entry to the blacklist
          * Returns this filter
          */
  def deny(name: js.Any, level: js.Any): Filter = js.native
  def test(name: js.Any, level: js.Any): scala.Boolean = js.native
}

