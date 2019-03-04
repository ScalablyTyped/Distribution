package typings
package nodeDashZookeeperDashClientLib.nodeDashZookeeperDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  var aversion: scala.Double
  var ctime: scala.Double
  var cversion: scala.Double
  var czxid: scala.Double
  var dataLength: scala.Double
  var ephemeralOwner: scala.Double
  var mtime: scala.Double
  var mzxid: scala.Double
  var numChildren: scala.Double
  var pzxid: scala.Double
  var version: scala.Double
}

object Stat {
  @scala.inline
  def apply(
    aversion: scala.Double,
    ctime: scala.Double,
    cversion: scala.Double,
    czxid: scala.Double,
    dataLength: scala.Double,
    ephemeralOwner: scala.Double,
    mtime: scala.Double,
    mzxid: scala.Double,
    numChildren: scala.Double,
    pzxid: scala.Double,
    version: scala.Double
  ): Stat = {
    val __obj = js.Dynamic.literal(aversion = aversion, ctime = ctime, cversion = cversion, czxid = czxid, dataLength = dataLength, ephemeralOwner = ephemeralOwner, mtime = mtime, mzxid = mzxid, numChildren = numChildren, pzxid = pzxid, version = version)
  
    __obj.asInstanceOf[Stat]
  }
}

