package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bloomfilterfalsepositives extends js.Object {
  var `bloom filter false positives`: scala.Double
  var `bloom filter hits`: scala.Double
  var `bloom filter misses`: scala.Double
  var `bloom filter pages evicted from cache`: scala.Double
  var `bloom filter pages read into cache`: scala.Double
  var `bloom filters in the LSM tree`: scala.Double
  var `chunks in the LSM tree`: scala.Double
  var `highest merge generation in the LSM tree`: scala.Double
  var `queries that could have benefited from a Bloom filter that did not exist`: scala.Double
  var `sleep for LSM checkpoint throttle`: scala.Double
  var `sleep for LSM merge throttle`: scala.Double
  var `total size of bloom filters`: scala.Double
}

object Anon_Bloomfilterfalsepositives {
  @scala.inline
  def apply(
    `bloom filter false positives`: scala.Double,
    `bloom filter hits`: scala.Double,
    `bloom filter misses`: scala.Double,
    `bloom filter pages evicted from cache`: scala.Double,
    `bloom filter pages read into cache`: scala.Double,
    `bloom filters in the LSM tree`: scala.Double,
    `chunks in the LSM tree`: scala.Double,
    `highest merge generation in the LSM tree`: scala.Double,
    `queries that could have benefited from a Bloom filter that did not exist`: scala.Double,
    `sleep for LSM checkpoint throttle`: scala.Double,
    `sleep for LSM merge throttle`: scala.Double,
    `total size of bloom filters`: scala.Double
  ): Anon_Bloomfilterfalsepositives = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bloom filter false positives")(`bloom filter false positives`)
    __obj.updateDynamic("bloom filter hits")(`bloom filter hits`)
    __obj.updateDynamic("bloom filter misses")(`bloom filter misses`)
    __obj.updateDynamic("bloom filter pages evicted from cache")(`bloom filter pages evicted from cache`)
    __obj.updateDynamic("bloom filter pages read into cache")(`bloom filter pages read into cache`)
    __obj.updateDynamic("bloom filters in the LSM tree")(`bloom filters in the LSM tree`)
    __obj.updateDynamic("chunks in the LSM tree")(`chunks in the LSM tree`)
    __obj.updateDynamic("highest merge generation in the LSM tree")(`highest merge generation in the LSM tree`)
    __obj.updateDynamic("queries that could have benefited from a Bloom filter that did not exist")(`queries that could have benefited from a Bloom filter that did not exist`)
    __obj.updateDynamic("sleep for LSM checkpoint throttle")(`sleep for LSM checkpoint throttle`)
    __obj.updateDynamic("sleep for LSM merge throttle")(`sleep for LSM merge throttle`)
    __obj.updateDynamic("total size of bloom filters")(`total size of bloom filters`)
    __obj.asInstanceOf[Anon_Bloomfilterfalsepositives]
  }
}

