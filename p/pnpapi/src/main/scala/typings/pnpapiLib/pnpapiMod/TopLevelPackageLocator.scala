package typings
package pnpapiLib.pnpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopLevelPackageLocator extends PackageLocator {
  var name: scala.Null
  var reference: scala.Null
}

object TopLevelPackageLocator {
  @scala.inline
  def apply(name: scala.Null, reference: scala.Null): TopLevelPackageLocator = {
    val __obj = js.Dynamic.literal(name = name, reference = reference)
  
    __obj.asInstanceOf[TopLevelPackageLocator]
  }
}

