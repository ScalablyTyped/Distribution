package typings
package pnpapiLib.pnpapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageInformation extends js.Object {
  var packageDependencies: stdLib.Map[
    java.lang.String, 
    java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
  ]
  var packageLocation: java.lang.String
}

object PackageInformation {
  @scala.inline
  def apply(
    packageDependencies: stdLib.Map[
      java.lang.String, 
      java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])
    ],
    packageLocation: java.lang.String
  ): PackageInformation = {
    val __obj = js.Dynamic.literal(packageDependencies = packageDependencies, packageLocation = packageLocation)
  
    __obj.asInstanceOf[PackageInformation]
  }
}

