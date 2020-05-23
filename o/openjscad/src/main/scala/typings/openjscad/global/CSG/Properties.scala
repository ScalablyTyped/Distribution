package typings.openjscad.global.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Properties")
@js.native
class Properties ()
  extends typings.openjscad.CSG.Properties {
  /* CompleteClass */
  override var center: js.Any = js.native
  /* CompleteClass */
  override var cube: typings.openjscad.CSG.Properties = js.native
  /* CompleteClass */
  override var cylinder: typings.openjscad.CSG.Properties = js.native
  /* CompleteClass */
  override var end: js.Any = js.native
  /* CompleteClass */
  override var facecenters: js.Array[_] = js.native
  /* CompleteClass */
  override var facepoint: js.Any = js.native
  /* CompleteClass */
  override var facepointH: js.Any = js.native
  /* CompleteClass */
  override var facepointH90: js.Any = js.native
  /* CompleteClass */
  override var roundedCube: typings.openjscad.CSG.Properties = js.native
  /* CompleteClass */
  override var roundedCylinder: js.Any = js.native
  /* CompleteClass */
  override var sphere: typings.openjscad.CSG.Properties = js.native
  /* CompleteClass */
  override var start: js.Any = js.native
  /* CompleteClass */
  override def _merge(otherproperties: typings.openjscad.CSG.Properties): typings.openjscad.CSG.Properties = js.native
  /* CompleteClass */
  override def _transform(matrix4x4: typings.openjscad.CSG.Matrix4x4): typings.openjscad.CSG.Properties = js.native
}

/* static members */
@JSGlobal("CSG.Properties")
@js.native
object Properties extends js.Object {
  def addFrom(result: js.Any, otherproperties: typings.openjscad.CSG.Properties): Unit = js.native
  def cloneObj(source: js.Any, result: js.Any): Unit = js.native
  def transformObj(source: js.Any, result: js.Any, matrix4x4: typings.openjscad.CSG.Matrix4x4): Unit = js.native
}

