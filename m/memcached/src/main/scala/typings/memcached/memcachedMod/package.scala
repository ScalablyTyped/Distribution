package typings.memcached

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object memcachedMod {
  import org.scalablytyped.runtime.StringDictionary

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
  type Location = String | js.Array[String] | StringDictionary[Double]
}
