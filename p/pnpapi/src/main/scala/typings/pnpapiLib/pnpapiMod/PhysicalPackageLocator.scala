package typings
package pnpapiLib.pnpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicalPackageLocator extends PackageLocator {
  var name: java.lang.String
  var reference: java.lang.String
}

object PhysicalPackageLocator {
  @scala.inline
  def apply(name: java.lang.String, reference: java.lang.String): PhysicalPackageLocator = {
    val __obj = js.Dynamic.literal(name = name, reference = reference)
  
    __obj.asInstanceOf[PhysicalPackageLocator]
  }
}

