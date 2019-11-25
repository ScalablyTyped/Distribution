package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bloomfilterfalsepositives extends js.Object {
  var `bloom filter false positives`: Double
  var `bloom filter hits`: Double
  var `bloom filter misses`: Double
  var `bloom filter pages evicted from cache`: Double
  var `bloom filter pages read into cache`: Double
  var `bloom filters in the LSM tree`: Double
  var `chunks in the LSM tree`: Double
  var `highest merge generation in the LSM tree`: Double
  var `queries that could have benefited from a Bloom filter that did not exist`: Double
  var `sleep for LSM checkpoint throttle`: Double
  var `sleep for LSM merge throttle`: Double
  var `total size of bloom filters`: Double
}

object Anon_Bloomfilterfalsepositives {
  @scala.inline
  def apply(
    `bloom filter false positives`: Double,
    `bloom filter hits`: Double,
    `bloom filter misses`: Double,
    `bloom filter pages evicted from cache`: Double,
    `bloom filter pages read into cache`: Double,
    `bloom filters in the LSM tree`: Double,
    `chunks in the LSM tree`: Double,
    `highest merge generation in the LSM tree`: Double,
    `queries that could have benefited from a Bloom filter that did not exist`: Double,
    `sleep for LSM checkpoint throttle`: Double,
    `sleep for LSM merge throttle`: Double,
    `total size of bloom filters`: Double
  ): Anon_Bloomfilterfalsepositives = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bloom filter false positives")(`bloom filter false positives`.asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filter hits")(`bloom filter hits`.asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filter misses")(`bloom filter misses`.asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filter pages evicted from cache")(`bloom filter pages evicted from cache`.asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filter pages read into cache")(`bloom filter pages read into cache`.asInstanceOf[js.Any])
    __obj.updateDynamic("bloom filters in the LSM tree")(`bloom filters in the LSM tree`.asInstanceOf[js.Any])
    __obj.updateDynamic("chunks in the LSM tree")(`chunks in the LSM tree`.asInstanceOf[js.Any])
    __obj.updateDynamic("highest merge generation in the LSM tree")(`highest merge generation in the LSM tree`.asInstanceOf[js.Any])
    __obj.updateDynamic("queries that could have benefited from a Bloom filter that did not exist")(`queries that could have benefited from a Bloom filter that did not exist`.asInstanceOf[js.Any])
    __obj.updateDynamic("sleep for LSM checkpoint throttle")(`sleep for LSM checkpoint throttle`.asInstanceOf[js.Any])
    __obj.updateDynamic("sleep for LSM merge throttle")(`sleep for LSM merge throttle`.asInstanceOf[js.Any])
    __obj.updateDynamic("total size of bloom filters")(`total size of bloom filters`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bloomfilterfalsepositives]
  }
}

