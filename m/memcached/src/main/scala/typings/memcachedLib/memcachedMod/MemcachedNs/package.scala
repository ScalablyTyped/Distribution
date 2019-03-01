package typings
package memcachedLib.memcachedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object MemcachedNs {
  /**
    * Declaration for single server or Memcached cluster location
    *
    * to connect to a single server use
    * "127.0.0.1:11211"
    *
    * to connect to a cluster of Memcached servers use
    * ["127.0.0.1:11211","127.0.0.1:11212"]
    *
    * to connect to servers with weight use
    * {"127.0.0.1:11211": 1,"127.0.0.1:11212": 2}
    */
  type Location = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[scala.Double]
}
