package typings.peculiarJsonSchema

import typings.peculiarJsonSchema.propTypesMod.JsonPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@peculiar/json-schema/build/types/helper", JSImport.Namespace)
@js.native
object helperMod extends js.Object {
  def checkType(value: js.Any, `type`: JsonPropTypes): Boolean = js.native
  def isConvertible(target: js.Any): /* is @peculiar/json-schema.@peculiar/json-schema/build/types/types.IJsonConvertible<any> */ Boolean = js.native
  def throwIfTypeIsWrong(value: js.Any, `type`: JsonPropTypes): Unit = js.native
}

