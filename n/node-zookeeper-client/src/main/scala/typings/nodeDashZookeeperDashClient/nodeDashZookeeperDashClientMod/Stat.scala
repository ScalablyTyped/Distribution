package typings.nodeDashZookeeperDashClient.nodeDashZookeeperDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stat extends js.Object {
  var aversion: Double
  var ctime: Double
  var cversion: Double
  var czxid: Double
  var dataLength: Double
  var ephemeralOwner: Double
  var mtime: Double
  var mzxid: Double
  var numChildren: Double
  var pzxid: Double
  var version: Double
}

object Stat {
  @scala.inline
  def apply(
    aversion: Double,
    ctime: Double,
    cversion: Double,
    czxid: Double,
    dataLength: Double,
    ephemeralOwner: Double,
    mtime: Double,
    mzxid: Double,
    numChildren: Double,
    pzxid: Double,
    version: Double
  ): Stat = {
    val __obj = js.Dynamic.literal(aversion = aversion.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], cversion = cversion.asInstanceOf[js.Any], czxid = czxid.asInstanceOf[js.Any], dataLength = dataLength.asInstanceOf[js.Any], ephemeralOwner = ephemeralOwner.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mzxid = mzxid.asInstanceOf[js.Any], numChildren = numChildren.asInstanceOf[js.Any], pzxid = pzxid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Stat]
  }
}

