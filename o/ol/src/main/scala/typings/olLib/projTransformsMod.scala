package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj/transforms", JSImport.Namespace)
@js.native
object projTransformsMod extends js.Object {
  def add(
    source: olLib.projProjectionMod.default,
    destination: olLib.projProjectionMod.default,
    transformFn: olLib.projMod.TransformFunction
  ): scala.Unit = js.native
  def clear(): scala.Unit = js.native
  def get(sourceCode: java.lang.String, destinationCode: java.lang.String): olLib.projMod.TransformFunction = js.native
  def remove(source: olLib.projProjectionMod.default, destination: olLib.projProjectionMod.default): olLib.projMod.TransformFunction = js.native
}

