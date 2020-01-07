package typings.ol

import typings.ol.projMod.TransformFunction
import typings.ol.projProjectionMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj/transforms", JSImport.Namespace)
@js.native
object projTransformsMod extends js.Object {
  def add(source: default, destination: default, transformFn: TransformFunction): Unit = js.native
  def clear(): Unit = js.native
  def get(sourceCode: String, destinationCode: String): TransformFunction = js.native
  def remove(source: default, destination: default): TransformFunction = js.native
}

